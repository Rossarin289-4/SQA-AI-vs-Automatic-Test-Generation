package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "rightString", new String[]{"int"}, new String[]{"-2147483392"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "midString", new String[]{"int", "int"}, new String[]{"2013265919", "-68"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:0>", "1[.1234567890123456Hello, World"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "-2147467228", "2147483647", "<empty>", "2147483647"}}, 2), new String[][]{{"deleteAll", "char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "org.apache.commons.lang.text.StrMatcher", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "java.lang.String", "<null>"}}), new String[][]{{"contains", "org.apache.commons.lang.text.StrMatcher", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "int,int,char", "20", "-536870915", "_"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "rightString", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", "-0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{"int", "int"}, new String[]{"0", "536870912"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:8>", "TITLE 01F"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setLength", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setCharAt", new String[]{"int", "char"}, new String[]{"2147483647", "F"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteCharAt", "int", "2013266048"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "reverse", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"deleteAll", "java.lang.String", "0"}, {"append", "org.apache.commons.lang.text.StrBuilder", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("elpmassample {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "elpmassample {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"deleteCharAt", "int", "5"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("saple {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "saple {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:5>", "0x123456789"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "java.lang.String", "{\"a\":1}"}}), new String[][]{{"appendAll", "java.util.Collection", "6"}, {"appendSeparator", "char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0a {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0a {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<sample:4>", "-56", "536870975"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char,int", "H", "66"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equals", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "9"}, {"org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "9 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<null>", "-536870874", "-2147483536"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"markSupported", "", "1"}, {"read", "char[],int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.String", "int", "int"}, new String[]{"C5urue", "0", "-536870892"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "java.lang.String", "nul01F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"char", "char"}, new String[]{"9", "u"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "org.apache.commons.lang.text.StrBuilder,int,int", "<sample:15>", "-2147483362", "-64"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<null>", "2147483646"}}), new String[][]{{"capacity", "", "5"}, {"append", "org.apache.commons.lang.text.StrBuilder,int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.123445678", "1[.1234567890123446Hello, World"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendNewLine", ""}}), new String[][]{{"deleteFirst", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITL 11F", "\t12:30:45"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<empty>", "33", "536870874"}}), new String[][]{{"appendFixedWidthPadLeft", "java.lang.Object,int,char", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sampleey {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sampleey {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{"end E]start"}, false), new String[][]{{"appendSeparator", "java.lang.String,int", "6"}, {"deleteFirst", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=end E]start, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=end E]start, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"char", "char"}, new String[]{"o", "o"}, false, 2, new String[][]{}, 2), new String[][]{{"appendFixedWidthPadRight", "java.lang.Object,int,char", "4"}, {"appendln", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sampleke1.0\n {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sampleke1.0\n {getNewLineText=null, getNullText=null, isEmpty=false, length=12, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "a b", "-2147483586"}}), new String[][]{{"appendSeparator", "java.lang.String,int", "5"}, {"contains", "char", "0"}, {"asTokenizer", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=samplea\na, getTokenArray=[samplea, a], hasNext=true, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samplea\na {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "capacity", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "1342177279"}, {"org.apache.commons.lang.text.StrBuilder", "getChars", "char[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("38", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "midString", new String[]{"int", "int"}, new String[]{"-1056964569", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendAll", "java.util.Collection", "<sample:0>"}, {"org.apache.commons.lang.text.StrBuilder", "midString", "int,int", "-1073741787", "-2013266048"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "7628716375283629643TITLEInvalid startIndex: "}, false, 6, new String[][]{}), new String[][]{{"append", "char[],int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<null>", "5.\n"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer", "<sample:5>"}}), new String[][]{{"append", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("Infinity {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Infinity {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,double", "2147483647", "-0.94"}}), new String[][]{{"skip", "long", "5"}, {"read", "java.nio.CharBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", "PT1Hnull"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "charAt", new String[]{"int"}, new String[]{"-536870892"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "java.lang.String", "\u00e9"}, {"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "2013265964", "0", "<sample:4>", "-536870824"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "2147483647", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "startsWith", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}}), new String[][]{{"read", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder,int,int", "<null>", "2013265958", "1073741823"}}), new String[][]{{"mark", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char[]", "int", "int"}, new String[]{"2147483646", "<null>", "-2147483500", "-64"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "midString", "int,int", "-2013266048", "16402"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"write", "int", "6"}, {"write", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "\003 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "char,char", "h", "h"}}), new String[][]{{"read", "char[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "int", "2147483647"}}, 1), new String[][]{{"capacity", "", "4"}, {"appendln", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("02147483647sample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=18, size=18}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "02147483647sample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=18, size=18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<empty>", "end < [tart"}, false, 5, new String[][]{}), new String[][]{{"appendln", "char", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0\000\n {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0\000\n {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.Object"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "char[]", "<sample:3>"}}), new String[][]{{"contains", "char", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0", "C5urue0"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:4>"}}), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("C5urue0a00 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "C5urue0a00 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setLength", "int", "-2147483519"}}), new String[][]{{"append", "char[]", "5"}, {"deleteAll", "char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a0 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a0 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:10>"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char", "0", "{"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{ {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:8>", "h"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "false"}, {"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char", "d"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("fhlse {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "fhlse {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendAll", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "int,int,java.lang.String", "-32", "-2147483362", "ttp://ewample.col/a?b=c"}, {"org.apache.commons.lang.text.StrBuilder", "append", "char[],int,int", "<sample:1>", "-2147483648", "249"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "int,int,char", "1", "-2147483648", "H"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.lang.Object[],java.lang.String", "<sample:2>", "1.12345678901234567\n"}}), new String[][]{{"appendln", "char[]", "7"}, {"deleteAll", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("21.1234567891234567\nkey1.1234567891234567\n\000 \n {getNewLineText=null, getNullText=null, isEmpty=false, length=45, size=45}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "21.1234567891234567\nkey1.1234567891234567\n\000 \n {getNewLineText=null, getNullText=null, isEmpty=false, length=45, size=45}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char", "a"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "1L-1", "33"}}), new String[][]{{"capacity", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"int", "int", "java.lang.String"}, new String[]{"-536871898", "33", "g"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String", "int"}, new String[]{"\u00e9", "-1073741823"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-7", "7618716375283629643"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:3>", "-1.5\u00e9"}, {"org.apache.commons.lang.text.StrBuilder", "appendAll", "java.util.Collection", "<empty>"}}), new String[][]{{"contains", "org.apache.commons.lang.text.StrMatcher", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "leftString", new String[]{"int"}, new String[]{"-536870824"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "C5truge", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{"1.123456789012356"}, false, 6, new String[][]{}), new String[][]{{"appendln", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1.01.123456789012356 {getNewLineText=1.123456789012356, getNullText=null, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1.01.123456789012356 {getNewLineText=1.123456789012356, getNullText=null, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "java.lang.StringBuffer", "<sample:3>"}}), new String[][]{{"appendNull", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "/a3Tbb", "-536870893"}}), new String[][]{{"close", "", "1"}, {"close", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "java.lang.Object", "<s:a>"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "org.apache.commons.lang.text.StrMatcher", "<sample:6>"}}), new String[][]{{"flush", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/\t", "7628716374283629643TITLEInvalid startIndex: <a>b</a>"}, false), new String[][]{{"appendln", "java.lang.String,int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "startsWith", new String[]{"java.lang.String"}, new String[]{".\n"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:1>", "1[.1234567890123456Hello, Vorld"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "char", "c"}, {"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "32", "."}}), new String[][]{{"appendNull", "", "1"}, {"contains", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "c\n................................ {getNewLineText=null, getNullText=null, isEmpty=false, length=34, size=34}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendAll", "java.util.Collection", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"char", "char"}, new String[]{"n", "q"}, false, 2, new String[][]{}), new String[][]{{"appendln", "char[]", "3"}, {"appendFixedWidthPadRight", "int,int,char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample\000\n200 {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample\000\n200 {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:4>", "ttp://ewample.com/a?b=c"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", "nll"}}), new String[][]{{"appendNull", "", "7"}, {"contains", "java.lang.String", "7"}, {"appendln", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample0\n {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample0\n {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "reverse", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", ""}}), new String[][]{{"charAt", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"int"}, new String[]{"-68"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "char,int", ",", "-2147483644"}}), new String[][]{{"asReader", "", "2"}, {"reset", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "-68\n {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setLength", "int", "-536870896"}, {"org.apache.commons.lang.text.StrBuilder", "appendln", "java.lang.StringBuffer", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:10>", "0E5c"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "NaN"}}), new String[][]{{"contains", "char", "6"}, {"appendln", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("NaNa\n {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaNa\n {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<null>", ";"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:8>", "277"}, {"org.apache.commons.lang.text.StrBuilder", "appendln", "char[],int,int", "<sample:4>", "2147483647", "32804"}}, 1), new String[][]{{"append", "java.lang.String,int,int", "1"}, {"append", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("asample {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "asample {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"-6\t"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "char,char", "p", "l"}}), new String[][]{{"appendSeparator", "char,int", "4"}, {"appendNewLine", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samlle-6\t\000\n {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samlle-6\t\000\n {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "validateRange", new String[]{"int", "int"}, new String[]{"2147483647", "-2147417929"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Iterator,java.lang.String", "<null>", ".-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String,int,int", "true", "39", "2013265964"}}), new String[][]{{"appendWithSeparators", "java.util.Iterator,java.lang.String", "2"}, {"append", "org.apache.commons.lang.text.StrBuilder,int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"long"}, new String[]{"13"}, false), new String[][]{{"contains", "java.lang.String", "5"}, {"append", "int", "6"}, {"appendln", "org.apache.commons.lang.text.StrBuilder,int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"char"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "reverse", ""}}), new String[][]{{"appendAll", "java.lang.Object[]", "3"}, {"appendln", "java.lang.StringBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("keysample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "keysample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{}), new String[][]{{"deleteFirst", "org.apache.commons.lang.text.StrMatcher", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1F5d32", "76\n2871675283629643TITLE"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<empty>", "."}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Iterator,java.lang.String", "<sample:2>", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{"int", "int"}, new String[]{"2147483646", "134"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:8>", "-2147483604"}, {"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:1>"}, false), new String[][]{{"append", "java.lang.StringBuffer,int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"char"}, new String[]{"D"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "substring", "int", "0"}, {"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:1>", "mll"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0amll0 {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<sample:3>", "0", "-1056964535"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char[]", "int", "int"}, new String[]{"0", "<sample:0>", "-1073741805", "2147483647"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"char"}, new String[]{"a"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "char,char", "8", "."}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("smple {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "smple {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:5>", "16", "-536870902"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setCharAt", "int,char", "-12", "X"}, {"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:13>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:7>", "1F6d32"}, false, 6, new String[][]{}), new String[][]{{"asReader", "", "4"}, {"close", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendAll", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendSeparator", "java.lang.String,int", "{\"a\":1}http://example.com/a?b=c", "-2147483648"}}), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("00samplesamplesample {getNewLineText=null, getNullText=null, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "00samplesamplesample {getNewLineText=null, getNullText=null, isEmpty=false, length=20, size=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String"}, new String[]{"\u00e9123456789012345678901234567890"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "char", "b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendAll", "java.util.Iterator", "<sample:2>"}}), new String[][]{{"appendln", "long", "1"}, {"append", "char[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-1\na {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1\na {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"char", "int"}, new String[]{"l", "32794"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "char[]", "<null>"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<sample:4>", "2147483647", "-1073741823"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.String"}, new String[]{"0x1234567891.25"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<null>"}, {"org.apache.commons.lang.text.StrBuilder", "append", "char[],int,int", "<empty>", "-171", "2147483647"}}), new String[][]{{"append", "java.lang.StringBuffer", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0x1234567891.25\n {getNewLineText=null, getNullText=null, isEmpty=false, length=16, size=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0x1234567891.25\n {getNewLineText=null, getNullText=null, isEmpty=false, length=16, size=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<null>", "16", "-536870931"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "<"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("<\n {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<\n {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"int", "int", "java.lang.String"}, new String[]{"0", "268435456", "18r10"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "clear", ""}, {"org.apache.commons.lang.text.StrBuilder", "appendSeparator", "java.lang.String", "1[.1234567890123456Hello, Worlda"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("18r10 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "18r10 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendAll", new String[]{"java.util.Iterator"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", ""}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,long", "-38", "7628716375283695190"}}, 3), new String[][]{{"contains", "char", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{}), new String[][]{{"asWriter", "", "1"}, {"write", "char[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "true0 {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.String", "int", "int"}, new String[]{"<null>", "-1056964569", "2013266106"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "-1073741785", "-1006632960"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "int,int,char[],int", "1342177279", "2147483340", "<sample:4>", "-2147467228"}}, 1), new String[][]{{"appendln", "float", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n-Infinity\n {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n-Infinity\n {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "ensureCapacity", new String[]{"int"}, new String[]{"-1073741512"}, false), new String[][]{{"appendPadding", "int,char", "0"}, {"appendFixedWidthPadLeft", "int,int,char", "7"}, {"appendSeparator", "char,int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("    4a {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "    4a {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.Object"}, new String[]{"<s:aU>"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,int", "2147483647", "32851"}, {"org.apache.commons.lang.text.StrBuilder", "appendSeparator", "char,int", "\"", "-2013266017"}}), new String[][]{{"contains", "java.lang.String", "3"}, {"capacity", "", "5"}, {"append", "char[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "delete", new String[]{"int", "int"}, new String[]{"0", "1006632982"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,int", "-2147483648", "536870912"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"char", "char"}, new String[]{"v", "\""}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:12>", "-1073741824"}}, 2), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "1"}, {"deleteCharAt", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:1>", "0?F"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<null>", "112H3456789012345678901234567890"}, {"org.apache.commons.lang.text.StrBuilder", "clear", ""}}), new String[][]{{"deleteFirst", "char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<null>", "-536870893", "-1073741696"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "\u00e8,-9"}}), new String[][]{{"appendln", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\u00e8,-90\n {getNewLineText=null, getNullText=\u00e8,-9, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\u00e8,-90\n {getNewLineText=null, getNullText=\u00e8,-9, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", "java.util.Collection,java.lang.String", "<sample:2>", "[1,2]startIndex must be valie"}}), new String[][]{{"read", "char[],int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "reverse", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "validateIndex", "int", "268435456"}, {"org.apache.commons.lang.text.StrBuilder", "deleteAll", "org.apache.commons.lang.text.StrMatcher", "<sample:8>"}}, 1), new String[][]{{"asWriter", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", "elpms {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String", "1F5d.5"}}, 1), new String[][]{{"append", "char", "5"}, {"appendSeparator", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample  {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample  {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.String"}, new String[]{"m"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "7"}}), new String[][]{{"asReader", "", "3"}, {"read", "char[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "7m\n {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setLength", new String[]{"int"}, new String[]{"0"}, false), new String[][]{{"append", "char", "1"}, {"appendNewLine", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" \n {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " \n {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", ".\n"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", "int,int,char", "-2147483648", "2147483647", "\000"}}), new String[][]{{"charAt", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equals", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendSeparator", "char,int", "]", "-2147483570"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"B5urue"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendAll", "java.lang.Object[]", "<sample:0>"}}), new String[][]{{"deleteFirst", "java.lang.String", "2"}, {"append", "char", "1"}, {"appendFixedWidthPadRight", "java.lang.Object,int,char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("1 \000\000\000\000 {getNewLineText=null, getNullText=B5urue, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 \000\000\000\000 {getNewLineText=null, getNullText=B5urue, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "leftString", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "java.lang.String", "http://example-com/a?b=b"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("h", String.valueOf(actual));
  assertEquals("receiver state after the call", "http://example-com/a?b=b\n {getNewLineText=null, getNullText=null, isEmpty=false, length=25, size=25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "java.lang.String", "\u00e8-D1"}}), new String[][]{{"skip", "long", "2"}, {"transferTo", "java.io.Writer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"length must be valid", "-66"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[],int,int", "<sample:2>", "0", "-1073741817"}}), new String[][]{{"appendln", "double", "7"}, {"append", "boolean", "4"}, {"appendFixedWidthPadLeft", "java.lang.Object,int,char", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0.0\nfalseey {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0\nfalseey {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendSeparator", new String[]{"char"}, new String[]{"^"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendSeparator", "char", "8"}}, 3), new String[][]{{"appendln", "org.apache.commons.lang.text.StrBuilder", "7"}, {"appendln", "java.lang.StringBuffer,int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "int", "2147483647"}}), new String[][]{{"read", "", "6"}, {"transferTo", "java.io.Writer", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<null>", "1006632982", "-536870820"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "java.lang.String,int,int", "122456789012345678901234567890[1,2]TITLE", "-2147483648", "671088640"}, {"org.apache.commons.lang.text.StrBuilder", "append", "char[]", "<empty>"}}), new String[][]{{"appendln", "float", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n1.0\n {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n1.0\n {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:1>", "1.12345678901234567"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "endsWith", "java.lang.String", ""}}), new String[][]{{"appendSeparator", "java.lang.String", "0"}, {"append", "java.lang.StringBuffer", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "delete", new String[]{"int", "int"}, new String[]{"66", "16402"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String"}, new String[]{"01F"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\u00e8--1", "p"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "java.lang.Object", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "b\n {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("false\n {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "false\n {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String", "int", "int", "int"}, new String[]{"<sample:1>", "C5", "2147483647", "2147483647", "-64"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "reverse", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".6", "true2020-01-01"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setLength", new String[]{"int"}, new String[]{"33"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "substring", "int,int", "-2147483648", "1207959551"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=33, size=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000 {getNewLineText=null, getNullText=null, isEmpty=false, length=33, size=33}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"char"}, new String[]{"F"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"long"}, new String[]{"13"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("13\n {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "13\n {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"/a3b", "-1073741785", "33"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "int", "-77"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"char"}, new String[]{"!"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "org.apache.commons.lang.text.StrBuilder,int,int", "<sample:11>", "-1073741805", "-7"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<sample:3>", "-1073741823", "-536870866"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "java.lang.String,java.lang.String", ".5", "-2.5\u00e9"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:eL>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E5d", "ttp://example.com/a?b=c"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}, {"org.apache.commons.lang.text.StrBuilder", "appendSeparator", "char", "\uffff"}}, 2), new String[][]{{"appendFixedWidthPadLeft", "java.lang.Object,int,char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("000 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "000 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"2147483647", "d"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"char", "int"}, new String[]{"6", "-1"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "false {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", "w"}, {"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String", "ttp://ewample.com/a?b=c"}}, 2), new String[][]{{"insert", "int,float", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "org.apache.commons.lang.text.StrBuilder", "<sample:10>"}}, 2), new String[][]{{"appendFixedWidthPadLeft", "java.lang.Object,int,char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\ntrueb {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\ntrueb {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "char[]", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a\n {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"char[]"}, new String[]{"<null>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.12345678901234567", "-2", "536870866"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.String"}, new String[]{"]"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("]\n {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "]\n {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"int", "int", "java.lang.String"}, new String[]{"32", "16", ".5"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"java.lang.String"}, new String[]{"Ilength must be valid"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "size", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<null>", "2147483647", "2147483647"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<sample:0>", "1006632959", "-1073741785"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNullText", "java.lang.String", "0.5f"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.C12345778<a>b</a><a>b</a>", "TITLE 01F1E-5"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:7>", "\u00e9TITLE"}}, 1), new String[][]{{"appendAll", "java.lang.Object[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:1>", "end E start"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("aend E start0 {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "aend E start0 {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"1.1234567-0.0"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=1.1234567-0.0, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=1.1234567-0.0, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2), new String[][]{{"capacity", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String", "int", "int", "int"}, new String[]{"<sample:0>", "\t2020-01-01", "-2147483639", "-2147483601", "67"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "midString", new String[]{"int", "int"}, new String[]{"15", "2147418076"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "long", "-16"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample-16 {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.String", "int", "int"}, new String[]{"C5true", "2147483647", "-536870902"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "char", "C"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"long"}, new String[]{"64"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendSeparator", "java.lang.String,int", "1e10", "-1073741568"}}, 1), new String[][]{{"appendFixedWidthPadRight", "java.lang.Object,int,char", "2"}, {"capacity", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("38", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample64\nb {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"J"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("J {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "J {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"java.lang.String"}, new String[]{"\n\"a\":1}"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<null>", ""}, false, 0, null, 1), new String[][]{{"contains", "org.apache.commons.lang.text.StrMatcher", "1"}, {"appendSeparator", "char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char", "int"}, new String[]{":", "2147483647"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "long"}, new String[]{"-2147483648", "32"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer,int,int", "<sample:2>", "-1073741824", "4040"}, {"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<i:2>", "-2147483528", "W"}}, 1), new String[][]{{"appendPadding", "int,char", "2"}, {"appendWithSeparators", "java.util.Collection,java.lang.String", "3"}, {"append", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample0 {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample0 {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"char"}, new String[]{"X"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sampleX\n {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sampleX\n {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"C5true-1", "/"}, false, 0, null, 1), new String[][]{{"capacity", "", "1"}, {"contains", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendSeparator", new String[]{"char", "int"}, new String[]{"X", "-129"}, false, 6, new String[][]{}, 2), new String[][]{{"appendln", "java.lang.StringBuffer", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "length", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setNewLineText", "java.lang.String", "http://example.com/a?b=c"}, {"org.apache.commons.lang.text.StrBuilder", "append", "double", "-0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "-0.0 {getNewLineText=http://example.com/a?b=c, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadLeft", new String[]{"int", "int", "char"}, new String[]{"20", "-128", "1"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getNullText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "false {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "/a3Tbb"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,float", "-20", "44.0"}}, 2), new String[][]{{"appendWithSeparators", "java.util.Collection,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("aa {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "aa {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"!", "0x1234567899"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,boolean", "-2147483532", "true"}}, 2), new String[][]{{"append", "long", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("3 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "3 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char"}, new String[]{"\uffff"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "char", "p"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ab,c", ".6s"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"int"}, new String[]{"21"}, false, 2, new String[][]{}, 3), new String[][]{{"asReader", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "sample21\n {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equals", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char", "]"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "] {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "midString", new String[]{"int", "int"}, new String[]{"2147483647", "-2147483648"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:10>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{}, 2), new String[][]{{"appendFixedWidthPadRight", "java.lang.Object,int,char", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("falseke {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "falseke {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:9>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "midString", new String[]{"int", "int"}, new String[]{"2147483647", "1073741798"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toString", ""}, {"org.apache.commons.lang.text.StrBuilder", "insert", "int,long", "-1073741802", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<null>", "0bE5"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "setCharAt", "int,char", "-1073741764", "d"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"12:30:45", "2147475404", "2147483647"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asReader", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.StringBuffer"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toString", ""}}, 1), new String[][]{{"appendln", "float", "4"}, {"append", "float", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308\nInfinity\n0.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=36, size=36}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1.7976931348623157E308\nInfinity\n0.0 {getNewLineText=null, getNullText=null, isEmpty=false, length=36, size=36}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "leftString", new String[]{"int"}, new String[]{"-2147483316"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,int", "-1073741831", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replace", "int,int,java.lang.String", "-1073758207", "-1077936127", "+p"}}, 3), new String[][]{{"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "delete", "int,int", "2147483647", "-96"}}, 1), new String[][]{{"append", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:5>", ""}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "-0.94"}, {"org.apache.commons.lang.text.StrBuilder", "contains", "org.apache.commons.lang.text.StrMatcher", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-0.94a0sample {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-0.94a0sample {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteAll", new String[]{"java.lang.String"}, new String[]{"7628716375283629643TITLEInvalid startIndex: "}, false, 5, new String[][]{}, 3), new String[][]{{"appendFixedWidthPadLeft", "int,int,char", "2"}, {"appendln", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("00sample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "00sample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=9, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "capacity", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toCharArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("38", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getNewLineText", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "java.lang.String,int,int", ".1", "2147483647", "-2147483362"}}, 1), new String[][]{{"appendWithSeparators", "java.util.Iterator,java.lang.String", "2"}, {"appendSeparator", "char,int", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<empty>", "-9", "-536870931"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendAll", "java.util.Iterator", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "float"}, new String[]{"-2147483582", "-3.4028235E38"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "validateIndex", "int", "2147483612"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asWriter", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:5>", "20", "67"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendPadding", new String[]{"int", "char"}, new String[]{"0", "_"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "org.apache.commons.lang.text.StrBuilder", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char"}, new String[]{"n"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"long"}, new String[]{"-80"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("-80 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-80 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNullText", new String[]{"java.lang.String"}, new String[]{"length must be valid"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=length must be valid, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=length must be valid, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "delete", "int,int", "-20", "-7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("true {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "true {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:5>", "2013265919", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "double", "-0.94"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:3>", "0?F"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"java.lang.String"}, new String[]{"122456789012345678901234567890[1,2]"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "leftString", new String[]{"int"}, new String[]{"1073741823"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"htsp://example.cm/a?b=c"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("htsp://example.cm/a?b=c {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "htsp://example.cm/a?b=c {getNewLineText=null, getNullText=null, isEmpty=false, length=23, size=23}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher", "int"}, new String[]{"<sample:3>", "-128"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "charAt", "int", "20"}, {"org.apache.commons.lang.text.StrBuilder", "deleteFirst", "char", "x"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asTokenizer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "ensureCapacity", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=, getTokenArray=[], hasNext=false, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "midString", new String[]{"int", "int"}, new String[]{"10", "2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<empty>", "2147483647", "-1073741831"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:11>", "-1073741831", "-2147483648"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{}), new String[][]{{"appendWithSeparators", "java.lang.Object[],java.lang.String", "5"}, {"append", "long", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samplefalse0true0c-9223372036854775808 {getNewLineText=null, getNullText=null, isEmpty=false, length=38, size=38}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samplefalse0true0c-9223372036854775808 {getNewLineText=null, getNullText=null, isEmpty=false, length=38, size=38}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceFirst", "org.apache.commons.lang.text.StrMatcher,java.lang.String", "<sample:4>", "1.C12345678<a>b</a>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setLength", new String[]{"int"}, new String[]{"-536870915"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "int", "-67"}, {"org.apache.commons.lang.text.StrBuilder", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"a", "^"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "delete", new String[]{"int", "int"}, new String[]{"-67", "-2147483609"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendWithSeparators", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<sample:2>", "1.1234P568"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendSeparator", new String[]{"char", "int"}, new String[]{"2", "-67"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "equals", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:11>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char[]", "int", "int"}, new String[]{"-5", "<sample:0>", "-536870902", "-2147483648"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "leftString", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "replaceAll", "char,char", " ", "\""}, {"org.apache.commons.lang.text.StrBuilder", "contains", "java.lang.String", "7628716375283629643TITLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nul", "http://example.com/a?b=c"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "char[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0a0\n {getNewLineText=0, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0a0\n {getNewLineText=0, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder", "int", "int"}, new String[]{"<sample:1>", "2147483647", "-2147483648"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendAll", "java.lang.Object[]", "<sample:0>"}, {"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", "X"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{"32"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "char", "A"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=32, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=32, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "minimizeCapacity", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"appendln", "org.apache.commons.lang.text.StrBuilder,int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:2>", "10"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "org.apache.commons.lang.text.StrMatcher", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "2147483596", "-2147483648"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "deleteAll", "char", "w"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.123456781.12345678901234567", "2020-02-30U25:61:61"}, false, 2, new String[][]{}), new String[][]{{"appendAll", "java.util.Collection", "5"}, {"deleteAll", "org.apache.commons.lang.text.StrMatcher", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("samplea0sample {getNewLineText=null, getNullText=null, isEmpty=false, length=14, size=14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "samplea0sample {getNewLineText=null, getNullText=null, isEmpty=false, length=14, size=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234:56781.12345678901234567", "2147483648"}, false, 5, new String[][]{}), new String[][]{{"appendln", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0true\n {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0true\n {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"java.lang.String"}, new String[]{"1D25"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "false {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "charAt", new String[]{"int"}, new String[]{"-20"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setCharAt", new String[]{"int", "char"}, new String[]{"-2147483362", "f"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "-536870975", "2"}, {"org.apache.commons.lang.text.StrBuilder", "indexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:7>", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "reverse", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "char", "H"}, {"org.apache.commons.lang.text.StrBuilder", "appendln", "char", "d"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\nd {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\nd {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"char", "char"}, new String[]{"9", "y"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", "java.lang.Object,int,char", "<s:aT>", "2147483647", "e"}, {"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "-1073741831"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "delete", "int,int", "20", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "char[],int,int", "<empty>", "-2147483648", "-2147483392"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "char[]"}, new String[]{"2147483647", "<empty>"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "java.lang.StringBuffer,int,int", "<sample:0>", "-805306373", "-1073741681"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "reverse", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "getChars", "char[]", "<sample:1>"}}), new String[][]{{"appendNewLine", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("elpmas\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "elpmas\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<sample:3>", "4129", "8201"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:7>", "{\"a\":1}http://example.com/a?b=c"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toString", ""}}), new String[][]{{"appendFixedWidthPadLeft", "int,int,char", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("47 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "47 {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendPadding", "int,char", "-536870975", "_"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1300238314", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "validateRange", new String[]{"int", "int"}, new String[]{"-2147467228", "-2147483374"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getNewLineText", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "isEmpty", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "-16402", "26"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[]", "-128", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toStringBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"append", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("true {length=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"org.apache.commons.lang.text.StrBuilder"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("2147483647\n {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2147483647\n {getNewLineText=null, getNullText=null, isEmpty=false, length=11, size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "leftString", new String[]{"int"}, new String[]{"4097"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "false {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"char"}, new String[]{":"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.StringBuffer", "int", "int"}, new String[]{"<empty>", "-58", "-2147467228"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.String", "1e101.4"}, {"org.apache.commons.lang.text.StrBuilder", "appendSeparator", "java.lang.String", "1.12345678901234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:6>", "2020-02-30T25:61:61"}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "long", "137438953392"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("137438953392\n {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "137438953392\n {getNewLineText=null, getNullText=null, isEmpty=false, length=13, size=13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"deleteAll", "org.apache.commons.lang.text.StrMatcher", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("true\n {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "true\n {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"org.apache.commons.lang.text.StrMatcher", "int"}, new String[]{"<sample:10>", "2147483647"}, false, 1, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "long", "-80"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-80\n {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<s:a>", "2147483647", "H"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "contains", "org.apache.commons.lang.text.StrMatcher", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replace", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String", "int", "int", "int"}, new String[]{"<sample:5>", "D5", "3", "-1073741831", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:3>", "1946156998"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "rightString", new String[]{"int"}, new String[]{"-1073741807"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"char"}, new String[]{"\000"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "reverse", new String[]{}, new String[]{}, false), new String[][]{{"contains", "char", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"6628716375283629643TITLE", "76287163752836296-3TITLE"}, false), new String[][]{{"append", "org.apache.commons.lang.text.StrBuilder,int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.StringBuffer"}, new String[]{"<null>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.Object"}, new String[]{"<s:ax>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("ax\n {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ax\n {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<sample:7>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "indexOf", new String[]{"char", "int"}, new String[]{"c", "2147483647"}, false, 4, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "charAt", "int", "-2147483392"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "deleteFirst", new String[]{"org.apache.commons.lang.text.StrMatcher"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,long", "-2147483648", "-80"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "reverse", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"charAt", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"j", "-6"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "org.apache.commons.lang.text.StrMatcher,int", "<sample:1>", "-2147483648"}}), new String[][]{{"appendNewLine", "", "1"}, {"deleteFirst", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}), new String[][]{{"appendln", "java.lang.Object", "3"}, {"appendAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" a2\nsample {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a2\nsample {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"1.C12345668<a>b</a>"}, false), new String[][]{{"charAt", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "contains", new String[]{"char"}, new String[]{"A"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:10>", "5."}, false, 7, new String[][]{}), new String[][]{{"appendln", "java.lang.StringBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:3>", "\t"}, false, 7, new String[][]{}), new String[][]{{"appendWithSeparators", "java.util.Iterator,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getNullText", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "validateRange", "int,int", "43", "2147483628"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "ensureCapacity", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"org.apache.commons.lang.text.StrMatcher", "java.lang.String"}, new String[]{"<sample:4>", "2020-01-01PT1H"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "toString", ""}}), new String[][]{{"appendFixedWidthPadLeft", "java.lang.Object,int,char", "1"}, {"delete", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "insert", new String[]{"int", "java.lang.String"}, new String[]{"-1073995758", "true2020<01-01"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"char", "char"}, new String[]{"X", "\000"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equals", "java.lang.Object", "<i:-2147483648>"}}), new String[][]{{"appendln", "java.lang.StringBuffer", "5"}, {"append", "long", "7"}, {"append", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\n4key {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n4key {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "trim", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendln", "float", "Infinity"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("Infinity {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Infinity {getNewLineText=null, getNullText=null, isEmpty=false, length=8, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"float"}, new String[]{"NaN"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("NaN\n {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN\n {getNewLineText=null, getNullText=null, isEmpty=false, length=4, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1a3b", "/6"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "insert", "int,char[],int,int", "31", "<sample:1>", "536870975", "-1"}}), new String[][]{{"appendln", "java.lang.String", "4"}, {"append", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("\nfalse {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\nfalse {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendln", new String[]{"java.lang.String"}, new String[]{"0E5d"}, false), new String[][]{{"capacity", "", "6"}, {"appendFixedWidthPadRight", "java.lang.Object,int,char", "1"}, {"appendAll", "java.util.Iterator", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0E5d\n {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0E5d\n {getNewLineText=null, getNullText=null, isEmpty=false, length=5, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "equalsIgnoreCase", "org.apache.commons.lang.text.StrBuilder", "<sample:13>"}, {"org.apache.commons.lang.text.StrBuilder", "appendln", "java.lang.Object", "<i:-16>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample-16\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample-16\n {getNewLineText=null, getNullText=null, isEmpty=false, length=10, size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "lastIndexOf", new String[]{"java.lang.String"}, new String[]{"\u00e8--9"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "getNullText", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getNewLineText=null, getNullText=null, isEmpty=false, length=6, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "org.apache.commons.lang.text.StrBuilder", "<sample:7>"}}), new String[][]{{"append", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getNewLineText=null, getNullText=null, isEmpty=false, length=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "appendFixedWidthPadRight", new String[]{"java.lang.Object", "int", "char"}, new String[]{"<s:c>", "-1065353197", "a"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"char"}, new String[]{"d"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String", "<a>b</a>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("0d {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0d {getNewLineText=null, getNullText=null, isEmpty=false, length=2, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "setNewLineText", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "leftString", "int", "-58"}}), new String[][]{{"asTokenizer", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer", actual.getClass().getName());
  assertEquals("StrTokenizer[not tokenized yet] {getContent=, getTokenArray=[], hasNext=false, hasPrevious=false, isEmptyTokenAsNull=false, isIgnoreEmptyTokens=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "length", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "append", "java.lang.StringBuffer", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "append", new String[]{"java.lang.String"}, new String[]{"01F"}, false, 3, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "indexOf", "java.lang.String,int", "12H3456789012345678901234567890", "2013265919"}}), new String[][]{{"appendln", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("01F0.0\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "01F0.0\n {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "asReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "appendSeparator", "char,int", ">", "20"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder$StrBuilderReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "sample> {getNewLineText=null, getNullText=null, isEmpty=false, length=7, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.", "b1.5e300"}, false, 7, new String[][]{}), new String[][]{{"contains", "org.apache.commons.lang.text.StrMatcher", "7"}, {"appendPadding", "int,char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals("000 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "000 {getNewLineText=null, getNullText=null, isEmpty=false, length=3, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TBTLE", "2147483648"}, false, 3, new String[][]{}), new String[][]{{"appendln", "java.lang.StringBuffer,int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "toCharArray", new String[]{"int", "int"}, new String[]{"268435456", "1342177279"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "java.lang.String,int", "5.\n", "162"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceFirst", new String[]{"char", "char"}, new String[]{"E", "9"}, false, 5, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "asWriter", ""}}), new String[][]{{"appendNewLine", "", "0"}, {"delete", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.text.StrBuilder", "org.apache.commons.lang.text.StrBuilder", "replaceAll", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.-23", "+p"}, false, 0, new String[][]{{"org.apache.commons.lang.text.StrBuilder", "lastIndexOf", "char,int", "H", "536870912"}}), new String[][]{{"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.text.StrBuilder", actual.getClass().getName());
  assertEquals(" {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getNewLineText=null, getNullText=null, isEmpty=true, length=0, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
}
