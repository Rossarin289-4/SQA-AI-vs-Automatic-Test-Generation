package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher", "int"}, new String[]{"<sample:4>", "31"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<sample:1>", "33", "2147483647"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char,int", "l", "32"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"s7\nb", "srr/,ustrd0x123466789a"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629564"}, {"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "32", "1"}, {"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<null>"}}), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"charAt", "int", "5"}, {"indexOf", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample7628716375283629564 {getNewLineText=null, getNullText=null, isEmpty=false, length=25, size=25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{"d", "20"}, false, 10, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "delete", "int,int", "10", "-2147483648"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "0", "3.4028235E38"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "Title", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "3.4028235E38 {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"-56", "D"}, false, 8, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:6>"}}), new String[][]{{"asReader", "", "6"}, {"mark", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<empty>", "-1040187358", "20"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "1.7976931348623157E308"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "e", "-4"}}), new String[][]{{"append", "java.lang.Object", "0"}, {"deleteCharAt", "int", "3"}, {"indexOf", "java.lang.String", "0"}, {"appendNewLine", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("smple1.7976931348623157E308a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=29, size=29}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "smple1.7976931348623157E308a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=29, size=29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"/}8b"}, false, 9, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "char", "m"}}), new String[][]{{"insert", "int,char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=/}8b, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=/}8b, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "ensureCapacity", "int", "-1040187358"}, {"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "-134217792"}}), new String[][]{{"append", "float", "4"}, {"deleteAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sampleInfinity {getNewLineText=null, getNullText=null, isEmpty=false, length=14, size=14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sampleInfinity {getNewLineText=null, getNullText=null, isEmpty=false, length=14, size=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "-4", "16.0"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:6>", "Title"}, {"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<sample:2>"}}), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"deleteAll", "java.lang.String", "7"}, {"insert", "int,char[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<null>"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:3>", "srr/,ustrd0x133466789a"}, {"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "", "1234}6789012345678901234567890"}}), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "0"}, {"deleteAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,java.lang.Object", "4", "<null>"}, {"org.apache.commons.lang.text.StrBuilder", "replace", "int,int,java.lang.String", "32", "32", "/}Ibend < start"}}, 1), new String[][]{{"setDelimiterChar", "char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=, getTokenArray=[], hasNext=false, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "reverse", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "xlengXth mu9t be valid"}}), new String[][]{{"deleteAll", "org.apache.commons.lang.text.StrMatcher", "1"}, {"append", "double", "6"}, {"appendFixedWidthPadLeft", "int,int,char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("elpmas-1.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "elpmas-1.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "reverse", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "5."}}, 2), new String[][]{{"deleteAll", "org.apache.commons.lang.text.StrMatcher", "1"}, {"append", "double", "6"}, {"appendFixedWidthPadLeft", "int,int,char", "1"}, {"equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "substring", new String[]{"int", "int"}, new String[]{"-4198382", "4198382"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "substring", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:4>", "length murt be valid0x1F"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "0", "0"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "F", "76287163752836296437628716375283629643"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "java.lang.Object,int,char", "<i:-1>", "-2147483648", ","}}), new String[][]{{"deleteFirst", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0length murt be valid0x1F {getNewLineText=null, getNullText=null, isEmpty=false, length=25, size=25}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0length murt be valid0x1F {getNewLineText=null, getNullText=null, isEmpty=false, length=25, size=25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getNullText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<empty>"}, {"org.apache.commons.lang.text.StrBuilder", "toCharArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<null>", "-{Invallid startIndex: "}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", ""}, {"org.apache.commons.lang.text.StrBuilder", "trim", ""}, {"org.apache.commons.lang.text.StrBuilder", "reverse", ""}}, 3), new String[][]{{"append", "java.lang.StringBuffer", "4"}, {"appendFixedWidthPadRight", "java.lang.Object,int,char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0\000\000\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0\000\000\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<empty>", "dIIl*c!tt7a"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", "e"}}, 1), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "3"}, {"asTokenizer", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=samplsample, getTokenArray=[samplsample], hasNext=true, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samplsample {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<empty>", "dIIl*c!tt7a"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", "D"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "e", "a"}}, 1), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "3"}, {"asTokenizer", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=samplasample, getTokenArray=[samplasample], hasNext=true, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samplasample {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:0>", "C\"`\":1}{"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<d:7.5>"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "tt", "dIIl*c!tt7a"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "e", "f"}}), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "3"}, {"asTokenizer", "", "6"}, {"reset", "char[]", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=a0\000, getTokenArray=[a0\000], hasNext=true, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "7.51sample {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:2>", "TdITMI6mvalid"}, false, 11, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setCharAt", "int,char", "2147483647", "/"}, {"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder,int,int", "<sample:3>", "2147483647", "4198382"}}, 3), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "0"}, {"append", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("2TdITMI6mvalidkeyTdITMI6mvalid0true {getNewLineText=null, getNullText=null, isEmpty=false, length=35, size=35}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2TdITMI6mvalidkeyTdITMI6mvalid0true {getNewLineText=null, getNullText=null, isEmpty=false, length=35, size=35}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:6>", "sw1E"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "charAt", "int", "18"}, {"org.apache.commons.lang.text.StrBuilder", "setCharAt", "int,char", "64", "u"}}, 3), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "5"}, {"append", "boolean", "3"}, {"deleteAll", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sampletrueasampletrue {getNewLineText=null, getNullText=null, isEmpty=false, length=21, size=21}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sampletrueasampletrue {getNewLineText=null, getNullText=null, isEmpty=false, length=21, size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:8>", "s1E"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "33", "-2147483648", "<sample:0>", "10"}, {"org.apache.commons.lang.text.StrBuilder", "charAt", "int", "-18"}, {"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "-18", "-1040187358", "<sample:0>", "-56"}}), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "5"}, {"append", "boolean", "3"}, {"deleteAll", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample-1s1E1.5s1Evalueasampletrue {getNewLineText=null, getNullText=null, isEmpty=false, length=33, size=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample-1s1E1.5s1Evalueasampletrue {getNewLineText=null, getNullText=null, isEmpty=false, length=33, size=33}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:3>"}, false), new String[][]{{"asReader", "", "3"}, {"read", "", "2"}, {"read", "char[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:2>", "1.5f"}, false, 16, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:3>"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:0>", "4."}, {"org.apache.commons.lang.text.StrBuilder", "contains", "java.lang.String", "lemfth muWrt be vbli"}}, 2), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "6"}, {"append", "boolean", "3"}, {"deleteAll", "java.lang.String", "2"}, {"insert", "int,boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("true21.5fkey1.5ftrue {getNewLineText=null, getNullText=null, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "true21.5fkey1.5ftrue {getNewLineText=null, getNullText=null, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "length", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "midString", "int,int", "18", "-57"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:4>", "length murt be v?,lid0x1F"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "1.1234567a b", ""}, {"org.apache.commons.lang.text.StrBuilder", "getChars", "char[]", "<null>"}, {"org.apache.commons.lang.text.StrBuilder", "replace", "org.apache.commons.lang.text.StrMatcher,java.lang.String,int,int,int", "<sample:0>", "1.1234567890123456", "-1040187358", "-134217792", "0"}}), new String[][]{{"appendNewLine", "", "3"}, {"insert", "int,int", "6"}, {"indexOf", "org.apache.commons.lang.text.StrMatcher", "3"}, {"appendWithSeparators", "java.util.Iterator,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("00l4ength murt be v?,lid0x1F\n {getNewLineText=null, getNullText=null, isEmpty=false, length=29, size=29}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "00l4ength murt be v?,lid0x1F\n {getNewLineText=null, getNullText=null, isEmpty=false, length=29, size=29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:4>", "T1ji1.5e300"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "1.124567a b", "66_"}, {"org.apache.commons.lang.text.StrBuilder", "getChars", "char[]", "<null>"}, {"org.apache.commons.lang.text.StrBuilder", "setLength", "int", "-1040187373"}}, 2), new String[][]{{"append", "java.lang.String,int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:0>", "xlenfXti mu8t be\037valid1..13345678"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "1.124", "66_"}, {"org.apache.commons.lang.text.StrBuilder", "setLength", "int", "0"}}), new String[][]{{"appendNewLine", "", "7"}, {"insert", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "startsWith", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:0>", "-4"}, {"org.apache.commons.lang.text.StrBuilder", "trim", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:9>", "rqu\n"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "1.", "H6`"}, {"org.apache.commons.lang.text.StrBuilder", "setLength", "int", "10"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<null>", "1234567890123D45678901234567890"}}, 3), new String[][]{{"appendNewLine", "", "7"}, {"insert", "int,int", "6"}, {"appendWithSeparators", "java.util.Collection,java.lang.String", "7"}, {"endsWith", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sam4ple\000\000\000\0001.5\nsample {getNewLineText=null, getNullText=null, isEmpty=false, length=21, size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:5>", "B8u\n-1.0-1.5i"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "1.", "0x1F"}, {"org.apache.commons.lang.text.StrBuilder", "setLength", "int", "68"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "1234567890123D45678901234567690"}}, 3), new String[][]{{"insert", "int,java.lang.String", "7"}, {"insert", "int,int", "2"}, {"appendWithSeparators", "java.util.Collection,java.lang.String", "5"}, {"endsWith", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1sample\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000B8u\n-1.0-1.5itrueB8u\n-1.0-1.5ica000sample {getNewLineText=null, getNullText=null, isEmpty=false, length=110, size=110}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"char"}, new String[]{"e"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "-4198382", "-4198382", "v"}, {"org.apache.commons.lang.text.StrBuilder", "append", "char", "\uffff"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\uffff {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}, {"org.apache.commons.lang.text.StrBuilder", "deleteCharAt", "int", "64"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:1>", "Tlle"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", ".", "1.123456\"7"}, {"org.apache.commons.lang.text.StrBuilder", "setLength", "int", "127"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "1234567890123D456789\r01234567690"}}), new String[][]{{"appendFixedWidthPadLeft", "java.lang.Object,int,char", "7"}, {"insert", "int,int", "2"}, {"contains", "java.lang.String", "5"}, {"endsWith", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1sample\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000bTlle2 true {getNewLineText=null, getNullText=null, isEmpty=false, lengt...#216#1161657703", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"int", "int", "java.lang.String"}, new String[]{"0", "68", "2147483648"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("2147483648 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2147483648 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:3>", "0\t1Fb"}, false, 11, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asReader", ""}, {"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", ".", "1.023456\"6"}, {"org.apache.commons.lang.text.StrBuilder", "setLength", "int", "-2147483648"}}, 2), new String[][]{{"appendFixedWidthPadLeft", "java.lang.Object,int,char", "7"}, {"insert", "int,int", "2"}, {"appendWithSeparators", "java.util.Collection,java.lang.String", "3"}, {"deleteAll", "org.apache.commons.lang.text.StrMatcher", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1keytruesample {getNewLineText=null, getNullText=null, isEmpty=false, length=14, size=14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1keytruesample {getNewLineText=null, getNullText=null, isEmpty=false, length=14, size=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:1>", "1\tFb"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "/", "1.023456\"6{\"a\":1}"}, {"org.apache.commons.lang.text.StrBuilder", "setLength", "int", "0"}}, 2), new String[][]{{"appendFixedWidthPadLeft", "java.lang.Object,int,char", "7"}, {"insert", "int,int", "3"}, {"appendWithSeparators", "java.util.Collection,java.lang.String", "3"}, {"endsWith", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "b21474836471\tFb2 truesample {getNewLineText=null, getNullText=null, isEmpty=false, length=27, size=27}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "1.234567", "-2147483648"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "1234567890123D45678901234567890", "-X.5"}}), new String[][]{{"append", "java.lang.String", "3"}, {"appendWithSeparators", "java.util.Collection,java.lang.String", "6"}, {"insert", "int,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"xlCCeng,vXXth lu9t\u00e9 bevalid", "0,1235567899/c"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,long", "-134217792", "7628716375283629580"}, {"org.apache.commons.lang.text.StrBuilder", "appendNull", ""}}), new String[][]{{"appendNull", "", "5"}, {"append", "char[],int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"b\":T1}", "1.1234567890123456"}, false, 8, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:5>"}}, 1), new String[][]{{"appendNull", "", "0"}, {"append", "char[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{""}, false, 13, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629643"}}), new String[][]{{"deleteAll", "java.lang.String", "0"}, {"insert", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"char"}, new String[]{"m"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<null>"}, {"org.apache.commons.lang.text.StrBuilder", "validateRange", "int,int", "8188", "-1040187373"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"char"}, new String[]{"u"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "java.lang.Object", "<null>"}, {"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer", "<sample:2>"}}, 1), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "3"}, {"getChars", "char[]", "1"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[s, a, m, p, l, e, k, e, y]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samplekey {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<empty>", "\\0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:5>", "-4198339", "260046764"}, false, 9, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "-4", "127", "g"}, {"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "64", "8217"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:3>"}, false), new String[][]{{"delete", "int,int", "2"}, {"append", "org.apache.commons.lang.text.StrBuilder,int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "0", "-18"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setCharAt", "int,char", "-16777172", "C"}}), new String[][]{{"insert", "int,java.lang.Object", "3"}, {"insert", "int,boolean", "5"}, {"deleteAll", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("fkfalseeyalse {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "fkfalseeyalse {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"0x123456789", "0", "-134217792"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "1107296546", "4198382", "C"}, {"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "-56", "{"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "startsWith", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}, {"org.apache.commons.lang.text.StrBuilder", "append", "long", "2305843009146585232"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "2305843009146585232 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:1>", "startIodex must be valid"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "reverse", ""}, {"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "-25"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:2>", "O6lleaaaaaaaa\"aaaa\tnaaaaaaaa<aaaaaaaaa12:30:45"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0O6lleaaaaaaaa\"aaaastartIodex must be validnaaaaaaaa<aaaaaaaaa12:30:45sampleO6lleaaaaaaaa\"aaaa\tnaaaaaaaa<aaaaaaaaa12:30:45 {getNewLineText=null, getNullText=null, isEmpty=false, length=122, size=122}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0O6lleaaaaaaaa\"aaaastartIodex must be validnaaaaaaaa<aaaaaaaaa12:30:45sampleO6lleaaaaaaaa\"aaaa\tnaaaaaaaa<aaaaaaaaa12:30:45 {getNewLineText=null, getNullText=null, isEmpty=false, length=122, size=122}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"m", "6"}, false, 8, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", ""}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[],int,int", "-1", "<empty>", "-2147483648", "-4198339"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "", ""}}, 2), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "6"}, {"append", "java.lang.String,int,int", "1"}, {"appendWithSeparators", "java.util.Collection,java.lang.String", "1"}, {"insert", "int,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"2", "_"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "midString", "int,int", "18", "1107296536"}, {"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "39"}}), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "1"}, {"append", "java.lang.String,int,int", "1"}, {"deleteFirst", "char", "2"}, {"append", "java.lang.StringBuffer,int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<null>", "10", "-4198382"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{" ", "c"}, false, 11, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<sample:2>"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "s11E"}, {"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "2147483647"}}, 2), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "7"}, {"append", "java.lang.String,int,int", "1"}, {"deleteFirst", "char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0\000cc-1 {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0\000cc-1 {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"@", "6"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String", "Invalid  startIndex: "}, {"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "128"}, {"org.apache.commons.lang.text.StrBuilder", "ensureCapacity", "int", "18"}}, 1), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "3"}, {"append", "java.lang.String,int,int", "1"}, {"delete", "int,int", "6"}, {"endsWith", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0kea {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"{", "{"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "4"}, {"org.apache.commons.lang.text.StrBuilder", "replaceAll", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:1>", "/a/1"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String", "Invalid  startIndex: "}}), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "6"}, {"append", "java.lang.String,int,int", "1"}, {"delete", "int,int", "3"}, {"append", "java.lang.String,int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "64", "4", "<null>", "-1040187358"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "midString", "int,int", "-4198382", "39"}, {"org.apache.commons.lang.text.StrBuilder", "append", "char[],int,int", "<sample:0>", "-4", "-12"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "1.023456\"7", "Tlle"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String", "2.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "size", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "a", "i"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "\t", "8217"}}, 1), new String[][]{{"endsWith", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "simple9223372036854775807 {getNewLineText=null, getNullText=null, isEmpty=false, length=25, size=25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:2>", "8188"}}), new String[][]{{"flush", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "34"}}), new String[][]{{"write", "int", "0"}, {"close", "", "2"}, {"close", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "0\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<sample:0>"}, {"org.apache.commons.lang.text.StrBuilder", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "  {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:4>", "1234567890123D456789\r01234567690"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "java.lang.Object,int,char", "<null>", "127", "l"}}, 2), new String[][]{{"indexOf", "org.apache.commons.lang.text.StrMatcher", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1234567890123D456789\r01234567690a {getNewLineText=null, getNullText=null, isEmpty=false, length=33, size=33}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"s111E"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "33"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=s111E, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=s111E, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "char", "{"}, {"org.apache.commons.lang.text.StrBuilder", "deleteAll", "java.lang.String", "--1"}}), new String[][]{{"deleteFirst", "java.lang.String", "1"}, {"contains", "char", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "smple  {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "java.lang.String", "--0"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:2>"}}, 3), new String[][]{{"deleteFirst", "java.lang.String", "1"}, {"contains", "char", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "smplea0 {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<null>", "-2147483519", "0"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<sample:3>", "0", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:5>", ";nvalidoffsff-: "}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "java.lang.Object", "<s:3key>"}, {"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "int,int,char", "-57", "32", "{"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[]", "31", "<empty>"}}), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "0"}, {"appendFixedWidthPadRight", "int,int,char", "2"}, {"asTokenizer", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=0{{{{{{{{{{{{{{{{{{{{{{{{{{{{{-57a;nvalidoffsff-: 0;nvalidof.., getTokenArray=[0{{{{{{{{{{{{{{{{{{{{{{{{{{{{{-57a;nvalidoffsff-:, 0;nvalid.., hasNext=true, ...#278#513412370", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0{{{{{{{{{{{{{{{{{{{{{{{{{{{{{-57a;nvalidoffsff-: 0;nvalidoffsff-: sample10 {getNewLineText=null, getNullText=null, isEmpty=false, length=75, size=75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:4>", "s1234567"}, false, 9, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "int,int,char", "1073741794", "4198382", "4"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char", "0"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[],int,int", "31", "<sample:0>", "1", "-56"}}), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "5"}, {"insert", "int,long", "3"}, {"appendFixedWidthPadRight", "int,int,char", "7"}, {"appendWithSeparators", "java.util.Iterator,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("49223372036854775807444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...#4198507#272259435", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "49223372036854775807444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...#4198507#272259435", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"11\t\tstartIndex must be vaFlidInvalid length: ", "x]lem.gth m"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}}), new String[][]{{"ensureCapacity", "int", "7"}, {"getNullText", "", "4"}, {"append", "org.apache.commons.lang.text.StrBuilder,int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"int"}, new String[]{"8188"}, false), new String[][]{{"asReader", "", "7"}, {"skip", "long", "4"}, {"reset", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "8188 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:8>", "B"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "b0h/;Tl+0aaaaaaaaaaaaaaaaaaaaaaaaa`9aaaa"}, {"org.apache.commons.lang.text.StrBuilder", "append", "float", "1.0"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "1.", "28"}}, 2), new String[][]{{"appendFixedWidthPadRight", "java.lang.Object,int,char", "4"}, {"charAt", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{"1.F"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "4", "-56"}, {"org.apache.commons.lang.text.StrBuilder", "isEmpty", ""}}), new String[][]{{"asReader", "", "6"}, {"mark", "int", "3"}, {"read", "java.nio.CharBuffer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=1.F, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,long", "1107296536", "2305843009146585232"}}), new String[][]{{"write", "char[]", "1"}, {"append", "char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "a0a {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{"T1ji1.5e300"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:5>"}}), new String[][]{{"asWriter", "", "1"}, {"append", "java.lang.CharSequence", "5"}, {"write", "char[],int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 4, new String[][]{}), new String[][]{{"insert", "int,char[]", "2"}, {"appendNewLine", "", "4"}, {"insert", "int,boolean", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:,[`;ex>"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String,int,int", "Invalid startIndex: ", "-2147483648", "34"}, {"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:7>"}, {"org.apache.commons.lang.text.StrBuilder", "capacity", ""}}), new String[][]{{"insert", "int,char[]", "2"}, {"appendNewLine", "", "4"}, {"deleteFirst", "char", "4"}, {"asWriter", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", ",[`;ex\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<sample:1>"}, {"org.apache.commons.lang.text.StrBuilder", "size", ""}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String", "abc"}}, 1), new String[][]{{"deleteAll", "java.lang.String", "1"}, {"append", "org.apache.commons.lang.text.StrBuilder", "7"}, {"append", "char[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNewLine", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:8>"}, {"org.apache.commons.lang.text.StrBuilder", "append", "long", "31"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample31\n {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample31\n {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", "a "}}), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setCharAt", new String[]{"int", "char"}, new String[]{"4", "}"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samp}e {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samp}e {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"java.lang.String"}, new String[]{"srr/,ustrd0x133466789a"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,int", "0", "-16777172"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,java.lang.Object", "2147483647", "<s:->"}, {"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}}, 2), new String[][]{{"appendPadding", "int,char", "5"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "4"}, {"endsWith", "java.lang.String", "7"}, {"indexOf", "org.apache.commons.lang.text.StrMatcher,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-16777172sampleaaey {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "0", "10"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteCharAt", "int", "-25"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"2147483647", "-18", "l"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", "202/-/1-0"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String", "."}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<null>", "[1,2]"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "28", "1107296546", "<sample:1>", "32"}}, 1), new String[][]{{"delete", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<sample:2>", ""}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", "1234578901134567890123457I7890"}, {"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:2>"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String", ""}}), new String[][]{{"insert", "int,double", "3"}, {"indexOf", "org.apache.commons.lang.text.StrMatcher", "2"}, {"contains", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sInfinityample {getNewLineText=null, getNullText=null, isEmpty=false, length=14, size=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "double"}, new String[]{"2147483647", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:6>"}, {"org.apache.commons.lang.text.StrBuilder", "validateRange", "int,int", "33", "-1"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String", "12:30:45"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String", "int", "int", "int"}, new String[]{"<sample:2>", "1.1234567", "10", "1", "31"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"length must be valid0x1F", "a b"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"F", "OUlleaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}, {"org.apache.commons.lang.text.StrBuilder", "contains", "char", "l"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:7>"}}, 3), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "4"}, {"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "OUlleaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 13, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}, {"org.apache.commons.lang.text.StrBuilder", "contains", "char", "l"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:7>"}}, 3), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "4"}, {"isEmpty", "", "5"}, {"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "OUlleaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:7>"}}, 3), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "4"}, {"isEmpty", "", "5"}, {"clear", "", "2"}, {"appendFixedWidthPadLeft", "int,int,char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "OUlleaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:1>"}}, 3), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "4"}, {"isEmpty", "", "5"}, {"clear", "", "2"}, {"appendFixedWidthPadLeft", "int,int,char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"x", "OUlleaaaaaaaa\"aaaa\taaaaaaaaa<aaaaaaaa12:30:45"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}}, 3), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "4"}, {"isEmpty", "", "5"}, {"clear", "", "2"}, {"appendFixedWidthPadLeft", "int,int,char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"x", "OUlleaaaaaaaa\"aaaa\taaaaaaaaa<aaaaaaaa12:30:45"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "32"}, {"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}}, 3), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "4"}, {"isEmpty", "", "5"}, {"clear", "", "2"}, {"appendFixedWidthPadLeft", "int,int,char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"xlength mu9t be valid", "O6lleaaaaaaaa\"aaaa\tnaaaaaaaa<aaaaaaaaa12:30:45"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "32"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "32"}, {"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}}, 3), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "4"}, {"isEmpty", "", "5"}, {"clear", "", "2"}, {"appendFixedWidthPadLeft", "int,int,char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"xlength mu9t be valid", ".5"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "1"}, {"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}}, 3), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "4"}, {"isEmpty", "", "5"}, {"clear", "", "2"}, {"appendFixedWidthPadLeft", "int,int,char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"xlengXth mu9t be valid", "true"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "1.5", "4"}}, 3), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "4"}, {"isEmpty", "", "5"}, {"clear", "", "2"}, {"appendFixedWidthPadLeft", "int,int,char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "java.lang.String"}, new String[]{"10", " "}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "int,int,char", "-1", "1", "\uffff"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"xlengXth mu9t be valid", "true"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<null>", "2147483648"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "1.5", "4"}}, 3), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "4"}, {"isEmpty", "", "5"}, {"clear", "", "2"}, {"appendFixedWidthPadLeft", "int,int,char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"xlengXth mu9t be valid", "true"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "2147483648"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "1.5", "4"}}, 3), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "4"}, {"isEmpty", "", "5"}, {"clear", "", "2"}, {"appendFixedWidthPadLeft", "int,int,char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"xlengXth mu9t be valid", "true"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "21474{3648"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "1.5", "-4"}}, 3), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "4"}, {"isEmpty", "", "5"}, {"clear", "", "2"}, {"appendFixedWidthPadLeft", "int,int,char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"xlengXth mu9t be\037valid", "tru"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:0>", "21474{3648"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "1.5", "-4"}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"isEmpty", "", "5"}, {"clear", "", "2"}, {"appendFixedWidthPadLeft", "int,int,char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\0003 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"xlengXth mu9t be\037valid", "sru"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "1.5", "-4"}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"isEmpty", "", "5"}, {"clear", "", "2"}, {"appendFixedWidthPadLeft", "int,int,char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("002 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "002 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"xlengXth mu9t be\037valid", "sru"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "1.5", "-4"}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"isEmpty", "", "5"}, {"indexOf", "java.lang.String", "2"}, {"appendFixedWidthPadLeft", "int,int,char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("002 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "002 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"xlengXti mu8t be\037valid", "sruttre"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629643"}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"isEmpty", "", "5"}, {"indexOf", "java.lang.String", "2"}, {"appendFixedWidthPadLeft", "int,int,char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("7628716375283629643002 {getNewLineText=null, getNullText=null, isEmpty=false, length=22, size=22}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "7628716375283629643002 {getNewLineText=null, getNullText=null, isEmpty=false, length=22, size=22}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"xlengXti mu8t be\037valid", "sruttre"}, false, 8, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629643"}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"isEmpty", "", "5"}, {"indexOf", "java.lang.String", "2"}, {"appendFixedWidthPadLeft", "int,int,char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a7628716375283629643002 {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a7628716375283629643002 {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"s b", "srustrd"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629643"}, {"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", " "}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"isEmpty", "", "5"}, {"indexOf", "java.lang.String", "2"}, {"appendFixedWidthPadLeft", "int,int,char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("7628716375283629643002 {getNewLineText=null, getNullText=null, isEmpty=false, length=22, size=22}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "7628716375283629643002 {getNewLineText=null, getNullText=null, isEmpty=false, length=22, size=22}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"s b", "srustrd"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629643"}, {"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", " "}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"isEmpty", "", "5"}, {"indexOf", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "7628716375283629643 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"s\nb", "sr/ustrd"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629643"}, {"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", " "}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "7628716375283629643 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"s\nb", "sr/ustrd"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629643"}, {"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", " "}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:1>", "1"}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"isEmpty", "", "5"}, {"indexOf", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("21", String.valueOf(actual));
  assertEquals("receiver state after the call", "7628716375283629643a10 {getNewLineText=null, getNullText=null, isEmpty=false, length=22, size=22}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"s\nb", "sr/ustrd"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629643"}, {"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", " "}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:1>", "1"}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"isEmpty", "", "5"}, {"indexOf", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "07628716375283629643a10 {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"s\nb", "sr/ustrd"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629643"}, {"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", " "}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"isEmpty", "", "5"}, {"indexOf", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "07628716375283629643 {getNewLineText=null, getNullText=null, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{"D", "10"}, false, 10, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "delete", "int,int", "10", "-2147483648"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "0", "3.4028235E38"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "Title", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "3.4028235E38 {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{"g", "2147483647"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "0", "1.7014117E38"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "Ttle", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.7014117E38sample {getNewLineText=null, getNullText=null, isEmpty=false, length=18, size=18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"-2147483648", "a"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer", "<sample:3>"}, {"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:1>"}, {"org.apache.commons.lang.text.StrBuilder", "contains", "org.apache.commons.lang.text.StrMatcher", "<sample:0>"}}, 1), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "6"}, {"append", "float", "3"}, {"insert", "int,boolean", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", ".5"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", ".5"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "1", "a"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", ".5"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("asample {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "asample {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "1", "a"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", ".5"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "1.7976931348623157E308"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "e", "-4"}}, 3), new String[][]{{"append", "java.lang.Object", "0"}, {"deleteCharAt", "int", "3"}, {"indexOf", "java.lang.String", "0"}, {"appendNewLine", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("17976931348623157E308a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "17976931348623157E308a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "7628716375283629643"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "e", "-4"}}, 3), new String[][]{{"append", "java.lang.Object", "0"}, {"deleteCharAt", "int", "3"}, {"indexOf", "java.lang.String", "0"}, {"appendNewLine", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("76287163752836301E18a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=22, size=22}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "76287163752836301E18a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=22, size=22}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "20", "31", "u"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("20uuuuuuuuuuuuuuuuuuuuuuuuuuuuu {length=31}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "20uuuuuuuuuuuuuuuuuuuuuuuuuuuuu {getNewLineText=null, getNullText=null, isEmpty=false, length=31, size=31}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char"}, new String[]{"20", "\uffff"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "char,char", "l", "g"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:3>"}, false, 0, null, 1), new String[][]{{"indexOf", "char,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "substring", new String[]{"int", "int"}, new String[]{"4", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "substring", new String[]{"int", "int"}, new String[]{"4", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:1>", "x"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "1bx2 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "substring", new String[]{"int", "int"}, new String[]{"4", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:1>", "x"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1bx2 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "validateIndex", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:2>", "OUlleaaaaaaaa\"aaaa\taaaaaaaaa<aaaaaaaa12:30:45"}, {"org.apache.commons.lang.text.StrBuilder", "asTokenizer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:1>", "Invalid offseu: "}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "0"}, {"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}}, 3), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[b, I, n, v, a, l, i, d,  , o, f, f, s, e, u, :,  , 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "bInvalid offseu: 2 {getNewLineText=null, getNullText=null, isEmpty=false, length=18, size=18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:2>", "Invalid pffseu: "}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "0"}, {"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}}, 3), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[2, I, n, v, a, l, i, d,  , p, f, f, s, e, u, :,  , k, e, y, I, n, v, a, l, i, d,  , p, f, f, s, e, u, :,  , 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2Invalid pffseu: keyInvalid pffseu: 0 {getNewLineText=null, getNullText=null, isEmpty=false, length=37, size=37}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"appendWithSeparators", "java.util.Iterator,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:2>", "Invalid pffseu: "}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "0"}, {"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("2Invalid pffseu: keyInvalid pffseu: 0 {getNewLineText=null, getNullText=null, isEmpty=false, length=37, size=37}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2Invalid pffseu: keyInvalid pffseu: 0 {getNewLineText=null, getNullText=null, isEmpty=false, length=37, size=37}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:3>", "Invalid pffseu: "}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "0"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "7628716375283629643", "-1"}, {"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("key {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "key {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:3>", "I\rvalid pffseu: "}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "0"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "7628716375283629643", "-1"}, {"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}}, 3), new String[][]{{"append", "java.lang.StringBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("keysample {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "keysample {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 3), new String[][]{{"append", "float", "4"}, {"deleteAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sampleInfinity {getNewLineText=null, getNullText=null, isEmpty=false, length=14, size=14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sampleInfinity {getNewLineText=null, getNullText=null, isEmpty=false, length=14, size=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"deleteAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:0>"}, false, 14, new String[][]{}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"deleteAll", "java.lang.String", "6"}, {"insert", "int,char[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sam\000 ple {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sam\000 ple {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:5>"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<sample:0>"}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"deleteAll", "java.lang.String", "6"}, {"insert", "int,char[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sam\000 ple {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sam\000 ple {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:5>"}, false, 9, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<sample:0>"}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"deleteAll", "java.lang.String", "6"}, {"insert", "int,char[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<sample:0>"}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"deleteAll", "java.lang.String", "6"}, {"insert", "int,char[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sam\000 ple  {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sam\000 ple  {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}, {"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<sample:2>"}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"deleteAll", "java.lang.String", "6"}, {"insert", "int,char[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sam\000 ple  {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sam\000 ple  {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}, {"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<sample:1>"}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"deleteAll", "java.lang.String", "6"}, {"insert", "int,char[]", "6"}, {"ensureCapacity", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sam\000 plea {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sam\000 plea {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:8>"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}, {"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<sample:2>"}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"deleteAll", "java.lang.String", "6"}, {"insert", "int,char[]", "6"}, {"ensureCapacity", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("smp\000 le  {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "smp\000 le  {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "-4", "16.0"}, {"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<sample:2>"}}, 1), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"deleteAll", "java.lang.String", "6"}, {"insert", "int,char[]", "6"}, {"ensureCapacity", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sam\000 ple {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sam\000 ple {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "charAt", new String[]{"int"}, new String[]{"-1040187358"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "float"}, new String[]{"10", "3.4028235E38"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asReader", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:3>", "srr/,ustrd0x133466789a"}, {"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "", "1234}6789012345678901234567890"}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "0"}, {"deleteAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:4>", "srr/,ustrd0x133466789a"}, {"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "", "1234}6789012345678901234567890"}}, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "0"}, {"deleteAll", "java.lang.String", "6"}, {"append", "char[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=, getTokenArray=[], hasNext=false, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:1>", "xlengXti mu8t be\037valvid"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=sample, getTokenArray=[sample], hasNext=true, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "char", "\uffff"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=, getTokenArray=[], hasNext=false, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "char", "\uffff"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=0, getTokenArray=[0], hasNext=true, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=a, getTokenArray=[a], hasNext=true, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1), new String[][]{{"set", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:6>"}, false, 0, null, 3), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,java.lang.Object", "4", "<null>"}, {"org.apache.commons.lang.text.StrBuilder", "replace", "int,int,java.lang.String", "32", "32", "/}Ibend < start"}}, 1), new String[][]{{"previousToken", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"float"}, new String[]{"3.4028235E38"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("3.4028235E38 {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "3.4028235E38 {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"float"}, new String[]{"32"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("32.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "32.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"float"}, new String[]{"-3.4028235E38"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-3.4028235E38 {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-3.4028235E38 {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"float"}, new String[]{"-Infinity"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-Infinity {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "double"}, new String[]{"2147483647", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:6>"}, {"org.apache.commons.lang.text.StrBuilder", "validateRange", "int,int", "-1", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "double"}, new String[]{"2147483647", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:6>"}, {"org.apache.commons.lang.text.StrBuilder", "validateRange", "int,int", "33", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5", "{\"a\":1}"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2.5", "{\"a\":1}"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "java.lang.Object"}, new String[]{"31", "<s:>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"char", "char"}, new String[]{" ", " "}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String", "int", "int", "int"}, new String[]{"<sample:0>", "Invalid startIndex: ", "-1", "1", "33"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"length must be valid0x1F", "s b"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:5>"}}), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "Title"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:5>"}}), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "Tlle"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}, {"org.apache.commons.lang.text.StrBuilder", "contains", "char", "\uffff"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:5>"}}), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"s b"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=s b, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=s b, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-", "OUlleaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toStringBuffer", ""}, {"org.apache.commons.lang.text.StrBuilder", "contains", "char", "\uffff"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:7>"}}), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder", "4"}, {"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"char"}, new String[]{"l"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char", "-1", " "}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "reverse", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char[]"}, new String[]{"32", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:7>"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:3>", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"int", "int", "char[]", "int"}, new String[]{"31", "32", "<sample:1>", "31"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"s\nb", "sr/ustrd"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629643"}, {"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", " "}}), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"isEmpty", "", "5"}, {"indexOf", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "7628716375283629643 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"s\nb", "sr/ustrd0x123456789"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629643"}, {"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", "{"}}), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"isEmpty", "", "5"}, {"indexOf", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "07628716375283629643 {getNewLineText=null, getNullText=null, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"s\nb", "sr/ustrd0x123456789"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629580"}, {"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", "{"}}), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"isEmpty", "", "5"}, {"indexOf", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "07628716375283629580 {getNewLineText=null, getNullText=null, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"s7\nb", "srr/ustrd0x123466789"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629580"}, {"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", "{"}}), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"isEmpty", "", "5"}, {"indexOf", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
  assertEquals("receiver state after the call", "7628716375283629580 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"s7\nb", "srr/ustrd0x123466789"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", "-1"}, {"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629580"}, {"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", "{"}}), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"isEmpty", "", "5"}, {"indexOf", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
  assertEquals("receiver state after the call", "7628716375283629580 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"s7\nb", "srr/,ustrd0x123466789a"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629564"}}), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"isEmpty", "", "5"}, {"indexOf", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "7628716375283629564 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"s7\nb", "srr/,ustrd0x123466789a"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629564"}}), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"isEmpty", "", "5"}, {"indexOf", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample7628716375283629564 {getNewLineText=null, getNullText=null, isEmpty=false, length=25, size=25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"s7\nb", "srr/,ustrd0x123466789a"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629564"}, {"org.apache.commons.lang.text.StrBuilder", "toCharArray", "int,int", "32", "1"}}), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "4"}, {"charAt", "int", "5"}, {"indexOf", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample7628716375283629564 {getNewLineText=null, getNullText=null, isEmpty=false, length=25, size=25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "length", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<sample:1>", "1", "33"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"l", " "}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "char", "\000"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629643"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("7628716375283629643 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "7628716375283629643 {getNewLineText=null, getNullText=null, isEmpty=false, length=19, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7628716375283629643"}, {"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "32", "l"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("7628716375283629643llllllllllllllllllllllllllllllll {getNewLineText=null, getNullText=null, isEmpty=false, length=51, size=51}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "7628716375283629643llllllllllllllllllllllllllllllll {getNewLineText=null, getNullText=null, isEmpty=false, length=51, size=51}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "2.5", "0x,1234567899"}, {"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "32", "l"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("llllllllllllllllllllllllllllllll {getNewLineText=null, getNullText=null, isEmpty=false, length=32, size=32}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "llllllllllllllllllllllllllllllll {getNewLineText=null, getNullText=null, isEmpty=false, length=32, size=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "2.5", "0x,1234567899"}, {"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "32", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("11111111111111111111111111111111 {getNewLineText=null, getNullText=null, isEmpty=false, length=32, size=32}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "11111111111111111111111111111111 {getNewLineText=null, getNullText=null, isEmpty=false, length=32, size=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<null>"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "2.5", "0x,1234567899"}, {"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "32", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("11111111111111111111111111111111 {getNewLineText=null, getNullText=null, isEmpty=false, length=32, size=32}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "11111111111111111111111111111111 {getNewLineText=null, getNullText=null, isEmpty=false, length=32, size=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"-12"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<null>"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "java.lang.String,java.lang.String", "2.5", "0x,1234567899"}, {"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "32", "X"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {getNewLineText=null, getNullText=null, isEmpty=false, length=32, size=32}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {getNewLineText=null, getNullText=null, isEmpty=false, length=32, size=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"-12"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("Infinity {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Infinity {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"-Infinity"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-Infinity {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"-Infinity"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample-Infinity {getNewLineText=null, getNullText=null, isEmpty=false, length=15, size=15}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample-Infinity {getNewLineText=null, getNullText=null, isEmpty=false, length=15, size=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"Infinity"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sampleInfinity {getNewLineText=null, getNullText=null, isEmpty=false, length=14, size=14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sampleInfinity {getNewLineText=null, getNullText=null, isEmpty=false, length=14, size=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample-1.7976931348623157E308 {getNewLineText=null, getNullText=null, isEmpty=false, length=29, size=29}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample-1.7976931348623157E308 {getNewLineText=null, getNullText=null, isEmpty=false, length=29, size=29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample1.7976931348623157E308 {getNewLineText=null, getNullText=null, isEmpty=false, length=28, size=28}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample1.7976931348623157E308 {getNewLineText=null, getNullText=null, isEmpty=false, length=28, size=28}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "2.5", "sruttre"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample1.7976931348623157E308 {getNewLineText=null, getNullText=null, isEmpty=false, length=28, size=28}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample1.7976931348623157E308 {getNewLineText=null, getNullText=null, isEmpty=false, length=28, size=28}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "2.5", "sruttre"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,boolean", "32", "true"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:3>", "O6lleaaaaaaaa\"aaaa\tnaaaaaaaa<aaaaaaaaa12:30:45"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample1.7976931348623157E308 {getNewLineText=null, getNullText=null, isEmpty=false, length=28, size=28}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample1.7976931348623157E308 {getNewLineText=null, getNullText=null, isEmpty=false, length=28, size=28}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "2.5", "sruttre"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:3>", "O6lleaaaaaaaa\"aaaa\tnaaaaaaaa<aaaaaaaaa12:30:45"}}), new String[][]{{"capacity", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("38", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample-1.7976931348623157E308 {getNewLineText=null, getNullText=null, isEmpty=false, length=29, size=29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "2.5", "sruttre"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:3>", "O6lleaaaaaaaa\"aaaa\tnaaaaaaaa<aaaaaaaaa12:30:45"}}), new String[][]{{"capacity", "", "6"}, {"insert", "int,char[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", "2.5", "sruttre"}, {"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:3>", "O6lleaaaaaaaa\"aaaa\tnaaaaaaaa<aaaaaaaaa12:30:45"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char,int", "1", "-4"}}), new String[][]{{"capacity", "", "6"}, {"insert", "int,char[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{"\000", "0"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{"\000", "0"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "0", "-3.4028235E38"}, {"org.apache.commons.lang.text.StrBuilder", "append", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-3.4028235E380 {getNewLineText=null, getNullText=null, isEmpty=false, length=14, size=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{"\000", "0"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "0", "-3.4028235E38"}, {"org.apache.commons.lang.text.StrBuilder", "append", "char", "d"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-3.4028235E38d {getNewLineText=null, getNullText=null, isEmpty=false, length=14, size=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{"\000", "20"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "0", "3.4028235E38"}, {"org.apache.commons.lang.text.StrBuilder", "append", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "3.4028235E380 {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{"+", "20"}, false, 10, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "delete", "int,int", "10", "-2147483648"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "0", "3.4028235E38"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "3.4028235E38 {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{"D", "10"}, false, 10, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "delete", "int,int", "10", "-2147483648"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "0", "3.4028235E38"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "Title", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "3.4028235E38 {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{"g", "10"}, false, 8, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "delete", "int,int", "4", "-2147483648"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "0", "3.4028235E38"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "Ttle", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "3.4028235E38a {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{"g", "2147483647"}, false, 14, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "0", "1.7014117E38"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "1.5e300", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.7014117E38sample {getNewLineText=null, getNullText=null, isEmpty=false, length=18, size=18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"float"}, new String[]{"7628716375283629643"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("7.6287162E18 {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "7.6287162E18 {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"float"}, new String[]{"3.81435812E18"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", "2020-01-01"}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,boolean", "10", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("3.81435812E18 {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "3.81435812E18 {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char[]", "int", "int"}, new String[]{"10", "<sample:1>", "1", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char[]", "int", "int"}, new String[]{"10", "<sample:1>", "1", "0"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "rightString", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "0", "l"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"1", "\000"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "1", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"1", "\000"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "1", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("2\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"1", "\000"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "1", "F"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("F\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "F\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"1", "v"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "1", "F"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("Fv {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Fv {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"1", "v"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "1", "F"}}), new String[][]{{"appendPadding", "int,char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("Fvaa {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Fvaa {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"1", "v"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("v {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "v {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"1", "v"}, false), new String[][]{{"asReader", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "v {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"1", "g"}, false), new String[][]{{"asReader", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "g {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"1", "h"}, false), new String[][]{{"asReader", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "h {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"1", "/"}, false), new String[][]{{"asReader", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "/ {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"0", "/"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,java.lang.String", "33", "I"}}), new String[][]{{"asReader", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"-18", "/"}, false), new String[][]{{"asReader", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"-56", "u"}, false), new String[][]{{"asReader", "", "6"}, {"mark", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"-2147483584", "D"}, false, 8, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:1>"}}), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "6"}, {"append", "float", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a01.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a01.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"-2147483584", "D"}, false, 8, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:1>"}}), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "6"}, {"append", "float", "3"}, {"endsWith", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a01.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"-1", "31", "g"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("ggggggggggggggggggggggggggggg-1 {getNewLineText=null, getNullText=null, isEmpty=false, length=31, size=31}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ggggggggggggggggggggggggggggg-1 {getNewLineText=null, getNullText=null, isEmpty=false, length=31, size=31}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"-1040187358", "e"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:1>"}, {"org.apache.commons.lang.text.StrBuilder", "contains", "org.apache.commons.lang.text.StrMatcher", "<sample:0>"}}), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "6"}, {"append", "float", "3"}, {"indexOf", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "01.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "startsWith", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"-134217792", "a"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer", "<sample:3>"}, {"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:1>"}, {"org.apache.commons.lang.text.StrBuilder", "contains", "org.apache.commons.lang.text.StrMatcher", "<sample:0>"}}), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "6"}, {"append", "float", "3"}, {"insert", "int,boolean", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", ".5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "1", "a"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", ".5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<s:b>", "-18", "l"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"int"}, new String[]{"20"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("20 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "20 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "1", "a"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", ".?"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "startIndex must be valid", "32"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a0 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a0 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "1", "A"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", ".?"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "startIndex must be valid", "32"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("A {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "A {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "1", "A"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", ".?"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "startIndex must be valid", "32"}}), new String[][]{{"indexOf", "java.lang.String,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "A {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "1", "a"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", ".?"}}), new String[][]{{"indexOf", "java.lang.String,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"char[]"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "substring", "int", "31"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false), new String[][]{{"append", "java.lang.Object", "0"}, {"deleteCharAt", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "e", "-4"}}), new String[][]{{"append", "java.lang.Object", "0"}, {"deleteCharAt", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "e", "-4"}}), new String[][]{{"append", "java.lang.Object", "0"}, {"deleteCharAt", "int", "3"}, {"indexOf", "java.lang.String", "0"}, {"appendNewLine", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("smplea\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "smplea\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "1.7976931348623157E308"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "e", "-4"}}), new String[][]{{"append", "java.lang.Object", "0"}, {"deleteCharAt", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "delete", new String[]{"int", "int"}, new String[]{"-1040187358", "1"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setCharAt", "int,char", "31", "d"}, {"org.apache.commons.lang.text.StrBuilder", "substring", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "1.7976931348623157E308"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "e", "-4"}}), new String[][]{{"append", "java.lang.Object", "0"}, {"deleteCharAt", "int", "3"}, {"indexOf", "java.lang.String", "0"}, {"appendNewLine", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("17976931348623157E308a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "17976931348623157E308a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.lang.text.StrBuilder", "append", "double", "1.7976931348623157E308"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "e", "-4"}}), new String[][]{{"append", "java.lang.Object", "0"}, {"deleteCharAt", "int", "3"}, {"indexOf", "java.lang.String", "0"}, {"appendNewLine", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("smple11.7976931348623157E308a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=30, size=30}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "smple11.7976931348623157E308a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=30, size=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.lang.text.StrBuilder", "append", "double", "1.7976931348623157E308"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "e", "-4"}}), new String[][]{{"append", "java.lang.Object", "0"}, {"deleteCharAt", "int", "3"}, {"indexOf", "java.lang.String", "0"}, {"appendNewLine", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1.7976931348623157E308a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=24, size=24}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.7976931348623157E308a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=24, size=24}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "7628716375283629643"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "e", "-4"}}), new String[][]{{"append", "java.lang.Object", "0"}, {"deleteCharAt", "int", "3"}, {"indexOf", "java.lang.String", "0"}, {"appendNewLine", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("76287163752836301E18a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=22, size=22}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "76287163752836301E18a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=22, size=22}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "java.lang.String", "Invalid length: "}, {"org.apache.commons.lang.text.StrBuilder", "append", "double", "7628716375283629643"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "e", "-4"}}), new String[][]{{"append", "java.lang.Object", "0"}, {"deleteCharAt", "int", "3"}, {"indexOf", "java.lang.String", "0"}, {"appendNewLine", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("76287163752836301E18a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=22, size=22}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "76287163752836301E18a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=22, size=22}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "java.lang.String", "Invalid length: "}, {"org.apache.commons.lang.text.StrBuilder", "append", "double", "7628716375283629643"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "e", "-8"}}), new String[][]{{"append", "java.lang.Object", "0"}, {"deleteCharAt", "int", "3"}, {"indexOf", "java.lang.String", "0"}, {"appendNewLine", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0.6287163752836301E18a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.6287163752836301E18a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendNull", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "java.lang.String", "Invalid length: "}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "e", "-18"}}), new String[][]{{"append", "java.lang.Object", "0"}, {"deleteCharAt", "int", "3"}, {"indexOf", "java.lang.String", "0"}, {"appendNewLine", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0\n {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0\n {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "20", "31", "u"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("20uuuuuuuuuuuuuuuuuuuuuuuuuuuuu {length=31}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "20uuuuuuuuuuuuuuuuuuuuuuuuuuuuu {getNewLineText=null, getNullText=null, isEmpty=false, length=31, size=31}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "20", "31", "u"}}), new String[][]{{"insert", "int,double", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("20uu1.0uuuuuuuuuuuuuuuuuuuuuuuuuuu {length=34}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "20uuuuuuuuuuuuuuuuuuuuuuuuuuuuu {getNewLineText=null, getNullText=null, isEmpty=false, length=31, size=31}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "20", "15", "u"}}), new String[][]{{"insert", "int,double", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("20uu1.0uuuuuuuuuuu {length=18}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "20uuuuuuuuuuuuu {getNewLineText=null, getNullText=null, isEmpty=false, length=15, size=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "20", "15", "u"}}), new String[][]{{"insert", "int,double", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("samp1.0le20uuuuuuuuuuuuu {length=24}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample20uuuuuuuuuuuuu {getNewLineText=null, getNullText=null, isEmpty=false, length=21, size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "20", "30", "u"}}), new String[][]{{"insert", "int,double", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("samp1.0le20uuuuuuuuuuuuuuuuuuuuuuuuuuuu {length=39}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample20uuuuuuuuuuuuuuuuuuuuuuuuuuuu {getNewLineText=null, getNullText=null, isEmpty=false, length=36, size=36}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "20", "30", "u"}}), new String[][]{{"insert", "int,double", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("20uu1.0uuuuuuuuuuuuuuuuuuuuuuuuuu {length=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "20uuuuuuuuuuuuuuuuuuuuuuuuuuuu {getNewLineText=null, getNullText=null, isEmpty=false, length=30, size=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"insert", "int,double", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=/a/b, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=/a/b, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"/}/b"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "char", "\t"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=/}/b, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=/}/b, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"/}8b"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "char", "\t"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=/}8b, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=/}8b, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"/}8"}, false, 9, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "char", "m"}}), new String[][]{{"insert", "int,char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=/}8, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=/}8, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,long", "-2147483648", "7628716375283629643"}}), new String[][]{{"indexOf", "char,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"char[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[ ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getChars", new String[]{"char[]"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<empty>", "-18", "-1"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", "m", "-4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "validateIndex", new String[]{"int"}, new String[]{"-18"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:0>", "OUlleaaaaaaaa\"aaaa\taaaaaaaaa<aaaaaaaa12:30:45"}, {"org.apache.commons.lang.text.StrBuilder", "isEmpty", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "validateIndex", new String[]{"int"}, new String[]{"4198382"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<empty>", "OUlleaaaaaaaa\"aaaa\taaaaaaaaa<aaaaaaaa12:30:45"}, {"org.apache.commons.lang.text.StrBuilder", "isEmpty", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "validateIndex", new String[]{"int"}, new String[]{"4198382"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<empty>", "OUlleaaaaaaaa\"aaaa\taaaaaaaaa<aaaaaaaa12:30:45"}, {"org.apache.commons.lang.text.StrBuilder", "isEmpty", ""}, {"org.apache.commons.lang.text.StrBuilder", "asTokenizer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "validateIndex", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<null>", "OUlleaaaaaaaa\"aaaa\taaaaaaaaa<aaaaaaaa12:30:45"}, {"org.apache.commons.lang.text.StrBuilder", "isEmpty", ""}, {"org.apache.commons.lang.text.StrBuilder", "asTokenizer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "validateIndex", new String[]{"int"}, new String[]{"4"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:2>", "OUlleaaaaaaaa\"aaaa\taaaaaaaaa<aaaaaaaa12:30:45"}, {"org.apache.commons.lang.text.StrBuilder", "asTokenizer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2OUlleaaaaaaaa\"aaaa\taaaaaaaaa<aaaaaaaa12:30:45keyOUlleaaaaaaaa\"aaaa\taaaaaaaaa<aaaaaaaa12:30:450 {getNewLineText=null, getNullText=null, isEmpty=false, length=95, size=95}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"org.apache.commons.lang.text.StrMatcher", "int"}, new String[]{"<sample:5>", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "java.lang.String", "\t"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{"int", "int"}, new String[]{"-1040187358", "4198382"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "trim", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<empty>", "Invalid offset: "}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:1>", "Invalid offset: "}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("bInvalid offset: 2 {getNewLineText=null, getNullText=null, isEmpty=false, length=18, size=18}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "bInvalid offset: 2 {getNewLineText=null, getNullText=null, isEmpty=false, length=18, size=18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:1>", "Invalid offset: "}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "0"}, {"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}}), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[b, I, n, v, a, l, i, d,  , o, f, f, s, e, t, :,  , 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "bInvalid offset: 2 {getNewLineText=null, getNullText=null, isEmpty=false, length=18, size=18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:1>", "Invalid offseu: "}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "0"}, {"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}}), new String[][]{{"getChars", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[b, I, n, v, a, l, i, d,  , o, f, f, s, e, u, :,  , 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "bInvalid offseu: 2 {getNewLineText=null, getNullText=null, isEmpty=false, length=18, size=18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:3>", "I\rvalid pffseu: "}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "16777216"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "7628716375283629643", "-1"}, {"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}}), new String[][]{{"append", "java.lang.StringBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("keysample {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "keysample {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:2>", "I\rvalid pffseu: "}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "16777216"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "7628716375283629643", "-1"}, {"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}}), new String[][]{{"append", "java.lang.StringBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("2I\rvalid pffseu: keyI\rvalid pffseu: 0sample {getNewLineText=null, getNullText=null, isEmpty=false, length=43, size=43}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2I\rvalid pffseu: keyI\rvalid pffseu: 0sample {getNewLineText=null, getNullText=null, isEmpty=false, length=43, size=43}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:2>", "I\rvalid pffseu9 "}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[]", "31", "<sample:2>"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "16777216"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "7628716375283629643", "-1"}}), new String[][]{{"append", "java.lang.StringBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("2I\rvalid pffseu9 keyI\rvalid pffseu9 0sample {getNewLineText=null, getNullText=null, isEmpty=false, length=43, size=43}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2I\rvalid pffseu9 keyI\rvalid pffseu9 0sample {getNewLineText=null, getNullText=null, isEmpty=false, length=43, size=43}", SearchInputFactory_scaffolding.receiverState());
 }
}
