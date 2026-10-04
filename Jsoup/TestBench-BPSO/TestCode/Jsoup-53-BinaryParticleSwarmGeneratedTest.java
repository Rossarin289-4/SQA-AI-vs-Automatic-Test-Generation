package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWord", ""}, {"org.jsoup.parser.TokenQueue", "peek", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}, {"org.jsoup.parser.TokenQueue", "consume", "java.lang.String", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "http://example.com/a?b=ca b-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http:", String.valueOf(actual));
  assertEquals("receiver state after the call", "//example.com/a?b=ca b-1 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}, {"org.jsoup.parser.TokenQueue", "chompTo", "java.lang.String", "7"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "2020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25", String.valueOf(actual));
  assertEquals("receiver state after the call", ":61:61sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeCssIdentifier", ""}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"h"}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}, {"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", "1.123456789012345671.5f"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{" ", "\t"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "http://example.com/a?b=ca b-1"}, {"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "/example.com/a?b=ca b-1sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"a", "m"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "a"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"\n", "n"}, false, 4, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "\""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"a", "0"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("mple", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "<"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}, {"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWord", ""}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "1.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", ".5 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "2020-02-30T25:61:61"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25", String.valueOf(actual));
  assertEquals("receiver state after the call", ":61:61a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"\"", "l"}, false, 4, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "\""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "advance", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTagName", ""}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "\""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "\" {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"\\1,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"a"}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "|\"a\":1}"}, {"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("|\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "\":1} {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "<"}, {"org.jsoup.parser.TokenQueue", "consume", "java.lang.String", "1E-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"0", "u"}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "\000", "a"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{"http://exalple.com/a?b=c"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesWord", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<sample:4>"}, {"org.jsoup.parser.TokenQueue", "consumeCssIdentifier", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"-0.01"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\na {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeCssIdentifier", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "java.lang.String[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "chompTo", "java.lang.String", "[1,2]12:30:45"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWord", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"A", "+"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{".1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}, {"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "abc0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"4", "B"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchChomp", "java.lang.String", "2047483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"1.124345778"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{"java.lang.String"}, new String[]{"2L"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"1.5e300 "}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "1.5e300 a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", "He"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"T"}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeCssIdentifier", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "T {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"[1,"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"/`/"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"/a/"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"a", "!"}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesWhitespace", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "--1sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"U", "m"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "9"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.1234567890123467"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "matches", "java.lang.String", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"20920-01-01"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "L"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Lsample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWord", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "h"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ha", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{"java.lang.String"}, new String[]{"1.12345678911234671.5d"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "1.1234567890123456 "}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a,b,csample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matches", "java.lang.String", "c"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"1.5eb"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", "http://examptle.com/a?b=cnull"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1.12345678a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"-", "0"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "8"}, {"org.jsoup.parser.TokenQueue", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"010"}, false, 4, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "010a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"11234567890123456"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeCssIdentifier", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "Title2020-02-30T25:61:610x1F"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}, {"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", ">1.12345678901233467"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "bb"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"a 6"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesWhitespace", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a 6a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"1"}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.1234567890123467"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"a/b"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a/ba {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{"java.lang.String"}, new String[]{"/`/b"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "java.lang.String[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"//b"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "//ba {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"T"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Tsample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "A", "A"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"a", "!"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWord", ""}, {"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"r"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "ra {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", "java.lang.String", "Hello, Workd"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"/5"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "p1.1134567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"A", "\uffff"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 4, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "\t01"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2020-01-01 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"1E-4+1"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{"1-5f"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "tque"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"A1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"Uit7e"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Uit7ea {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", ""}, {"org.jsoup.parser.TokenQueue", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "TITLEa {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWord", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"TIT"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTo", new String[]{"java.lang.String"}, new String[]{"I"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeCssIdentifier", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"A-0.07"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"Hello, Work"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\t {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "iiI"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "21L"}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "i"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i21La", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWord", ""}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", ">"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "> {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchChomp", "java.lang.String", "hltp://exalpleHcom/a?b=c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{";a>b</a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(";a>b</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", "t011"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompTo", "java.lang.String", "2020-01-30T25:61:611"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{" "}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"200-01-01"}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesWord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"0"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "1.25PT1H"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "01.25PT1Ha {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"=e10"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesWord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"0", "."}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "java.lang.String[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"i1E-5"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeCssIdentifier", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "12930:45abc"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "12930:45abca {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTo", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"0", "\001"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "/a/H"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a/Ha {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWord", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{"http://exalple.com/a?b=c"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"\000", "h"}, false, 4, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "/`/b"}, {"org.jsoup.parser.TokenQueue", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ba {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "/"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "1.i345678"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"TITLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"\000", "p"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"92"}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "-00"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-000 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"\n "}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", ".`/b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ".`/bsample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "<"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "isEmpty", ""}, {"org.jsoup.parser.TokenQueue", "matches", "java.lang.String", "Hello,, Workd"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "l"}, {"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "1.5e"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", ".5ea {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "[1,2]ITLE"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1,2]ITLEa {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", "b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "PT1HTITLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT1HTITLEa {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "12345678901234567890134567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompTo", "java.lang.String", "a b-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "advance", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "mple {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "\002", "\""}, {"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"a", "\t"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("mple", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"+"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWord", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "\r", "d"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"92"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "matches", "java.lang.String", "+1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{" "}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "http://dxample.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "http://dxample.com/a?b=ca {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"b", "."}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "a"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "isEmpty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "0", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"http://exalple.com/aW?b=c"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompTo", "java.lang.String", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "\t", "0"}, {"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "\000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "\000sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"!", "u"}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "0"}, {"org.jsoup.parser.TokenQueue", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"tb"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "tb {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTo", new String[]{"java.lang.String"}, new String[]{"I"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTo", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"\ufffe", "{"}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWord", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"92"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matches", "java.lang.String", "0123456789012345678901234567890"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "92a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "?"}, {"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "?sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matches", "java.lang.String", "0x12345678C9"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", "java.lang.String", "1.4\u00e9f"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWord", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "\000"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "\000sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", "java.lang.String", "http://exampl.com/a?b=c[1,2]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"/`/b"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"m"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "ma {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesWord", ""}, {"org.jsoup.parser.TokenQueue", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", "java.lang.String", "1.1234567890123456\tPT1H"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "http://exalple.com/a?b=c "}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTagName", ""}, {"org.jsoup.parser.TokenQueue", "matches", "java.lang.String", "1;E.5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"II"}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "remainder", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"H"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"-.5"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "-.5sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesWhitespace", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompTo", "java.lang.String", "/a/"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{"java.lang.String"}, new String[]{"abcTITLE"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "toString", ""}, {"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"abd"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"0", "E"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesWhitespace", ""}, {"org.jsoup.parser.TokenQueue", "matches", "java.lang.String", "1.1345678901234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "java.lang.String[]", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", ".", "\t"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesWhitespace", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "matchChomp", "java.lang.String", "0x1234567899"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"b1E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b1E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "H"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ha", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\tsample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "chompTo", "java.lang.String", "\u00e9"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWord", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "1.13345778901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", ".13345778901234567a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "chompTo", "java.lang.String", "1.1234567890123446"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{",1"}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "\uffff"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\uffffa {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWord", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "advance", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"0", "a"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeCssIdentifier", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "C"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Csample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", "java.lang.String", ".2020-01-01"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "1.5e300true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.5e300truea {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "java.lang.String[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"i"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "isample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
