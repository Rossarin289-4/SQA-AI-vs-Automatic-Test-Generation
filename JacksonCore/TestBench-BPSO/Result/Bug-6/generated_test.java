package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}, {"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"i"}, true), new String[][]{{"tail", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"\\1,2]"}, true), new String[][]{{"mayMatchProperty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"http://example.com/a?b=c", "8"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getMatchingIndex=-1, getMatchingProperty=ttp://~xample.com}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"-0.0", "1"}, true), new String[][]{{"matches", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"P "}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("P  {getMatchingIndex=-1, getMatchingProperty= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"2147483547"}, true), new String[][]{{"mayMatchElement", "", "6"}, {"getMatchingProperty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("147483547", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"21474837471"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("21474837471 {getMatchingIndex=1474837471, getMatchingProperty=1474837471}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3), new String[][]{{"tail", "", "5"}, {"matchProperty", "java.lang.String", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"<null>"}, true), new String[][]{{"mayMatchProperty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"h0"}, true), new String[][]{{"matchElement", "int", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"{\"a\":1~"}, true, 0, null, 3), new String[][]{{"matchElement", "int", "1"}, {"mayMatchElement", "", "4"}, {"tail", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"{\"a\":1~1.12345667", "0"}, true), new String[][]{{"matchElement", "int", "4"}, {"matchElement", "int", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"12474837471"}, true, 0, null, 1), new String[][]{{"mayMatchProperty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"{\"a\":1~5."}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("{\"a\":1~5. {getMatchingIndex=-1, getMatchingProperty=\"a\":1~5.}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"{\"a\":1~", "1"}, true), new String[][]{{"mayMatchElement", "", "5"}, {"mayMatchElement", "", "1"}, {"matchProperty", "java.lang.String", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/7a/a-1true"}, true, 0, null, 3), new String[][]{{"mayMatchProperty", "", "3"}, {"matchProperty", "java.lang.String", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"a"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-2147483648"}}), new String[][]{{"matches", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"--10xFFFFFFFF"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "0xFFFFFFFFF-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"\n"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("\n {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"2e80"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"[2,1]"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"TITLE", "1"}, true, 0, null, 2), new String[][]{{"getMatchingProperty", "", "6"}, {"mayMatchElement", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"\n..", "-1073741824"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"//a-1"}, true, 0, null, 3), new String[][]{{"getMatchingProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"I+1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("I+1 {getMatchingIndex=-1, getMatchingProperty=+1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "Hellxo, World"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1E-c", "2147483646"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-8388609"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"#"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"18"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{" 12:30:450xFFFFFFFF", "62"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"5", "-262134"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/b;"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/b; {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1e10", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1.5e3001L", "66"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"I"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("I {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("true {getMatchingIndex=-1, getMatchingProperty=rue}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<d:-1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1.1234567", "2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1.1234567 {getMatchingIndex=-1, getMatchingProperty=/234567}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"Z1,]", "0"}, true, 0, null, 1), new String[][]{{"tail", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"0x12 456789"}, true, 0, null, 1), new String[][]{{"getMatchingProperty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x12 456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"trse"}, true, 0, null, 1), new String[][]{{"mayMatchElement", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0"}, true, 0, null, 2), new String[][]{{"tail", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1.5", "0"}, true, 0, null, 3), new String[][]{{"mayMatchElement", "", "6"}, {"mayMatchProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true, 0, null, 1), new String[][]{{"matchElement", "int", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<i:-2147483648>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2), new String[][]{{"mayMatchElement", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "10"}, true, 0, null, 1), new String[][]{{"mayMatchElement", "", "6"}, {"matchElement", "int", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1.5 {getMatchingIndex=-1, getMatchingProperty=.5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"-0.01.1234567", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("-0.01.1234567 {getMatchingIndex=-1, getMatchingProperty=~.01.1234567}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"getMatchingIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "ab7c"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}, {"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"21474837471", "10"}, true, 0, null, 1), new String[][]{{"getMatchingIndex", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"true", "0"}, true, 0, null, 2), new String[][]{{"matches", "", "3"}, {"matchElement", "int", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "\ri"}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/a-1"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/a-1 {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "0"}, {"com.fasterxml.jackson.core.JsonPointer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"--1", "0"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("--1 {getMatchingIndex=-1, getMatchingProperty=~--1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1.234I678", "-1073741823"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"[<a>b</a>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("[<a>b</a> {getMatchingIndex=-1, getMatchingProperty=<a>b<}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "Sitle"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true), new String[][]{{"mayMatchElement", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"--1", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1M"}, true), new String[][]{{"getMatchingIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a}>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"--11"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"10"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1.11034567", "1"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1.11034567 {getMatchingIndex=-1, getMatchingProperty=~.11034567}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1+25", "1"}, true), new String[][]{{"getMatchingIndex", "", "6"}, {"mayMatchProperty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{".5", "0"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(".5 {getMatchingIndex=-1, getMatchingProperty=~.5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1E-51.d", "2"}, true), new String[][]{{"matches", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "2147483647"}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("12:30:45 {getMatchingIndex=-1, getMatchingProperty=2:30:45}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"mayMatchElement", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{""}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<b:false>"}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true), new String[][]{{"getMatchingIndex", "", "5"}, {"mayMatchElement", "", "4"}, {"mayMatchElement", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1F255."}, true), new String[][]{{"getMatchingProperty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F255.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"matches", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"0xFFFF"}, true), new String[][]{{"getMatchingProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("xFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"5.-"}, true), new String[][]{{"matches", "", "3"}, {"matchProperty", "java.lang.String", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2020-01-01 {getMatchingIndex=-1, getMatchingProperty=aaaaaaaaaaaaaaaaaaaaaaaaaaaaa2020-01-01}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"0xFFFEFFFF/a/a-1"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/b {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"getMatchingIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"1.12345678901234567", "16"}, true), new String[][]{{"matchElement", "int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"getMatchingProperty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "8020-01-01"}}), new String[][]{{"getMatchingProperty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{".5"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(".5 {getMatchingIndex=5, getMatchingProperty=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"2147483547"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("2147483547 {getMatchingIndex=147483547, getMatchingProperty=147483547}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/a-1"}, true), new String[][]{{"mayMatchProperty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"<null>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/bb"}, true), new String[][]{{"mayMatchElement", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"PT1H", "1"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("PT1H {getMatchingIndex=-1, getMatchingProperty=~T1H}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/a-"}, true), new String[][]{{"tail", "", "3"}, {"getMatchingProperty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"mayMatchElement", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"mayMatchProperty", "", "5"}, {"getMatchingIndex", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"214748647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("214748647 {getMatchingIndex=14748647, getMatchingProperty=14748647}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}, {"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"/\010", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/\010 {getMatchingIndex=-1, getMatchingProperty=~/\010}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1.1234567 {getMatchingIndex=-1, getMatchingProperty=.1234567}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"1/a/b-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("1/a/b-1 {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"tail", "", "2"}, {"tail", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true), new String[][]{{"tail", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/b {getMatchingIndex=-1, getMatchingProperty=b}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-268435456"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"12:30"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"18"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}, {"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<i:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "8388567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, true, 0, null, 1), new String[][]{{"mayMatchProperty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"TITLE.a/b"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"202001-01I"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("202001-01I {getMatchingIndex=-1, getMatchingProperty=02001-01I}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}, {"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"0x1F", "1"}, true, 0, null, 1), new String[][]{{"mayMatchProperty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa1L", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa1L {getMatchingIndex=-1, getMatchingProperty=~aaaaaaaaaaaaaaaaaaaaaaaaaaaaa1L}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "1L"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"\""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("\" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"TITLE[1,2]"}, true, 0, null, 1), new String[][]{{"getMatchingProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ITLE[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}, {"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}, {"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 3), new String[][]{{"mayMatchProperty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"--11.12345678"}, true, 0, null, 2), new String[][]{{"getMatchingIndex", "", "1"}, {"getMatchingIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true, 0, null, 3), new String[][]{{"matchProperty", "java.lang.String", "3"}, {"matches", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"<a>b</a>", "0"}, true, 0, null, 2), new String[][]{{"mayMatchElement", "", "4"}, {"getMatchingIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"{\"a\":1}aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "10"}, true, 0, null, 3), new String[][]{{"getMatchingProperty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"a\":1}aa~aaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"10"}, true), new String[][]{{"matches", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"\t"}, true), new String[][]{{"mayMatchElement", "", "4"}, {"matchProperty", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"-12020-02-30T25:61:61"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("-12020-02-30T25:61:61 {getMatchingIndex=-1, getMatchingProperty=12020-02-30T25:61:61}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"iF"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"I", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("I {getMatchingIndex=-1, getMatchingProperty=~I}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"-1.51.5f"}, true, 0, null, 3), new String[][]{{"matchElement", "int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/a-1"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/a-1 {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true), new String[][]{{"mayMatchElement", "", "1"}, {"getMatchingIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 1), new String[][]{{"mayMatchProperty", "", "4"}, {"getMatchingProperty", "", "7"}, {"mayMatchProperty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"Hello, World10", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("Hello, World10 {getMatchingIndex=-1, getMatchingProperty=~Hello, World10}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"a"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/b {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"<a>b</a>1.5", "0"}, true, 0, null, 3), new String[][]{{"matches", "", "4"}, {"tail", "", "7"}, {"getMatchingIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "X"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "4"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:[a>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/b-1"}, true), new String[][]{{"matchElement", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"12"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:0.701>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "equals", "java.lang.Object", "<d:0.97>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "70"}}, 3), new String[][]{{"mayMatchElement", "", "1"}, {"getMatchingProperty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"I1E-5"}, true, 0, null, 2), new String[][]{{"matchProperty", "java.lang.String", "3"}, {"tail", "", "5"}, {"matches", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "2"}, true, 0, null, 3), new String[][]{{"mayMatchElement", "", "5"}, {"matches", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "tail", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseTail", new String[]{"java.lang.String"}, new String[]{"+"}, true, 0, null, 2), new String[][]{{"mayMatchProperty", "", "5"}, {"tail", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"mayMatchElement", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"tail", "", "5"}, {"getMatchingIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "_parseQuotedTail", new String[]{"java.lang.String", "int"}, new String[]{"/a/a-1", "5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/a-1 {getMatchingIndex=-1, getMatchingProperty=a/a/}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1), new String[][]{{"getMatchingProperty", "", "4"}, {"getMatchingIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3), new String[][]{{"mayMatchElement", "", "5"}, {"mayMatchElement", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matches", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"36"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matches", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"mayMatchProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/baaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 1), new String[][]{{"tail", "", "3"}, {"getMatchingProperty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("baaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 2), new String[][]{{"matchProperty", "java.lang.String", "5"}, {"matchElement", "int", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/a"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/a {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a"}, true, 0, null, 1), new String[][]{{"mayMatchProperty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchElement", new String[]{"int"}, new String[]{"268435458"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"tail", "", "1"}, {"matchElement", "int", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchProperty", "java.lang.String", "2147583657"}}, 2), new String[][]{{"getMatchingProperty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/a-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/a-1 {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/a-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/a-1 {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "matchElement", "int", "18"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/b {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/a-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 1), new String[][]{{"getMatchingProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"mayMatchElement", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3), new String[][]{{"matches", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/`/a-1"}, true, 0, null, 3), new String[][]{{"tail", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a-1 {getMatchingIndex=-1, getMatchingProperty=a-1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/a-1-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/a-1-1 {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchProperty", ""}}, 2), new String[][]{{"mayMatchElement", "", "5"}, {"mayMatchElement", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a.a-1"}, true, 0, null, 1), new String[][]{{"mayMatchProperty", "", "1"}, {"matches", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}}, 2), new String[][]{{"mayMatchProperty", "", "4"}, {"mayMatchProperty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getMatchingIndex=-1, getMatchingProperty=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/a-1"}, true, 0, null, 1), new String[][]{{"tail", "", "3"}, {"tail", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/a/a-1-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/a-1-1 {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/b<a>b</a>"}, true, 0, null, 1), new String[][]{{"mayMatchProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"mayMatchElement", "", "0"}, {"getMatchingProperty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/Fa/a-2"}, true, 0, null, 2), new String[][]{{"matchProperty", "java.lang.String", "0"}, {"mayMatchProperty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "compile", new String[]{"java.lang.String"}, new String[]{"/|/b"}, true, 0, null, 2), new String[][]{{"matches", "", "3"}, {"matches", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "hashCode", ""}}, 3), new String[][]{{"getMatchingIndex", "", "1"}, {"getMatchingIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/0a/a-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/0a/a-1 {getMatchingIndex=-1, getMatchingProperty=0a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "tail", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "mayMatchElement", ""}, {"com.fasterxml.jackson.core.JsonPointer", "getMatchingProperty", ""}}, 1), new String[][]{{"mayMatchElement", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a5/a-01"}, true, 0, null, 3), new String[][]{{"matches", "", "2"}, {"getMatchingProperty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/aa-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/aa-1 {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/`/a-1"}, true, 0, null, 1), new String[][]{{"getMatchingIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/`.b"}, true, 0, null, 3), new String[][]{{"matches", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "matchProperty", new String[]{"java.lang.String"}, new String[]{"a"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonPointer", "getMatchingIndex", ""}}, 2), new String[][]{{"getMatchingProperty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/a"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/a {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2), new String[][]{{"getMatchingProperty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/{a/a-1/a/b"}, true, 0, null, 3), new String[][]{{"mayMatchElement", "", "3"}, {"tail", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a-1/a/b {getMatchingIndex=-1, getMatchingProperty=a-1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonPointer", "com.fasterxml.jackson.core.JsonPointer", "valueOf", new String[]{"java.lang.String"}, new String[]{"/a/ba"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals("/a/ba {getMatchingIndex=-1, getMatchingProperty=a}", SearchInputFactory_scaffolding.observe(actual));
 }
}
