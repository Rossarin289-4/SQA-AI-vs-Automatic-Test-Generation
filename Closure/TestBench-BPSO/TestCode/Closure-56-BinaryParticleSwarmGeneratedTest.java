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
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a\":1}", "0/"}, true), new String[][]{{"getLineOffset", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"1.1234567890123"}, true), new String[][]{{"getRegion", "int", "6"}, {"clearCachedSource", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("1.1234567890123 {getCode=!FileNotFoundException, getName=1.1234567890123, getOriginalPath=1.1234567890123, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:1>", "<sample:4>"}, true), new String[][]{{"getCode", "", "6"}, {"getLine", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"+1<a>b</a>", "<sample:2>"}, true), new String[][]{{"getRegion", "int", "0"}, {"getSourceExcerpt", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"W-1", "<null>"}, true, 0, null, 1), new String[][]{{"getLine", "int", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\u00e91", ""}, true), new String[][]{{"getLine", "int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"2020-02-30T25:61:61_", "<sample:3>"}, true), new String[][]{{"getLine", "int", "7"}, {"clearCachedSource", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Generated", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61_ {getCode=sample, getName=2020-02-30T25:61:61_, getOriginalPath=2020-02-30T25:61:61_, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{".5d", "1L", "<sample:2>"}, true), new String[][]{{"getLine", "int", "5"}, {"getLineOffset", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"1/12?4567", "<sample:0>"}, true), new String[][]{{"getLineOffset", "int", "3"}, {"getLineOffset", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"<null>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"11", "<sample:3>"}, true, 0, null, 1), new String[][]{{"clearCachedSource", "", "4"}, {"getLine", "int", "0"}, {"getRegion", "int", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SimpleRegion", actual.getClass().getName());
  assertEquals("{getBeginningLineNumber=1, getEndingLineNumber=3, getSourceExcerpt=a\r\nb\r}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:1>"}, true), new String[][]{{"getCodeReader", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.io.FileReader", actual.getClass().getName());
  assertEquals("{getEncoding=UTF8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getNumLines", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLineOffset", "int", "-50"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:1>", "<sample:2>"}, true), new String[][]{{"getCode", "", "5"}, {"setCharset", "java.nio.charset.Charset", "2"}, {"getCodeReader", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeNoCache", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setIsExtern", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getRegion", new String[]{"int"}, new String[]{"-2147467264"}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}, {"com.google.javascript.jscomp.SourceFile", "getRegion", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SimpleRegion", actual.getClass().getName());
  assertEquals("{getBeginningLineNumber=1, getEndingLineNumber=1, getSourceExcerpt={\"a\":1}}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"TITLE21474833648.5", "<sample:0>"}, true, 0, null, 1), new String[][]{{"getRegion", "int", "6"}, {"getCodeReader", "", "7"}, {"read", "java.nio.CharBuffer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "clearCachedSource", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "isExtern", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLine", "int", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLine", new String[]{"int"}, new String[]{"-5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLineOffset", "int", "20"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"\tb"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=\tb, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<null>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"TITLE2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("TITLE2147483648 {getCode=!FileNotFoundException, getName=TITLE2147483648, getOriginalPath=TITLE2147483648, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"true", "-1.5", "Hello,> World"}, true, 0, null, 3), new String[][]{{"getOriginalPath", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"2020-02-30T25:61:61", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61 {getCode=a, getName=2020-02-30T25:61:61, getOriginalPath=2020-02-30T25:61:61, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:5>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"getRegion", "int", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLineOffset", new String[]{"int"}, new String[]{"-1"}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setOriginalPath", "java.lang.String", "2020-02-30T25:61:61--1 "}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"http://example.coom/a?b=c1.5f", "<sample:0>"}, true, 0, null, 2), new String[][]{{"getLine", "int", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "clearCachedSource", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setIsExtern", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getNumLines", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "5\t", "{\"a![1}"}, true, 0, null, 2), new String[][]{{"setOriginalPath", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("0x123456789 {getCode={\"a![1}, getName=0x123456789, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "clearCachedSource", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"0xGFFFFFFF", "<sample:1>"}, true, 0, null, 1), new String[][]{{"getCodeReader", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:3>", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/a {getCode=!FileNotFoundException, getName=/a, getOriginalPath=/a, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"+"}, false, 7, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getRegion", "int", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=+, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"0/", "/ /b", "<sample:2>"}, true, 0, null, 1), new String[][]{{"getCode", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\nb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeNoCache", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:4>", "<sample:4>"}, true, 0, null, 2), new String[][]{{"getCharset", "", "2"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLineOffset", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"com.google.javascript.jscomp.SourceFile", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getName", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"` b", "<sample:6>"}, true, 0, null, 3), new String[][]{{"getName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("` b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"getRegion", "int", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeNoCache", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=sample, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"1.d"}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "isExtern", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=1.d, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"\n", "5.", "02:30d45"}, true, 0, null, 1), new String[][]{{"getCodeReader", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getName", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "clearCachedSource", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeReader", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLine", new String[]{"int"}, new String[]{"4"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"x\"a\"\":1}", "2147473648", "\t"}, true, 0, null, 2), new String[][]{{"getCode", "", "6"}, {"clearCachedSource", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("x\"a\"\":1} {getCode=\t, getName=x\"a\"\":1}, getOriginalPath=2147473648, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/a/sample {getCode=, getName=/a/sample, getOriginalPath=/a/sample, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\u00e9", "bTITLE21474783648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("\u00e9 {getCode=bTITLE21474783648, getName=\u00e9, getOriginalPath=\u00e9, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"http://example.4oom/a?b=c1b.5f", "<sample:3>"}, true, 0, null, 3), new String[][]{{"getCode", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:4>", "<empty>"}, true, 0, null, 3), new String[][]{{"getCode", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"\u00e9", "<a>b</a>1.5e300", "<sample:2>"}, true, 0, null, 2), new String[][]{{"getCodeReader", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:0>", "<sample:4>"}, true, 0, null, 3), new String[][]{{"getCharset", "", "2"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"2020-02-30U25:61:61--1 a b", "I", "-f1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("2020-02-30U25:61:61--1 a b {getCode=-f1, getName=2020-02-30U25:61:61--1 a b, getOriginalPath=I, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getNumLines", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"2/20-02-30T25:61:61", "/a/b-1", "-11--1"}, true, 0, null, 1), new String[][]{{"getLine", "int", "2"}, {"getCodeReader", "", "2"}, {"skip", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"/a/b-1i", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("/a/b-1i {getCode=, getName=/a/b-1i, getOriginalPath=/a/b-1i, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "isExtern", ""}, {"com.google.javascript.jscomp.SourceFile", "getCodeReader", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getOriginalPath", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"147483648\u00e9", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("147483648\u00e9 {getCode=a\nb, getName=147483648\u00e9, getOriginalPath=147483648\u00e9, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"setOriginalPath", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/a {getCode=!FileNotFoundException, getName=/a, getOriginalPath=, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"1", "<sample:3>"}, true, 0, null, 3), new String[][]{{"setOriginalPath", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("1 {getCode=a\r\nb\r\n, getName=1, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"getOriginalPath", "", "5"}, {"getLine", "int", "7"}, {"clearCachedSource", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "clearCachedSource", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getOriginalPath", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"0x1[[", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"21474836480x123456789", "1.12345678901234567{\"a\":1}", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLineOffset", new String[]{"int"}, new String[]{"40"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"TIITLE2147I83648"}, true, 0, null, 1), new String[][]{{"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TIITLE2147I83648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"a,b:c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("a,b:c {getCode=!FileNotFoundException, getName=a,b:c, getOriginalPath=a,b:c, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.SourceFile", "isExtern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=sample, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLineOffset", new String[]{"int"}, new String[]{"60"}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"1.1234567890123456", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("1.1234567890123456 {getCode=, getName=1.1234567890123456, getOriginalPath=1.1234567890123456, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getRegion", new String[]{"int"}, new String[]{"-94"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/a {getCode=!FileNotFoundException, getName=/a, getOriginalPath=/a, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getOriginalPath", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getOriginalPath", ""}, {"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"http://example.comIa?b=c", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("http://example.comIa?b=c {getCode=a\r\nb\r\n, getName=http://example.comIa?b=c, getOriginalPath=http://example.comIa?b=c, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"PT1H1.5e300", "\n", "01.123456789012345"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("PT1H1.5e300 {getCode=01.123456789012345, getName=PT1H1.5e300, getOriginalPath=\n, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1", "1.255"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("+1 {getCode=1.255, getName=+1, getOriginalPath=+1, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"2021-01-\n1", "<sample:2>"}, true, 0, null, 2), new String[][]{{"clearCachedSource", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("2021-01-\n1 {getCode=a\nb, getName=2021-01-\n1, getOriginalPath=2021-01-\n1, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLine", new String[]{"int"}, new String[]{"2"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:1>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/a/sample {getCode=, getName=/a/sample, getOriginalPath=/a/sample, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getOriginalPath", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setIsExtern", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"8true", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("8true {getCode=!FileNotFoundException, getName=8true, getOriginalPath=8true, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLine", new String[]{"int"}, new String[]{"1073741823"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLine", new String[]{"int"}, new String[]{"-31"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "clearCachedSource", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"/a/b-1", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("/a/b-1 {getCode=a, getName=/a/b-1, getOriginalPath=/a/b-1, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getRegion", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"PT1G"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLine", "int", "-4097"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=PT1G, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeNoCache", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"12:30:441.5f", "[1P,2]", "Titlee8true"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("12:30:441.5f {getCode=Titlee8true, getName=12:30:441.5f, getOriginalPath=[1P,2], isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"5", "/`/b", "<a>b</a>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("5 {getCode=<a>b</a>, getName=5, getOriginalPath=/`/b, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"<a>b</a>1.5e300", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Generated", actual.getClass().getName());
  assertEquals("<a>b</a>1.5e300 {getCode=sample, getName=<a>b</a>1.5e300, getOriginalPath=<a>b</a>1.5e300, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"1.123"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=1.123, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\n1.1234567", "1e1/"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("\n1.1234567 {getCode=1e1/, getName=\n1.1234567, getOriginalPath=\n1.1234567, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:3>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/a {getCode=!FileNotFoundException, getName=/a, getOriginalPath=/a, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeNoCache", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{""}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"a b", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("a b {getCode=, getName=a b, getOriginalPath=a b, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<empty>", "<null>"}, true), new String[][]{{"getLine", "int", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}, {"com.google.javascript.jscomp.SourceFile", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"60", "a,b,c", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("60 {getCode=a\nb, getName=60, getOriginalPath=a,b,c, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa {getCode=!FileNotFoundException, getName=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, getOriginalPath=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"\010"}, true), new String[][]{{"getCode", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1L", "2020-02-01+1"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("1L {getCode=2020-02-01+1, getName=1L, getOriginalPath=1L, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getOriginalPath", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLineOffset", new String[]{"int"}, new String[]{"-10"}, false, 1, new String[][]{{"com.google.javascript.jscomp.SourceFile", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"\n1", "<empty>"}, true), new String[][]{{"getName", "", "6"}, {"getName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "clearCachedSource", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=sample, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getNumLines", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setIsExtern", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}, {"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getOriginalPath", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"I", "1/a/b"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("I {getCode=1/a/b, getName=I, getOriginalPath=I, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeReader", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", ""}, {"com.google.javascript.jscomp.SourceFile", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getOriginalPath", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true), new String[][]{{"clearCachedSource", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("2020-01-01 {getCode=!FileNotFoundException, getName=2020-01-01, getOriginalPath=2020-01-01, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeReader", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a\":12", "1.12345678"}, true), new String[][]{{"getName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\u00e9", "21F7483648"}, true), new String[][]{{"getOriginalPath", "", "5"}, {"clearCachedSource", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("\u00e9 {getCode=21F7483648, getName=\u00e9, getOriginalPath=\u00e9, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?b=c<a>b</a>1.5e300", "-1.5", "nvll"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c<a>b</a>1.5e300 {getCode=nvll, getName=http://example.com/a?b=c<a>b</a>1.5e300, getOriginalPath=-1.5, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"0xx", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("0xx {getCode=, getName=0xx, getOriginalPath=0xx, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"-1", "<null>"}, true), new String[][]{{"getCodeReader", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:4>", "<sample:2>"}, true), new String[][]{{"getCode", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getNumLines", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setIsExtern", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "clearCachedSource", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"2147483648\u00e9", "<sample:0>"}, true), new String[][]{{"getCodeReader", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "clearCachedSource", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLine", "int", "-10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"12345678890123456789012345678905", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("12345678890123456789012345678905 {getCode=!FileNotFoundException, getName=12345678890123456789012345678905, getOriginalPath=12345678890123456789012345678905, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:2>", "<sample:3>"}, true), new String[][]{{"getLineOffset", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeNoCache", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setOriginalPath", "java.lang.String", ".5i"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=.5i, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=sample, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "isExtern", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"\t9", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("\t9 {getCode=!FileNotFoundException, getName=\t9, getOriginalPath=\t9, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"1020-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("1020-02-30T25:61:61 {getCode=!FileNotFoundException, getName=1020-02-30T25:61:61, getOriginalPath=1020-02-30T25:61:61, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"0.", "<sample:2>"}, true), new String[][]{{"getCodeReader", "", "2"}, {"transferTo", "java.io.Writer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567http://example.coom/a?b=c1].5f", ".5"}, true), new String[][]{{"getCode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"1234567890123456789012345607890", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Generated", actual.getClass().getName());
  assertEquals("1234567890123456789012345607890 {getCode=0, getName=1234567890123456789012345607890, getOriginalPath=1234567890123456789012345607890, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"i123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("i123456789012345678901234567890 {getCode=!FileNotFoundException, getName=i123456789012345678901234567890, getOriginalPath=i123456789012345678901234567890, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"http://example.com/a?h=c", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("http:/example.com/a?h=c {getCode=!FileNotFoundException, getName=http:/example.com/a?h=c, getOriginalPath=http:/example.com/a?h=c, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "clearCachedSource", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"0L", "<empty>"}, true), new String[][]{{"getLine", "int", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"  ", "<sample:1>"}, true), new String[][]{{"setOriginalPath", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("   {getCode=!FileNotFoundException, getName=  , getOriginalPath=sample, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getName", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:6>", "<empty>"}, true), new String[][]{{"getOriginalPath", "", "0"}, {"isExtern", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true), new String[][]{{"getName", "", "2"}, {"clearCachedSource", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("1.1234567 {getCode=!FileNotFoundException, getName=1.1234567, getOriginalPath=1.1234567, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"6;"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("6; {getCode=!FileNotFoundException, getName=6;, getOriginalPath=6;, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getNumLines", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"\n", "2T1H", ""}, true), new String[][]{{"getCodeReader", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{".-1", "<sample:0>"}, true), new String[][]{{"getOriginalPath", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"a,b,c", "<sample:2>"}, true), new String[][]{{"getCode", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"214a7483648\u00e90x123456789", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("214a7483648\u00e90x123456789 {getCode=a\nb, getName=214a7483648\u00e90x123456789, getOriginalPath=214a7483648\u00e90x123456789, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeNoCache", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"http://example.coom/a?bX=c1.5f", "1.e", "abc"}, true), new String[][]{{"getName", "", "6"}, {"getCode", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345778", "1.6e300"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("1.12345778 {getCode=1.6e300, getName=1.12345778, getOriginalPath=1.12345778, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"01f1.5e300", "i", "bc"}, true), new String[][]{{"setOriginalPath", "java.lang.String", "6"}, {"getName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("01f1.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\n0/", "/a/b"}, true), new String[][]{{"getRegion", "int", "0"}, {"getSourceExcerpt", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"r5.[1,2]", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("r5.[1,2] {getCode=, getName=r5.[1,2], getOriginalPath=r5.[1,2], isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"12:30:35", "<sample:3>"}, true), new String[][]{{"isExtern", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"\t123456789012345678901234567890", "<a>b</ a>1.5e300", "1.5e300-11.5e300"}, true), new String[][]{{"getCodeReader", "", "7"}, {"skip", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:5>"}, true), new String[][]{{"getCode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"20280-02-30T25:61:61", "<empty>"}, true), new String[][]{{"getCodeReader", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"2021-02-30T25:61:60"}, true), new String[][]{{"getOriginalPath", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2021-02-30T25:61:60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"15.", "<sample:0>"}, true), new String[][]{{"clearCachedSource", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("15. {getCode=, getName=15., getOriginalPath=15., isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"c0", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("c0 {getCode=, getName=c0, getOriginalPath=c0, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeNoCache", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" x \t y ", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"+10x123456789", "+2", "1e101.16345678"}, true), new String[][]{{"setOriginalPath", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("+10x123456789 {getCode=1e101.16345678, getName=+10x123456789, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"Z1,2]1.5", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"+1", "123456789012445678901234567890", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("+1 {getCode=a\nb, getName=+1, getOriginalPath=123456789012445678901234567890, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true), new String[][]{{"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"\u00e9160", "<sample:2>"}, true), new String[][]{{"getCodeReader", "", "7"}, {"read", "char[],int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"2020-02-30T25:61:61--1 TITLE2147483648", "<sample:0>"}, true), new String[][]{{"getName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61--1 TITLE2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true), new String[][]{{"getRegion", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"2020-02-30T25:61:61--1 8true", "<sample:3>"}, true), new String[][]{{"getOriginalPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61--1 8true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"2020-11-\n1", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("2020-11-\n1 {getCode=a\nb, getName=2020-11-\n1, getOriginalPath=2020-11-\n1, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "clearCachedSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setOriginalPath", "java.lang.String", "2147e83648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=2147e83648, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "isExtern", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.SourceFile", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setOriginalPath", "java.lang.String", "\t2020-=1-01"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=\t2020-=1-01, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=sample, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,b;c", "http://example.coom/a?b=c1.5f"}, true), new String[][]{{"getRegion", "int", "7"}, {"getLineOffset", "int", "3"}, {"clearCachedSource", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("a,b;c {getCode=http://example.coom/a?b=c1.5f, getName=a,b;c, getOriginalPath=a,b;c, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"ab\rc", "<empty>"}, true), new String[][]{{"getCodeReader", "", "4"}, {"markSupported", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"", "<sample:9>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLine", "int", "262164"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"PTT_H"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=PTT_H, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<empty>", "<sample:3>"}, true), new String[][]{{"getName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "2020-02-30T25:61:61", "<sample:2>"}, true), new String[][]{{"getCode", "", "6"}, {"isExtern", "", "4"}, {"isExtern", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"mITLE", "<sample:3>"}, true), new String[][]{{"getCode", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "isExtern", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=sample, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getOriginalPath", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:5>", "<sample:6>"}, true), new String[][]{{"getRegion", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getRegion", new String[]{"int"}, new String[]{"20"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLine", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLineOffset", new String[]{"int"}, new String[]{"-13"}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"2020-02-30T25:61:615.", "-11--1", "<sample:2>"}, true), new String[][]{{"getLineOffset", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"0/", "-,\r1", "<sample:4>"}, true), new String[][]{{"getCode", "", "2"}, {"getCode", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\rb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:0>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:7>"}, true), new String[][]{{"getCodeReader", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"2020-02-[30T25:61:61<a>b</a>1.5e300", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setOriginalPath", "java.lang.String", "}-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=}-1, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"-1\n5", "<sample:2>"}, true), new String[][]{{"getLine", "int", "4"}, {"isExtern", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"--1", "\t", "<sample:1>"}, true), new String[][]{{"getOriginalPath", "", "7"}, {"getCode", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "isExtern", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{" c", "<sample:4>"}, true), new String[][]{{"setOriginalPath", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Generated", actual.getClass().getName());
  assertEquals(" c {getCode=, getName= c, getOriginalPath=, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "isExtern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setIsExtern", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"\u00e9Hello, Worldaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:1>"}, true), new String[][]{{"getLine", "int", "5"}, {"setOriginalPath", "java.lang.String", "6"}, {"getCode", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"1.5e300a", "", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("1.5e300a {getCode=, getName=1.5e300a, getOriginalPath=, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:7>"}, true), new String[][]{{"setCharset", "java.nio.charset.Charset", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/a {getCode=!FileNotFoundException, getName=/a, getOriginalPath=/a, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"2020-0I-01"}, false, 2, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setOriginalPath", "java.lang.String", "2020-02-30T25:6:615."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=2020-0I-01, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:5>"}, true), new String[][]{{"isExtern", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeReader", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"21474836h4\u00e9"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=21474836h4\u00e9, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLineOffset", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"getCodeReader", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{",1.5", "1.5d300", "<sample:2>"}, true), new String[][]{{"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "r\na"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getRegion", new String[]{"int"}, new String[]{"-131068"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{":020-00-01"}, true, 0, null, 3), new String[][]{{"setCharset", "java.nio.charset.Charset", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals(":020-00-01 {getCode=!FileNotFoundException, getName=:020-00-01, getOriginalPath=:020-00-01, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"12456789012345678901234567890", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("12456789012345678901234567890 {getCode=a\nb, getName=12456789012345678901234567890, getOriginalPath=12456789012345678901234567890, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"+1", "21h47483]48\u00e9", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("+1 {getCode=, getName=+1, getOriginalPath=21h47483]48\u00e9, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLineOffset", "int", "-42"}, {"com.google.javascript.jscomp.SourceFile", "getLineOffset", "int", "16"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setOriginalPath", "java.lang.String", "1.350xFFFFFFFF"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=1.350xFFFFFFFF, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:7>"}, true, 0, null, 1), new String[][]{{"getName", "", "2"}, {"getCharset", "", "2"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"Help, World", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLineOffset", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"<a>b</>1.5e300"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("<a>b</>1.5e300 {getCode=!FileNotFoundException, getName=<a>b</>1.5e300, getOriginalPath=<a>b</>1.5e300, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getRegion", "int", "-64"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"TITE", "<sample:0>"}, true, 0, null, 3), new String[][]{{"getRegion", "int", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"--1.5", "2/20-02-30T25:61:61", "<sample:1>"}, true, 0, null, 2), new String[][]{{"getOriginalPath", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2/20-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"2.5", "1.5d", "\n\n"}, true, 0, null, 2), new String[][]{{"getLineOffset", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5", "\u00e9Hello,Worldaaoaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("5 {getCode=\u00e9Hello,Worldaaoaaaaaaaaaaaaaaaaaaaaaaaaaaa, getName=5, getOriginalPath=5, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeReader", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getOriginalPath", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"getCode", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"abc", "<sample:2>"}, true, 0, null, 1), new String[][]{{"getLineOffset", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLineOffset", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/a/sample {getCode=, getName=/a/sample, getOriginalPath=/a/sample, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"r"}, true, 0, null, 1), new String[][]{{"getRegion", "int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeNoCache", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"PT2I", "<sample:0>"}, true, 0, null, 2), new String[][]{{"getRegion", "int", "2"}, {"clearCachedSource", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("PT2I {getCode=!FileNotFoundException, getName=PT2I, getOriginalPath=PT2I, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:7>", "<sample:5>"}, true), new String[][]{{"getLine", "int", "0"}, {"getLineOffset", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:1>"}, true), new String[][]{{"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "isExtern", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=sample, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"0x023456789", "+.1", "<sample:0>"}, true, 0, null, 2), new String[][]{{"getRegion", "int", "5"}, {"getCode", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.123345r678", "1.12345678901232020-02-30T25:61:61"}, true, 0, null, 1), new String[][]{{"getCode", "", "4"}, {"getName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123345r678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLine", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getOriginalPath", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "clearCachedSource", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=sample, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setOriginalPath", "java.lang.String", "httpT://example.coom/a?b=c1.5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=httpT://example.coom/a?b=c1.5f, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getOriginalPath", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"\u00e9n"}, true, 0, null, 1), new String[][]{{"getOriginalPath", "", "4"}, {"getLineOffset", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"60", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Generated", actual.getClass().getName());
  assertEquals("60 {getCode=0, getName=60, getOriginalPath=60, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"Title", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("Title {getCode=a, getName=Title, getOriginalPath=Title, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"2/;002-30T25:61:61", "00", "<sample:5>"}, true), new String[][]{{"getRegion", "int", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SimpleRegion", actual.getClass().getName());
  assertEquals("{getBeginningLineNumber=1, getEndingLineNumber=3, getSourceExcerpt=a,b\n1,2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"1.25", "<sample:1>"}, true, 0, null, 1), new String[][]{{"clearCachedSource", "", "6"}, {"getCodeReader", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"getCodeReader", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{":/", "<sample:0>"}, true, 0, null, 3), new String[][]{{"isExtern", "", "5"}, {"getName", "", "6"}, {"getRegion", "int", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x12", "2020-02-30T25:61:61"}, true, 0, null, 3), new String[][]{{"getName", "", "7"}, {"getName", "", "2"}, {"getOriginalPath", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"_", "<sample:2>"}, true, 0, null, 1), new String[][]{{"getOriginalPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "isExtern", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"tsue", "<sample:3>"}, true, 0, null, 1), new String[][]{{"getCharset", "", "4"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"0x112356789"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=0x112356789, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLine", "int", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeNoCache", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:1>", "<empty>"}, true, 0, null, 3), new String[][]{{"getLineOffset", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "isExtern", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\u00ea1-0.0", "a,b,c"}, true, 0, null, 1), new String[][]{{"getRegion", "int", "4"}, {"setOriginalPath", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("\u00ea1-0.0 {getCode=a,b,c, getName=\u00ea1-0.0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"C", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("C {getCode=a\r\nb\r\n, getName=C, getOriginalPath=C, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=sample, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"x", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("x {getCode=a\r\nb\r\n, getName=x, getOriginalPath=x, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
}
