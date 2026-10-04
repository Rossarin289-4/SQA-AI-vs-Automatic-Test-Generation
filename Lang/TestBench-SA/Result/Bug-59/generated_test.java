package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"2147483647", "9", "m"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", ""}}), new String[][]{{"delete", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"-2097151", "9", "m"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:3>"}, {"org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", ""}}), new String[][]{{"delete", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"odt;l125Titke", "<null>"}, false, 17, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "\t"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:7>", "-7"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}}), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, \t]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0\t {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "5.0"}, false, 17, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "\t"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:7>", "-7"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}}, 2), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, \t]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0\t {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"!E", "5.0"}, false, 16, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<null>", "32", ">"}, {"org.apache.commons.lang.text.StrBuilder", "setCharAt", "int,char", "7", "0"}}), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "char", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-;5", "01.1vt"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,boolean", "9", "true"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[]", "1", "<empty>"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<sample:0>", "32", ">"}}, 3), new String[][]{{"getChars", "char[]", "2"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[s, a, m, p, l, e, a, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samplea>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> {getNewLineText=null, getNullText=null, isEmpty=false, length=38, size=38}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"char", "char"}, new String[]{"\000", "\000"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"P000-01.P01true", ".0"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "-31", "32"}, {"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:3>", "1.5", "1", "59", "-31"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:1>"}}), new String[][]{{"isEmpty", "", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}, {"indexOf", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345679", "+1Hell, Worc?ld"}, false, 12, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<empty>", "[,2]"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "-2147483647", "0.0"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<i:2>"}}), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("2 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Inual\nid+ offr202001-01", "+1Hfll,[ W9arc?le1.5dm1.25/x123456789http://xampl"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNewLineText", "java.lang.String", "1.5dm1.250x123456789"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "31"}, {"org.apache.commons.lang.text.StrBuilder", "ensureCapacity", "int", "0"}}, 1), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=1.5dm1.250x123456789, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=1.5dm1.250x123456789, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{" ", "\t"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "0", "F"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<null>", "0xFFFFFFFF"}, {"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "Inual\nid+ offr2020- 01-01"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=Inual\nid+ offr2020- 01-01, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=Inual\nid+ offr2020- 01-01, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"2020-02-30T35:61:61"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getNewLineText", ""}, {"org.apache.commons.lang.text.StrBuilder", "trim", ""}, {"org.apache.commons.lang.text.StrBuilder", "asTokenizer", ""}}, 1), new String[][]{{"indexOf", "java.lang.String,int", "2"}, {"append", "org.apache.commons.lang.text.StrBuilder", "7"}, {"contains", "java.lang.String", "7"}, {"endsWith", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "2020-02-30T35:61:61 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"Invalid offse: "}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:2>"}, {"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:8>"}, {"org.apache.commons.lang.text.StrBuilder", "asTokenizer", ""}}, 1), new String[][]{{"indexOf", "java.lang.String,int", "2"}, {"append", "org.apache.commons.lang.text.StrBuilder", "4"}, {"contains", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sampleInvalid offse:  {getNewLineText=null, getNullText=null, isEmpty=false, length=21, size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"Hnval{d ofgse: 12:30:45"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<null>"}, {"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:8>"}}, 1), new String[][]{{"indexOf", "java.lang.String,int", "2"}, {"append", "org.apache.commons.lang.text.StrBuilder", "7"}, {"contains", "java.lang.String", "7"}, {"contains", "org.apache.commons.lang.text.StrMatcher", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Hnval{d ofgse: 12:30:45 {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"d", "}"}, false, 9, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "clear", ""}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:3>", "123456789012345668901234567890"}, {"org.apache.commons.lang.text.StrBuilder", "append", "float", "1.026"}}, 2), new String[][]{{"contains", "char", "5"}, {"appendNewLine", "", "2"}, {"indexOf", "char,int", "7"}, {"insert", "int,double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("kInfinityey1.026\n {getNewLineText=null, getNullText=null, isEmpty=false, length=17, size=17}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "kInfinityey1.026\n {getNewLineText=null, getNullText=null, isEmpty=false, length=17, size=17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"e", "o"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Iterator,java.lang.String", "<empty>", "Inual\nid+!offs202001-01"}, {"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", "v_9"}, {"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "9", "1"}}, 3), new String[][]{{"asReader", "", "5"}, {"close", "", "7"}, {"skip", "long", "1"}, {"read", "char[]", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "samplo {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"}", "}"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Iterator,java.lang.String", "<empty>", "Inual\nid+!offs202101-01"}, {"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", "v\u00e9^"}}), new String[][]{{"asReader", "", "5"}, {"read", "char[]", "7"}, {"skip", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"\000", "7"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "clear", ""}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Iterator,java.lang.String", "<empty>", "Inual\nid+!offs202101-01"}, {"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", "v\u00e9^"}}), new String[][]{{"asReader", "", "5"}, {"read", "", "7"}, {"skip", "long", "1"}, {"read", "char[],int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<null>", "-127", "0"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "31"}, {"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "v\u00e9^"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("31v\u00e9^ {getNewLineText=null, getNullText=v\u00e9^, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "31v\u00e9^ {getNewLineText=null, getNullText=v\u00e9^, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"L", "2"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<sample:3>"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Iterator,java.lang.String", "<null>", "Inual\nid+!ogfs20101-001"}, {"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", "u\u00e9"}}), new String[][]{{"asReader", "", "6"}, {"read", "", "7"}, {"skip", "long", "1"}, {"transferTo", "java.io.Writer", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"?", "l"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<sample:5>"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Iterator,java.lang.String", "<sample:0>", "http://example/com/a?b=c"}, {"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", "u\u00ea"}}), new String[][]{{"asReader", "", "6"}, {"read", "char[]", "2"}, {"read", "", "0"}, {"read", "java.nio.CharBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "double"}, new String[]{"-3839", "-32.410000000000004"}, false, 8, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "java.lang.String", "abc7628716l375283629643"}, {"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String", "int"}, new String[]{"<null>", "33"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"long"}, new String[]{"7628716375283629644"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "a,b,c", "1048543"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("07628716375283629644 {getNewLineText=null, getNullText=null, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "07628716375283629644 {getNewLineText=null, getNullText=null, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}}), new String[][]{{"insert", "int,char", "7"}, {"deleteFirst", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("smp\000le\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "smp\000le\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char"}, new String[]{","}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "2147483647"}, {"org.apache.commons.lang.text.StrBuilder", "append", "int", "-127"}}), new String[][]{{"append", "java.lang.String,int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"int"}, new String[]{"-2147483647"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "-1073739726", "-3.4028235E38"}}), new String[][]{{"append", "java.lang.String,int,int", "1"}, {"ensureCapacity", "int", "7"}, {"append", "float", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-2147483647a-1.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=16, size=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-2147483647a-1.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=16, size=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getNewLineText", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder,int,int", "<sample:1>", "-2147483648", "1"}, {"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "1", "2147479551"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"-3839"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "char", "I"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:2>", "-7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "midString", new String[]{"int", "int"}, new String[]{"10", "59"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "midString", new String[]{"int", "int"}, new String[]{"0", "2147483615"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "true"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "42", "2148483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char,int", "m", "59"}}), new String[][]{{"deleteAll", "char", "2"}, {"insert", "int,java.lang.Object", "7"}, {"insert", "int,char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("trauec {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "trauec {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"long"}, new String[]{"7628716375283629642"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<empty>"}, {"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", "1.12D45679"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("7628716375283629642 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "7628716375283629642 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char", "e"}, {"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "123456789012345668901234567890"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String", "-"}}), new String[][]{{"deleteAll", "char", "2"}, {"insert", "int,java.lang.Object", "7"}, {"insert", "int,char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("s\000mplceflse {getNewLineText=null, getNullText=123456789012345668901234567890, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "s\000mplceflse {getNewLineText=null, getNullText=123456789012345668901234567890, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"false"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "123456789012345668901234567890"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String", ""}}), new String[][]{{"deleteAll", "char", "2"}, {"insert", "int,java.lang.Object", "7"}, {"insert", "int,char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("s\000mplceflse {getNewLineText=null, getNullText=123456789012345668901234567890, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "s\000mplceflse {getNewLineText=null, getNullText=123456789012345668901234567890, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"int", "int", "char[]", "int"}, new String[]{"1", "0", "<empty>", "59"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "charAt", new String[]{"int"}, new String[]{"-31"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "validateIndex", "int", "9"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "http/hxxampll"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:2>", "!F"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String,int,int", "1.5e300", "31", "31"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "http/hxxaampll1E-5", "-1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("2!Fkey!F0 {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2!Fkey!F0 {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", ""}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:0>", "/a/b"}}), new String[][]{{"mark", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}, {"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<null>"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "\n", "0x123456789"}}, 1), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"java.lang.String"}, new String[]{"ed ; saruaaaaDFaaaaaaaaaaaTaaaaaaaaaaaaHello, World"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "-6.7"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "", "0y1234567891.5dm1.250x123456789"}}), new String[][]{{"delete", "int,int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("- {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "- {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String", "int"}, new String[]{"<null>", "1073741823"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asTokenizer", ""}, {"org.apache.commons.lang.text.StrBuilder", "trim", ""}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "-2147483648", "-6.7"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<sample:2>", "59", "t"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,long", "5", "7628716375283629643"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "char", "F"}, {"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "-2147483615"}}, 3), new String[][]{{"deleteCharAt", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("tttttttttttttttttttttttttttttttttttttttttttttttttttttttttb {getNewLineText=null, getNullText=null, isEmpty=false, length=58, size=58}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "tttttttttttttttttttttttttttttttttttttttttttttttttttttttttb {getNewLineText=null, getNullText=null, isEmpty=false, length=58, size=58}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<null>", "-1"}, false, 13, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[],int,int", "<null>", "2147483647", "120"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<sample:1>", "10", "1073741823"}}), new String[][]{{"insert", "int,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:2>", ", P"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", ""}, {"org.apache.commons.lang.text.StrBuilder", "equals", "java.lang.Object", "<i:-2>"}}), new String[][]{{"insert", "int,java.lang.String", "6"}, {"insert", "int,float", "6"}, {"deleteAll", "java.lang.String", "0"}, {"indexOf", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "2, 0.0samplePkey, P0 {getNewLineText=null, getNullText=null, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:2>", "Inuak\nid+ offr2020-01-/1"}, false, 15, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "<null>"}}, 3), new String[][]{{"insert", "int,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("2Insampleuak\nid+ offr2020-01-/1keyInuak\nid+ offr2020-01-/10 {getNewLineText=null, getNullText=null, isEmpty=false, length=59, size=59}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2Insampleuak\nid+ offr2020-01-/1keyInuak\nid+ offr2020-01-/10 {getNewLineText=null, getNullText=null, isEmpty=false, length=59, size=59}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "capacity", ""}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<empty>", "httHp/h,xxa.;5"}}, 2), new String[][]{{"charAt", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,long", "9437151", "-9223372036854775808"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:1>", "1F-;envd < start"}, {"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}}), new String[][]{{"isEmpty", "", "6"}, {"asReader", "", "4"}, {"read", "char[],int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "1/25"}, {"org.apache.commons.lang.text.StrBuilder", "append", "char[],int,int", "<sample:1>", "0", "16337"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:5>", "1Fenvd < start"}}, 1), new String[][]{{"isEmpty", "", "6"}, {"append", "float", "4"}, {"insert", "int,long", "7"}, {"deleteFirst", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a1Fe5nvd < start1Fenvd < startsampleInfinity {getNewLineText=null, getNullText=1/25, isEmpty=false, length=44, size=44}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a1Fe5nvd < start1Fenvd < startsampleInfinity {getNewLineText=null, getNullText=1/25, isEmpty=false, length=44, size=44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:4>", "1Fenvd < start"}, {"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", "1.5d"}}, 1), new String[][]{{"isEmpty", "", "6"}, {"append", "float", "4"}, {"insert", "int,long", "7"}, {"deleteFirst", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1Fen5vd < startaInfinity {getNewLineText=null, getNullText=null, isEmpty=false, length=24, size=24}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1Fen5vd < startaInfinity {getNewLineText=null, getNullText=null, isEmpty=false, length=24, size=24}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setLength", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder,int,int", "<sample:7>", "10", "9"}}), new String[][]{{"insert", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "java.lang.Object", "<i:-1>"}}), new String[][]{{"write", "char[]", "3"}, {"append", "char", "1"}, {"flush", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000  {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}, {"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "31"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:4>", "length must be valid2020-02-3/T295:61:62length must be valid"}}, 1), new String[][]{{"deleteAll", "org.apache.commons.lang.text.StrMatcher", "0"}, {"isEmpty", "", "2"}, {"append", "org.apache.commons.lang.text.StrBuilder,int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<null>", "31", "-26"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:4>", "length must be valid2020-02-3/T295:61:62length must be valid"}, {"org.apache.commons.lang.text.StrBuilder", "toString", ""}}, 1), new String[][]{{"deleteAll", "org.apache.commons.lang.text.StrMatcher", "6"}, {"deleteAll", "char", "2"}, {"insert", "int,float", "2"}, {"appendWithSeparators", "java.lang.Object[],java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1.0lengthmustbevlid2020-02-3/T295:61:62lengthmustbevlid1 {getNewLineText=null, getNullText=null, isEmpty=false, length=56, size=56}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.0lengthmustbevlid2020-02-3/T295:61:62lengthmustbevlid1 {getNewLineText=null, getNullText=null, isEmpty=false, length=56, size=56}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:4>", "a,F,chttp://example.com/a?b=c"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "1..1?34568Hello, World", "2147483647"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "1.1234X678"}}, 2), new String[][]{{"deleteAll", "org.apache.commons.lang.text.StrMatcher", "3"}, {"deleteAll", "char", "2"}, {"insert", "int,java.lang.Object", "6"}, {"appendNewLine", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(",F,truechttp://exmple.com/?b=c\n {getNewLineText=null, getNullText=null, isEmpty=false, length=31, size=31}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", ",F,truechttp://exmple.com/?b=c\n {getNewLineText=null, getNullText=null, isEmpty=false, length=31, size=31}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:4>", "lengt mustbe ualid200L-02-3/S295:60:62lenth must[be valid\u00e9startIndex must be"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "1.1?34568Hdllo/_, Worlc", "2147483621"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "\u00e9"}}, 1), new String[][]{{"deleteAll", "org.apache.commons.lang.text.StrMatcher", "6"}, {"indexOf", "char,int", "0"}, {"insert", "int,java.lang.Object", "3"}, {"insert", "int,boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("trueakeylengtmustbeualid200L-02-3/S295:60:62lenthmust[bevalidstartIndexmustbea {getNewLineText=null, getNullText=null, isEmpty=false, length=78, size=78}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "trueakeylengtmustbeualid200L-02-3/S295:60:62lenthmust[bevalidstartIndexmustbea {getNewLineText=null, getNullText=null, isEmpty=false, length=78, size=78}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:4>", "lengt mustbe ualid200L-02-3/S295:60:62lenth must[be valid\u00e9startIndex must be"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "1.1?34668Hdllo/_+ Worl\nc", "2147483621"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "a,\\,chttp://exbmple.com2a?b=c"}}), new String[][]{{"appendFixedWidthPadRight", "java.lang.Object,int,char", "2"}, {"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "0"}, {"insert", "int,java.lang.Object", "5"}, {"insert", "int,boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("safalsemplelengtmustbe ualid200L-02-3/S295:60:62lenth must[be valid\u00e9startIndex must beab {getNewLineText=null, getNullText=null, isEmpty=false, length=88, size=88}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "safalsemplelengtmustbe ualid200L-02-3/S295:60:62lenth must[be valid\u00e9startIndex must beab {getNewLineText=null, getNullText=null, isEmpty=false, length=88, size=88}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "1", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[],int,int", "-67108857", "<sample:0>", "16394", "10"}, {"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629642"}}), new String[][]{{"close", "", "4"}, {"append", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "7628716375283629642 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:4>", "lengt m5ustbe uald2e0L-02--3S3944:6/d62leemtg muss[be valid\u00e9staqtIndex must be"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "2.25", "2145386444"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", " "}}), new String[][]{{"appendFixedWidthPadRight", "java.lang.Object,int,char", "2"}, {"endsWith", "java.lang.String", "6"}, {"insert", "int,java.lang.Object", "7"}, {"equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "lengctm5ustbe uald2e0L-02--3S3944:6/d62leemtg muss[be valid\u00e9staqtIndex must beab {getNewLineText=null, getNullText=null, isEmpty=false, length=80, size=80}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char[]"}, new String[]{"2147483647", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[],int,int", "2145386444", "<sample:2>", "10", "9"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,java.lang.Object", "-26", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char"}, new String[]{"2147481659", "C"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[],int,int", "-59", "<sample:1>", "-26", "33"}, {"org.apache.commons.lang.text.StrBuilder", "setCharAt", "int,char", "1", "t"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"char", "char"}, new String[]{"m", "s"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "reverse", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("elpsas {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "elpsas {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String", "int", "int", "int"}, new String[]{"<sample:3>", "1.1?34568Hdllo/_, Worlc", "2147483135", "-7", "1073741808"}, false, 15, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "isEmpty", ""}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<null>"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,long", "-1073741764", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "substring", new String[]{"int"}, new String[]{"0"}, false, 12, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", "a b"}, {"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "-52", "r"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "-127", "-3.4028235E38"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "-1073739726", "-1073741823"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "java.lang.Object,int,char", "<null>", "16394", " "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:4>", "u\u00e9"}, {"org.apache.commons.lang.text.StrBuilder", "deleteCharAt", "int", "16394"}, {"org.apache.commons.lang.text.StrBuilder", "append", "char[],int,int", "<empty>", "-26", "-2147483615"}}, 3), new String[][]{{"append", "char", "5"}, {"write", "java.lang.String,int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "delete", new String[]{"int", "int"}, new String[]{"-2147483647", "7"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setLength", "int", "59"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNewLineText", "java.lang.String", "1._?34668Hdllo/_+ Worl\nc"}, {"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", "2148483648"}, {"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "+1h"}}, 1), new String[][]{{"contains", "java.lang.String", "1"}, {"append", "long", "3"}, {"delete", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("key1 {getNewLineText=1._?34668Hdllo/_+ Worl\nc, getNullText=+1h, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "key1 {getNewLineText=1._?34668Hdllo/_+ Worl\nc, getNullText=+1h, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{"int", "int"}, new String[]{"0", "1073741822"}, false, 13, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteCharAt", "int", "-26"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,boolean", "2147483080", "true"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[],int,int", "-127", "<sample:1>", "5", "59"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:7>", "htup://example.com/a?bPc"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}}), new String[][]{{"delete", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 17, new String[][]{}), new String[][]{{"skip", "long", "6"}, {"reset", "", "6"}, {"read", "char[],int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629642"}}), new String[][]{{"skip", "long", "6"}, {"reset", "", "6"}, {"read", "char[],int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", ""}}, 2), new String[][]{{"write", "char[]", "7"}, {"write", "java.lang.String", "7"}, {"write", "char[]", "7"}, {"write", "char[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "0\000 sample\000 0 {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "char", "o"}, {"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:2>"}, {"org.apache.commons.lang.text.StrBuilder", "contains", "char", "s"}}, 2), new String[][]{{"deleteAll", "java.lang.String", "5"}, {"indexOf", "char,int", "2"}, {"endsWith", "java.lang.String", "7"}, {"append", "java.lang.StringBuffer", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("smple\n {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "smple\n {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "59", "5"}, false), new String[][]{{"asReader", "", "0"}, {"skip", "long", "4"}, {"markSupported", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "Invalid offset: "}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "33", "\t"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "java.lang.Object,int,char", "<sample:5>", "120", "h"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[]", "38", "<null>"}}, 3), new String[][]{{"endsWith", "java.lang.String", "3"}, {"indexOf", "org.apache.commons.lang.text.StrMatcher", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\thhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0\n {getNewLineText=null, getNullText=null, isEmp...#231#-924951802", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String", "int"}, new String[]{"2148483648", "5"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "char[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:2>"}, {"org.apache.commons.lang.text.StrBuilder", "midString", "int,int", "-2147483648", "-104"}, {"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "false"}}, 3), new String[][]{{"endsWith", "java.lang.String", "3"}, {"indexOf", "char", "7"}, {"appendWithSeparators", "java.lang.Object[],java.lang.String", "7"}, {"insert", "int,char[]", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samp a0lefalse\nc-1 {getNewLineText=null, getNullText=null, isEmpty=false, length=18, size=18}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samp a0lefalse\nc-1 {getNewLineText=null, getNullText=null, isEmpty=false, length=18, size=18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:2>"}, {"org.apache.commons.lang.text.StrBuilder", "contains", "org.apache.commons.lang.text.StrMatcher", "<sample:0>"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:8>"}}), new String[][]{{"endsWith", "java.lang.String", "6"}, {"append", "java.lang.StringBuffer", "7"}, {"appendWithSeparators", "java.lang.Object[],java.lang.String", "4"}, {"appendWithSeparators", "java.util.Iterator,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample\n0a {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample\n0a {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", "h"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "-2147483647"}, {"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "false"}}), new String[][]{{"append", "double", "7"}, {"insert", "int,int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("f2147483647alse0hsampleh0.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=27, size=27}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "f2147483647alse0hsampleh0.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=27, size=27}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"1E-;end < start"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:6>", "2s20-01-01"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "1.5e300", "-2147483615"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char", "\n"}}, 1), new String[][]{{"asTokenizer", "", "5"}, {"reset", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=0, getTokenArray=[0], hasNext=true, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=1E-;end < start, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", "3"}, {"org.apache.commons.lang.text.StrBuilder", "setCharAt", "int,char", "-1073739726", "m"}}, 3), new String[][]{{"clear", "", "4"}, {"appendWithSeparators", "java.lang.Object[],java.lang.String", "3"}, {"deleteFirst", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("key {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "key {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", ""}, {"org.apache.commons.lang.text.StrBuilder", "asReader", ""}}), new String[][]{{"clear", "", "4"}, {"appendWithSeparators", "java.lang.Object[],java.lang.String", "3"}, {"deleteFirst", "java.lang.String", "1"}, {"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:4>"}, false, 15, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<null>", "Invalid startIndex: "}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "http/hxampll", "Hnul{d\037oggeeI: 22:40o5x123f45#7892020-0-3T25:61:61a,b,}"}, {"org.apache.commons.lang.text.StrBuilder", "replaceAll", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:2>", "E12::451.5f"}}, 1), new String[][]{{"clear", "", "7"}, {"appendWithSeparators", "java.lang.Object[],java.lang.String", "3"}, {"deleteFirst", "java.lang.String", "4"}, {"indexOf", "org.apache.commons.lang.text.StrMatcher", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "12;3 L:451.1233567890123456", "1.12345678901234567"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<sample:2>", "5", "2147483615"}, {"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:5>"}}), new String[][]{{"clear", "", "7"}, {"appendWithSeparators", "java.lang.Object[],java.lang.String", "3"}, {"deleteFirst", "java.lang.String", "7"}, {"indexOf", "char,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:3>", "2147483647"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "2.257627163752;83629643I1", "762/871637583629643"}, {"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:8>"}}, 1), new String[][]{{"endsWith", "java.lang.String", "7"}, {"appendWithSeparators", "java.lang.Object[],java.lang.String", "7"}, {"appendWithSeparators", "java.util.Iterator,java.lang.String", "6"}, {"append", "char[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0asamplec-1a {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0asamplec-1a {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setLength", new String[]{"int"}, new String[]{"-26"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:8>", "1.5dm1.250x123456789"}, {"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "-67108857"}, {"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "2145386444", "16394", "<empty>", "-2097151"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"536354831", "0", "P"}, false, 16, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[],int,int", "<sample:2>", "1073741764", "-18874302"}, {"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:9>"}, {"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "-67108857", "-2147483647", "<sample:1>", "-7"}}, 3), new String[][]{{"contains", "org.apache.commons.lang.text.StrMatcher", "2"}, {"indexOf", "java.lang.String,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "reverse", ""}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<sample:5>", "-1073739726", "182"}, {"org.apache.commons.lang.text.StrBuilder", "replace", "int,int,java.lang.String", "0", "120", "Hnul{d\037oggeeI: 22:40o5x123f45#7892020-0-3T25:61:61a,b,}"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Hnul{d\037oggeeI: 22:40o5x123f45#7892020-0-3T25:61:61a,b,} {getNewLineText=null, getNullText=null, isEmpty=false, length=55, size=55}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char", "0", "t"}, {"org.apache.commons.lang.text.StrBuilder", "toCharArray", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "t {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:1>", "Hnvl{d oggseI: 22:30o4x123!45\"7892020-03-3T25:61:61a,b,c"}, {"org.apache.commons.lang.text.StrBuilder", "midString", "int,int", "-7", "32"}}), new String[][]{{"setIgnoredMatcher", "org.apache.commons.lang.text.StrMatcher", "1"}, {"getTokenArray", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[bHnvl{d, oggseI:, 22:30o4x123!45\"7892020-03-3T25:61:61a,b,c2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "bHnvl{d oggseI: 22:30o4x123!45\"7892020-03-3T25:61:61a,b,c2 {getNewLineText=null, getNullText=null, isEmpty=false, length=58, size=58}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "4611686018427387903"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String,int,int", "InTal\nid+!ofes202001-01", "0", "-2147483615"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,long", "9", "7628716375283629642"}}, 2), new String[][]{{"append", "char[]", "6"}, {"append", "java.lang.String", "0"}, {"appendFixedWidthPadRight", "java.lang.Object,int,char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0461168607628716375283629642184273879030\000\000\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=44, size=44}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0461168607628716375283629642184273879030\000\000\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=44, size=44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder,int,int", "<sample:4>", "2147483615", "2147483647"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "w", "}"}}, 1), new String[][]{{"append", "char[]", "3"}, {"append", "java.lang.String", "5"}, {"deleteFirst", "char", "4"}, {"asTokenizer", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=a, getTokenArray=[a], hasNext=true, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"java.lang.String"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char[]", "int", "int"}, new String[]{"33", "<empty>", "-1", "10"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"33"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "char", "\uffff"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "char", "="}}, 3), new String[][]{{"getNewLineText", "", "0"}, {"insert", "int,long", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"9"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "char", "\uffff"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<sample:1>", "0", "\uffff"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "char", "="}}, 3), new String[][]{{"getNewLineText", "", "0"}, {"insert", "int,long", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"2097086"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "char,char", "=", "t"}}, 1), new String[][]{{"getNewLineText", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"4194213"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "char,char", ">", "u"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, null, 1), new String[][]{{"append", "long", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-1 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 1), new String[][]{{"append", "long", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-1 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "float"}, new String[]{"268435456", "-1.0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,long", "1048543", "-1"}, {"org.apache.commons.lang.text.StrBuilder", "trim", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:1>", "1.5f"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a1.5f0 {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a1.5f0 {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"odt;l125Titke", "5.0"}, false, 17, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "\t"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:7>", "-7"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}}, 2), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, \t]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0\t {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" ", "5.0"}, false, 17, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "\t"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:7>", "-7"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}}, 2), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, \t]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0\t {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" E", "5.0"}, false, 17, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "\t"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:7>", "-7"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}}, 2), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, \t]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0\t {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"!E", "5.0"}, false, 17, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:7>", "7"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}}, 2), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"!E", "5.0"}, false, 16, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:7>", "7"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}}, 2), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-5", "00.1vt"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,boolean", "9", "true"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<sample:0>", "32", ">"}}, 3), new String[][]{{"getChars", "char[]", "2"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[a, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> {getNewLineText=null, getNullText=null, isEmpty=false, length=32, size=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-;5", "00.1vt"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,boolean", "9", "true"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<sample:0>", "32", ">"}}, 3), new String[][]{{"getChars", "char[]", "2"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[s, a, m, p, l, e, a, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samplea>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> {getNewLineText=null, getNullText=null, isEmpty=false, length=38, size=38}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-;5", "00.1vt"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,boolean", "9", "true"}}, 3), new String[][]{{"getChars", "char[]", "2"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[s, a, m, p, l, e]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-;end < start", "011.1vt2020-02f30T25:61:61"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "10", "1048543", "<sample:1>", "33"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,boolean", "-31", "true"}}, 3), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[s, a, m, p, l, e]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1F", "011.1vt2020-02f30<25:61:61"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "10", "1048543", "<sample:1>", "33"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,boolean", "-31", "true"}}, 2), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[s, a, m, p, l, e]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-5", ""}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char", "2147483647", "f"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char", "2147483135", "s"}}, 2), new String[][]{{"isEmpty", "", "3"}, {"appendFixedWidthPadRight", "int,int,char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-5", ""}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char", "2147483647", "f"}, {"org.apache.commons.lang.text.StrBuilder", "toCharArray", ""}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char", "2147483135", "s"}}, 2), new String[][]{{"isEmpty", "", "7"}, {"appendFixedWidthPadRight", "int,int,char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",: P", "11.25"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:3>", "1.5", "1", "59", "-31"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "1.12345678", "1.1234567"}}, 3), new String[][]{{"isEmpty", "", "7"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "2"}, {"deleteAll", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "111.25"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:3>", "1.5", "1", "59", "-31"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "1.12345678", "1.1234567"}}, 3), new String[][]{{"isEmpty", "", "7"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}, {"deleteAll", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samplea {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samplea {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"P00-01.P01", "+,!P"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "-31", "32"}, {"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:3>", "1.5", "1", "59", "-31"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:1>"}}, 3), new String[][]{{"isEmpty", "", "7"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<i:-1>", "-31", "\000"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"P000-01.P01true", ".0"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "-31", "32"}, {"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:3>", "1.5", "1", "59", "-31"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:1>"}}, 1), new String[][]{{"isEmpty", "", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}, {"indexOf", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"H\n", "0xFFFFFFFF"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "-31", "32"}, {"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:3>", "http/hxampll", "1", "59", "-31"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:1>"}}, 1), new String[][]{{"isEmpty", "", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Invalid ooffse: ", "iwFF8FFFFF32>a,b,d"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "-31", "0.0"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:3>"}}, 3), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("2 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Invalid ooffse: ", "+1"}, false, 12, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "-31", "0.0"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:3>"}}, 1), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("2 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Invalid ooffse: ", "+1"}, false, 12, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:1>", "[1,2]"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "2147483647", "0.0"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:3>"}}, 1), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("b[1,2]22 {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "b[1,2]22 {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Inva\nid ooffse: ", "+1"}, false, 12, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:1>", "[2,2]"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "2147483647", "0.0"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:3>"}}, 1), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("b[2,2]22 {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "b[2,2]22 {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Helo, Wvrld", "+1Hello, World"}, false, 12, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:3>", "[2,2]"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "2147483647", "0.0"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:3>"}}, 1), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("key2 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "key2 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Helo, Wvrld", "+1Hello, World"}, false, 12, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:3>", "[2,2]"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "2147483647", "0.0"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<i:1>"}}, 1), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("key1 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "key1 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12D45679", "+1Hfll, Worc?ld"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:3>", "[,2]"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "-2147483648", "0.0"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<i:2>"}}, 2), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("key2 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "key2 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Inual\nid+ offr2020-01-01", "+1Hfll,[ W9arc?le1.5dm1.250x123456789"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNewLineText", "java.lang.String", "1.5dm1.250x123456789"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "-2147483648", "-1.0"}}, 1), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "1"}, {"getChars", "char[]", "5"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, 0, \000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=1.5dm1.250x123456789, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Inual\nid+ offr2020-01-01", "+1Hfll,[ W9arc?le1.5dm1.250x123456789"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNewLineText", "java.lang.String", "1.5dm1.250x123456789"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "-2147483648", "-1.0"}, {"org.apache.commons.lang.text.StrBuilder", "replaceAll", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:5>", "+1Hell, Worc?ld"}}, 1), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "1"}, {"getChars", "char[]", "5"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, 0, \000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=1.5dm1.250x123456789, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Inual\nid+ offr2020-01-01", "+1Hfll,[ W9arc?le1.5dm1.250x123456789"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNewLineText", "java.lang.String", "1.5dm1.250x123456789"}, {"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", "\n"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "-2147483648", "-1.0"}}, 1), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "1"}, {"getChars", "char[]", "5"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, 0, \000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=1.5dm1.250x123456789, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Inual\nid+ offr202001-01", "+1Hfll,[ W9arc?le1.5dm1.25/x123456789"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNewLineText", "java.lang.String", "1.5dm1.250x123456789"}, {"org.apache.commons.lang.text.StrBuilder", "ensureCapacity", "int", "0"}}, 1), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=1.5dm1.250x123456789, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=1.5dm1.250x123456789, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"d..", "+1Hfll,[ W9arc?le1.5dm1.25/x123456789http://xampl"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNewLineText", "java.lang.String", "1.5dm1.240x123456789"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "31"}, {"org.apache.commons.lang.text.StrBuilder", "ensureCapacity", "int", "0"}}, 1), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=1.5dm1.240x123456789, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=1.5dm1.240x123456789, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"d..", "+Hfll,[ W9arc?le1.5dm1.25/x123456789http://xampl"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNewLineText", "java.lang.String", "1.5dm1.240x123466789"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "31"}, {"org.apache.commons.lang.text.StrBuilder", "ensureCapacity", "int", "0"}}, 1), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=1.5dm1.240x123466789, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=1.5dm1.240x123466789, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"c-..", "+Hfll,[ W9arc?le1.5dm1.25/x124456789http://x6mplalength must be valid"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNewLineText", "java.lang.String", "length must be valid"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "131103"}, {"org.apache.commons.lang.text.StrBuilder", "ensureCapacity", "int", "-8388554"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=length must be valid, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=length must be valid, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t", "I"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "131103"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t", "abc"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}, {"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,F,chttp://example.com/a?b=c", "httHp/h,xxa.5"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "java.lang.Object,int,char", "<d:1.5>", "-2147483648", "o"}}, 2), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,F,chttp://example.com/a?b=c", "httHp/h,xxa.5"}, false, 7, new String[][]{}, 2), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "7"}, {"appendFixedWidthPadRight", "int,int,char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("200 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "200 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,F,chttp://example.com/a?b=c", "httHp/h,xxa.5"}, false, 8, new String[][]{}, 2), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "7"}, {"appendFixedWidthPadRight", "int,int,char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a200 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a200 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,F,chttp://example.com/a?b=c", "httHp/h,xxa.5"}, false, 8, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setLength", "int", "2147483647"}}, 2), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "7"}, {"appendFixedWidthPadRight", "int,int,char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a200 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a200 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,\\,chttp://exbmple.com2a?b=c", "httHp/h,xxa.;5"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "float", "7628716375283629643"}}, 2), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "7"}, {"insert", "int,boolean", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "char", "a"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,long", "2147479551", "7628716375283629643"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "smple {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,long", "2147479551", "7628716375283629643"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"\r", "a"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "0", "F"}, {"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "Inual\nid+ offr2020- 01-01-1.5"}}, 3), new String[][]{{"getNullText", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Inual\nid+ offr2020- 01-01-1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=Inual\nid+ offr2020- 01-01-1.5, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"\r", "a"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "0", "F"}, {"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "Inual\nid+ offr2020- 01-01-1.5"}}, 3), new String[][]{{"getNullText", "", "1"}, {"deleteAll", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=Inual\nid+ offr2020- 01-01-1.5, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=Inual\nid+ offr2020- 01-01-1.5, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"\r", "a"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "0", "F"}, {"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "Inual\nid+ offr2020- 01-01-1.5"}}, 3), new String[][]{{"getNullText", "", "1"}, {"indexOf", "char,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=Inual\nid+ offr2020- 01-01-1.5, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"e", " "}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "java.lang.Object,int,char", "<sample:1>", "31", "="}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "0", "f"}, {"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "Inual\nid+ offr2020- 01-01-1.5"}}, 3), new String[][]{{"getNullText", "", "1"}, {"indexOf", "char,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "==============================1 {getNewLineText=null, getNullText=Inual\nid+ offr2020- 01-01-1.5, isEmpty=false, length=31, size=31}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"f", "a"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "java.lang.Object,int,char", "<sample:1>", "31", "="}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "0", "f"}}, 3), new String[][]{{"getNullText", "", "1"}, {"indexOf", "char,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "==============================1 {getNewLineText=null, getNullText=null, isEmpty=false, length=31, size=31}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"f", "a"}, false, 1, new String[][]{}, 3), new String[][]{{"getNullText", "", "1"}, {"indexOf", "char,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{" ", "f"}, false, 1, new String[][]{}, 1), new String[][]{{"getNullText", "", "1"}, {"indexOf", "char,int", "6"}, {"append", "char[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"!", "f"}, false, 1, new String[][]{}, 1), new String[][]{{"getNullText", "", "1"}, {"indexOf", "char,int", "6"}, {"append", "char[]", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a0\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a0\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"p", "@"}, false, 1, new String[][]{}, 1), new String[][]{{"getNullText", "", "1"}, {"indexOf", "char,int", "6"}, {"append", "char[]", "5"}, {"contains", "org.apache.commons.lang.text.StrMatcher", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a0\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"+1Hfll,[ W9arc?le1.5dm1.250x123456789"}, false, 2, new String[][]{}, 3), new String[][]{{"insert", "int,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samp5le+1Hfll,[ W9arc?le1.5dm1.250x123456789 {getNewLineText=null, getNullText=null, isEmpty=false, length=44, size=44}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samp5le+1Hfll,[ W9arc?le1.5dm1.250x123456789 {getNewLineText=null, getNullText=null, isEmpty=false, length=44, size=44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"nullhttp://xampl1.12345678901234561.5d"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "odt;l125Titke123456789012345678901234567890"}}, 1), new String[][]{{"insert", "int,long", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1samplenullhttp://xampl1.12345678901234561.5d {getNewLineText=null, getNullText=odt;l125Titke123456789012345678901234567890, isEmpty=false, length=45, size=45}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1samplenullhttp://xampl1.12345678901234561.5d {getNewLineText=null, getNullText=odt;l125Titke123456789012345678901234567890, isEmpty=false, length=45, size=45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"-5"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "odt;l125Titke123456789012345678901234567890"}}, 1), new String[][]{{"insert", "int,long", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1sample-5 {getNewLineText=null, getNullText=odt;l125Titke123456789012345678901234567890, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1sample-5 {getNewLineText=null, getNullText=odt;l125Titke123456789012345678901234567890, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"-5"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "odt;l125Titke123456789012345678901234567890"}}, 1), new String[][]{{"capacity", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("38", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample-5 {getNewLineText=null, getNullText=odt;l125Titke123456789012345678901234567890, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"-5"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "odt;l125Titke123456789012345678901234567890"}}, 1), new String[][]{{"capacity", "", "2"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample-5 {getNewLineText=null, getNullText=odt;l125Titke123456789012345678901234567890, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample-5 {getNewLineText=null, getNullText=odt;l125Titke123456789012345678901234567890, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"-{i"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "odt;l125Titke123456789012345678901234567890"}}, 1), new String[][]{{"capacity", "", "2"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample-{i {getNewLineText=null, getNullText=odt;l125Titke123456789012345678901234567890, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample-{i {getNewLineText=null, getNullText=odt;l125Titke123456789012345678901234567890, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"-{iend < start"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "-31", "10"}, {"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "odt;l125Titke123456789012345678901234567890"}}, 1), new String[][]{{"capacity", "", "2"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample-{iend < start {getNewLineText=null, getNullText=odt;l125Titke123456789012345678901234567890, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample-{iend < start {getNewLineText=null, getNullText=odt;l125Titke123456789012345678901234567890, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"-{iend < start"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "-31", "10"}, {"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "odt;l125Titke123456789012345678901234567890<a>b</a>"}}, 1), new String[][]{{"capacity", "", "2"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample-{iend < start {getNewLineText=null, getNullText=odt;l125Titke123456789012345678901234567890<a>b</a>, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample-{iend < start {getNewLineText=null, getNullText=odt;l125Titke123456789012345678901234567890<a>b</a>, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"-{iend < start"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "-31", "10"}, {"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "odt;l125Titke123456789"}}, 1), new String[][]{{"capacity", "", "2"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample-{iend < start {getNewLineText=null, getNullText=odt;l125Titke123456789, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample-{iend < start {getNewLineText=null, getNullText=odt;l125Titke123456789, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"-{iend < stafC"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "-31", "10"}, {"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "odt;l125Titke123456789"}}, 1), new String[][]{{"capacity", "", "2"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample-{iend < stafC {getNewLineText=null, getNullText=odt;l125Titke123456789, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample-{iend < stafC {getNewLineText=null, getNullText=odt;l125Titke123456789, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"-{iend < start"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "-31", "10"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "2147483648"}, {"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "pdt;l125Titke123456789"}}, 1), new String[][]{{"capacity", "", "2"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample-{iend < start {getNewLineText=null, getNullText=pdt;l125Titke123456789, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample-{iend < start {getNewLineText=null, getNullText=pdt;l125Titke123456789, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"-{ienc < staru"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "-31", "10"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "2147483648"}, {"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "pdt;l125Titke123456789"}}, 1), new String[][]{{"capacity", "", "2"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "0"}, {"appendWithSeparators", "java.util.Iterator,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample-{ienc < staru {getNewLineText=null, getNullText=pdt;l125Titke123456789, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample-{ienc < staru {getNewLineText=null, getNullText=pdt;l125Titke123456789, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "-31", "10"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "2147483648"}}, 1), new String[][]{{"capacity", "", "2"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "7"}, {"appendWithSeparators", "java.util.Iterator,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample1e10 true {getNewLineText=null, getNullText=null, isEmpty=false, length=15, size=15}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample1e10 true {getNewLineText=null, getNullText=null, isEmpty=false, length=15, size=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<sample:0>", "http://example.com/a?b=c"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<empty>", "http://example.com/a?b=c"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<empty>", "http://xampl"}, false, 1, new String[][]{}), new String[][]{{"append", "char[],int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<empty>", "http://xampl"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[],int,int", "33", "<sample:1>", "1", "-2147483648"}}), new String[][]{{"append", "char[],int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"char"}, new String[]{" "}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"char"}, new String[]{">"}, false), new String[][]{{"indexOf", "java.lang.String,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "char", ">"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[]", "32", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"32"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "char", ">"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[]", "32", "<sample:2>"}}), new String[][]{{"getNewLineText", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"32"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "char", ">"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[]", "-2147483648", "<sample:2>"}}), new String[][]{{"getNewLineText", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"32"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "char", ">"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[]", "-2147483648", "<sample:2>"}}), new String[][]{{"getNewLineText", "", "0"}, {"insert", "int,long", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"59"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "char", ">"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[]", "-2147483648", "<sample:2>"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "char", ">"}}), new String[][]{{"getNewLineText", "", "0"}, {"insert", "int,long", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"1048543"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<sample:1>", "0", "\uffff"}, {"org.apache.commons.lang.text.StrBuilder", "replaceAll", "char,char", "=", "a"}}), new String[][]{{"getNewLineText", "", "0"}, {"insert", "int,long", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "float"}, new String[]{"0", "1.0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "float"}, new String[]{"0", "1.0"}, false), new String[][]{{"append", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1.04 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.04 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "float"}, new String[]{"0", "-1.0"}, false), new String[][]{{"append", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-1.04 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1.04 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "float"}, new String[]{"268435456", "-1.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<sample:0>", "true"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getNewLineText", ""}}), new String[][]{{"append", "long", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("9223372036854775807 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9223372036854775807 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<sample:0>", "true"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", "PT1H"}, {"org.apache.commons.lang.text.StrBuilder", "getNewLineText", ""}}), new String[][]{{"append", "long", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("9223372036854775807 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9223372036854775807 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:6>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equals", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", ""}, {"org.apache.commons.lang.text.StrBuilder", "append", "char[],int,int", "<null>", "1", "31"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:1>", "Sitle"}, false), new String[][]{{"indexOf", "java.lang.String,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<null>", "1.5dm1.250x123456789"}, false), new String[][]{{"indexOf", "java.lang.String,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "double"}, new String[]{"9", "7628716375283629643"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:5>", "1.5dm1.250x133456789"}, false), new String[][]{{"indexOf", "java.lang.String,int", "2"}, {"getChars", "char[]", "2"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, \000,  ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"1", "9", "a"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0aaaaaaaa1 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0aaaaaaaa1 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"1", "9", "a"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", ""}}), new String[][]{{"delete", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"-2097151", "9", "m"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", ""}}), new String[][]{{"delete", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:1>", "1.5f"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a1.5f0 {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a1.5f0 {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:1>", "1.5Df"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a1.5Df0 {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a1.5Df0 {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:1>", "1.5f"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a1.5f0 {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a1.5f0 {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"null", "abc"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[],int,int", "<empty>", "59", "32"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ntl", "http:/hxampl"}, false, 15, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[],int,int", "<sample:0>", "-59", "10"}}), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{"--1"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=--1, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=--1, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"char[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[],int,int", "-2097151", "<sample:1>", "1048543", "1"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, \000,  ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"odtl125Title", "http/hxampll"}, false, 15, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "\uffff"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:7>", "33"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}}), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\uffff]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\uffff {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"odtl125Titke", "http/hxxampll"}, false, 16, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "."}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:7>", "33"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}}), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[.]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", ". {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"odtl125Titke", "http/hxxampll"}, false, 16, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "."}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:7>", "-7"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}}), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[.]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", ". {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"odt;l125Titke", "http/hxxampll"}, false, 17, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "."}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:7>", "-7"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}}), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, .]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"odt;l125Titke", "http/hxxampll"}, false, 17, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "."}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:7>", "-7"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<empty>", "0"}}), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, .]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"odt;l125Titke", "http/hxxampll"}, false, 17, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "\t"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:7>", "-7"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}}), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, \t]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0\t {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", "5."}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=a,b,c, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=a,b,c, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"!E", "5.0"}, false, 16, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:7>", "7"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<null>", "32", ">"}}), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"!F", "..0"}, false, 16, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<null>", "32", ">"}, {"org.apache.commons.lang.text.StrBuilder", "setCharAt", "int,char", "-67108857", "0"}}), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "validateRange", new String[]{"int", "int"}, new String[]{"-67108857", "32"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"!F", "..0"}, false, 16, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<null>", "32", ">"}}), new String[][]{{"getChars", "char[]", "5"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[a, 0, \000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5.0", "0.0"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<null>", "32", ">"}}), new String[][]{{"getChars", "char[]", "5"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, 0, \000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"d.", "0.0"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<sample:0>", "32", ">"}}), new String[][]{{"getChars", "char[]", "5"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, a, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0a>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> {getNewLineText=null, getNullText=null, isEmpty=false, length=33, size=33}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"d.", "0.0v"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<sample:0>", "32", "+"}}), new String[][]{{"getChars", "char[]", "5"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, a, +, +, +, +, +, +, +, +, +, +, +, +, +, +, +, +, +, +, +, +, +, +, +, +, +, +, +, +, +, +, +]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0a+++++++++++++++++++++++++++++++ {getNewLineText=null, getNullText=null, isEmpty=false, length=33, size=33}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"d", "0.0v"}, false, 8, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<sample:0>", "32", ">"}}), new String[][]{{"getChars", "char[]", "5"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[a, a, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "aa>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> {getNewLineText=null, getNullText=null, isEmpty=false, length=33, size=33}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"d", "0.1v"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "0"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<sample:0>", "32", ">"}}), new String[][]{{"getChars", "char[]", "5"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[a, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >, >]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> {getNewLineText=null, getNullText=null, isEmpty=false, length=32, size=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String"}, new String[]{"5."}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-;end < start", "011.1vt2020-02f30T25:61:61"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "10", "1048543", "<sample:1>", "33"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,boolean", "-31", "true"}}), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[s, a, m, p, l, e]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setCharAt", new String[]{"int", "char"}, new String[]{"1048543", "\000"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "9223372036854775807"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"char[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[ ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{", ", "1.5f"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char", "2147483647", "f"}, {"org.apache.commons.lang.text.StrBuilder", "toCharArray", ""}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char", "2147483135", "s"}}), new String[][]{{"isEmpty", "", "7"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+,!P", "B14"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:3>", "1.5", "1", "59", "2147483135"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char", "2147483647", "f"}, {"org.apache.commons.lang.text.StrBuilder", "toCharArray", ""}}), new String[][]{{"isEmpty", "", "7"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+, P", "B14aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:3>", "1.5", "1", "59", "2147483135"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char", "2147483647", "f"}}), new String[][]{{"isEmpty", "", "7"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "2"}, {"deleteAll", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+,9 P", "B4aaaaaaaaaaaaaabc"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:3>", "1.5", "1", "59", "-31"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char", "2147479551", "f"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "1.12345678", "1.1234567"}}), new String[][]{{"isEmpty", "", "7"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "2"}, {"deleteAll", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false), new String[][]{{"asReader", "", "7"}, {"transferTo", "java.io.Writer", "7"}, {"markSupported", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=1.5f, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "10", "2147483135", " "}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "111.25"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:3>", "1.5", "1", "59", "-31"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "1.12345678", "1.1234567"}}), new String[][]{{"isEmpty", "", "7"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}, {"deleteAll", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samplea {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samplea {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Xx", "211.252147483648"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:3>", "1.5", "1", "59", "-31"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "1.12345678", "1.1234567"}}), new String[][]{{"isEmpty", "", "7"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}, {"deleteAll", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample1 {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample1 {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "charAt", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t", "211.252147483648"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:3>", "1.5", "1", "59", "-31"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "1.12345678", "1.1234667"}}), new String[][]{{"isEmpty", "", "7"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}, {"deleteAll", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "-31", "1048543"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "isEmpty", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1h", "ixFFFFFEF32"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:5>", "http/hxampll", "1", "32", "-31"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:1>"}}), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1h", "ixFFFFFEF32"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:5>", "http/hxampll", "1", "32", "-31"}, {"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "1"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:1>"}}), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Invalid offse: ", "iwFFFFFFF32>a,b,c"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "2147483647"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "-31", "0.0"}}), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12D45679", "+1Hfll, Worc?ld"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:3>", "[,2]"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "-2147483648", "0.0"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<i:2>"}}), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("key2 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "key2 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12D45679", "+1Hfll, Worc?ld"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:3>", "[,2]"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "-2147483648", "0.0"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<i:2>"}}), new String[][]{{"indexOf", "char,int", "0"}, {"appendFixedWidthPadRight", "int,int,char", "1"}, {"deleteAll", "java.lang.String", "6"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("key2 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "key2 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "int"}, new String[]{"33", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[1,2]Hello, World", "http/hxxaampll1E-5"}, false, 12, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}}), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char"}, new String[]{">"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".5", "1.5dm1.250x123456789"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "ensureCapacity", "int", "2147483647"}}), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "6"}, {"append", "float", "2"}, {"deleteCharAt", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,long", "-2147479434", "7628716375283629698"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "capacity", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "capacity", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "trim", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{" ", "\t"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "Inual\nid+ offr2020-01-01"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=Inual\nid+ offr2020-01-01, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=Inual\nid+ offr2020-01-01, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{" ", "\t"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{" ", "\t"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "Inual\nid+ offr2020- 01-01"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=Inual\nid+ offr2020- 01-01, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=Inual\nid+ offr2020- 01-01, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{" ", "\t"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "0", "\t"}, {"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "Inual\nid+ offr2020- 01-01"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=Inual\nid+ offr2020- 01-01, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=Inual\nid+ offr2020- 01-01, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"char"}, new String[]{"\uffff"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "validateRange", "int,int", "2147483647", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{" ", "m"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "0", "F"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<null>", "0xFFFFFFFF"}, {"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "Inual\nid+ offr2020- 01-01"}}), new String[][]{{"getNullText", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Inual\nid+ offr2020- 01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=Inual\nid+ offr2020- 01-01, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{" ", "m"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "0", "F"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<null>", "0xFFFFFFFF"}, {"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "Inual\nid+ offr2020- 01-01"}}), new String[][]{{"getNullText", "", "1"}, {"getNewLineText", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=Inual\nid+ offr2020- 01-01, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"g", "a"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "0", "F"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<null>", "0xFFFFFFFF"}, {"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "Inual\nid+ offr2020- 01-01-1.5"}}), new String[][]{{"getNullText", "", "1"}, {"getNewLineText", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=Inual\nid+ offr2020- 01-01-1.5, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"f", "`"}, false, 1, new String[][]{}), new String[][]{{"getNullText", "", "1"}, {"indexOf", "char,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"e", "`"}, false, 1, new String[][]{}), new String[][]{{"getNullText", "", "1"}, {"indexOf", "char,int", "6"}, {"append", "char[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"char", "int"}, new String[]{">", "1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"+1Hfll,[ W9arc?le1.5dm1.250x123456789"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("+1Hfll,[ W9arc?le1.5dm1.250x123456789 {getNewLineText=null, getNullText=null, isEmpty=false, length=37, size=37}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "+1Hfll,[ W9arc?le1.5dm1.250x123456789 {getNewLineText=null, getNullText=null, isEmpty=false, length=37, size=37}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"+1Hflm,[ W9arc?le1.5dm1.250x123456789"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("+1Hflm,[ W9arc?le1.5dm1.250x123456789 {getNewLineText=null, getNullText=null, isEmpty=false, length=37, size=37}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "+1Hflm,[ W9arc?le1.5dm1.250x123456789 {getNewLineText=null, getNullText=null, isEmpty=false, length=37, size=37}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("true {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "true {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"+1Hfll,[ W9arc?le1.5dm1.250x123456789"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample+1Hfll,[ W9arc?le1.5dm1.250x123456789 {getNewLineText=null, getNullText=null, isEmpty=false, length=43, size=43}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample+1Hfll,[ W9arc?le1.5dm1.250x123456789 {getNewLineText=null, getNullText=null, isEmpty=false, length=43, size=43}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"+1Hfll,[ W9arc?le1.5dm1.250x123456789"}, false, 2, new String[][]{}), new String[][]{{"insert", "int,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samp5le+1Hfll,[ W9arc?le1.5dm1.250x123456789 {getNewLineText=null, getNullText=null, isEmpty=false, length=44, size=44}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samp5le+1Hfll,[ W9arc?le1.5dm1.250x123456789 {getNewLineText=null, getNullText=null, isEmpty=false, length=44, size=44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"+1Hfll,[ W9aqc?le1.5dm1.250x123456789"}, false, 2, new String[][]{}), new String[][]{{"insert", "int,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samp5le+1Hfll,[ W9aqc?le1.5dm1.250x123456789 {getNewLineText=null, getNullText=null, isEmpty=false, length=44, size=44}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samp5le+1Hfll,[ W9aqc?le1.5dm1.250x123456789 {getNewLineText=null, getNullText=null, isEmpty=false, length=44, size=44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"+1Hfll,[ W9aqc?le1.5dm1.250x123456789"}, false, 3, new String[][]{}), new String[][]{{"insert", "int,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("+1Hf5ll,[ W9aqc?le1.5dm1.250x123456789 {getNewLineText=null, getNullText=null, isEmpty=false, length=38, size=38}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "+1Hf5ll,[ W9aqc?le1.5dm1.250x123456789 {getNewLineText=null, getNullText=null, isEmpty=false, length=38, size=38}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"\u00e9E"}, false, 3, new String[][]{}), new String[][]{{"insert", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"+1Hfll,[ W9aqc?le1.5dm1.250x12345678i"}, false, 3, new String[][]{}), new String[][]{{"insert", "int,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("+1Hf5ll,[ W9aqc?le1.5dm1.250x12345678i {getNewLineText=null, getNullText=null, isEmpty=false, length=38, size=38}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "+1Hf5ll,[ W9aqc?le1.5dm1.250x12345678i {getNewLineText=null, getNullText=null, isEmpty=false, length=38, size=38}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308 {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1.7976931348623157E308 {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"+1Hfll,[ W9aq?le1.5dm1.250x12345678i"}, false, 3, new String[][]{}), new String[][]{{"insert", "int,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("+1Hf5ll,[ W9aq?le1.5dm1.250x12345678i {getNewLineText=null, getNullText=null, isEmpty=false, length=37, size=37}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "+1Hf5ll,[ W9aq?le1.5dm1.250x12345678i {getNewLineText=null, getNullText=null, isEmpty=false, length=37, size=37}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"+1Hfll,[ W9aq?le1.5dm1.250x12345678i"}, false, 3, new String[][]{}), new String[][]{{"insert", "int,long", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("+1Hf5ll,[ W9aq?le1.5dm1.250x12345678i {getNewLineText=null, getNullText=null, isEmpty=false, length=37, size=37}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "+1Hf5ll,[ W9aq?le1.5dm1.250x12345678i {getNewLineText=null, getNullText=null, isEmpty=false, length=37, size=37}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"+1Hfll,[ W9aq?le1.5dm1.250x12345678i"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "odt;l125Titke"}, {"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "1"}}), new String[][]{{"insert", "int,long", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("+1Hf5ll,[ W9aq?le1.5dm1.250x12345678i {getNewLineText=null, getNullText=odt;l125Titke, isEmpty=false, length=37, size=37}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "+1Hf5ll,[ W9aq?le1.5dm1.250x12345678i {getNewLineText=null, getNullText=odt;l125Titke, isEmpty=false, length=37, size=37}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"+1Hfll,[ W9aq?le1.75dm1.250x12345678i"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "odt;l125Titke"}, {"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "1"}}), new String[][]{{"insert", "int,long", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("+1Hf5ll,[ W9aq?le1.75dm1.250x12345678i {getNewLineText=null, getNullText=odt;l125Titke, isEmpty=false, length=38, size=38}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "+1Hf5ll,[ W9aq?le1.75dm1.250x12345678i {getNewLineText=null, getNullText=odt;l125Titke, isEmpty=false, length=38, size=38}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"+1Hfll,[ Wd9aq?le1/75dm1.250x12345678i"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "odt;l125Titke"}, {"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "1"}}), new String[][]{{"insert", "int,long", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("+1Hf5ll,[ Wd9aq?le1/75dm1.250x12345678i {getNewLineText=null, getNullText=odt;l125Titke, isEmpty=false, length=39, size=39}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "+1Hf5ll,[ Wd9aq?le1/75dm1.250x12345678i {getNewLineText=null, getNullText=odt;l125Titke, isEmpty=false, length=39, size=39}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"+1Hfll,[ Wd9aq?le1/75dm1.250x12345678i"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "odt;l125Titke"}, {"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("+1Hfll,[ Wd9aq?le1/75dm1.250x12345678i {getNewLineText=null, getNullText=odt;l125Titke, isEmpty=false, length=38, size=38}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "+1Hfll,[ Wd9aq?le1/75dm1.250x12345678i {getNewLineText=null, getNullText=odt;l125Titke, isEmpty=false, length=38, size=38}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"+, P"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "odt;l125Titke"}, {"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "1"}}), new String[][]{{"insert", "int,long", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("+, P5 {getNewLineText=null, getNullText=odt;l125Titke, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "+, P5 {getNewLineText=null, getNullText=odt;l125Titke, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"nullhttp://xampl1.1234567890123456"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "odt;l125Titke123456789012345678901234567890"}, {"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "-127"}}), new String[][]{{"insert", "int,long", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1nullhttp://xampl1.1234567890123456 {getNewLineText=null, getNullText=odt;l125Titke123456789012345678901234567890, isEmpty=false, length=35, size=35}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1nullhttp://xampl1.1234567890123456 {getNewLineText=null, getNullText=odt;l125Titke123456789012345678901234567890, isEmpty=false, length=35, size=35}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "delete", "int,int", "2147483647", "9"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "-31", "10"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "2147483648"}}, 1), new String[][]{{"capacity", "", "2"}, {"charAt", "int", "7"}, {"appendWithSeparators", "java.util.Iterator,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample1e10 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample1e10 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"PX1H76297x63[5283629643"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "-5"}, {"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:8>"}, {"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "false"}}, 1), new String[][]{{"capacity", "", "2"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "7"}, {"appendWithSeparators", "java.util.Iterator,java.lang.String", "6"}, {"getNewLineText", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "afalsePX1H76297x63[5283629643 true {getNewLineText=null, getNullText=null, isEmpty=false, length=34, size=34}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"odtl125Title"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "-"}, {"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:8>"}, {"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "true"}}, 1), new String[][]{{"append", "java.lang.String,int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getNewLineText", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "long"}, new String[]{"2147479551", "7628716375283629642"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"+1h"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "-"}, {"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "false"}}, 2), new String[][]{{"indexOf", "java.lang.String,int", "2"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("false+1h true {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "false+1h true {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"http/hx?xaampll1E-5I"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", ""}}), new String[][]{{"indexOf", "java.lang.String,int", "2"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "7"}, {"append", "java.lang.StringBuffer", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("http/hx?xaampll1E-5I true {getNewLineText=null, getNullText=null, isEmpty=false, length=25, size=25}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "http/hx?xaampll1E-5I true {getNewLineText=null, getNullText=null, isEmpty=false, length=25, size=25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"http/hx?xaampll1E-5I"}, false, 4, new String[][]{}, 3), new String[][]{{"indexOf", "java.lang.String,int", "2"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "7"}, {"append", "java.lang.StringBuffer", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("http/hx?xaampll1E-5I true {getNewLineText=null, getNullText=null, isEmpty=false, length=25, size=25}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "http/hx?xaampll1E-5I true {getNewLineText=null, getNullText=null, isEmpty=false, length=25, size=25}", SearchInputFactory_scaffolding.receiverState());
 }
}
