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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "validateIndex", new String[]{"int"}, new String[]{"9"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:5>"}, {"org.apache.commons.lang.text.StrBuilder", "equals", "java.lang.Object", "<s:W>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "int,int,char", "-6", "-2147483648", "\000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<null>", "47", ";"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", " TITLE\u00e9"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String", "int"}, new String[]{"1.1234567890", "-28"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<empty>", "{\"a\";1}"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<empty>", "-2", "16"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "midString", new String[]{"int", "int"}, new String[]{"0", "536870911"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<empty>", "{\"a!:1}"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:2>", "2147482648"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setCharAt", "int,char", "-1073741760", "\t"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:1>", "0", "-524328"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "2046", "."}, {"org.apache.commons.lang.text.StrBuilder", "midString", "int,int", "-16357", "32"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("...........................................................................................................................................................................................................#2125#492373071", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "...........................................................................................................................................................................................................#2125#492373071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setCharAt", new String[]{"int", "char"}, new String[]{"65556", "\010"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "62"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"32778", "0"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<i:-32824>", "5", "0"}}), new String[][]{{"deleteCharAt", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<null>", "PT1o"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,java.lang.String", "2147483647", "Invalid rtartIndex: "}, {"org.apache.commons.lang.text.StrBuilder", "append", "char", "\t"}}), new String[][]{{"indexOf", "char,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\t {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,boolean", "-5", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"1/a/"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:4>", "-16379"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=1/a/, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=1/a/, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"15f", "2147483647", "-1073741824"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String,int,int", "32", "-32778", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:0>", "53"}}), new String[][]{{"indexOf", "org.apache.commons.lang.text.StrMatcher", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setLength", new String[]{"int"}, new String[]{"23"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "capacity", ""}, {"org.apache.commons.lang.text.StrBuilder", "setLength", "int", "114"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "1K ", "2147483647"}}, 1), new String[][]{{"charAt", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "rightString", new String[]{"int"}, new String[]{"-6"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "34", "Infinity"}, {"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "startsWith", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "int,int,char", "7", "-32816", "f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"char"}, new String[]{"2"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "650"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:8>"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Iterator,java.lang.String", "<sample:4>", "null"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=TITLE, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=TITLE, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "int"}, new String[]{"2147483647", "-1073676288"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "-1", "33554447", "<sample:1>", "16777269"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"[", ","}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "char[]", "<sample:3>"}}), new String[][]{{"indexOf", "org.apache.commons.lang.text.StrMatcher,int", "5"}, {"charAt", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<empty>", "7", "1073741839"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setLength", new String[]{"int"}, new String[]{"-2096502"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char"}, new String[]{"-479", "m"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "reverse", ""}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:4>", "-2096502"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "-10", "68"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "ensureCapacity", "int", "479"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String", "int"}, new String[]{"1.1234567990", "32815"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "java.lang.Object,int,char", "<sample:0>", "29", "\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\na {getNewLineText=null, getNullText=null, isEmpty=false, length=29, size=29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"char"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", ""}}, 1), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "6"}, {"insert", "int,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sampletrue {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sampletrue {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "startsWith", new String[]{"java.lang.String"}, new String[]{"2147483649"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<i:-1>", "16777269", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000...#16777356#335228771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:5>", "startIndtrue"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String", "a,b+c"}}), new String[][]{{"asReader", "", "1"}, {"mark", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample0 {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "boolean"}, new String[]{"1", "false"}, false, 2, new String[][]{}), new String[][]{{"append", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sfalseamplefalse {getNewLineText=null, getNullText=null, isEmpty=false, length=16, size=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sfalseamplefalse {getNewLineText=null, getNullText=null, isEmpty=false, length=16, size=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"int", "int", "char"}, new String[]{"4194315", "-4193004", "\""}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "org.apache.commons.lang.text.StrMatcher", "<sample:5>"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String", "2020-01-017628716375283629643"}}), new String[][]{{"append", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample0 {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample0 {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "capacity", ""}}), new String[][]{{"skip", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "int,int,char", "1", "2147483647", "F"}}), new String[][]{{"read", "java.nio.CharBuffer", "5"}, {"close", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"write", "char[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", " a {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "leftString", new String[]{"int"}, new String[]{"-1073676032"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "org.apache.commons.lang.text.StrMatcher", "<sample:3>"}, {"org.apache.commons.lang.text.StrBuilder", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"deleteAll", "java.lang.String", "5"}, {"asTokenizer", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=smple\n, getTokenArray=[smple], hasNext=true, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "smple\n {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "substring", new String[]{"int", "int"}, new String[]{"2147483647", "263"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String", " "}, {"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<null>"}, false, 1, new String[][]{}, 2), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "1"}, {"append", "float", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a00-Infinity {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a00-Infinity {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "0", "68"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<d:-1.5>"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<null>", "aa1"}}), new String[][]{{"insert", "int,double", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<s:W>", "-34603038", "f"}}), new String[][]{{"capacity", "", "5"}, {"equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "7"}, {"endsWith", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "false {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<null>", "{\"a!:2}"}, false, 6, new String[][]{}), new String[][]{{"contains", "java.lang.String", "6"}, {"insert", "int,char[]", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char"}, new String[]{"a"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "validateRange", "int,int", "122", "16448"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:0>"}, false), new String[][]{{"deleteFirst", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:W<>"}, false, 2, new String[][]{}, 2), new String[][]{{"deleteFirst", "java.lang.String", "3"}, {"indexOf", "char", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "W< {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:0>", "1.123457890123456"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "-7", "\001"}}), new String[][]{{"deleteAll", "org.apache.commons.lang.text.StrMatcher", "1"}, {"indexOf", "org.apache.commons.lang.text.StrMatcher,int", "5"}, {"deleteFirst", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("01 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "01 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"int", "int", "char"}, new String[]{"8388656", "131", "["}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "a,b,b", "[1,2]"}, {"org.apache.commons.lang.text.StrBuilder", "toString", ""}}), new String[][]{{"getChars", "char[]", "7"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[8, 3, 8, 8, 6, 5, 6, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [, [...#393#655141564", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "8388656[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[ {getNewLineText=null, getNullText=null, isEmpty=false, length=131, s...#208#-1152395579", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String", "int"}, new String[]{"76287163752836?29643", "32778"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "char[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"-1", "0", "109"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:0>", "1/a/"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "leftString", new String[]{"int"}, new String[]{"65549"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "-2147352064", "8388631", "A"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "A", ":"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147352064:AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...#65549#1480965716", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-2147352064:AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...#8388716#-1192523399", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"long"}, new String[]{"9221120237041090559"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "x", "-6"}}), new String[][]{{"deleteAll", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("922112237419559 {getNewLineText=null, getNullText=null, isEmpty=false, length=15, size=15}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "922112237419559 {getNewLineText=null, getNullText=null, isEmpty=false, length=15, size=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer", "<null>"}}), new String[][]{{"reset", "", "1"}, {"read", "java.nio.CharBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-51.123456790x123456789", "1.12345678901234567"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asReader", ""}}, 3), new String[][]{{"insert", "int,long", "5"}, {"insert", "int,char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("saa3mple {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "saa3mple {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", "a,b+c2.1234567890123456"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<sample:8>"}, {"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:1>", "--1", "-65516", "524392", "268435471"}}, 1), new String[][]{{"indexOf", "org.apache.commons.lang.text.StrMatcher", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0a,b+c2.1234567890123456samplea,b+c2.1234567890123456 {getNewLineText=null, getNullText=null, isEmpty=false, length=53, size=53}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"asReader", "", "5"}, {"markSupported", "", "4"}, {"read", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("102", String.valueOf(actual));
  assertEquals("receiver state after the call", "false {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setLength", new String[]{"int"}, new String[]{"16"}, false), new String[][]{{"deleteAll", "org.apache.commons.lang.text.StrMatcher", "4"}, {"append", "char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "30", "2147483647"}}), new String[][]{{"reset", "char[]", "6"}, {"setDelimiterString", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=0, getTokenArray=[0], hasNext=true, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<sample:1>"}}), new String[][]{{"read", "char[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "0", "-2147483581"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "substring", "int", "7"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"flush", "", "6"}, {"append", "java.lang.CharSequence", "3"}, {"write", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "sample\uffff {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setLength", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "org.apache.commons.lang.text.StrMatcher", "<sample:6>"}}), new String[][]{{"appendNewLine", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "org.apache.commons.lang.text.StrMatcher", "<sample:10>"}}), new String[][]{{"contains", "java.lang.String", "1"}, {"append", "char[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samplea {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samplea {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"1..5p"}, false), new String[][]{{"appendNull", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1..5p {getNewLineText=null, getNullText=1..5p, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1..5p {getNewLineText=null, getNullText=1..5p, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:8>", "1"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("s1mple {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "s1mple {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:8>", "Invalid startIndex: "}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", ".251.12345678"}, {"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "true"}}), new String[][]{{"append", "long", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("Invalid startIndex: rue9223372036854775807 {getNewLineText=null, getNullText=null, isEmpty=false, length=42, size=42}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Invalid startIndex: rue9223372036854775807 {getNewLineText=null, getNullText=null, isEmpty=false, length=42, size=42}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{"\t", "69"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "midString", "int,int", "-2147352048", "536936594"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:6>", "32778"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"l", "v"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "isEmpty", ""}}), new String[][]{{"asWriter", "", "0"}, {"append", "java.lang.CharSequence", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "0sample {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "reverse", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"deleteAll", "char", "6"}, {"indexOf", "char", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "elpms {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false), new String[][]{{"ready", "", "6"}, {"read", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"char"}, new String[]{"u"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "java.lang.String", "2020-01-017628716375283629643"}}), new String[][]{{"asReader", "", "6"}, {"read", "char[]", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setLength", "int", "98"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<null>", "0", "-8"}, false, 0, null, 2), new String[][]{{"append", "java.lang.StringBuffer,int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", new String[]{}, new String[]{}, false), new String[][]{{"asReader", "", "2"}, {"transferTo", "java.io.Writer", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{"int", "int"}, new String[]{"-2096455", "-2147483648"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:2>", "1.1234568"}, {"org.apache.commons.lang.text.StrBuilder", "contains", "java.lang.String", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"char"}, new String[]{"\\"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "java.lang.String", "Invalid length: "}}), new String[][]{{"appendFixedWidthPadLeft", "java.lang.Object,int,char", "4"}, {"asReader", "", "6"}, {"read", "char[]", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "ey {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<sample:0>", "-2", "\""}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "isEmpty", ""}}, 1), new String[][]{{"deleteCharAt", "int", "7"}, {"deleteAll", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sampe {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sampe {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "trim", ""}}), new String[][]{{"substring", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"java.lang.String"}, new String[]{"1E-5 "}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer", "<sample:2>"}}, 2), new String[][]{{"deleteAll", "org.apache.commons.lang.text.StrMatcher", "7"}, {"indexOf", "java.lang.String,int", "0"}, {"insert", "int,java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<null>", "2147483647", "\010"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "capacity", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"char", "char"}, new String[]{"]", ";"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendNull", ""}}), new String[][]{{"insert", "int,float", "3"}, {"deleteFirst", "char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sInfinityample {getNewLineText=null, getNullText=null, isEmpty=false, length=14, size=14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sInfinityample {getNewLineText=null, getNullText=null, isEmpty=false, length=14, size=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:6>", "length must be valid{\"a\":1}"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder,int,int", "<null>", "650", "53"}}), new String[][]{{"indexOf", "char", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<null>", "2020-[1-01+1"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", "a/b0x123456789"}}, 1), new String[][]{{"append", "int", "2"}, {"appendWithSeparators", "java.util.Collection,java.lang.String", "6"}, {"append", "char[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"char"}, new String[]{"\010"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", "01"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0a {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{"ct"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}}), new String[][]{{"asWriter", "", "4"}, {"write", "java.lang.String,int,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "a {getNewLineText=ct, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "startsWith", new String[]{"java.lang.String"}, new String[]{"a,b,cstartIndInvalid length: "}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "NaN"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String,int,int", "7628716375283629643", "5", "-4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder,int,int", "<sample:5>", "-42", "26"}}), new String[][]{{"contains", "char", "2"}, {"appendWithSeparators", "java.util.Iterator,java.lang.String", "2"}, {"append", "char[]", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0false0\000  {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0false0\000  {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{"int", "int"}, new String[]{"0", "11"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "20200-C[1-01", "-112"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[s, a, m, p, l, e]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer", "<sample:6>"}, {"org.apache.commons.lang.text.StrBuilder", "toCharArray", ""}}), new String[][]{{"indexOf", "char,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<sample:1>", "0", "-28"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "1ex10", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder,int,int", "<sample:5>", "11", "18"}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:V<>"}, false), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder,int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char", ","}}), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder,int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{" /5e300"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "int", "2147483647"}}), new String[][]{{"append", "long", "7"}, {"append", "java.lang.StringBuffer,int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:8>", "af,b,"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char,int", "m", "-1048656"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "1.1234567890null"}}), new String[][]{{"append", "boolean", "3"}, {"asReader", "", "7"}, {"read", "char[],int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"e", ";"}, false, 2, new String[][]{}), new String[][]{{"indexOf", "org.apache.commons.lang.text.StrMatcher", "5"}, {"deleteAll", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sampl; {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sampl; {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "nulla b1.12345startInd"}, false, 7, new String[][]{}), new String[][]{{"indexOf", "char,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", ""}}), new String[][]{{"close", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"int", "int", "char[]", "int"}, new String[]{"19", "0", "<sample:2>", "2147483575"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\u00eam", "PTH1.1234567890123456"}, false, 5, new String[][]{}), new String[][]{{"indexOf", "char,int", "1"}, {"delete", "int,int", "3"}, {"append", "char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0a {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0a {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<d:-16.5>", "14", "\000"}, false), new String[][]{{"indexOf", "java.lang.String", "5"}, {"deleteAll", "char", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-16.5 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-16.5 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"2020-01-017628716375283629643end < start"}, false), new String[][]{{"append", "int", "2"}, {"contains", "org.apache.commons.lang.text.StrMatcher", "6"}, {"contains", "org.apache.commons.lang.text.StrMatcher", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "2020-01-017628716375283629643end < start0 {getNewLineText=null, getNullText=null, isEmpty=false, length=41, size=41}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"-1207959470", "-2147483392", "]"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "1E-51.1234g56791.5e300", ",b,b"}}, 1), new String[][]{{"insert", "int,boolean", "2"}, {"insert", "int,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("truec {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "truec {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"char"}, new String[]{"\r"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:2>", "http://e"}}), new String[][]{{"insert", "int,double", "3"}, {"isEmpty", "", "6"}, {"deleteAll", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("2Infinityhttp://ekeyhttp://e {getNewLineText=null, getNullText=null, isEmpty=false, length=28, size=28}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2Infinityhttp://ekeyhttp://e {getNewLineText=null, getNullText=null, isEmpty=false, length=28, size=28}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:6>"}, false, 0, null, 2), new String[][]{{"append", "java.lang.StringBuffer", "5"}, {"equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:0>", "<null>"}, false, 0, null, 3), new String[][]{{"indexOf", "java.lang.String,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<s:W<l>", "0", "S"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "char,char", "e", "e"}}), new String[][]{{"insert", "int,java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"ready", "", "2"}, {"read", "char[],int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "11", "65590"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "2147483647", "536870911", "<sample:0>", "20"}}), new String[][]{{"read", "java.nio.CharBuffer", "0"}, {"skip", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"int"}, new String[]{"-30"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "midString", "int,int", "1023", "-56"}}, 2), new String[][]{{"indexOf", "char,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-30 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String", "int"}, new String[]{"5.--m1", "1073741823"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:1>", "20200-C[1-011.5f"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String", "2/20-[1-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "b20200-C[1-011.5f22/20-[1-01 {getNewLineText=null, getNullText=null, isEmpty=false, length=28, size=28}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<null>", "0.0"}, false, 1, new String[][]{}), new String[][]{{"insert", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "java.lang.String"}, new String[]{"-1073741787", "+1Ttrue"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<null>"}, false), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "7"}, {"asWriter", "", "7"}, {"write", "char[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "-1073741782", "-10485110"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteCharAt", "int", "32"}}, 2), new String[][]{{"append", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("b {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "b {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", ""}}), new String[][]{{"equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"2020-02-30T245:61:61"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:9>"}}, 1), new String[][]{{"append", "java.lang.StringBuffer", "3"}, {"equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=2020-02-30T245:61:61, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String", "int"}, new String[]{"", "1073741793"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:3>", "nu1"}, {"org.apache.commons.lang.text.StrBuilder", "appendNewLine", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "length", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder,int,int", "<sample:2>", "32778", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getNewLineText", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char"}, new String[]{";"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("; {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "; {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "rightString", new String[]{"int"}, new String[]{"32778"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:3>", "/a/b"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"int", "int", "char"}, new String[]{"-6", "32", "<"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "charAt", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-6<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< {getNewLineText=null, getNullText=null, isEmpty=false, length=32, size=32}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-6<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< {getNewLineText=null, getNullText=null, isEmpty=false, length=32, size=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "268435471", "1073741823", "<sample:1>", "-2147352576"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:1>", "aa1"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:10>", ""}}, 1), new String[][]{{"insert", "int,long", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "0xGFFFFFFF1.12345678", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "2147483647", "7.62871637528363E19"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1d10"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,b,,c", "length must be validhttp://example.com/a?b=c"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "charAt", "int", "2147483647"}}, 1), new String[][]{{"append", "float", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("01.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "01.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "char", "\010"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"char"}, new String[]{"T"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "midString", new String[]{"int", "int"}, new String[]{"-44", "9"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "midString", new String[]{"int", "int"}, new String[]{"-2147483575", "536870911"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "int", "5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("05", String.valueOf(actual));
  assertEquals("receiver state after the call", "05 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"[", "."}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "-26.019"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-26.0191.7976931348623157E308 {getNewLineText=null, getNullText=null, isEmpty=false, length=29, size=29}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-26.0191.7976931348623157E308 {getNewLineText=null, getNullText=null, isEmpty=false, length=29, size=29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"7628716375283629643"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char,int", "e", "117"}}, 2), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=7628716375283629643, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=7628716375283629643, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.5", "-28", "2147483647"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"15", "{"}, false, 0, null, 2), new String[][]{{"append", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("{{{{{{{{{{{{{{{true {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{{{{{{{{{{{{{{{true {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"read", "java.nio.CharBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "length", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "-16352", "1073741793", "."}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:10>", ""}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "char", "n"}}, 1), new String[][]{{"insert", "int,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sa0mple {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sa0mple {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"int", "int", "char"}, new String[]{"131112", "16389", "\001"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "<", "\t"}}, 3), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("131112\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001...#16473#-1278952848", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "131112\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001...#16473#-1278952848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setCharAt", "int,char", "32841", " "}, {"org.apache.commons.lang.text.StrBuilder", "setNewLineText", "java.lang.String", "nulla b1.12345678"}}, 2), new String[][]{{"asWriter", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=nulla b1.12345678, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{" ", "8388595"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", "f"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<i:0>", "-64", "F"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "2074", "-1073741824"}, {"org.apache.commons.lang.text.StrBuilder", "length", ""}}, 1), new String[][]{{"append", "double", "2"}, {"asWriter", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "0.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"b", "l"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<null>", "-1"}, false, 2, new String[][]{}, 1), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample0 {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample0 {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"setEmptyTokenAsNull", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=sample, getTokenArray=[sample], hasNext=true, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<sample:2>", "-262165", "-2147483648"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "trim", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"char"}, new String[]{"{"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "true"}, {"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("truesample {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "truesample {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:6>", "-56", "1140850687"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char,int", "v", "536903690"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{"<a>b</a>0x1F"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "a,b,bb "}, {"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:7>"}}, 1), new String[][]{{"getNullText", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,bb ", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=<a>b</a>0x1F, getNullText=a,b,bb , isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:3>"}, false, 0, null, 1), new String[][]{{"append", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"insert", "int,double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\nInfinity {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\nInfinity {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<sample:4>", "---1abc"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5.true", "-0"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asTokenizer", ""}}, 1), new String[][]{{"append", "java.lang.StringBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=, getTokenArray=[], hasNext=false, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String", "int", "int", "int"}, new String[]{"<sample:6>", "Invblid ssartIndex: ", "10", "67108910", "2147483647"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"char", "char"}, new String[]{"Z", "i"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "[1,2]", "a blength must be valid"}}, 3), new String[][]{{"getNewLineText", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"-32768", "-2147483648", "_"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<empty>", "Invalidt length; "}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"char"}, new String[]{"\010"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "float", "0.0"}, {"org.apache.commons.lang.text.StrBuilder", "delete", "int,int", "-33", "1073741777"}}, 3), new String[][]{{"contains", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<d:-4.75>", "-2147483648", "T"}, false, 2, new String[][]{}, 1), new String[][]{{"getChars", "char[]", "1"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[s, a, m, p, l, e]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{"0b"}, false, 0, null, 1), new String[][]{{"append", "java.lang.Object", "5"}, {"contains", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=0b, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "rightString", new String[]{"int"}, new String[]{"-524329"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:2>", "1.55."}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "21.55.key1.55.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=15, size=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:3>", "0xGFFFFFFF1.12345678"}, false, 0, null, 1), new String[][]{{"deleteAll", "java.lang.String", "2"}, {"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "charAt", new String[]{"int"}, new String[]{"-50"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "rightString", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "delete", new String[]{"int", "int"}, new String[]{"178", "2084"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"char[]"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "2147383649", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"asReader", "", "7"}, {"ready", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "startsWith", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "<", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.123", "0.0"}, false, 0, null, 1), new String[][]{{"append", "java.lang.StringBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "startsWith", new String[]{"java.lang.String"}, new String[]{"Invalid startIndex: 1.1234567890123456"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "9"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char,int", "4", "-1073741751"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char"}, new String[]{"L"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "int,int,char", "2147483647", "-2147483616", "\r"}}, 1), new String[][]{{"asWriter", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "L {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x12456789", "a,b,bInvalid startIndex: "}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher", "int"}, new String[]{"<sample:2>", "267911183"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"setQuoteMatcher", "org.apache.commons.lang.text.StrMatcher", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=, getTokenArray=[], hasNext=false, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:5>", "1.1234567890Invalid length: "}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String", "+1Ttru"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{"int", "int"}, new String[]{"8388598", "-16357"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asTokenizer", ""}, {"org.apache.commons.lang.text.StrBuilder", "validateIndex", "int", "68"}}, 3), new String[][]{{"indexOf", "java.lang.String", "5"}, {"insert", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "long"}, new String[]{"1073217547", "-56"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String"}, new String[]{"PT7o"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "--0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"2020-01-11"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=2020-01-11, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=2020-01-11, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 3), new String[][]{{"insert", "int,float", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "-268435394", "16"}}, 1), new String[][]{{"contains", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"char", "char"}, new String[]{"b", "p"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "substring", new String[]{"int", "int"}, new String[]{"-64", "-2147483648"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"startInd", " "}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setLength", "int", "16"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=16, size=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=16, size=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "1", "69"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<i:0>", "16", "9"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("9999999999999990 {getNewLineText=null, getNullText=null, isEmpty=false, length=16, size=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9999999999999990 {getNewLineText=null, getNullText=null, isEmpty=false, length=16, size=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<i:-31>", "28", ";"}, false, 3, new String[][]{}), new String[][]{{"append", "float", "5"}, {"appendWithSeparators", "java.util.Collection,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(";;;;;;;;;;;;;;;;;;;;;;;;;-31-Infinitya000sample {getNewLineText=null, getNullText=null, isEmpty=false, length=47, size=47}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", ";;;;;;;;;;;;;;;;;;;;;;;;;-31-Infinitya000sample {getNewLineText=null, getNullText=null, isEmpty=false, length=47, size=47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"1.0000000000000002"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1.0000000000000002 {getNewLineText=null, getNullText=null, isEmpty=false, length=18, size=18}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.0000000000000002 {getNewLineText=null, getNullText=null, isEmpty=false, length=18, size=18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"char"}, new String[]{"\uffff"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "reverse", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "endsWith", new String[]{"java.lang.String"}, new String[]{"/a/"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"int"}, new String[]{"31"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("31 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "31 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "validateRange", new String[]{"int", "int"}, new String[]{"1", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "substring", new String[]{"int", "int"}, new String[]{"10", "28"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "int,int,java.lang.String", "2147483647", "-2147483648", "1.5d"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher", "int"}, new String[]{"<sample:1>", "47"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"java.lang.String"}, new String[]{"a,b,b"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"int"}, new String[]{"28"}, false, 6, new String[][]{}), new String[][]{{"append", "java.lang.StringBuffer", "5"}, {"asTokenizer", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=28, getTokenArray=[28], hasNext=true, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "28 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<sample:4>", "33", "\001"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001key {getNewLineText=null, getNullText=null, isEmpty=false, length=33, size=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001\001key {getNewLineText=null, getNullText=null, isEmpty=false, length=33, size=33}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"capacity", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"long"}, new String[]{"9223372036854247423"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("9223372036854247423 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9223372036854247423 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteCharAt", new String[]{"int"}, new String[]{"-262164"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", " ", "."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String", "int", "int", "int"}, new String[]{"<sample:7>", "/a/b", "9", "-1", "0"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Iterator,java.lang.String", "<sample:0>", "bc"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"0", "0"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "java.lang.String"}, new String[]{"10", "00x1F"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,long", "94", "-131071"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"int", "int", "char"}, new String[]{"-2", "2147483647", "\000"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getNewLineText", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteCharAt", "int", "16"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<s:W>", "16", "a"}}), new String[][]{{"insert", "int,float", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sa-1.0mpleWaaaaaaaaaaaaaaa {getNewLineText=null, getNullText=null, isEmpty=false, length=26, size=26}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sa-1.0mpleWaaaaaaaaaaaaaaa {getNewLineText=null, getNullText=null, isEmpty=false, length=26, size=26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String", "int"}, new String[]{"--0.0", "0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "reverse", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"char", "int"}, new String[]{"0", "14"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147483648", "1.5e"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "length", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<sample:0>", "8388631", "16389"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char", "2147483647", "\r"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char[]", "int", "int"}, new String[]{"-6", "<null>", "0", "-2147352576"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "34", "1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "boolean"}, new String[]{"0", "true"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("true {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "true {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("  {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "  {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"long"}, new String[]{"7628716375283629642"}, false), new String[][]{{"indexOf", "char,int", "5"}, {"asWriter", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "7628716375283629642 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"int", "int", "java.lang.String"}, new String[]{"-5", "-1073741824", "1/a/"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "size", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "capacity", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<empty>", "-2147483647", "47"}, {"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "68", "14", "<sample:0>", "-22"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:5>", "Title", "-479", "69", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("false {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "false {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char"}, new String[]{"a"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "substring", "int", "2"}, {"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "-2", "268435455"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{"int", "int"}, new String[]{"-262168", "-268435456"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "charAt", new String[]{"int"}, new String[]{"-2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String", "int", "int", "int"}, new String[]{"<sample:5>", "1e10", "-10", "-2", "-1073741824"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char,int", " ", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"a,b,bb ", "15", "2147483647"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "charAt", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setCharAt", "int,char", "19", "T"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<s:a>", "0", " "}, false), new String[][]{{"asWriter", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "substring", new String[]{"int"}, new String[]{"16777231"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "startsWith", new String[]{"java.lang.String"}, new String[]{"Invalid offset: 2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"org.apache.commons.lang.text.StrMatcher", "int"}, new String[]{"<sample:3>", "-482"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "56", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<s:>", "-2147483648", "i"}, false, 4, new String[][]{}), new String[][]{{"append", "float", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-Infinity {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=0, getTokenArray=[0], hasNext=true, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<null>", "http://example.com/a?b=c"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "char", "["}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a/b", "1.1234567"}, false, 2, new String[][]{}), new String[][]{{"indexOf", "org.apache.commons.lang.text.StrMatcher", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:10>", "1 .5e300"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"69", "v"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "validateIndex", "int", "-1207959486"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv {getNewLineText=null, getNullText=null, isEmpty=false, length=69, size=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv {getNewLineText=null, getNullText=null, isEmpty=false, length=69, size=69}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String", "int"}, new String[]{"startInd", "2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:3>"}, false), new String[][]{{"insert", "int,java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<i:1>", "11", "E"}}), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1EEEEEEEEEE\n0true0c {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1EEEEEEEEEE\n0true0c {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"append", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n0.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n0.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"char", "char"}, new String[]{"[", "a"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"Hello, Worlda"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("Hello, Worlda {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Hello, Worlda {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String"}, new String[]{"[1,2] "}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:3>", "123456789012345678901234567890"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char[]", "int", "int"}, new String[]{"-4", "<null>", "2147483647", "-6"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "midString", new String[]{"int", "int"}, new String[]{"-2147483648", "-2147483648"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1xGFFFFFFF1.12345678", "a,b,bb "}, false, 1, new String[][]{}), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0samplesamplesample {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0samplesamplesample {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"640.0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("640.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "640.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<s:>", "-5", "?"}, false, 4, new String[][]{}), new String[][]{{"insert", "int,char", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{".5"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=.5, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=.5, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"char"}, new String[]{"_"}, false), new String[][]{{"indexOf", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT3o", "1.12345677890123456"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asTokenizer", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"-1073676288", "<"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char"}, new String[]{"n"}, false), new String[][]{{"ensureCapacity", "int", "3"}, {"indexOf", "org.apache.commons.lang.text.StrMatcher", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 3, new String[][]{}), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "1"}, {"appendWithSeparators", "java.util.Collection,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("9223372036854775807a000sample {getNewLineText=null, getNullText=null, isEmpty=false, length=29, size=29}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9223372036854775807a000sample {getNewLineText=null, getNullText=null, isEmpty=false, length=29, size=29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Invblid startIndex: ", "I"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:5>"}, {"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<sample:1>"}}), new String[][]{{"indexOf", "org.apache.commons.lang.text.StrMatcher,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a0 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"-2147483648", "-2147483575", "9"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<i:0>", "-16357", "\000"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1.5 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.5 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<i:-2>", "32778", "7"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "delete", "int,int", "1073741823", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-2777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777...#32859#-216456984", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-2777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777...#32859#-216456984", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "java.lang.String"}, new String[]{"31", "2020-[1-01"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1..5", "2020-01-01"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<sample:0>"}}), new String[][]{{"insert", "int,double", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"5", "-4", "N"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "java.lang.Object", "<s:a>"}}), new String[][]{{"indexOf", "char,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteCharAt", "int", "-1073741824"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String,int,int", "1..", "32", "-4089"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "reverse", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "int", "-8192"}}), new String[][]{{"appendFixedWidthPadRight", "java.lang.Object,int,char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("2918-b {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2918-b {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<null>", "1"}, false), new String[][]{{"append", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "int"}, new String[]{"-330", "536838144"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "char[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"char", "char"}, new String[]{":", "\010"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}), new String[][]{{"appendNull", "", "5"}, {"insert", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("20 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "20 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:6>", ""}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "<"}, {"org.apache.commons.lang.text.StrBuilder", "appendNewLine", ""}}), new String[][]{{"append", "float", "4"}, {"insert", "int,char", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getNullText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"long"}, new String[]{"15"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<empty>", "32\n"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("15 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "15 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"float"}, new String[]{"-3.4028235E37"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-3.4028235E37 {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-3.4028235E37 {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.receiverState());
 }
}
