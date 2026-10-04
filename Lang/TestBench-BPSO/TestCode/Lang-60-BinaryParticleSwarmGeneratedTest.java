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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setLength", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "java.lang.Object,int,char", "<d:1.5>", "64", "}"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<null>", "67108897", "32"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "-32", "25165840"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder,int,int", "<sample:5>", "-1073741824", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<sample:0>", "1879048191", "45"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"int", "int", "char[]", "int"}, new String[]{"-2147483648", "-7", "<sample:0>", "31"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "endsWith", new String[]{"java.lang.String"}, new String[]{"Ttee"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "charAt", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"nll", "20", "1879048191"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:2>", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "char[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("false {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "false {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "rightString", new String[]{"int"}, new String[]{"1073741793"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "capacity", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "-134217922", "-2147483648"}, {"org.apache.commons.lang.text.StrBuilder", "replaceAll", "char,char", " ", "\ufffe"}}), new String[][]{{"flush", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"char[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:3>", "-262050"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[ , a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"int"}, new String[]{"4064"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "true"}, {"org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", ""}}), new String[][]{{"deleteCharAt", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "midString", "int,int", "-77", "1073745919"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samplefalse {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samplefalse {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<s:keyy>", "-939393023", "C"}, false, 4, new String[][]{}), new String[][]{{"deleteAll", "java.lang.String", "4"}, {"contains", "char", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1.12345678901234a675."}, false, 5, new String[][]{}), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<empty>", "1"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"java.lang.String"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "-1.7976931348623157E308"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308 {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1.7976931348623157E308 {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"7628716375283629643"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", ""}}), new String[][]{{"insert", "int,long", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("17.6287163752836301E18 {getNewLineText=null, getNullText=null, isEmpty=false, length=22, size=22}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "17.6287163752836301E18 {getNewLineText=null, getNullText=null, isEmpty=false, length=22, size=22}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "double"}, new String[]{"2147483647", "8.988465674311579E307"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "reverse", ""}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char", "."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "midString", new String[]{"int", "int"}, new String[]{"45", "12"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "P", "\r"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char", "-8388604", "H"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:3>", "nl2"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "size", ""}}), new String[][]{{"isEmpty", "", "3"}, {"insert", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1key {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1key {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher", "int"}, new String[]{"<null>", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String", "-1n5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:6>", "T-0-C0"}, false, 2, new String[][]{}), new String[][]{{"insert", "int,float", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samp1.0le {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samp1.0le {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String"}, new String[]{"1.5d-1.5"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "int,int,java.lang.String", "268435420", "71", "0.5d"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<s:b>>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "b> {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"int"}, new String[]{"12582904"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String,int,int", "32W", "2", "68"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "-32", "-1073741823", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("012582904 {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "012582904 {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:6>", "2147483647", "-36831"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "reverse", ""}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", "/a/b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[],int,int", "<sample:0>", "134217922", "-16777213"}}), new String[][]{{"skip", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "java.lang.Object,int,char", "<s:key>", "2147483647", "}"}, {"org.apache.commons.lang.text.StrBuilder", "setCharAt", "int,char", "67108834", "-"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<i:-1>", "-1073741888", "Q"}, false, 5, new String[][]{}, 3), new String[][]{{"delete", "int,int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<i:1>", "15", "T"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char,int", "1", "67108961"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "-10", "Infinity"}}), new String[][]{{"append", "java.lang.StringBuffer,int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"1.26"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "1.0"}}), new String[][]{{"delete", "int,int", "3"}, {"appendFixedWidthPadRight", "int,int,char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=1.26, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=1.26, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "int,int,java.lang.String", "32", "-262306", "1.1234678"}}), new String[][]{{"appendNewLine", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "org.apache.commons.lang.text.StrMatcher", "<sample:2>"}}, 1), new String[][]{{"indexOf", "java.lang.String", "5"}, {"asWriter", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"char"}, new String[]{"4"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:4>", "0"}, {"org.apache.commons.lang.text.StrBuilder", "deleteAll", "java.lang.String", "abbc"}}), new String[][]{{"asWriter", "", "6"}, {"close", "", "7"}, {"write", "char[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<null>", "0x1233456789abc"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[],int,int", "-2147483648", "<sample:6>", "2147483647", "109"}}), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder,int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"char"}, new String[]{"u"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", ""}, {"org.apache.commons.lang.text.StrBuilder", "append", "double", "-32.47999999999999"}}), new String[][]{{"appendWithSeparators", "java.util.Iterator,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0-32.47999999999999 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0-32.47999999999999 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:7>", "-11", "128", "939393027", "-4194306"}}), new String[][]{{"reset", "java.lang.String", "0"}, {"setDelimiterMatcher", "org.apache.commons.lang.text.StrMatcher", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=, getTokenArray=[], hasNext=false, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String", "int"}, new String[]{"{{g\"a\"91}a", "-27"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"char"}, new String[]{"X"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<null>"}}, 1), new String[][]{{"ensureCapacity", "int", "2"}, {"appendFixedWidthPadRight", "java.lang.Object,int,char", "6"}, {"append", "char", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000\000\000\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\000\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<s:b>>", "111", "E"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<empty>", "1.25"}}), new String[][]{{"insert", "int,boolean", "7"}, {"append", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("EEEEfalseEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEb>0 {getNewLineText=null, getNullText=null, isEmpty=false, length=117, size=117}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "EEEEfalseEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEb>0 {getNewLineText=null, getNullText=null, isEmpty=false, length=117, size=117}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:1>", "1.11234567891234567"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "org.apache.commons.lang.text.StrMatcher", "<sample:0>"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "0x1F"}}), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sampleaa {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sampleaa {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"-64.77999999999999"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<null>", "-1 "}, {"org.apache.commons.lang.text.StrBuilder", "append", "int", "33"}}), new String[][]{{"contains", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "33-64.77999999999999 {getNewLineText=null, getNullText=null, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char"}, new String[]{"P"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<null>", "2147483647", "`"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:4>", "./.0"}, false, 2, new String[][]{}), new String[][]{{"appendFixedWidthPadRight", "int,int,char", "4"}, {"append", "char[],int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<i:1>", "-1993", "y"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "-32", "-40", "r"}}), new String[][]{{"insert", "int,char[]", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\0000 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\0000 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getNewLineText", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "-1.19"}, {"org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "-1.19 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "startsWith", new String[]{"java.lang.String"}, new String[]{"-10"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<sample:2>", "1.51L"}, false), new String[][]{{"append", "java.lang.StringBuffer,int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"int"}, new String[]{"-536870892"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", "\n"}}), new String[][]{{"deleteFirst", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-536870892 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-536870892 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getNewLineText", ""}}), new String[][]{{"markSupported", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:0>"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<sample:7>"}}, 2), new String[][]{{"appendFixedWidthPadLeft", "java.lang.Object,int,char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String", "int"}, new String[]{"a,bx,", "-2147483622"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<null>", "lTitle"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setLength", new String[]{"int"}, new String[]{"61"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "true"}}), new String[][]{{"contains", "org.apache.commons.lang.text.StrMatcher", "2"}, {"append", "java.lang.StringBuffer,int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{"nL"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "char,char", "\000", "h"}, {"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "-134217922"}}), new String[][]{{"deleteAll", "org.apache.commons.lang.text.StrMatcher", "6"}, {"deleteFirst", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=nL, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=nL, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String", "int", "int", "int"}, new String[]{"<sample:1>", "", "262239", "67108957", "2147483647"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setLength", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<sample:8>"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "w", "939393027"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "smple {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"<null>", "-1073741824", "268435420"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char[]", "int", "int"}, new String[]{"-45", "<sample:7>", "268435844", "-8388604"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,java.lang.Object", "134184980", "<null>"}, {"org.apache.commons.lang.text.StrBuilder", "trim", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"-2147483595", "|"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:4>"}}), new String[][]{{"contains", "java.lang.String", "7"}, {"getChars", "char[]", "0"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[s, a, m, p, l, e]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:2>"}}), new String[][]{{"read", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("115", String.valueOf(actual));
  assertEquals("receiver state after the call", "samplesample {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<null>", "0xFFFFFFFF4PT1H"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Iterator,java.lang.String", "<sample:4>", "42"}, {"org.apache.commons.lang.text.StrBuilder", "append", "char", "U"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("U {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "U {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"64.0"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setCharAt", "int,char", "-20", "?"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String,int,int", "end < start", "-25165840", "-10"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample64.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample64.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"int", "int", "java.lang.String"}, new String[]{"0", "2147483647", "end < rtart"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("end < rtart {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "end < rtart {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"4x1", "aaaaaaaaaaaaabaaaaaaaaaaaaaaaa"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String,int,int", "1.H1234567{\"a\":1}aaaaaacaaaaaaaaaaaaaaaaaaaaaaa", "0", "-536870911"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "125", "64"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNewLineText", "java.lang.String", "startIndex mustt be-validabc"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=startIndex mustt be-validabc, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=startIndex mustt be-validabc, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.H12b34567", "\n.25"}, false, 2, new String[][]{}), new String[][]{{"endsWith", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:2>", "0", "-4056"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "8388676", "94", "<sample:1>", "-25"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", "-1 "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asReader", ""}}, 2), new String[][]{{"ready", "", "6"}, {"transferTo", "java.io.Writer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{"1.H1223567{\"a\":1}aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.5e300"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "2147483647"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "\t", "-16777208"}}, 2), new String[][]{{"indexOf", "char", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=1.H1223567{\"a\":1}aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.5e300, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "midString", "int,int", "2147483647", "-2147483612"}, {"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", "1-5f"}}), new String[][]{{"append", "float", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample0.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample0.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"a", "6"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "midString", "int,int", "-536854508", "16"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,java.lang.String", "2147483647", "-15"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("s6mple {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "s6mple {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "false"}}), new String[][]{{"insert", "int,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("false {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "false {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", "Invalid startHndex: "}}), new String[][]{{"appendFixedWidthPadLeft", "java.lang.Object,int,char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("b {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "b {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder,int,int", "<null>", "256", "33554492"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char", "]"}}), new String[][]{{"insert", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<null>", "134217922", " "}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[],int,int", "2", "<sample:6>", "-10", "54"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "org.apache.commons.lang.text.StrMatcher", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "substring", new String[]{"int"}, new String[]{"6"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String", "1.124567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("67", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.124567 {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setLength", new String[]{"int"}, new String[]{"64"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", ",i1.12345678", "nul]l"}}), new String[][]{{"insert", "int,double", "6"}, {"indexOf", "org.apache.commons.lang.text.StrMatcher,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sam0.0ple\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=67, size=67}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}), new String[][]{{"insert", "int,boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("true {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "true {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "1", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "charAt", "int", "-2147483648"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[]", "2147483614", "<null>"}}, 3), new String[][]{{"indexOf", "java.lang.String", "0"}, {"appendPadding", "int,char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample\n000 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample\n000 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629639"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char", "15", "-"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[s, a, m, p, l, e, 7, 6, 2, 8, 7, 1, 6, 3, 7, -, 5, 2, 8, 3, 6, 2, 9, 6, 3, 9]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample762871637-5283629639 {getNewLineText=null, getNullText=null, isEmpty=false, length=26, size=26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:2>", "\n.25x"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "]", "-36862"}}, 1), new String[][]{{"deleteCharAt", "int", "6"}, {"append", "org.apache.commons.lang.text.StrBuilder", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-923372036854775808 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-923372036854775808 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "validateRange", "int,int", "33554378", "-536870911"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "", "1.1 2345678801234F56aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "trim", ""}, {"org.apache.commons.lang.text.StrBuilder", "asReader", ""}}), new String[][]{{"appendFixedWidthPadRight", "java.lang.Object,int,char", "7"}, {"deleteFirst", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("truetrue {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "truetrue {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "charAt", "int", "33554492"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "4140", "2147483647", "{"}}), new String[][]{{"append", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "sample0 {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String", "int"}, new String[]{"l", "262221"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"T-0-C0"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}}, 1), new String[][]{{"contains", "char", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "T-0-C0 {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equals", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "org.apache.commons.lang.text.StrMatcher", "<sample:8>"}, {"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:4>", "!", "-262306", "33554480", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 2), new String[][]{{"deleteAll", "java.lang.String", "2"}, {"asWriter", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000  {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "int,int,java.lang.String", "1878786054", "939393027", "T-0-C0"}, {"org.apache.commons.lang.text.StrBuilder", "replaceAll", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:8>", "s3artIndex must be validabc"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("ss3artIndex must be validabcmple {getNewLineText=null, getNullText=null, isEmpty=false, length=32, size=32}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ss3artIndex must be validabcmple {getNewLineText=null, getNullText=null, isEmpty=false, length=32, size=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"read", "char[]", "4"}, {"read", "java.nio.CharBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteCharAt", "int", "33554393"}}), new String[][]{{"append", "java.lang.StringBuffer", "5"}, {"appendNull", "", "6"}, {"append", "java.lang.String,int,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{""}, false), new String[][]{{"append", "char[]", "5"}, {"deleteAll", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0\000 {getNewLineText=, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0\000 {getNewLineText=, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "rightString", new String[]{"int"}, new String[]{"-2147483571"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String", "\n.2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"org.apache.commons.lang.text.StrMatcher", "int"}, new String[]{"<sample:2>", "-324"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "java.lang.Object"}, new String[]{"-262306", "<i:2>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNewLineText", "java.lang.String", "7rueI"}, {"org.apache.commons.lang.text.StrBuilder", "equals", "java.lang.Object", "<sample:3>"}}), new String[][]{{"asWriter", "", "6"}, {"write", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "0 {getNewLineText=7rueI, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"}", "}"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getNewLineText", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[]", "-536870912", "<sample:6>"}}, 2), new String[][]{{"asWriter", "", "4"}, {"write", "char[]", "2"}, {"append", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "0\000 a {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"close", "", "7"}, {"read", "char[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,long", "2147483647", "-9204231738438451200"}}, 2), new String[][]{{"read", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Invalid startIndex: ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}}), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "5"}, {"append", "float", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0true0c-Infinity {getNewLineText=null, getNullText=null, isEmpty=false, length=16, size=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0true0c-Infinity {getNewLineText=null, getNullText=null, isEmpty=false, length=16, size=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:3>", "\n.25"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "char", "4"}, {"org.apache.commons.lang.text.StrBuilder", "replaceAll", "char,char", "i", ","}}), new String[][]{{"asTokenizer", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=sample, getTokenArray=[sample], hasNext=true, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:5>"}, {"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:6>", "true-0.1", "2147483647", "-536870911", "-2147483633"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"-44", "34", "0"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<s:Fe>", "196", "4"}}, 2), new String[][]{{"append", "java.lang.StringBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("Fe444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440000...#313#1411590191", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Fe444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440000...#313#1411590191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "-8.98846567431158E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-8.98846567431158E307 {getNewLineText=null, getNullText=null, isEmpty=false, length=21, size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"int", "int", "char"}, new String[]{"2147483647", "-42", "1"}, false, 2, new String[][]{}, 2), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder,int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "1.6f", "suartIndex mustt be-valid"}}), new String[][]{{"skip", "long", "7"}, {"close", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}), new String[][]{{"asReader", "", "4"}, {"mark", "int", "4"}, {"reset", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"int"}, new String[]{"67108961"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("67108961 {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "67108961 {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"."}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(". {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", ". {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "validateIndex", new String[]{"int"}, new String[]{"16777246"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "-2147483590", "-1.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<null>", "0.5d"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "2", "67108855"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,java.lang.String", "31", "aaaaaaaaaa"}, {"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "94"}}, 3), new String[][]{{"insert", "int,char[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{"int", "int"}, new String[]{"-33554417", "939393023"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"tru", "24", "50331630"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "-67108897", "2147483598"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=, getTokenArray=[], hasNext=false, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"\n{\"a\"d1}", "-5", "-939393027"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "clear", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char"}, new String[]{"d"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:8>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "a", "http://examp\re.com/a?b]c "}}, 2), new String[][]{{"append", "java.lang.StringBuffer", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"org.apache.commons.lang.text.StrMatcher", "int"}, new String[]{"<null>", "-33"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"2147467263", "45", "\u00e9"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char", "-2147483593", "e"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e92147467263 {getNewLineText=null, getNullText=null, isEmpty=false, length=45, size=45}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e92147467263 {getNewLineText=null, getNullText=null, isEmpty=false, length=45, size=45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", ",", "2147483647"}}, 1), new String[][]{{"append", "long", "5"}, {"endsWith", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "02 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "char", "u"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "org.apache.commons.lang.text.StrMatcher", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("true {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "true {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{"{", "-33554428"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{"int", "int"}, new String[]{"-2147483648", "96"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<i:-44>", "0", "d"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Iterator,java.lang.String", "<sample:0>", "1.H1234567{\"a\":1}aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 1), new String[][]{{"appendFixedWidthPadLeft", "int,int,char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("002 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "002 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equals", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<i:0>", "45", "\""}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", "xT1H"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"0 {getNewLineText=null, getNullText=null, isEmpty=false, length=45, size=45}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"0 {getNewLineText=null, getNullText=null, isEmpty=false, length=45, size=45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "int"}, new String[]{"2147483647", "45"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "ensureCapacity", "int", "-7"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "boolean"}, new String[]{"2097156", "true"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:4>", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteCharAt", new String[]{"int"}, new String[]{"-2"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<sample:3>", "94", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendNull", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer", "<sample:2>"}, {"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0samplesample {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0samplesample {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "java.lang.String", "5x+1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<sample:5>", "45", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Iterator,java.lang.String", "<sample:2>", "abc"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[],int,int", "25165840", "<sample:5>", "0", "1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:6>", "5/"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "capacity", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "float"}, new String[]{"-54", "1.7014117E38"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}, {"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder,int,int", "<sample:2>", "-2147483648", "-2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456end < start"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "X"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "X {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"1234567890113"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,java.lang.String", "33", "a,b,c"}}, 3), new String[][]{{"getNewLineText", "", "1"}, {"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1234567890113 {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1234567890113 {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 1), new String[][]{{"indexOf", "java.lang.String,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "leftString", new String[]{"int"}, new String[]{"20"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "trim", ""}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "startIndex must be valid+1", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "endsWith", new String[]{"java.lang.String"}, new String[]{"nL"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteCharAt", "int", "67108855"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<sample:0>", "2147483647", "1073745964"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"int", "int", "char[]", "int"}, new String[]{"-27", "-27", "<sample:5>", "-8388585"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "<a=b</a>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getNullText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "int,int,java.lang.String", "-31", "12582961", "{\"a\":1}A"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char"}, new String[]{"67108855", "1"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "midString", "int,int", "-16", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "-2125", "Infinity"}}, 3), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "0"}, {"insert", "int,double", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "isEmpty", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "delete", new String[]{"int", "int"}, new String[]{"16777246", "1073741793"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "charAt", "int", "43"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder,int,int", "<sample:5>", "2147483647", "32763"}, {"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"8388736", "33", "{"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "substring", "int,int", "-8388604", "33"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("{{{{{{{{{{{{{{{{{{{{{{{{{{8388736 {getNewLineText=null, getNullText=null, isEmpty=false, length=33, size=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{{{{{{{{{{{{{{{{{{{{{{{{{{8388736 {getNewLineText=null, getNullText=null, isEmpty=false, length=33, size=33}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"end  start"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "2147483647", ","}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "delete", new String[]{"int", "int"}, new String[]{"33554480", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "2147483604", "1073741793", "<sample:4>", "67108855"}}, 2), new String[][]{{"substring", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "2147483647", "2147483647", "/"}, {"org.apache.commons.lang.text.StrBuilder", "replaceAll", "char,char", "0", "?"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "charAt", "int", "-108"}, {"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 1), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "00 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "double"}, new String[]{"268435411", "33.0"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "java.lang.String", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "leftString", new String[]{"int"}, new String[]{"67108901"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toString", ""}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "010Invalid offset: ", "2147"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<sample:0>", "2147483647", "8388639"}}, 1), new String[][]{{"insert", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteCharAt", new String[]{"int"}, new String[]{"-33"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "validateIndex", "int", "-64"}, {"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("9223372036854775807 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9223372036854775807 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"int", "int", "java.lang.String"}, new String[]{"18", "2147483604", "a"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "int"}, new String[]{"2147483647", "20"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getNullText", ""}, {"org.apache.commons.lang.text.StrBuilder", "charAt", "int", "67108961"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"2147483647", "-2147483648", "A"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "-24", "-2147483587"}}, 1), new String[][]{{"getChars", "char[]", "6"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String"}, new String[]{"[1,2]-1"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"b.0234567", "20", "-2"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:8>", "-1.5Title"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:12>", "0.12345678901234a675.1L"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<sample:2>", "-2147483647", "-943587331"}}, 1), new String[][]{{"appendPadding", "int,char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:3>", "Tisle"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", "Hello, World"}}, 3), new String[][]{{"append", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char,int", "c", "-66"}}, 2), new String[][]{{"delete", "int,int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("saple {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "saple {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"-Infinity"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "1.1 2345678901234F5}61.12345678", "0B1F"}}, 1), new String[][]{{"appendNewLine", "", "4"}, {"deleteFirst", "char", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-Infinity\n {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity\n {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "1E-5", ",-1"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0a0\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0a0\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"31"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher", "int"}, new String[]{"<sample:2>", "47"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "-10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Iterator,java.lang.String", "<sample:2>", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "endsWith", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"48"}, false, 5, new String[][]{}), new String[][]{{"ensureCapacity", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "length", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "charAt", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "char[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "delete", new String[]{"int", "int"}, new String[]{"15", "-2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:6>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "java.lang.Object,int,char", "<s:ke>", "2147483647", "?"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", ""}, {"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1 ", "startIndex must be valid"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:9>", "47"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "boolean"}, new String[]{"-4064", "false"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"char"}, new String[]{"?"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String", "1.1 2345678901234F56"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.1 2345678901234F56 {getNewLineText=null, getNullText=null, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\n{\"a\":1}", ""}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}, {"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "-2147483647", "x"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "startsWith", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b]=c "}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "char", "W"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:3>", "e"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("2147483647sample {getNewLineText=null, getNullText=null, isEmpty=false, length=16, size=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2147483647sample {getNewLineText=null, getNullText=null, isEmpty=false, length=16, size=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:5>", "4"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "-27", "2147483647", "w"}}), new String[][]{{"indexOf", "org.apache.commons.lang.text.StrMatcher", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<i:-61>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-61 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-61 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:4>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:3>", ""}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("key {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "key {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<d:1.5>", "31", "0"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("01.50000000000000000000000000000 {getNewLineText=null, getNullText=null, isEmpty=false, length=32, size=32}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "01.50000000000000000000000000000 {getNewLineText=null, getNullText=null, isEmpty=false, length=32, size=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:3>"}, false), new String[][]{{"append", "float", "7"}, {"append", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0.0  {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0  {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "boolean"}, new String[]{"45", "false"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setCharAt", "int,char", "-4064", "/"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "capacity", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "charAt", "int", "33"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"long"}, new String[]{"75"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<null>"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("075 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "075 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "substring", new String[]{"int"}, new String[]{"25165809"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "validateIndex", "int", "-2147483648"}, {"org.apache.commons.lang.text.StrBuilder", "clear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"char"}, new String[]{"D"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "startIndex mustt be-valid", "Invalid length: "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"float"}, new String[]{"3.4028235E38"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setLength", "int", "15"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0003.4028235E38 {getNewLineText=null, getNullText=null, isEmpty=false, length=27, size=27}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0003.4028235E38 {getNewLineText=null, getNullText=null, isEmpty=false, length=27, size=27}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "endsWith", new String[]{"java.lang.String"}, new String[]{"{\"a\"B:1"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "delete", new String[]{"int", "int"}, new String[]{"-939393023", "2147483647"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asTokenizer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "-2147483648", "-7.6287162E18"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"java.lang.String"}, new String[]{"`,b,c2020-01-01"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<sample:1>", "-2147483647", "-54"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char,int", "w", "-16777246"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "int", "-2147483539"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-2147483539\n {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-2147483539\n {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"setQuoteMatcher", "org.apache.commons.lang.text.StrMatcher", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=, getTokenArray=[], hasNext=false, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "clear", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-2147483648 {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-2147483648 {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "clear", new String[]{}, new String[]{}, false), new String[][]{{"deleteAll", "char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}), new String[][]{{"appendPadding", "int,char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0\000\000\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0\000\000\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"-2147483647", "-12", "}"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"hTitle", "1.12345678901234a675."}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asReader", ""}}), new String[][]{{"capacity", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("38", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getNewLineText", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char"}, new String[]{"-2147483648", " "}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char"}, new String[]{"m"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "validateRange", "int,int", "-2147483648", "-261986"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<sample:5>", "-2147483587", "67108855"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<sample:3>"}, {"org.apache.commons.lang.text.StrBuilder", "append", "char[],int,int", "<sample:2>", "2147483647", "12582904"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "?"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("? {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "? {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{}), new String[][]{{"append", "long", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("true9223372036854775807 {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "true9223372036854775807 {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:3>"}, false), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "1"}, {"appendPadding", "int,char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"char", "char"}, new String[]{"0", "x"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"[/+2]"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNewLineText", "java.lang.String", "-0-0"}}), new String[][]{{"appendFixedWidthPadLeft", "java.lang.Object,int,char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("[/+2] {getNewLineText=-0-0, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[/+2] {getNewLineText=-0-0, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equals", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asTokenizer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:3>", "{{g\"a\":1}", "-16777208", "0", "-2147483648"}}), new String[][]{{"deleteFirst", "char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"000"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "-8388575", "109"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=000, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=000, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<s:Db>", "-33554417", "o"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "validateRange", "int,int", "4064", "-16777208"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "int", "2147483647"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "java.lang.Object,int,char", "<i:-10>", "-939393027", "x"}}), new String[][]{{"contains", "char", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647true {getNewLineText=null, getNullText=null, isEmpty=false, length=14, size=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaa"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,long", "2147483647", "2"}, {"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", "a,b,"}}), new String[][]{{"deleteAll", "org.apache.commons.lang.text.StrMatcher", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=aaaaaaaaaaaaaa, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=aaaaaaaaaaaaaa, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "java.lang.Object"}, new String[]{"2147483647", "<i:-51>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[]", "2147483647", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "1.1 234567"}}), new String[][]{{"indexOf", "char,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0\n {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:0>", "2", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "1.H1234567", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "-32.48"}, {"org.apache.commons.lang.text.StrBuilder", "append", "char", "w"}}), new String[][]{{"appendNewLine", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-32.48w\n {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-32.48w\n {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "double"}, new String[]{"48", "1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:3>", "2147483647"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Iterator,java.lang.String", "<sample:2>", "\n{\"a\"d1}9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"java.lang.String"}, new String[]{"1._26"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "\t", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:0>", "1\""}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[],int,int", "<empty>", "-20", "-50"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("b {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "b {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<i:-8206>", "106", "\""}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-8206\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" {getNewLineText=null, getNullText=null, isEmpty=false, length=106, size=106}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-8206\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" {getNewLineText=null, getNullText=null, isEmpty=false, length=106, size=106}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendNull", ""}}), new String[][]{{"append", "java.lang.String,int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setLength", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"char"}, new String[]{"t"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "org.apache.commons.lang.text.StrMatcher", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String", "int", "int", "int"}, new String[]{"<sample:10>", "21474836348", "1073741793", "8", "2147483647"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,int", "-7", "-39"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}), new String[][]{{"deleteFirst", "java.lang.String", "7"}, {"insert", "int,double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 -1.0a {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 -1.0a {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "java.lang.String"}, new String[]{"79", "Invalid nffset: "}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "substring", "int", "-2147483648"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String", "1.5123456789012345678901234567890"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{"int", "int"}, new String[]{"-33554417", "-2097086"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"char[]"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", "//b"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[a, 0, \000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false), new String[][]{{"appendNull", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<i:-268435512>"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "-2147483648", "16"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-268435512 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-268435512 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:6>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "long"}, new String[]{"4045", "9223372036854775807"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"append", "java.lang.CharSequence,int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:8>"}, false, 6, new String[][]{}), new String[][]{{"insert", "int,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" a00 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a00 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"int", "int", "java.lang.String"}, new String[]{"69206007", "2147483647", ">"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"int"}, new String[]{"2147483647"}, false), new String[][]{{"deleteAll", "org.apache.commons.lang.text.StrMatcher", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("2147483647 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2147483647 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483610>"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "delete", "int,int", "64", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"append", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1 {length=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "\u00e9"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\u00e9, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\u00e9 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"NaN"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0NaN {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0NaN {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}), new String[][]{{"insert", "int,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample0 {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample0 {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "leftString", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:5>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"int", "int", "char[]", "int"}, new String[]{"-25165840", "-2147483648", "<sample:5>", "2147483647"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String"}, new String[]{"5/"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "java.lang.String", "<a>b</a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"{"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:7>"}}), new String[][]{{"deleteFirst", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("{ {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{ {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"java.lang.String"}, new String[]{"startIndex must be valid+1"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<sample:3>"}, {"org.apache.commons.lang.text.StrBuilder", "charAt", "int", "-134217922"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "1._2}", "-5"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String", "WT2H"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "WT2H {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String", "int"}, new String[]{".5", "268435420"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"int", "int", "char"}, new String[]{"-2147483648", "2147483647", "x"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "boolean"}, new String[]{"-1", "true"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char,int", "6", "67108897"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{"\000", "-81"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder,int,int", "<sample:8>", "0", "2147483647"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "-2", "1879048255", "_"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<i:-2147483648>", "2147483647", "-"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"java.lang.String"}, new String[]{"Hell?o, World"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:0>", "5"}}), new String[][]{{"getNewLineText", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "int"}, new String[]{"1879048255", "1073741824"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "trim", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"int"}, new String[]{"-4056"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "char", "/"}}), new String[][]{{"deleteAll", "char", "1"}, {"append", "java.lang.StringBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-4056 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-4056 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "rightString", new String[]{"int"}, new String[]{"-2147483590"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getNewLineText", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
}
