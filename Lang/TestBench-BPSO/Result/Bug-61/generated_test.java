package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char[]"}, new String[]{"0", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:1>", "112:30::45", "74", "-2147483648", "-1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" a {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<null>", "0100x1F"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<empty>"}, false), new String[][]{{"isEmpty", "", "7"}, {"indexOf", "char,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}), new String[][]{{"capacity", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:4>", "-1", "-5"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"-6"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setCharAt", "int,char", "38", "\000"}}), new String[][]{{"asReader", "", "0"}, {"read", "char[],int,int", "1"}, {"markSupported", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-6 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "boolean"}, new String[]{"0", "false"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("false {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "false {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteCharAt", new String[]{"int"}, new String[]{"-3"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"33.0"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:4>"}}), new String[][]{{"deleteCharAt", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("33.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "33.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"5l", "-1073741792", "77"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}), new String[][]{{"append", "java.lang.String", "2"}, {"endsWith", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<s:a>", "-2147482605", "i"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:9>"}}), new String[][]{{"appendNewLine", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:1>"}}), new String[][]{{"ready", "", "1"}, {"reset", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "true"}}), new String[][]{{"getNullText", "", "2"}, {"deleteAll", "org.apache.commons.lang.text.StrMatcher", "7"}, {"deleteAll", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("truetrue {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "truetrue {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:1>", "1.12345678901234567"}, false, 1, new String[][]{}), new String[][]{{"asReader", "", "4"}, {"read", "char[]", "0"}, {"read", "java.nio.CharBuffer", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "b1.123456789012345672 {getNewLineText=null, getNullText=null, isEmpty=false, length=21, size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "midString", new String[]{"int", "int"}, new String[]{"31", "76"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "62"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String"}, new String[]{"\t-"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setLength", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "m", "1073741859"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,java.lang.Object", "-50", "<s:kez>"}}), new String[][]{{"deleteAll", "char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("smple {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "smple {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<s:kevy>", "-2147482605", "h"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNewLineText", "java.lang.String", "/10"}, {"org.apache.commons.lang.text.StrBuilder", "size", ""}}), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder,int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<empty>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "NaN"}}), new String[][]{{"ensureCapacity", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("NaN {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"write", "char[],int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{"/a/b12:30:45"}, false, 3, new String[][]{}, 2), new String[][]{{"appendNewLine", "", "6"}, {"contains", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/a/b12:30:45 {getNewLineText=/a/b12:30:45, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<null>", "1621", "d"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<empty>", "{\"a\":1}"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"int", "int", "char[]", "int"}, new String[]{"70", "38", "<sample:0>", "262072"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "trim", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{"Uitl]"}, false), new String[][]{{"append", "java.lang.String,int,int", "1"}, {"deleteAll", "org.apache.commons.lang.text.StrMatcher", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a {getNewLineText=Uitl], getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getNewLineText=Uitl], getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"char"}, new String[]{"\037"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "17", "1.6"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String", "TITLE1.1234567"}}), new String[][]{{"appendFixedWidthPadLeft", "java.lang.Object,int,char", "7"}, {"indexOf", "char", "5"}, {"deleteAll", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("TITLE1.1234567 true {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "TITLE1.1234567 true {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[],int,int", "<null>", "3242", "9"}}, 3), new String[][]{{"appendFixedWidthPadLeft", "int,int,char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1.5d {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.5d {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "char", "/"}, {"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "-50"}}), new String[][]{{"charAt", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"char"}, new String[]{"c"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:1>", "1"}}), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "6"}, {"insert", "int,long", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samp5lea10 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samp5lea10 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<sample:4>"}, {"org.apache.commons.lang.text.StrBuilder", "toString", ""}}), new String[][]{{"contains", "java.lang.String", "3"}, {"appendFixedWidthPadRight", "java.lang.Object,int,char", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" a\nke {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a\nke {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"char"}, new String[]{"9"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "org.apache.commons.lang.text.StrMatcher", "<sample:5>"}}), new String[][]{{"insert", "int,float", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sam0.0ple {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sam0.0ple {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "-2147483648"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"char", "int"}, new String[]{"e", "-1073741792"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "float", "30.0"}, {"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample30.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"endsWith", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "false {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setCharAt", new String[]{"int", "char"}, new String[]{"-2147482605", ","}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"long"}, new String[]{"-9223372019674906592"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Iterator,java.lang.String", "<sample:0>", "i"}, {"org.apache.commons.lang.text.StrBuilder", "appendNewLine", ""}}), new String[][]{{"append", "java.lang.StringBuffer,int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char"}, new String[]{"0", "\001"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "charAt", "int", "85"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\001 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\001 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"reset", "", "4"}, {"close", "", "4"}, {"skip", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "reverse", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<null>", "32\n"}}), new String[][]{{"endsWith", "java.lang.String", "5"}, {"insert", "int,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"char"}, new String[]{"c"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendNewLine", ""}}, 3), new String[][]{{"delete", "int,int", "3"}, {"insert", "int,long", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "midString", new String[]{"int", "int"}, new String[]{"-262081", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:4>", "!/"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "!/a {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<sample:3>", "64", "-560"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"char"}, new String[]{"a"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("smple {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "smple {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "startIndex ust be valid"}}, 3), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "3"}, {"indexOf", "char,int", "6"}, {"getNewLineText", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "key {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"char", "char"}, new String[]{"@", "X"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "\n8"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<b:true>"}}), new String[][]{{"insert", "int,double", "6"}, {"deleteAll", "org.apache.commons.lang.text.StrMatcher", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("tru0.0e {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "tru0.0e {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"float"}, new String[]{"-0.0"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<null>"}, {"org.apache.commons.lang.text.StrBuilder", "size", ""}}), new String[][]{{"equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-0.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "java.lang.String"}, new String[]{"2147483647", "1E-5ia b"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "midString", "int,int", "-2147483565", "3242"}, {"org.apache.commons.lang.text.StrBuilder", "substring", "int", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<sample:5>"}}, 2), new String[][]{{"deleteAll", "org.apache.commons.lang.text.StrMatcher", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "-2147483648", "3242", "<sample:3>", "536870910"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<d:-2.2>"}}, 3), new String[][]{{"insert", "int,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-2.2 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-2.2 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"char[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "-50"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "PT1hH"}, false), new String[][]{{"appendFixedWidthPadLeft", "java.lang.Object,int,char", "0"}, {"append", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("false {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "false {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"org.apache.commons.lang.text.StrMatcher", "int"}, new String[]{"<sample:7>", "-2145385471"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "java.lang.Object,int,char", "<d:1.5>", "-1610611693", "T"}, {"org.apache.commons.lang.text.StrBuilder", "contains", "java.lang.String", "PT\t1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false), new String[][]{{"close", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<sample:2>", "0", "262062"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:0>", "a"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,int", "2147482567", "-2147483585"}}), new String[][]{{"asWriter", "", "2"}, {"flush", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:0>", "32"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String,int,int", "a aPT1hH", "2147483647", "1"}, {"org.apache.commons.lang.text.StrBuilder", "equals", "java.lang.Object", "<i:1>"}}), new String[][]{{"asReader", "", "1"}, {"ready", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setLength", new String[]{"int"}, new String[]{"1044"}, false), new String[][]{{"append", "double", "7"}, {"append", "org.apache.commons.lang.text.StrBuilder", "7"}, {"appendWithSeparators", "java.util.Iterator,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#1126#-1977820259", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#1126#-1977820259", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "startsWith", new String[]{"java.lang.String"}, new String[]{"Invald startIndex: "}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample a {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<sample:3>"}}), new String[][]{{"deleteFirst", "java.lang.String", "4"}, {"appendWithSeparators", "java.util.Collection,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0samplesamplesample {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0samplesamplesample {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:4>"}}), new String[][]{{"appendPadding", "int,char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("aa {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "aa {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "4"}, {"contains", "org.apache.commons.lang.text.StrMatcher", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample0a {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String", "int"}, new String[]{"5", "2147483647"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:5>", "1073741823"}}, 1), new String[][]{{"deleteFirst", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samplesample {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samplesample {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setCharAt", new String[]{"int", "char"}, new String[]{"0", "G"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("Gample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Gample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"5", "D"}, false, 5, new String[][]{}, 2), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "2"}, {"appendPadding", "int,char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("00samplesamplesampleaa {getNewLineText=null, getNullText=null, isEmpty=false, length=22, size=22}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "00samplesamplesampleaa {getNewLineText=null, getNullText=null, isEmpty=false, length=22, size=22}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{"}", "2147483647"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "-2147483565"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}), new String[][]{{"deleteAll", "char", "1"}, {"append", "org.apache.commons.lang.text.StrBuilder,int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Iterator,java.lang.String", "<null>", "1"}}, 2), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "0"}, {"getChars", "char[]", "1"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "546", "/"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "//0xFFFFFFFF", "1E-5Invalid startIndex: "}}), new String[][]{{"appendPadding", "int,char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////...#630#1496017347", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////...#630#1496017347", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"-2147483647", "C"}, false, 6, new String[][]{}), new String[][]{{"append", "char[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char", "2147483647", "u"}}, 2), new String[][]{{"append", "java.lang.CharSequence,int,int", "1"}, {"write", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "a\001 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"T3le", "1.51"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}}), new String[][]{{"asReader", "", "0"}, {"transferTo", "java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char", "e"}}, 1), new String[][]{{"indexOf", "java.lang.String,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "samplesample {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false), new String[][]{{"mark", "int", "5"}, {"skip", "long", "0"}, {"skip", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:4>", "<a>bH/a>"}, false), new String[][]{{"asReader", "", "0"}, {"read", "", "3"}, {"read", "char[]", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0<a>bH/a> {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setLength", new String[]{"int"}, new String[]{"74"}, false, 7, new String[][]{}), new String[][]{{"asReader", "", "6"}, {"read", "char[],int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"int", "int", "char"}, new String[]{"2147483647", "-2147483648", "e"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "char[]", "<sample:1>"}}), new String[][]{{"indexOf", "org.apache.commons.lang.text.StrMatcher", "5"}, {"charAt", "int", "3"}, {"deleteFirst", "char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:0>", "11.134567"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "ensureCapacity", "int", "2097154"}}, 2), new String[][]{{"append", "java.lang.String,int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteCharAt", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a", "000"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("s000mple {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "s000mple {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String", "int"}, new String[]{"", "32"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "char,char", "v", "v"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "50", "239", "a"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=50aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.., getTokenArray=[50aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.., hasNext=true, ...#278#-1895214344", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "50aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...#316#-531893879", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false), new String[][]{{"reset", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=, getTokenArray=[], hasNext=false, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"char"}, new String[]{"a"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TTITLElength must be valid", "7638"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "21474836481.5fPT1hH", "<null>"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "int,int,char", "1073741859", "-262076", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"Invalid startHndex: "}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<sample:0>", "0", "-65832"}}), new String[][]{{"append", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samplefalse {getNewLineText=null, getNullText=Invalid startHndex: , isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samplefalse {getNewLineText=null, getNullText=Invalid startHndex: , isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nvl-", "Uitle"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:5>", "1.12345678901334567--1", "-2147483648", "-131664", "-2147483648"}}), new String[][]{{"deleteFirst", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("smple {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "smple {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<null>", "34", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder,int,int", "<sample:0>", "1073741823", "5"}}, 3), new String[][]{{"appendFixedWidthPadLeft", "int,int,char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setLength", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "char[]", "<null>"}}), new String[][]{{"appendFixedWidthPadRight", "int,int,char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("200 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "200 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<sample:4>", "10", "32"}, {"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "null", "nullH"}}, 3), new String[][]{{"contains", "java.lang.String", "4"}, {"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "reverse", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "elpmas {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "int"}, new String[]{"262072", "-4021"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "["}, {"org.apache.commons.lang.text.StrBuilder", "replace", "int,int,java.lang.String", "2", "2147483647", ",32"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "//[1,2]"}}), new String[][]{{"insert", "int,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String", "int"}, new String[]{"", "1"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "int", "262072"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "262072 {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toString", ""}, {"org.apache.commons.lang.text.StrBuilder", "getNullText", ""}}), new String[][]{{"read", "", "1"}, {"read", "char[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String", "int"}, new String[]{"<null>", "-1073741759"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<sample:2>", "-2147483616", "2147483601"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char[]"}, new String[]{"2", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<s:kenz>"}}), new String[][]{{"appendWithSeparators", "java.util.Iterator,java.lang.String", "0"}, {"indexOf", "char,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "kenz {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2", "Uitl-0.0"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-Uitl-0.0147483648 {getNewLineText=null, getNullText=null, isEmpty=false, length=18, size=18}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Uitl-0.0147483648 {getNewLineText=null, getNullText=null, isEmpty=false, length=18, size=18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"11L", "1", "-33554152"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"int", "int", "char[]", "int"}, new String[]{"262076", "9", "<sample:2>", "169"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:2>", "ITmKE"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "int"}, new String[]{"0", "262140"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[],int,int", "<sample:2>", "2147483647", "31"}, {"org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", ""}}), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("2621400 {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2621400 {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String"}, new String[]{"1.12345678901r334567--1"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:2>", "end  <"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String", "Hemlo, 5."}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("Hemlo,end  <5. {getNewLineText=null, getNullText=null, isEmpty=false, length=14, size=14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Hemlo,end  <5. {getNewLineText=null, getNullText=null, isEmpty=false, length=14, size=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:2>", "4", "-4"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "-17", "\ufffe"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "startsWith", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "float"}, new String[]{"-2147483648", "-0.2"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "", ";end  <"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{"int", "int"}, new String[]{"0", "2147483647"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<sample:2>", "37", "2147483551"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[s, a, m, p, l, e]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"-", "X"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "-3.248"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", "-00T\n"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("X3.248 {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "X3.248 {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "3242", "-33554136"}}, 2), new String[][]{{"write", "java.lang.String,int,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:2>", "1", "2147483647"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "float", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{"d", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "java.lang.String", "1010/a/b"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "char", "8"}, {"org.apache.commons.lang.text.StrBuilder", "replaceAll", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:7>", "PT\t1H"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1300238314", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"char", "char"}, new String[]{"7", "f"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "2147483647", "2048", "7"}, {"org.apache.commons.lang.text.StrBuilder", "append", "long", "29"}}), new String[][]{{"appendFixedWidthPadRight", "int,int,char", "2"}, {"contains", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample214f4836477777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777...#2136#-1992658037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<null>", "3242", "\001"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNewLineText", "java.lang.String", "2020-00-01"}, {"org.apache.commons.lang.text.StrBuilder", "trim", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false), new String[][]{{"write", "char[]", "0"}, {"append", "java.lang.CharSequence,int,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", " a {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "substring", new String[]{"int"}, new String[]{"4"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("le", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<null>", "16", "-2145385471"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}, {"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:0>"}}), new String[][]{{"append", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("true {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "true {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hemlo, }World1.1234567890123456", "Hemlo, }World1\t.1234567890123456"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "2L", "-2147483648"}}, 2), new String[][]{{"delete", "int,int", "5"}, {"appendFixedWidthPadRight", "java.lang.Object,int,char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("saple {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "saple {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "boolean"}, new String[]{"0", "true"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "float", "-0.2"}}), new String[][]{{"charAt", "int", "6"}, {"indexOf", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "true-0.2 {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char[]"}, new String[]{"0", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", ",32\t"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<sample:2>", "<null>"}, false, 0, null, 2), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0true0c {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0true0c {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "startsWith", new String[]{"java.lang.String"}, new String[]{"-0/\n"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "java.lang.String", ",{"}, {"org.apache.commons.lang.text.StrBuilder", "append", "float", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-0.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"read", "char[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "isEmpty", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<i:-1>", "1", "\001"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "char", "T"}}, 3), new String[][]{{"asWriter", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "- {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"org.apache.commons.lang.text.StrMatcher", "int"}, new String[]{"<sample:0>", "536"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", "ITLE"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char"}, new String[]{"v"}, false, 0, null, 2), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"contains", "char", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "v {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "trim", ""}}, 2), new String[][]{{"insert", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}, 3), new String[][]{{"insert", "int,char[]", "3"}, {"appendFixedWidthPadLeft", "int,int,char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("s aamplesample    4 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "s aamplesample    4 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "double"}, new String[]{"-1073741813", "3.2"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "-34"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:10>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"java.lang.String"}, new String[]{"1.12345678901r334567--1"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[],int,int", "597", "<sample:2>", "85", "-3"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"setQuoteChar", "char", "4"}, {"previous", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "delete", new String[]{"int", "int"}, new String[]{"-32916", "536"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setCharAt", new String[]{"int", "char"}, new String[]{"2147483647", "P"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String", "int", "int", "int"}, new String[]{"<sample:8>", ".55", "0", "1073741311", "10"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "leftString", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:2>"}}, 3), new String[][]{{"indexOf", "char,int", "7"}, {"appendPadding", "int,char", "3"}, {"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"//", "-2147483648", "-1"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "length", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "java.lang.Object"}, new String[]{"262076", "<i:53>"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "java.lang.Object,int,char", "<s:b>", "5", "@"}, {"org.apache.commons.lang.text.StrBuilder", "append", "double", "-3.248"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"int"}, new String[]{"-1073741823"}, false, 3, new String[][]{}, 3), new String[][]{{"deleteFirst", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-1073741823 {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1073741823 {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 3, new String[][]{}, 1), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("key {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "key {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"char"}, new String[]{"H"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "validateIndex", "int", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:1>"}, false, 0, null, 3), new String[][]{{"contains", "java.lang.String", "4"}, {"capacity", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"java.lang.String"}, new String[]{"ssartIndex must 9e valid"}, false, 2, new String[][]{}, 2), new String[][]{{"appendNewLine", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{"int", "int"}, new String[]{"-2147483648", "-8212"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:2>", "2147483647", "67108874"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String", "Invalid length:;"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<s:v>", "-16777068", "f"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "double"}, new String[]{"170", "-1.7976931348623157E308"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 1), new String[][]{{"append", "java.lang.String,int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char"}, new String[]{"-2147483598", "d"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "[1,2]"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"float"}, new String[]{"-3.4028235E38"}, false, 2, new String[][]{}, 1), new String[][]{{"append", "java.lang.StringBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample-3.4028235E38sample {getNewLineText=null, getNullText=null, isEmpty=false, length=25, size=25}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample-3.4028235E38sample {getNewLineText=null, getNullText=null, isEmpty=false, length=25, size=25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char"}, new String[]{"10", "F"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:2>", "//"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"int", "int", "java.lang.String"}, new String[]{"1073741849", "17", "0x12345789"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "-298", "2147483647", "<sample:1>", "62"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "size", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "19", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String", "1.12345678901r234567--1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"/", "\000"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{"+", "-2147483563"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "nulgl", "Title"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,long", "2", "31"}}, 3), new String[][]{{"append", "int", "7"}, {"indexOf", "org.apache.commons.lang.text.StrMatcher,int", "7"}, {"deleteAll", "char", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("4 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "4 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:4>", "-1072", "-1073741823"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "P1hH", "2147483642"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char"}, new String[]{"{"}, false, 0, null, 3), new String[][]{{"insert", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", "-00I\n"}, false, 5, new String[][]{}, 3), new String[][]{{"deleteAll", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("00-00I\n-00I\n {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "00-00I\n-00I\n {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"char"}, new String[]{"f"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "delete", "int,int", "-262194", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<null>", "1.6f"}, false, 0, null, 3), new String[][]{{"append", "char[]", "4"}, {"append", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" a1.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a1.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "boolean"}, new String[]{"-2130706396", "false"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asTokenizer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "delete", new String[]{"int", "int"}, new String[]{"16538", "-2147483632"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "char,char", "D", "6"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "reverse", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"deleteFirst", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getNullText", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String", "int", "int", "int"}, new String[]{"<sample:8>", "-1.0", "-262076", "-536870896", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteCharAt", "int", "15"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"-262081", "-2147483648", "e"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "trim", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getNewLineText", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:8>", "1I.1234567"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:3>", "33572405", "42"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"appendFixedWidthPadLeft", "java.lang.Object,int,char", "2"}, {"indexOf", "char", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<null>", "Hemlo, }Worldr1.12345678:0123456"}, false, 5, new String[][]{}, 3), new String[][]{{"appendWithSeparators", "java.util.Iterator,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=, getTokenArray=[], hasNext=false, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char"}, new String[]{"\ufffe"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,java.lang.String", "-2147483559", "c1L123456789012345678901234567890"}}, 2), new String[][]{{"append", "java.lang.Object", "7"}, {"indexOf", "org.apache.commons.lang.text.StrMatcher", "0"}, {"deleteAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\ufffetrue {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\ufffetrue {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "java.lang.String"}, new String[]{"-2147483648", "-0.01.25startIndex mst be validtrue"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "org.apache.commons.lang.text.StrMatcher", "<sample:8>"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<sample:6>", "55", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setLength", new String[]{"int"}, new String[]{"-50"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String"}, new String[]{"4."}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "delete", "int,int", "-1073741859", "262076"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,int", "1072", "-3"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:3>"}, false, 0, null, 1), new String[][]{{"insert", "int,char[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char[]", "int", "int"}, new String[]{"1073741823", "<sample:0>", "1", "21"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "char", "d"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"float"}, new String[]{"NaN"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String,int,int", "Hello, World0xFFFFFFFF", "16514000", "8388637"}}, 3), new String[][]{{"contains", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"0Cx1Faaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 6, new String[][]{}, 2), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "2"}, {"append", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0Cx1Faaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue {getNewLineText=null, getNullText=null, isEmpty=false, length=39, size=39}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0Cx1Faaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue {getNewLineText=null, getNullText=null, isEmpty=false, length=39, size=39}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "clear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"P", "7"}, false, 0, null, 3), new String[][]{{"asWriter", "", "5"}, {"append", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"java.lang.String"}, new String[]{"/10"}, false, 0, null, 2), new String[][]{{"append", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "substring", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "int,int,java.lang.String", "2147483647", "263102", "Invalid  stbrtIndex: i"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteCharAt", new String[]{"int"}, new String[]{"-18"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 1), new String[][]{{"charAt", "int", "2"}, {"contains", "org.apache.commons.lang.text.StrMatcher", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " a {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteCharAt", "int", "-1073741706"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"org.apache.commons.lang.text.StrMatcher", "int"}, new String[]{"<sample:5>", "32"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 2, new String[][]{}, 3), new String[][]{{"insert", "int,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samsampleplea {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samsampleplea {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", ".5"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "validateIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<sample:4>", "-2147483648", "15"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"java.lang.String"}, new String[]{"PT1hH"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<s:bb>", "-33", "\001"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String"}, new String[]{"//"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:1>", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" a {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "clear", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "float"}, new String[]{"16", "7.6287162E18"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String"}, new String[]{"1.12345678901334567--1"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "java.lang.String"}, new String[]{"1073741824", "31"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{"Title1.12345678901234567"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "java.lang.String", "-1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=Title1.12345678901234567, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=Title1.12345678901234567, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:1>", "2147482623", "-17"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendNull", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "validateIndex", new String[]{"int"}, new String[]{"27"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String", "int"}, new String[]{"abc", "2147483642"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1.7976931348623157E308 {getNewLineText=null, getNullText=null, isEmpty=false, length=22, size=22}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.7976931348623157E308 {getNewLineText=null, getNullText=null, isEmpty=false, length=22, size=22}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendNull", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "substring", new String[]{"int", "int"}, new String[]{"33554464", "-2147483648"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0false {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0false {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:2>", "32", "2147483647", "2147482623", "148"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("b {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "b {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"char"}, new String[]{"i"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:v>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "!"}}), new String[][]{{"contains", "char", "4"}, {"deleteAll", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("!v {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "!v {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"char"}, new String[]{"\002"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "size", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "int,int,java.lang.String", "2147483647", "-1", "Title1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"char"}, new String[]{"\u00e9"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String", "int"}, new String[]{"1.1234567890123456", "63"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "reverse", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<sample:1>", "32916", "\""}, false), new String[][]{{"indexOf", "org.apache.commons.lang.text.StrMatcher", "6"}, {"insert", "int,java.lang.String", "3"}, {"indexOf", "org.apache.commons.lang.text.StrMatcher,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"...#32997#1093043568", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0-2147483648 {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0-2147483648 {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "substring", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[],int,int", "31", "<null>", "99", "-19"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"{\"a!91}"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "java.lang.String", "Hemlo, }World"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("{\"a!91} {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"a!91} {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"T3le"}, false, 1, new String[][]{}), new String[][]{{"deleteFirst", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("T3le {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "T3le {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char"}, new String[]{"2147483647", "\002"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "-2147483585", "33", "<sample:1>", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "java.lang.Object,int,char", "<i:0>", "-2147483585", "D"}}), new String[][]{{"mark", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "double"}, new String[]{"536903828", "2.7"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<sample:1>", "32", "2147483647"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "boolean"}, new String[]{"2145385471", "false"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"java.lang.String"}, new String[]{"0x12345789"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<null>", "0xFFFFFFFF"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"length must be valid", "15", "32916"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Uitle", "1010"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=1.25, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=1.25, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char[]"}, new String[]{"74", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"char"}, new String[]{" "}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<sample:1>", "19", "2145385471"}}), new String[][]{{"appendFixedWidthPadRight", "java.lang.Object,int,char", "1"}, {"deleteAll", "org.apache.commons.lang.text.StrMatcher", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("NaN {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setCharAt", "int,char", "2147483647", "\000"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "startsWith", new String[]{"java.lang.String"}, new String[]{"startIndex must be valid"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"long"}, new String[]{"31"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("31 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "31 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"java.lang.String"}, new String[]{"12:i0:45"}, false), new String[][]{{"contains", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "substring", new String[]{"int", "int"}, new String[]{"-2147483565", "2145385471"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "length", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"74", ";"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; {getNewLineText=null, getNullText=null, isEmpty=false, length=74, size=74}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; {getNewLineText=null, getNullText=null, isEmpty=false, length=74, size=74}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"int"}, new String[]{"-2147483598"}, false), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "2"}, {"insert", "int,double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-Infinity2147483598 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity2147483598 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<s:?b>", "2147483647", "e"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<s:k{y>", "77", "\""}, false), new String[][]{{"getChars", "char[]", "7"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[k, {, y, \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \", \"...#231#1437149775", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "k{y\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" {getNewLineText=null, getNullText=null, isEmpty=false, length=77, size=77}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:3>", "Invalid startIndex: i"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samplesample {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samplesample {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String", "int"}, new String[]{"2020-02-30T25:61:61", "33"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String", "a,b,cnull"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a,b,cnull {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "isEmpty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:1>", "1.51.12345678"}, false), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a1.51.123456780 {getNewLineText=null, getNullText=null, isEmpty=false, length=15, size=15}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a1.51.123456780 {getNewLineText=null, getNullText=null, isEmpty=false, length=15, size=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "0Cx1F", "2147483642"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=, getTokenArray=[], hasNext=false, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteCharAt", new String[]{"int"}, new String[]{"19"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "clear", ""}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"-29", "A"}, false), new String[][]{{"charAt", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:3>", "-33554136", "10"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "isEmpty", ""}, {"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "2147483642"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"char", "char"}, new String[]{"!", "e"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "charAt", "int", "-2147483648"}, {"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:5>", "Invalid length:;", "2147483647", "31", "8269"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:?b>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:2>"}, false), new String[][]{{"indexOf", "char", "4"}, {"contains", "char", "3"}, {"append", "java.lang.String,int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "5"}, {"append", "long", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0true0c-1 {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0true0c-1 {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<s:>", "3", "p"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}}), new String[][]{{"charAt", "int", "2"}, {"append", "long", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("ppp4 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ppp4 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{"1.1234r678"}, false), new String[][]{{"deleteAll", "char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=1.1234r678, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=1.1234r678, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "true {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false), new String[][]{{"ready", "", "0"}, {"markSupported", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:5>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{"int", "int"}, new String[]{"588", "33"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"java.lang.String"}, new String[]{"-0.01.25startIndex must be valid"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<sample:1>"}}), new String[][]{{"append", "java.lang.String,int,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"Infinity"}, false, 3, new String[][]{}), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "5"}, {"contains", "java.lang.String", "3"}, {"appendFixedWidthPadLeft", "int,int,char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("Infinitya000sample002 {getNewLineText=null, getNullText=null, isEmpty=false, length=21, size=21}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Infinitya000sample002 {getNewLineText=null, getNullText=null, isEmpty=false, length=21, size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "int"}, new String[]{"-6", "-111"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setLength", new String[]{"int"}, new String[]{"11"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000\000\000\000\000\000\000\000\000\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:0>"}, false), new String[][]{{"contains", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "  {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"int", "int", "char"}, new String[]{"1073741823", "-2147483598", ","}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "java.lang.String", "1L"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char", "1073741821", "/"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"0.0"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer", "<empty>"}}), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "5"}, {"appendFixedWidthPadLeft", "int,int,char", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "size", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "java.lang.String"}, new String[]{"15", " 0/"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}), new String[][]{{"insert", "int,double", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"7628716375283629643"}, false, 2, new String[][]{}), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "1"}, {"indexOf", "java.lang.String,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample7.6287163752836301E18a00 {getNewLineText=null, getNullText=null, isEmpty=false, length=30, size=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"7.6287163752836301E18"}, false, 3, new String[][]{}), new String[][]{{"contains", "java.lang.String", "4"}, {"getNewLineText", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "7.6287163752836301E18 {getNewLineText=null, getNullText=null, isEmpty=false, length=21, size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String"}, new String[]{"ull"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"320.0"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String", " 1.12345678"}}), new String[][]{{"appendFixedWidthPadRight", "java.lang.Object,int,char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" 1.12345678320.0b {getNewLineText=null, getNullText=null, isEmpty=false, length=17, size=17}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " 1.12345678320.0b {getNewLineText=null, getNullText=null, isEmpty=false, length=17, size=17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:2>", "Hello, Wprld0x123456789"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("2Hello, Wprld0x123456789keyHello, Wprld0x1234567890 {getNewLineText=null, getNullText=null, isEmpty=false, length=51, size=51}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2Hello, Wprld0x123456789keyHello, Wprld0x1234567890 {getNewLineText=null, getNullText=null, isEmpty=false, length=51, size=51}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<sample:2>", "end <"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNewLineText", "java.lang.String", "Hemlo, }World1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=Hemlo, }World1.1234567890123456, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=Hemlo, }World1.1234567890123456, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:3>", "0b"}, false), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "7"}, {"insert", "int,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samsampleple {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samsampleple {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "leftString", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:1>", "Inva0id offset: "}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "1-5d"}}), new String[][]{{"append", "java.lang.StringBuffer", "3"}, {"indexOf", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "samplebInva0id offset: 2 {getNewLineText=null, getNullText=null, isEmpty=false, length=24, size=24}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:6>"}}), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("c-1 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "c-1 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
}
