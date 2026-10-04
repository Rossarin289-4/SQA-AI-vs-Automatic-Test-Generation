package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "\0371E-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"0xFFFFFiFF", "0"}, true, 0, null, 3), new String[][]{{"getMatchingIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"12:30:4", "0"}, true), new String[][]{{"matchElement", "int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1/5f"}, true), new String[][]{{"matchProperty", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/5f {getMatchingIndex=-1, getMatchingProperty=5f}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"{\"a\":1~", "0"}, true, 0, null, 2), new String[][]{{"getMatchingProperty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("~{\"a\":1~", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"{\"a\":1~"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("{\"a\":1~ {getMatchingIndex=-1, getMatchingProperty=\"a\":1~}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"http://example.com/a?b=c", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getMatchingIndex=-1, getMatchingProperty=~ttp:}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"{\"a\":1~Hello, World", "1"}, true, 0, null, 3), new String[][]{{"getMatchingProperty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("~\"a\":1~Hello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"/5"}, true), new String[][]{{"mayMatchElement", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"{\"a\":1~Hello, 5World"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("{\"a\":1~Hello, 5World {getMatchingIndex=-1, getMatchingProperty=\"a\":1~Hello, 5World}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"u1474883648"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("u1474883648 {getMatchingIndex=1474883648, getMatchingProperty=1474883648}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"28474836468"}, true), new String[][]{{"getMatchingProperty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8474836468", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 2), new String[][]{{"matchElement", "int", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3), new String[][]{{"matchProperty", "java.lang.String", "6"}, {"tail", "", "6"}, {"getMatchingProperty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/5"}, true, 0, null, 1), new String[][]{{"matches", "", "6"}, {"matchElement", "int", "2"}, {"getMatchingIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:6:61\u00e9"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.123456780101.12345678901234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1.123456780101.12345678901234567 {getMatchingIndex=-1, getMatchingProperty=.123456780101.12345678901234567}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"--", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("-- {getMatchingIndex=-1, getMatchingProperty=~--}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"0x1Fnull", "-1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "\0371E-5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"/x1F"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/aa/b"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/aa/b {getMatchingIndex=-1, getMatchingProperty=aa}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "2147479592"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"--H2"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1.123456780101.12345678901234567", "2147483646"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"11"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("11 {getMatchingIndex=1, getMatchingProperty=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"\t", "5"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<s:key>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"2148483648"}, true, 0, null, 2), new String[][]{{"mayMatchProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1-"}, true, 0, null, 3), new String[][]{{"matchElement", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"2147479554"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"aa"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("aa {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"a,b,d"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"125"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"!"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("! {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"", "-55"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"15e300", "-1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"010"}, true, 0, null, 3), new String[][]{{"mayMatchProperty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"\u00ea"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"15f+1"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true, 0, null, 3), new String[][]{{"mayMatchProperty", "", "0"}, {"mayMatchElement", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"a aa,b,c"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"getMatchingIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"1true.5"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"Hello, World", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("Hello, World {getMatchingIndex=-1, getMatchingProperty=~Hello, World}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, true, 0, null, 2), new String[][]{{"matchElement", "int", "5"}, {"mayMatchElement", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"[[1,2]", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1L"}, true, 0, null, 1), new String[][]{{"tail", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1.d", "0"}, true, 0, null, 3), new String[][]{{"matchElement", "int", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"\0371E-5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("\0371E-5 {getMatchingIndex=-1, getMatchingProperty=1E-5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"123456789012335678901234567890"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"6"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("6 {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.5d1.123456789012345671.25"}, true, 0, null, 2), new String[][]{{"matchElement", "int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"5.", "0"}, true, 0, null, 1), new String[][]{{"mayMatchElement", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1.12345678901234567null", "0"}, true, 0, null, 2), new String[][]{{"matchElement", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"0101.12345678901234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:6"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "2147479550"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"true.5", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1PT1H", "27"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"{"}, true), new String[][]{{"matchElement", "int", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"abc"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"-t"}, true), new String[][]{{"mayMatchProperty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"I"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("I {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"true.5", "5"}, true), new String[][]{{"matchProperty", "java.lang.String", "5"}, {"matchElement", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"TTL;E", "1"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("TTL;E {getMatchingIndex=-1, getMatchingProperty=~TL;E}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"a!b", "0"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("a!b {getMatchingIndex=-1, getMatchingProperty=~a!b}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"matchElement", "int", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:0.15>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getMatchingIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"-2"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"true.5abc"}, true), new String[][]{{"tail", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"0", "0"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("0 {getMatchingIndex=-1, getMatchingProperty=~}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"--"}, true), new String[][]{{"mayMatchProperty", "", "0"}, {"getMatchingProperty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"0xGFFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("0xGFFFFFFF {getMatchingIndex=-1, getMatchingProperty=xGFFFFFFF}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"mHello, Worldd"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", ".5c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("Hello, World {getMatchingIndex=-1, getMatchingProperty=ello, World}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.123456789012345672020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1.123456789012345672020-01-01 {getMatchingIndex=-1, getMatchingProperty=.123456789012345672020-01-01}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "1.5l"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"[1-2]", "0"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("[1-2] {getMatchingIndex=-1, getMatchingProperty=~[1-2]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"000xFFFFFFFF"}, true), new String[][]{{"matches", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"matchProperty", "java.lang.String", "1"}, {"mayMatchProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"0x12345789", "5"}, true), new String[][]{{"getMatchingIndex", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"true.5", "2"}, true), new String[][]{{"mayMatchElement", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/5"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/5 {getMatchingIndex=5, getMatchingProperty=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"0101.12345678901234H67", "0"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("0101.12345678901234H67 {getMatchingIndex=-1, getMatchingProperty=~101.12345678901234H67}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"getMatchingProperty", "", "1"}, {"getMatchingIndex", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"2020-11-01", "1"}, true), new String[][]{{"getMatchingProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("~20-11-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"matches", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:C>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "11"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/aa/"}, true), new String[][]{{"mayMatchElement", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/ {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"217483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("217483648 {getMatchingIndex=17483648, getMatchingProperty=17483648}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"-2147483646"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"\n\n"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("\n\n {getMatchingIndex=-1, getMatchingProperty=\n}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"true"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-131072>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"TITE"}, true, 0, null, 2), new String[][]{{"getMatchingProperty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ITE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"matchProperty", "java.lang.String", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/aa/b"}, true), new String[][]{{"matches", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"4"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/aa/b"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/aa/b {getMatchingIndex=-1, getMatchingProperty=aa}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/5 {getMatchingIndex=5, getMatchingProperty=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1E--6"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1E--6 {getMatchingIndex=-1, getMatchingProperty=E--6}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"123456789012345678901234567890", "0"}, true, 0, null, 1), new String[][]{{"getMatchingProperty", "", "4"}, {"matchProperty", "java.lang.String", "6"}, {"mayMatchProperty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true, 0, null, 2), new String[][]{{"tail", "", "7"}, {"mayMatchProperty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"/a/b", "0"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/b {getMatchingIndex=-1, getMatchingProperty=~/a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"C", "0"}, true, 0, null, 1), new String[][]{{"matchElement", "int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/ {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"<a>b</a>1.1234567890123456"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("<a>b</a>1.1234567890123456 {getMatchingIndex=-1, getMatchingProperty=a>b<}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1.1234567 {getMatchingIndex=-1, getMatchingProperty=.1234567}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"\u00e9\u00e9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("\u00e9\u00e9 {getMatchingIndex=-1, getMatchingProperty=\u00e9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"-0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("-0 {getMatchingIndex=0, getMatchingProperty=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"2020-01-0112:30:45"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("2020-01-0112:30:45 {getMatchingIndex=-1, getMatchingProperty=020-01-0112:30:45}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("12:30:45 {getMatchingIndex=-1, getMatchingProperty=2:30:45}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"40"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa {getMatchingIndex=-1, getMatchingProperty=~aaaaaaaaaaaaaaaaaaaaaaaaaaaaa}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{".5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(".5 {getMatchingIndex=5, getMatchingProperty=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"0x?1F"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("0x?1F {getMatchingIndex=-1, getMatchingProperty=x?1F}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 2), new String[][]{{"matches", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"2147483646"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/"}, true, 0, null, 3), new String[][]{{"matchProperty", "java.lang.String", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}, {"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"getMatchingProperty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/o5"}, true, 0, null, 2), new String[][]{{"mayMatchProperty", "", "6"}, {"matchElement", "int", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"getMatchingIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getMatchingProperty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<i:-2047>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"\0371hE-5", "5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("\0371hE-5 {getMatchingIndex=-1, getMatchingProperty=1hE~5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:0.75>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"ii", "1"}, true, 0, null, 3), new String[][]{{"matches", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"+1", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("+1 {getMatchingIndex=-1, getMatchingProperty=/}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1 {getMatchingIndex=-1, getMatchingProperty=/}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a0b"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a0b {getMatchingIndex=-1, getMatchingProperty=a0b}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<s:a>"}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"1073741823"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/10"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/10 {getMatchingIndex=10, getMatchingProperty=10}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1[2:30:45", "1"}, true, 0, null, 3), new String[][]{{"mayMatchProperty", "", "2"}, {"mayMatchProperty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"http://example.com/a?b=c1.1234567890123456", "27"}, true, 0, null, 2), new String[][]{{"mayMatchProperty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"19L", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("19L {getMatchingIndex=-1, getMatchingProperty=/9L}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"\0370E-5"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"\n,1", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("\n,1 {getMatchingIndex=-1, getMatchingProperty=~\n,1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/5H"}, true, 0, null, 3), new String[][]{{"matchProperty", "java.lang.String", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/btrue"}, true), new String[][]{{"getMatchingProperty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"tail", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0101.12345678", "27"}, true, 0, null, 2), new String[][]{{"tail", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"mayMatchElement", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<b:false>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1.12345h6780101.12345678900234567", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1.12345h6780101.12345678900234567 {getMatchingIndex=-1, getMatchingProperty=~.12345h6780101.12345678900234567}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"getMatchingIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"getMatchingIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"matches", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"getMatchingProperty", "", "1"}, {"getMatchingProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/51.12345678"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/51.12345678 {getMatchingIndex=-1, getMatchingProperty=51.12345678}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/5 {getMatchingIndex=5, getMatchingProperty=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3), new String[][]{{"mayMatchProperty", "", "6"}, {"matches", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/aa/b"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/aa/b {getMatchingIndex=-1, getMatchingProperty=aa}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/5<a>b</a>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/5<a>b</a> {getMatchingIndex=-1, getMatchingProperty=5<a>b<}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/5http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"mayMatchElement", "", "4"}, {"getMatchingProperty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5http:", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"getMatchingProperty", "", "5"}, {"mayMatchElement", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/5"}, true, 0, null, 3), new String[][]{{"mayMatchElement", "", "7"}, {"matches", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a\nb"}, true, 0, null, 2), new String[][]{{"mayMatchElement", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"matches", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/51.x5"}, true, 0, null, 2), new String[][]{{"tail", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 2), new String[][]{{"getMatchingProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/aa0b"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/aa0b {getMatchingIndex=-1, getMatchingProperty=aa0b}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/55"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/55 {getMatchingIndex=55, getMatchingProperty=55}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a\na/b"}, true, 0, null, 1), new String[][]{{"mayMatchElement", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/5[1,2]<a>b</a>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/5[1,2]<a>b</a> {getMatchingIndex=-1, getMatchingProperty=5[1,2]<a>b<}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true, 0, null, 2), new String[][]{{"getMatchingProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"a"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 3), new String[][]{{"mayMatchProperty", "", "5"}, {"getMatchingProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/5a b"}, true, 0, null, 3), new String[][]{{"getMatchingProperty", "", "5"}, {"getMatchingProperty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5a b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/51.5d"}, true, 0, null, 3), new String[][]{{"matches", "", "1"}, {"getMatchingProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("51.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"a"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}), new String[][]{{"matchProperty", "java.lang.String", "5"}, {"getMatchingProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/aa/b1.1234567890123456/a/b"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/aa/b1.1234567890123456/a/b {getMatchingIndex=-1, getMatchingProperty=aa}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/5http://example.com/a?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/5http://example.com/a?b=c {getMatchingIndex=-1, getMatchingProperty=5http:}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<i:2>"}}, 1), new String[][]{{"tail", "", "4"}, {"matches", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "1020-01-01"}}, 1), new String[][]{{"mayMatchElement", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"a"}, false, 3, new String[][]{}), new String[][]{{"matches", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/51.1234567890123456"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/51.1234567890123456 {getMatchingIndex=-1, getMatchingProperty=51.1234567890123456}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/aa/b"}, true, 0, null, 1), new String[][]{{"getMatchingIndex", "", "7"}, {"mayMatchProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 3), new String[][]{{"matches", "", "0"}, {"matches", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/6"}, true, 0, null, 1), new String[][]{{"matchElement", "int", "4"}, {"matchElement", "int", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "5"}}, 3), new String[][]{{"mayMatchElement", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true, 0, null, 3), new String[][]{{"mayMatchProperty", "", "5"}, {"getMatchingProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"//5"}, true, 0, null, 2), new String[][]{{"matchElement", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"getMatchingIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/aa/b\0371XE-5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/aa/b\0371XE-5 {getMatchingIndex=-1, getMatchingProperty=aa}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"a"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 2), new String[][]{{"getMatchingProperty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
}
