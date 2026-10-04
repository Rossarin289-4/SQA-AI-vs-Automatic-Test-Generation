package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<null>"}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"matchElement", "int", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "1.25/"}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 3), new String[][]{{"mayMatchElement", "", "6"}, {"mayMatchElement", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"21747483648"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("21747483648 {getMatchingIndex=1747483648, getMatchingProperty=1747483648}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"http://example.com/a?b=c", "0"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getMatchingIndex=-1, getMatchingProperty=~http:}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/\n"}, true, 0, null, 1), new String[][]{{"matchProperty", "java.lang.String", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"<null>"}, true), new String[][]{{"mayMatchElement", "", "3"}, {"getMatchingIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"2147483647"}, true, 0, null, 1), new String[][]{{"mayMatchElement", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1.25", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1.25 {getMatchingIndex=-1, getMatchingProperty=/.25}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"2020-02-30T25:61:61", "1"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61 {getMatchingIndex=-1, getMatchingProperty=~20-02-30T25:61:61}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"I2147483648"}, true), new String[][]{{"mayMatchElement", "", "1"}, {"tail", "", "6"}, {"matches", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"{\"a\":1~"}, true), new String[][]{{"matchElement", "int", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{".1"}, true), new String[][]{{"matchElement", "int", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"{\"a\":1~", "1"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("{\"a\":1~ {getMatchingIndex=-1, getMatchingProperty=~\"a\":1~}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"{b\"51~~"}, true), new String[][]{{"mayMatchProperty", "", "1"}, {"mayMatchElement", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"{b\"51~~", "0"}, true), new String[][]{{"getMatchingProperty", "", "0"}, {"mayMatchProperty", "", "2"}, {"matchElement", "int", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"a"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<sample:4>"}}), new String[][]{{"matchProperty", "java.lang.String", "6"}, {"getMatchingProperty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"I"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.5"}, true, 0, null, 1), new String[][]{{"getMatchingIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"n..55"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("n..55 {getMatchingIndex=-1, getMatchingProperty=..55}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"n..5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("n..5 {getMatchingIndex=-1, getMatchingProperty=..5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 2), new String[][]{{"matches", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"2147483646"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"bb"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "t"}, {"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<i:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}, {"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}, {"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"0x133456788"}, true, 0, null, 3), new String[][]{{"matchElement", "int", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"[a"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("[a {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"[a"}, true, 0, null, 2), new String[][]{{"matches", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"[["}, true, 0, null, 3), new String[][]{{"matches", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"[Z"}, true, 0, null, 3), new String[][]{{"mayMatchProperty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"P611.5di"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"I=", "1"}, true, 0, null, 1), new String[][]{{"mayMatchElement", "", "7"}, {"tail", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"1.1234567b8901234567-1.5"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "1.25"}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 3), new String[][]{{"mayMatchElement", "", "6"}, {"mayMatchElement", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 1), new String[][]{{"mayMatchProperty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 1), new String[][]{{"mayMatchProperty", "", "4"}, {"getMatchingIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"14:4"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "\t"}, {"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "2147483648"}, {"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "2147483647"}}, 2), new String[][]{{"matchProperty", "java.lang.String", "5"}, {"getMatchingIndex", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"5.\t"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("5.\t {getMatchingIndex=-1, getMatchingProperty=.\t}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"5-\tPT1H"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("5-\tPT1H {getMatchingIndex=-1, getMatchingProperty=-\tPT1H}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"l-\tPT1H"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("l-\tPT1H {getMatchingIndex=-1, getMatchingProperty=-\tPT1H}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"5-\tPT1H"}, true, 0, null, 2), new String[][]{{"getMatchingIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"-188"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"<a>bb</a>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("<a>bb</a> {getMatchingIndex=-1, getMatchingProperty=a>bb<}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"<a>bb<a>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("<a>bb<a> {getMatchingIndex=-1, getMatchingProperty=a>bb<a>}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"<a?bb<a>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("<a?bb<a> {getMatchingIndex=-1, getMatchingProperty=a?bb<a>}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"<a?bb<a>"}, true, 0, null, 1), new String[][]{{"matches", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "a b"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"-1"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"\nh"}, true, 0, null, 3), new String[][]{{"getMatchingProperty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("h", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true, 0, null, 3), new String[][]{{"getMatchingProperty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"i", "0"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("i {getMatchingIndex=-1, getMatchingProperty=~i}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"i ", "-67108864"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("true {getMatchingIndex=-1, getMatchingProperty=rue}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{""}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}, {"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"Title", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"1E-5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}), new String[][]{{"matchElement", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true), new String[][]{{"mayMatchElement", "", "4"}, {"mayMatchElement", "", "1"}, {"matchProperty", "java.lang.String", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1.12345678 {getMatchingIndex=-1, getMatchingProperty=.12345678}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.123345678"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1.123345678 {getMatchingIndex=-1, getMatchingProperty=.123345678}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.123345678"}, true), new String[][]{{"getMatchingProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".123345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.123345688"}, true), new String[][]{{"getMatchingProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".123345688", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true), new String[][]{{"getMatchingProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ttp:", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"htp://examole.com/ah?b=c0xFFFFFFFF"}, true), new String[][]{{"getMatchingProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("tp:", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1e10"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1e10 {getMatchingIndex=-1, getMatchingProperty=e10}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"Xe10"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("Xe10 {getMatchingIndex=-1, getMatchingProperty=e10}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"Be10"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("Be10 {getMatchingIndex=-1, getMatchingProperty=e10}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}), new String[][]{{"matches", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"2147483646"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"1"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "i"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true), new String[][]{{"mayMatchProperty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:D\t>"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"I=", "1"}, true), new String[][]{{"mayMatchElement", "", "7"}, {"tail", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}), new String[][]{{"mayMatchElement", "", "2"}, {"mayMatchElement", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"2147483647", "0"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("2147483647 {getMatchingIndex=-1, getMatchingProperty=~2147483647}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"21474836472147483647", "0"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("21474836472147483647 {getMatchingIndex=-1, getMatchingProperty=~21474836472147483647}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"2147483647null", "0"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("2147483647null {getMatchingIndex=-1, getMatchingProperty=~2147483647null}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.12345678911234567"}, true, 0, null, 3), new String[][]{{"getMatchingProperty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".12345678911234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.22345678911234557"}, true, 0, null, 3), new String[][]{{"getMatchingProperty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".22345678911234557", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matches", ""}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}, {"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}, {"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true), new String[][]{{"matchElement", "int", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"2020-01-01", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"/a8/b"}, true, 0, null, 2), new String[][]{{"matchElement", "int", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}), new String[][]{{"matches", "", "7"}, {"getMatchingProperty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("0 {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true), new String[][]{{"tail", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/b {getMatchingIndex=-1, getMatchingProperty=b}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/F"}, true), new String[][]{{"tail", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/F {getMatchingIndex=-1, getMatchingProperty=F}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"//Fd"}, true), new String[][]{{"tail", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/Fd {getMatchingIndex=-1, getMatchingProperty=Fd}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"///F"}, true), new String[][]{{"tail", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("//F {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"tque", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1//1.123455678D01234567a", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1//1.123455678D01234567a", "-1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-536870882>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 27, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 29, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true, 0, null, 2), new String[][]{{"tail", "", "3"}, {"mayMatchProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "1.1234567\t"}, {"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "Titme"}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 3), new String[][]{{"tail", "", "6"}, {"getMatchingIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "10"}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s: >"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"getMatchingIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"aa"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"1234567890123456789012345678901.123456789012345p7"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 19, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"{"}, true), new String[][]{{"matchProperty", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a,\r0,c"}, true, 0, null, 3), new String[][]{{"getMatchingProperty", "", "6"}, {"getMatchingIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"http://example.com/a?b=c", "0"}, true), new String[][]{{"mayMatchProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/ {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"mayMatchProperty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"Hello, World", "0"}, true, 0, null, 2), new String[][]{{"tail", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"\"", "1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"\"\"", "2147483646"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"mayMatchElement", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/b {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1.H25", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1.H25 {getMatchingIndex=-1, getMatchingProperty=/.H25}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1.H25", "58"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1/H15", "1"}, true, 0, null, 1), new String[][]{{"matches", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:57>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"Title", "1"}, true), new String[][]{{"getMatchingIndex", "", "5"}, {"matchProperty", "java.lang.String", "3"}, {"getMatchingIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"matches", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"Hello, World", "10"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("Hello, World {getMatchingIndex=-1, getMatchingProperty=ello, Wo~ld}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{" "}, false, 11, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matches", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"2020-02-30S25:61:61", "1"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("2020-02-30S25:61:61 {getMatchingIndex=-1, getMatchingProperty=~20-02-30S25:61:61}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 3), new String[][]{{"matches", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"a,b,c", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("a,b,c {getMatchingIndex=-1, getMatchingProperty=~a,b,c}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1B\u00e947-8n3648", "3"}, true, 0, null, 2), new String[][]{{"getMatchingProperty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("B~47-8n3648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/5d"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/5d {getMatchingIndex=-1, getMatchingProperty=5d}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-1073741824"}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"{\"a\":1}", "1"}, true, 0, null, 2), new String[][]{{"mayMatchProperty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-2050"}, {"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "a,b,ctrue"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"getMatchingProperty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"getMatchingProperty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"tail", "", "1"}, {"tail", "", "0"}, {"matchElement", "int", "2"}, {"getMatchingProperty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1), new String[][]{{"matches", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"matches", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"\t", "0"}, true, 0, null, 1), new String[][]{{"getMatchingIndex", "", "3"}, {"getMatchingIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1234567890123456789012345678t:90", "0"}, true, 0, null, 3), new String[][]{{"matches", "", "2"}, {"tail", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/p7"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/p7 {getMatchingIndex=-1, getMatchingProperty=p7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/p7"}, true), new String[][]{{"getMatchingProperty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("p7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"getMatchingProperty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/ {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"2147483648", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("2147483648 {getMatchingIndex=-1, getMatchingProperty=/47483648}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"214783648", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("214783648 {getMatchingIndex=-1, getMatchingProperty=/4783648}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/b {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:k\\]>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"{"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/b {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/a"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/a {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"-1", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("-1 {getMatchingIndex=-1, getMatchingProperty=/}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"k1", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("k1 {getMatchingIndex=-1, getMatchingProperty=/}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"-2147483635"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/b {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/2/b"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/2/b {getMatchingIndex=2, getMatchingProperty=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"-1073741823"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-2147483648"}, {"com.fasterxml.jackson.core.JsonPointer", "toString", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-2147483648"}}), new String[][]{{"getMatchingIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"Titld", "1"}, true, 0, null, 3), new String[][]{{"getMatchingIndex", "", "5"}, {"matchProperty", "java.lang.String", "7"}, {"getMatchingIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"mayMatchProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"matchProperty", "java.lang.String", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"getMatchingProperty", "", "6"}, {"getMatchingProperty", "", "5"}, {"mayMatchElement", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"0x1F", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("0x1F {getMatchingIndex=-1, getMatchingProperty=~x1F}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"0y1F", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("0y1F {getMatchingIndex=-1, getMatchingProperty=~y1F}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"getMatchingIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"matchProperty", "java.lang.String", "5"}, {"mayMatchProperty", "", "1"}, {"getMatchingIndex", "", "0"}, {"getMatchingProperty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"matchProperty", "java.lang.String", "5"}, {"mayMatchProperty", "", "1"}, {"getMatchingIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"0I122345a\n779", "10"}, true, 0, null, 3), new String[][]{{"matchElement", "int", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"a"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"31.5d", "0"}, true, 0, null, 3), new String[][]{{"getMatchingProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("~31.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 3), new String[][]{{"matchProperty", "java.lang.String", "7"}, {"mayMatchElement", "", "5"}, {"getMatchingIndex", "", "3"}, {"getMatchingProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"2147483646"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3), new String[][]{{"getMatchingProperty", "", "1"}, {"getMatchingProperty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 1), new String[][]{{"matches", "", "5"}, {"mayMatchElement", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3), new String[][]{{"matchProperty", "java.lang.String", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"matches", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}, {"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<i:1>"}, {"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 1), new String[][]{{"matches", "", "3"}, {"getMatchingProperty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/itq:10 "}, true, 0, null, 2), new String[][]{{"matches", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 2), new String[][]{{"mayMatchElement", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/ba"}, true, 0, null, 1), new String[][]{{"getMatchingProperty", "", "2"}, {"matchProperty", "java.lang.String", "3"}, {"matchElement", "int", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3), new String[][]{{"tail", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true, 0, null, 3), new String[][]{{"getMatchingProperty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/b {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"getMatchingProperty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"a"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "{"}}, 3), new String[][]{{"matches", "", "4"}, {"getMatchingIndex", "", "2"}, {"mayMatchProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
}
