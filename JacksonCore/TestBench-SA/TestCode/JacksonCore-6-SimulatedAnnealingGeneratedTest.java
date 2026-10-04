package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"24\t"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("24\t {getMatchingIndex=-1, getMatchingProperty=4\t}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<i:1>"}, {"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-2147483648"}, {"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "5."}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"0x123456789", "0"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("0x123456789 {getMatchingIndex=-1, getMatchingProperty=~x123456789}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1e10", "0"}, true), new String[][]{{"tail", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/10"}, true, 0, null, 1), new String[][]{{"mayMatchElement", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"0\""}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("0\" {getMatchingIndex=-1, getMatchingProperty=\"}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/0"}, true), new String[][]{{"matchProperty", "java.lang.String", "6"}, {"getMatchingProperty", "", "7"}, {"matchProperty", "java.lang.String", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"<:"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-1"}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1.12;456667999/123e4561.123456780true,", "0"}, true), new String[][]{{"matches", "", "4"}, {"getMatchingIndex", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/10http://example-com/a?b=c[ b"}, true, 0, null, 2), new String[][]{{"mayMatchProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2), new String[][]{{"matchProperty", "java.lang.String", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3), new String[][]{{"matchProperty", "java.lang.String", "1"}, {"matches", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/2147183647"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/2147183647 {getMatchingIndex=2147183647, getMatchingProperty=2147183647}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"-1"}, true), new String[][]{{"matchElement", "int", "3"}, {"matchProperty", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"/2471836474"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/2471836474 {getMatchingIndex=-1, getMatchingProperty=2471836474}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"{a\":1~"}, true), new String[][]{{"matchElement", "int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"{a\":1~a,b,c"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("{a\":1~a,b,c {getMatchingIndex=-1, getMatchingProperty=a\":1~a,b,c}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"{a\":1~a,b,c", "1"}, true), new String[][]{{"mayMatchElement", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"{a\":1~", "0"}, true), new String[][]{{"matchElement", "int", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1.5 {getMatchingIndex=-1, getMatchingProperty=.5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1.4 {getMatchingIndex=-1, getMatchingProperty=.4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"2/4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("2/4 {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"24"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("24 {getMatchingIndex=4, getMatchingProperty=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-2147483648"}, {"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "5."}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-2147483648"}, {"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "5."}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<i:1>"}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "5."}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}, {"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}, {"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}, {"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}, {"com.fasterxml.jackson.core.JsonPointer", "toString", ""}, {"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}, {"com.fasterxml.jackson.core.JsonPointer", "toString", ""}, {"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}, {"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1L1.1234567899012356", "-2"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1K1.12345678991225\r0\u00e9", "10"}, true, 0, null, 3), new String[][]{{"matchProperty", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"2K1.12345678991225\r0", "1048596"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 1), new String[][]{{"getMatchingProperty", "", "2"}, {"getMatchingProperty", "", "2"}, {"mayMatchElement", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/="}, true, 0, null, 1), new String[][]{{"matchProperty", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/= {getMatchingIndex=-1, getMatchingProperty==}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/b/="}, true, 0, null, 1), new String[][]{{"matchProperty", "java.lang.String", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/b/="}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/b/= {getMatchingIndex=-1, getMatchingProperty=b}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{".b/="}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"//b="}, true, 0, null, 1), new String[][]{{"tail", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/b= {getMatchingIndex=-1, getMatchingProperty=b=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/0b="}, true, 0, null, 1), new String[][]{{"tail", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"h."}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 25, new String[][]{}, 2), new String[][]{{"tail", "", "5"}, {"matches", "", "6"}, {"mayMatchElement", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 26, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 2), new String[][]{{"tail", "", "5"}, {"matches", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 3), new String[][]{{"mayMatchProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "/a/b"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "a"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3), new String[][]{{"mayMatchProperty", "", "5"}, {"mayMatchProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "[1,2]"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "[1,2]"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "[1,2]"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("Hello, World {getMatchingIndex=-1, getMatchingProperty=ello, World}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61 {getMatchingIndex=-1, getMatchingProperty=020-02-30T25:61:61}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"aa>b</a>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("aa>b</a> {getMatchingIndex=-1, getMatchingProperty=a>b<}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.5"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1.5 {getMatchingIndex=-1, getMatchingProperty=.5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"24"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("24 {getMatchingIndex=4, getMatchingProperty=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"24\t"}, true), new String[][]{{"mayMatchProperty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"\""}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"1L"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}), new String[][]{{"tail", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}), new String[][]{{"tail", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"--1", "0"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("--1 {getMatchingIndex=-1, getMatchingProperty=~--1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"--2", "0"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("--2 {getMatchingIndex=-1, getMatchingProperty=~--2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1L", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1K1.12345678991225\r0\u00e9", "10"}, true), new String[][]{{"matchProperty", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"2K1.12345678991225\r0", "10"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("2K1.12345678991225\r0 {getMatchingIndex=-1, getMatchingProperty=K1.12345~78991225\r0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"\u00e9", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"\u00e9\u00e9", "1"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("\u00e9\u00e9 {getMatchingIndex=-1, getMatchingProperty=~\u00e9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"\u00e9\u00e9", "1"}, true), new String[][]{{"getMatchingIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"matchProperty", "java.lang.String", "2"}, {"getMatchingProperty", "", "2"}, {"getMatchingIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}), new String[][]{{"matchProperty", "java.lang.String", "2"}, {"getMatchingProperty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true), new String[][]{{"matchProperty", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/b {getMatchingIndex=-1, getMatchingProperty=b}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/="}, true), new String[][]{{"matchProperty", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/= {getMatchingIndex=-1, getMatchingProperty==}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}, {"com.fasterxml.jackson.core.JsonPointer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 19, new String[][]{}), new String[][]{{"tail", "", "5"}, {"matches", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 25, new String[][]{}), new String[][]{{"tail", "", "5"}, {"matches", "", "6"}, {"mayMatchElement", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"-"}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "2020-0c-30T25:61:61\t"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"aa>b</a><a>b</a>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("aa>b</a><a>b</a> {getMatchingIndex=-1, getMatchingProperty=a>b<}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1E-5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1E-5 {getMatchingIndex=-1, getMatchingProperty=E-5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/b {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"12345678901234567890123456789/1K1.12345678991225\r0\u00e9"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("Hello, World {getMatchingIndex=-1, getMatchingProperty=ello, World}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true), new String[][]{{"matches", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"Henlo, World"}, true, 0, null, 3), new String[][]{{"matches", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"\n", "10"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"\n1K1.12345678991225\r0\u00e9", "10"}, true, 0, null, 1), new String[][]{{"matchProperty", "java.lang.String", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"mayMatchElement", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/10http://example.com/a?b=ca b"}, true, 0, null, 1), new String[][]{{"matches", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"-536346582"}, false, 15, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"12"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("Hello, World {getMatchingIndex=-1, getMatchingProperty=ello, World}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"Hello, Wor]ld"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("Hello, Wor]ld {getMatchingIndex=-1, getMatchingProperty=ello, Wor]ld}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"Hello, Wor]ld<a>b</a>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("Hello, Wor]ld<a>b</a> {getMatchingIndex=-1, getMatchingProperty=ello, Wor]ld<a>b<}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"Hello, Wor]ld<a>b</a>-0.0"}, true, 0, null, 2), new String[][]{{"getMatchingProperty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ello, Wor]ld<a>b<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true, 0, null, 2), new String[][]{{"getMatchingProperty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/10"}, true), new String[][]{{"matchProperty", "java.lang.String", "5"}, {"matchElement", "int", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/0"}, true), new String[][]{{"matchProperty", "java.lang.String", "5"}, {"matchElement", "int", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"-1", "0"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("-1 {getMatchingIndex=-1, getMatchingProperty=~-1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{" "}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("  {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{""}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"\""}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("\" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"."}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(". {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"X"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("X {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"X"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("X {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"1.-234567880122355567"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-34"}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1K1.12345678991225\r0\u00e9", "0"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1K1.12345678991225\r0\u00e9 {getMatchingIndex=-1, getMatchingProperty=/K1.12345678991225\r0\u00e9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"111.12345628991225\r0\u00e9", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("111.12345628991225\r0\u00e9 {getMatchingIndex=-1, getMatchingProperty=/11.12345628991225\r0\u00e9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1.12345678", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1.12345678 {getMatchingIndex=-1, getMatchingProperty=/.12345678}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"112345678", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("112345678 {getMatchingIndex=-1, getMatchingProperty=/12345678}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"\u00e924\t", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("\u00e924\t {getMatchingIndex=-1, getMatchingProperty=~\u00e924\t}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"I", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("I {getMatchingIndex=-1, getMatchingProperty=~I}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"I", "-8"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"1.12345678H"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"1.123456X78H"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matches", ""}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true), new String[][]{{"getMatchingProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/`/=bA"}, true), new String[][]{{"getMatchingProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/`.=bA"}, true), new String[][]{{"getMatchingProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`.=bA", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/`.=bA"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/`.=bA {getMatchingIndex=-1, getMatchingProperty=`.=bA}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:4>"}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"Helo, [Wo1ld1\"b:f:1C1.5f"}, false, 9, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"mayMatchElement", "", "2"}, {"matches", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 2), new String[][]{{"getMatchingIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 2), new String[][]{{"getMatchingProperty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"getMatchingIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"getMatchingIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/0"}, true), new String[][]{{"matches", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/0"}, true, 0, null, 2), new String[][]{{"matches", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3), new String[][]{{"tail", "", "5"}, {"matchProperty", "java.lang.String", "4"}, {"tail", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/4"}, true), new String[][]{{"getMatchingProperty", "", "5"}, {"matchProperty", "java.lang.String", "4"}, {"getMatchingProperty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/4123456789012345678901234567890"}, true), new String[][]{{"getMatchingProperty", "", "5"}, {"matchProperty", "java.lang.String", "4"}, {"getMatchingProperty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:Tcm>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/10"}, true, 0, null, 2), new String[][]{{"tail", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"tail", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1-25", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1-25 {getMatchingIndex=-1, getMatchingProperty=~-25}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1-25", "-1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-15"}, {"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"1/1234467890123456"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-15"}, {"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"1/123446779012345D"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-15"}, {"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true, 0, null, 2), new String[][]{{"mayMatchProperty", "", "4"}, {"getMatchingProperty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:aaa\">"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"1"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<s:b>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"1073741823"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<s:b>"}, {"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<sample:1>"}, {"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "<null>"}}, 3), new String[][]{{"getMatchingProperty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<sample:1>"}, {"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"matchProperty", "java.lang.String", "5"}, {"getMatchingProperty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"matches", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"\u00e9", "2147483646"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1e10", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1e10 {getMatchingIndex=-1, getMatchingProperty=/e10}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"d\nCbee-1.5"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "toString", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "1.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/W"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/W {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/W2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/W2147483648 {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/W2147473648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/W2147473648 {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/W2B147473648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/W2B147473648 {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-1"}, {"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1E-5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1E-5 {getMatchingIndex=-1, getMatchingProperty=E-5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"9["}, true, 0, null, 3), new String[][]{{"matches", "", "5"}, {"mayMatchElement", "", "2"}, {"getMatchingProperty", "", "4"}, {"matchElement", "int", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"0\""}, true, 0, null, 3), new String[][]{{"getMatchingProperty", "", "0"}, {"tail", "", "0"}, {"mayMatchProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"0I"}, true, 0, null, 3), new String[][]{{"getMatchingProperty", "", "0"}, {"tail", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"///i;10it3tp://exam\rlpe.com/a?b=d\u00e9 b+e10"}, true, 0, null, 3), new String[][]{{"mayMatchProperty", "", "5"}, {"mayMatchElement", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"///i;10it3p://exam\rlpe.com/a?b=d\u00e9 b+e10true"}, true, 0, null, 3), new String[][]{{"mayMatchProperty", "", "5"}, {"mayMatchElement", "", "6"}, {"matchElement", "int", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 1), new String[][]{{"getMatchingProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"matchElement", "int", "6"}, {"mayMatchElement", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true, 0, null, 2), new String[][]{{"mayMatchElement", "", "3"}, {"getMatchingIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{" q2", "1"}, true, 0, null, 2), new String[][]{{"tail", "", "1"}, {"getMatchingIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{" q2", "1"}, true, 0, null, 2), new String[][]{{"tail", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"2.26\u00e9", "1"}, true, 0, null, 2), new String[][]{{"matches", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"0xFFFEFFFF", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("0xFFFEFFFF {getMatchingIndex=-1, getMatchingProperty=~xFFFEFFFF}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"0lFFFEFFFF", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("0lFFFEFFFF {getMatchingIndex=-1, getMatchingProperty=~lFFFEFFFF}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3), new String[][]{{"mayMatchElement", "", "1"}, {"matches", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("[1,2] {getMatchingIndex=-1, getMatchingProperty=1,2]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1.1234567890123456 {getMatchingIndex=-1, getMatchingProperty=.1234567890123456}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/10hftpL/example.com/a?b<caa aHello, World"}, true, 0, null, 1), new String[][]{{"getMatchingIndex", "", "3"}, {"matchProperty", "java.lang.String", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/ {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/W"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/W {getMatchingIndex=-1, getMatchingProperty=W}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"2030-2-30U25:61:61"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"49"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"-2147418112"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 1), new String[][]{{"getMatchingIndex", "", "1"}, {"matches", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1.12345678", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1.12345678 {getMatchingIndex=-1, getMatchingProperty=~.12345678}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"getMatchingIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"-32871"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 3), new String[][]{{"matchProperty", "java.lang.String", "1"}, {"getMatchingIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"mayMatchElement", "", "7"}, {"tail", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"a"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true, 0, null, 1), new String[][]{{"getMatchingProperty", "", "5"}, {"getMatchingProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/10 {getMatchingIndex=10, getMatchingProperty=10}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"2e10H\\1,X2]", "1"}, true, 0, null, 3), new String[][]{{"getMatchingProperty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("~e10H\\1,X2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"2020-01-01", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("2020-01-01 {getMatchingIndex=-1, getMatchingProperty=~2020-01-01}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"2020-:1-01", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("2020-:1-01 {getMatchingIndex=-1, getMatchingProperty=~2020-:1-01}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-1"}}, 3), new String[][]{{"mayMatchElement", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
}
