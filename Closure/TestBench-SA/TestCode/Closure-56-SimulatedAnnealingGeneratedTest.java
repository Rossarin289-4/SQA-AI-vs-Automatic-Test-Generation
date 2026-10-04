package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeReader", ""}, {"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}, {"com.google.javascript.jscomp.SourceFile", "getOriginalPath", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"\u00e9\u00e9", "<sample:0>"}, true, 0, null, 3), new String[][]{{"isExtern", "", "1"}, {"getLine", "int", "4"}, {"clearCachedSource", "", "3"}, {"getRegion", "int", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"135", "<sample:3>"}, true), new String[][]{{"getLine", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b\r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"2", "<sample:2>"}, true, 0, null, 2), new String[][]{{"getLine", "int", "5"}, {"getCodeReader", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"<null>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"0xFFFFFFFF", "<null>"}, true, 0, null, 3), new String[][]{{"clearCachedSource", "", "6"}, {"isExtern", "", "2"}, {"isExtern", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.SourceFile", "isExtern", ""}, {"com.google.javascript.jscomp.SourceFile", "getLine", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=!FileNotFoundException, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 8, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLineOffset", "int", "-2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=!FileNotFoundException, getName=<a><b>t</b></a>, getOriginalPath=1.5e300, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getRegion", new String[]{"int"}, new String[]{"-2147483647"}, false, 12, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SimpleRegion", actual.getClass().getName());
  assertEquals("{getBeginningLineNumber=2147483647, getEndingLineNumber=2147483647, getSourceExcerpt=b}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a\nb, getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getRegion", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}, {"com.google.javascript.jscomp.SourceFile", "toString", ""}, {"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"11.5f", "<null>"}, true, 0, null, 2), new String[][]{{"getLineOffset", "int", "3"}, {"getOriginalPath", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"1}", "<sample:5>"}, true), new String[][]{{"getOriginalPath", "", "0"}, {"getRegion", "int", "1"}, {"getBeginningLineNumber", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{" ", "<sample:4>"}, true), new String[][]{{"getCode", "", "5"}, {"getName", "", "3"}, {"getLine", "int", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"o202>-\r1.30T5:61:610"}, false, 12, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeReader", ""}, {"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}, {"com.google.javascript.jscomp.SourceFile", "getLineOffset", "int", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a\nb, getName=<a><b>t</b></a>, getOriginalPath=o202>-\r1.30T5:61:610, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:1>"}, true), new String[][]{{"getCodeReader", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.io.FileReader", actual.getClass().getName());
  assertEquals("{getEncoding=UTF8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getName", new String[]{}, new String[]{}, false, 31, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLineOffset", "int", "47"}, {"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}, {"com.google.javascript.jscomp.SourceFile", "setIsExtern", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:5>", "<empty>"}, true), new String[][]{{"getLine", "int", "1"}, {"getCodeReader", "", "7"}, {"reset", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"false"}, false, 8, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=!FileNotFoundException, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"true"}, false, 8, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=!FileNotFoundException, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeReader", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeReader", ""}, {"com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeReader", ""}, {"com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"1E-5", "<sample:0>"}, true, 0, null, 3), new String[][]{{"getCodeReader", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"getOriginalPath", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"getOriginalPath", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"getOriginalPath", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLine", new String[]{"int"}, new String[]{"1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLine", new String[]{"int"}, new String[]{"-19"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}, {"com.google.javascript.jscomp.SourceFile", "setIsExtern", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}, {"com.google.javascript.jscomp.SourceFile", "setIsExtern", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=!FileNotFoundException, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"null", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("null {getCode=, getName=null, getOriginalPath=null, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:6\t11:611E-5", "-0].0", "Bitkf"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("2020-02-30T25:6\t11:611E-5 {getCode=Bitkf, getName=2020-02-30T25:6\t11:611E-5, getOriginalPath=-0].0, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?b=c", "-\n.0", "[1,2010"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getCode=[1,2010, getName=http://example.com/a?b=c, getOriginalPath=-\n.0, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"E1", "-\n.0", "[1,2010"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("E1 {getCode=[1,2010, getName=E1, getOriginalPath=-\n.0, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"E1", "-\n.0", "[1,2000"}, true, 0, null, 1), new String[][]{{"getLineOffset", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/a/sample {getCode=, getName=/a/sample, getOriginalPath=/a/sample, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<empty>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/a {getCode=!FileNotFoundException, getName=/a, getOriginalPath=/a, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeReader", ""}, {"com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=sample, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeReader", ""}, {"com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeReader", ""}, {"com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeReader", ""}, {"com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeReader", ""}, {"com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" x \t y ", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"", "\n", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getRegion", new String[]{"int"}, new String[]{"32800"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLine", "int", "-2147479552"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "isExtern", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"\u00e9\u00e9", "<sample:0>"}, true, 0, null, 3), new String[][]{{"isExtern", "", "1"}, {"getLine", "int", "4"}, {"clearCachedSource", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("\u00e9\u00e9 {getCode=, getName=\u00e9\u00e9, getOriginalPath=\u00e9\u00e9, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"\u00e9\u00e9", "<sample:1>"}, true, 0, null, 3), new String[][]{{"isExtern", "", "1"}, {"getLine", "int", "4"}, {"clearCachedSource", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("\u00e9\u00e9 {getCode=a, getName=\u00e9\u00e9, getOriginalPath=\u00e9\u00e9, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"\u00e9\u00ea", "<sample:0>"}, true, 0, null, 3), new String[][]{{"isExtern", "", "1"}, {"getLine", "int", "4"}, {"clearCachedSource", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("\u00e9\u00ea {getCode=, getName=\u00e9\u00ea, getOriginalPath=\u00e9\u00ea, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"1", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeReader", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getOriginalPath", ""}, {"com.google.javascript.jscomp.SourceFile", "getRegion", "int", "1"}, {"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeReader", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getRegion", "int", "1"}, {"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeReader", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getRegion", "int", "1"}, {"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeReader", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getRegion", "int", "1"}, {"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeReader", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getRegion", "int", "2"}, {"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeReader", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getRegion", "int", "4"}, {"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeReader", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getRegion", "int", "4"}, {"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a\nb, getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeReader", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getRegion", "int", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a\nb, getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeReader", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3), new String[][]{{"read", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeReader", new String[]{}, new String[]{}, false, 22, new String[][]{}, 3), new String[][]{{"read", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"2135", "<sample:3>"}, true, 0, null, 2), new String[][]{{"getLine", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b\r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"2135", "<sample:3>"}, true, 0, null, 2), new String[][]{{"getLine", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"21=5", "<empty>"}, true, 0, null, 2), new String[][]{{"getLine", "int", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"21=5", "<empty>"}, true, 0, null, 2), new String[][]{{"getLine", "int", "5"}, {"getCodeReader", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"2", "<sample:2>"}, true, 0, null, 2), new String[][]{{"getLine", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"isExtern", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"isExtern", "", "7"}, {"getCharset", "", "2"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLine", new String[]{"int"}, new String[]{"-1073741846"}, false, 15, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"/\rIa/b", "1,2]", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("/\rIa/b {getCode=, getName=/\rIa/b, getOriginalPath=1,2], isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"/\rIa/b\n", "1,2F]", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("/\rIa/b\n {getCode=a\r\nb\r\n, getName=/\rIa/b\n, getOriginalPath=1,2F], isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"/\rIa.b\n", "1,2F]", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("/\rIa.b\n {getCode=a\r\nb\r\n, getName=/\rIa.b\n, getOriginalPath=1,2F], isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"/\rIa.b\n", "2,2F]", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"/\rIa.\n\n", "2,2F]", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("/\rIa.\n\n {getCode=, getName=/\rIa.\n\n, getOriginalPath=2,2F], isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"/\rI.\n\n", "2,2F]", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("/\rI.\n\n {getCode=, getName=/\rI.\n\n, getOriginalPath=2,2F], isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"/\rI..\013\n", "2,2F]", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("/\rI..\013\n {getCode=, getName=/\rI..\013\n, getOriginalPath=2,2F], isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"2020-02-30T25:61:61", "2,2F]", "<sample:3>"}, true, 0, null, 3), new String[][]{{"getLine", "int", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"setOriginalPath", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/a/sample {getCode=, getName=/a/sample, getOriginalPath=, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getNumLines", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.SourceFile", "isExtern", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getNumLines", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.SourceFile", "isExtern", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getNumLines", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.SourceFile", "isExtern", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getNumLines", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "isExtern", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"setOriginalPath", "java.lang.String", "1"}, {"getCodeReader", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a\nb, getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"1.5f", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("1.5f {getCode=a, getName=1.5f, getOriginalPath=1.5f, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getNumLines", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "clearCachedSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}, {"com.google.javascript.jscomp.SourceFile", "getCodeReader", ""}, {"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeReader", ""}, {"com.google.javascript.jscomp.SourceFile", "getOriginalPath", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeReader", ""}, {"com.google.javascript.jscomp.SourceFile", "getOriginalPath", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeReader", ""}, {"com.google.javascript.jscomp.SourceFile", "getOriginalPath", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"1E-5", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("1E-5 {getCode=!FileNotFoundException, getName=1E-5, getOriginalPath=1E-5, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"1E-5", "<sample:0>"}, true), new String[][]{{"getCodeReader", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/a {getCode=!FileNotFoundException, getName=/a, getOriginalPath=/a, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, true), new String[][]{{"getOriginalPath", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:0>"}, true), new String[][]{{"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:1>"}, true), new String[][]{{"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:0>"}, true), new String[][]{{"setCharset", "java.nio.charset.Charset", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:5>"}, true), new String[][]{{"setCharset", "java.nio.charset.Charset", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/a/sample {getCode=, getName=/a/sample, getOriginalPath=/a/sample, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getRegion", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeReader", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", "1.1234567", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"p", "1.1234567", "0+"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("p {getCode=0+, getName=p, getOriginalPath=1.1234567, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"p", "1..1234567 ", "010http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("p {getCode=010http://example.com/a?b=c, getName=p, getOriginalPath=1..1234567 , isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"p", "1..1234567 ", "010http://example.com/a?b=c"}, true), new String[][]{{"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("p", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"pa", "1..123", "010htto://example.com/a?b=c"}, true), new String[][]{{"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("pa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"\u00e9", "1..123", "010htto://example.com/a?b=c"}, true), new String[][]{{"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"-0.0", "-1", "010tto://example.com/a?b=c"}, true), new String[][]{{"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"D-0.0", "-1", "010tto://example.com/a?b=c"}, true), new String[][]{{"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("D-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"+1", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("+1 {getCode=a, getName=+1, getOriginalPath=+1, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"+1", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("+1 {getCode=a\nb, getName=+1, getOriginalPath=+1, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"+1", "<sample:2>"}, true), new String[][]{{"getLineOffset", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"E1", "<sample:1>"}, true), new String[][]{{"getLineOffset", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"E1", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("E1 {getCode=a, getName=E1, getOriginalPath=E1, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"E1", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("E1 {getCode=a\r\nb\r\n, getName=E1, getOriginalPath=E1, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"E0", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("E0 {getCode=a\r\nb\r\n, getName=E0, getOriginalPath=E0, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"E0", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("E0 {getCode=a,b\n1,2\n, getName=E0, getOriginalPath=E0, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"E0", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("E0 {getCode=a\rb, getName=E0, getOriginalPath=E0, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"E/", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("E/ {getCode=a\rb, getName=E/, getOriginalPath=E/, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"E/", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("E/ {getCode=a,b\n1,2\n, getName=E/, getOriginalPath=E/, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=sample, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getRegion", new String[]{"int"}, new String[]{"-1"}, false, 2, new String[][]{{"com.google.javascript.jscomp.SourceFile", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:5>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/a/sample {getCode=, getName=/a/sample, getOriginalPath=/a/sample, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:5>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/a/sample {getCode=, getName=/a/sample, getOriginalPath=/a/sample, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:6>", "<sample:0>"}, true), new String[][]{{"setOriginalPath", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/a {getCode=!FileNotFoundException, getName=/a, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<null>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"I", "1.5d"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("I {getCode=1.5d, getName=I, getOriginalPath=I, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeReader", ""}, {"com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=sample, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "clearCachedSource", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "clearCachedSource", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=sample, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "clearCachedSource", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "clearCachedSource", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getOriginalPath", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "clearCachedSource", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getOriginalPath", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a\nb, getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=sample, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"", "-1", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getRegion", new String[]{"int"}, new String[]{"32"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"1L", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Generated", actual.getClass().getName());
  assertEquals("1L {getCode=!NullPointerException, getName=1L, getOriginalPath=1L, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" x \t y ", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "isExtern", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "isExtern", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "isExtern", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getOriginalPath", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getOriginalPath", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getOriginalPath", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a\nb, getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getOriginalPath", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getOriginalPath", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromReader", new String[]{"java.lang.String", "java.io.Reader"}, new String[]{"Hello, World", "<sample:0>"}, true), new String[][]{{"isExtern", "", "1"}, {"getLine", "int", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getOriginalPath", ""}, {"com.google.javascript.jscomp.SourceFile", "getRegion", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeReader", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getOriginalPath", ""}, {"com.google.javascript.jscomp.SourceFile", "getRegion", "int", "1"}, {"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"1.25", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"1.35", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("1.35 {getCode=, getName=1.35, getOriginalPath=1.35, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"135", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("135 {getCode=, getName=135, getOriginalPath=135, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"135", "<empty>"}, true), new String[][]{{"getLine", "int", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:1>"}, true), new String[][]{{"getLineOffset", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, true), new String[][]{{"getLineOffset", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:4>"}, true), new String[][]{{"isExtern", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"null"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=null, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"nnull"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=nnull, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"nnull1.25"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=nnull1.25, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"nnull1.251"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=nnull1.251, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=/a/b, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Title", "PT1H"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("Title {getCode=PT1H, getName=Title, getOriginalPath=Title, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Tiule", "PT1H"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("Tiule {getCode=PT1H, getName=Tiule, getOriginalPath=Tiule, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Titke", "PT1I"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("Titke {getCode=PT1I, getName=Titke, getOriginalPath=Titke, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Titke", "[PT1I"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("Titke {getCode=[PT1I, getName=Titke, getOriginalPath=Titke, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Tiuke", "[PT1"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("Tiuke {getCode=[PT1, getName=Tiuke, getOriginalPath=Tiuke, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"iuke", "[PT1"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("iuke {getCode=[PT1, getName=iuke, getOriginalPath=iuke, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"iue", "[PTT1"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("iue {getCode=[PTT1, getName=iue, getOriginalPath=iue, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLine", new String[]{"int"}, new String[]{"2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLine", new String[]{"int"}, new String[]{"4"}, false, 15, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"/a/b", "2147483648", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"/\rIa/b", "[1,2]", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("/\rIa/b {getCode=, getName=/\rIa/b, getOriginalPath=[1,2], isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setIsExtern", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setIsExtern", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"1.25", "<sample:2>"}, true), new String[][]{{"getName", "", "1"}, {"isExtern", "", "3"}, {"isExtern", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"http://example.com/a?b=c", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Generated", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getCode=sample, getName=http://example.com/a?b=c, getOriginalPath=http://example.com/a?b=c, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"-1.5", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Generated", actual.getClass().getName());
  assertEquals("-1.5 {getCode=sample, getName=-1.5, getOriginalPath=-1.5, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"-1.5", "<sample:7>"}, true), new String[][]{{"getCodeReader", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getNumLines", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}, {"com.google.javascript.jscomp.SourceFile", "isExtern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getNumLines", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "isExtern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getNumLines", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.SourceFile", "isExtern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "isExtern", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setOriginalPath", "java.lang.String", "<a>b</a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=<a>b</a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "isExtern", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setOriginalPath", "java.lang.String", "<a>bX</a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=<a>bX</a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"5", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("5 {getCode=a\r\nb\r\n, getName=5, getOriginalPath=5, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"5", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("5 {getCode=a\nb, getName=5, getOriginalPath=5, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"5", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("5 {getCode=, getName=5, getOriginalPath=5, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.io.InputStream"}, new String[]{"51K", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("51K {getCode=, getName=51K, getOriginalPath=51K, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=!FileNotFoundException, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"1", "<sample:4>"}, true), new String[][]{{"clearCachedSource", "", "6"}, {"isExtern", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"1.5", "<sample:3>"}, true), new String[][]{{"clearCachedSource", "", "6"}, {"isExtern", "", "2"}, {"getName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"1L", "1", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"a", "1", "<sample:2>"}, true), new String[][]{{"getLine", "int", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLineOffset", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLineOffset", new String[]{"int"}, new String[]{"2147483589"}, false, 14, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLine", "int", "-19"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.SourceFile", "isExtern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode= x \t y , getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.SourceFile", "isExtern", ""}, {"com.google.javascript.jscomp.SourceFile", "getLine", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.SourceFile", "isExtern", ""}, {"com.google.javascript.jscomp.SourceFile", "getLine", "int", "5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a\nb, getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.SourceFile", "isExtern", ""}, {"com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", ""}, {"com.google.javascript.jscomp.SourceFile", "getLine", "int", "5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{".5"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals(".5 {getCode=!FileNotFoundException, getName=.5, getOriginalPath=.5, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"/5"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/5 {getCode=, getName=/5, getOriginalPath=/5, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"/50x123456789"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/50x123456789 {getCode=!FileNotFoundException, getName=/50x123456789, getOriginalPath=/50x123456789, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"/50x12345p"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/50x12345p {getCode=!FileNotFoundException, getName=/50x12345p, getOriginalPath=/50x12345p, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"/50x2345p"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/50x2345p {getCode=!FileNotFoundException, getName=/50x2345p, getOriginalPath=/50x2345p, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"--1"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("--1 {getCode=!FileNotFoundException, getName=--1, getOriginalPath=--1, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"--1"}, true), new String[][]{{"getCodeReader", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"0xFFFFFFFF", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("0xFFFFFFFF {getCode=a, getName=0xFFFFFFFF, getOriginalPath=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"0xF1FFFFFFF", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("0xF1FFFFFFF {getCode=a, getName=0xF1FFFFFFF, getOriginalPath=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"0xG1FFFFFFF", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("0xG1FFFFFFF {getCode=a, getName=0xG1FFFFFFF, getOriginalPath=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"0xG11FFFFFFF", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("0xG11FFFFFFF {getCode=, getName=0xG11FFFFFFF, getOriginalPath=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("123456789012345678901234567890 {getCode=!FileNotFoundException, getName=123456789012345678901234567890, getOriginalPath=123456789012345678901234567890, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLine", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=sample, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLine", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLine", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", new String[]{}, new String[]{}, false, 18, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"1.25", "1.12345678", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("1.25 {getCode=, getName=1.25, getOriginalPath=1.12345678, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"1t25", "1.123456708", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("1t25 {getCode=, getName=1t25, getOriginalPath=1.123456708, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"1t251E-5", "1.123456708", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", actual.getClass().getName());
  assertEquals("1t251E-5 {getCode=, getName=1t251E-5, getOriginalPath=1.123456708, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"1t251E-5", "1.12", "<sample:1>"}, true, 0, null, 2), new String[][]{{"getOriginalPath", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"1t251E-5", "1-12", "<sample:3>"}, true, 0, null, 2), new String[][]{{"getOriginalPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"1ot251E-5", "1-12\n", "<sample:3>"}, true, 0, null, 2), new String[][]{{"getOriginalPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-12\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromInputStream", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"1ot251E-5", "1-22\n", "<sample:6>"}, true, 0, null, 2), new String[][]{{"getOriginalPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-22\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"1.12345678", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Generated", actual.getClass().getName());
  assertEquals("1.12345678 {getCode=a, getName=1.12345678, getOriginalPath=1.12345678, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"1.1234567-8", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$Generated", actual.getClass().getName());
  assertEquals("1.1234567-8 {getCode=a, getName=1.1234567-8, getOriginalPath=1.1234567-8, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"Iaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaa"}, false, 8, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLineOffset", "int", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=!FileNotFoundException, getName=<a><b>t</b></a>, getOriginalPath=Iaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaa, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 8, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLineOffset", "int", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=!FileNotFoundException, getName=<a><b>t</b></a>, getOriginalPath=1.5e300, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"1.5et00"}, false, 8, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLineOffset", "int", "-2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=!FileNotFoundException, getName=<a><b>t</b></a>, getOriginalPath=1.5et00, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setOriginalPath", new String[]{"java.lang.String"}, new String[]{"1.5et0"}, false, 8, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=!FileNotFoundException, getName=<a><b>t</b></a>, getOriginalPath=1.5et0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeNoCache", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeNoCache", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeNoCache", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setIsExtern", "boolean", "true"}, {"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeNoCache", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setIsExtern", "boolean", "true"}, {"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=sample, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeNoCache", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setIsExtern", "boolean", "true"}, {"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}, {"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setOriginalPath", "java.lang.String", "1.1234567890123456"}, {"com.google.javascript.jscomp.SourceFile", "getLineOffset", "int", "-2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=1.1234567890123456, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setOriginalPath", "java.lang.String", "1.1234567890123456"}, {"com.google.javascript.jscomp.SourceFile", "getLineOffset", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=1.1234567890123456, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"true"}, false, 13, new String[][]{{"com.google.javascript.jscomp.SourceFile", "setIsExtern", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"false"}, false, 13, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"true"}, false, 15, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "setIsExtern", new String[]{"boolean"}, new String[]{"false"}, false, 15, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/a {getCode=!FileNotFoundException, getName=/a, getOriginalPath=/a, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("/a/sample {getCode=, getName=/a/sample, getOriginalPath=/a/sample, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File"}, new String[]{"<sample:8>"}, true, 0, null, 3), new String[][]{{"getOriginalPath", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getRegion", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:3>", "<null>"}, true), new String[][]{{"setOriginalPath", "java.lang.String", "5"}, {"getRegion", "int", "3"}, {"isExtern", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:3>", "<sample:3>"}, true), new String[][]{{"getCode", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"getCode", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"getCode", "", "5"}, {"getLine", "int", "3"}, {"isExtern", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "isExtern", ""}, {"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.SourceFile", "isExtern", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.SourceFile", "isExtern", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=sample, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceFile", "isExtern", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCode", ""}, {"com.google.javascript.jscomp.SourceFile", "isExtern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\nb", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a\nb, getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCode", ""}, {"com.google.javascript.jscomp.SourceFile", "isExtern", ""}, {"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCode", ""}, {"com.google.javascript.jscomp.SourceFile", "isExtern", ""}, {"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getRegion", new String[]{"int"}, new String[]{"2147483647"}, false, 12, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a\nb, getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getRegion", new String[]{"int"}, new String[]{"2147483647"}, false, 10, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}, {"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeNoCache", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLineOffset", "int", "2"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCodeNoCache", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getLineOffset", "int", "2"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCode=null, getName=0, getOriginalPath=0, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLineOffset", new String[]{"int"}, new String[]{"2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getRegion", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "hasSourceInMemory", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getOriginalPath", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {getCode=null, getName=sample, getOriginalPath=sample, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getOriginalPath", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode={\"a\":1}, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getLine", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getCode", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getCodeNoCache", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\nb", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=a\nb, getName=<a><b>t</b></a>, getOriginalPath={\"a\":1}, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"1", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("1 {getCode=!FileNotFoundException, getName=1, getOriginalPath=1, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"11.5f", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("11.5f {getCode=!FileNotFoundException, getName=11.5f, getOriginalPath=11.5f, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"11.5f", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("11.5f {getCode=!FileNotFoundException, getName=11.5f, getOriginalPath=11.5f, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCode=null, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"11.5f", "<sample:3>"}, true, 0, null, 2), new String[][]{{"getLineOffset", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"11.5f", "<sample:2>"}, true), new String[][]{{"getLineOffset", "int", "3"}, {"getOriginalPath", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"11.5", "<sample:2>"}, true), new String[][]{{"getLineOffset", "int", "3"}, {"getOriginalPath", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"1L", "<sample:5>"}, true), new String[][]{{"getLineOffset", "int", "3"}, {"getOriginalPath", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"L", "<sample:2>"}, true), new String[][]{{"getLineOffset", "int", "3"}, {"getOriginalPath", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"TITLE", "<sample:4>"}, true), new String[][]{{"getLine", "int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromGenerator", new String[]{"java.lang.String", "com.google.javascript.jscomp.SourceFile$Generator"}, new String[]{"TITLl", "<sample:3>"}, true), new String[][]{{"getLine", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getRegion", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"com.google.javascript.jscomp.SourceFile", "getNumLines", ""}, {"com.google.javascript.jscomp.SourceFile", "toString", ""}, {"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCode=!FileNotFoundException, getName=a, getOriginalPath=a, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "getRegion", new String[]{"int"}, new String[]{"2147483647"}, false, 8, new String[][]{{"com.google.javascript.jscomp.SourceFile", "clearCachedSource", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a><b>t</b></a> {getCode=!FileNotFoundException, getName=<a><b>t</b></a>, getOriginalPath=<a><b>t</b></a>, isExtern=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "fromFile", new String[]{"java.lang.String", "java.nio.charset.Charset"}, new String[]{"1.12345677", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", actual.getClass().getName());
  assertEquals("1.12345677 {getCode=!FileNotFoundException, getName=1.12345677, getOriginalPath=1.12345677, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
 }
}
