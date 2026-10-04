package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "a"}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", ":30:45a0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 34, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWord", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}, {"org.jsoup.parser.TokenQueue", "consume", "java.lang.String", ",1.5"}, {"org.jsoup.parser.TokenQueue", "matchesAny", "java.lang.String[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "d", "5"}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "_"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_ample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "s", "m"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ple", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1."}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "921 591 "}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "/", "0"}, {"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 591 sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1L2.5C2{2\n;++1\n"}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "0xP1i:"}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "5", "a"}, {"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"x"}, false, 10, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "20-224=46.7m"}, {"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "I", "E"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("46.7msample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", "java.lang.String", "1L"}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"xa/b"}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:4>"}, {"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "Title"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"5\\xP0j"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5xP0j", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"\\\\"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "1.e3"}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "L", "i"}, {"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".e3a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"L"}, false, 10, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", "java.lang.String", ""}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "d", "5"}, {"org.jsoup.parser.TokenQueue", "isEmpty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("amp", String.valueOf(actual));
  assertEquals("receiver state after the call", "e {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"0", "\u00e9"}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "0"}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "00PP1xix8-1[1,2\\"}, {"org.jsoup.parser.TokenQueue", "matchesWord", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0PP1xix8-1[1,2\\0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"0", "\u00e8"}, false, 14, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "0FR^LJML{\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FR^LJML{\"a\":1}sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}, {"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "hsp://ex;allpple.com/a?b=cnull"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("hsp:", String.valueOf(actual));
  assertEquals("receiver state after the call", "//ex;allpple.com/a?b=cnull {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}, {"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", "BB"}, {"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "<"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "<"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "matches", "java.lang.String", "1.25"}, {"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.TokenQueue", "matches", "java.lang.String", "1.35"}, {"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "matches", "java.lang.String", "1.35"}, {"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:1>"}, {"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "/a/b"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "/a/b"}, {"org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", "java.lang.String", "-1.5"}, {"org.jsoup.parser.TokenQueue", "consume", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"0x1"}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTagName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"0x1i"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"0x}1i"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"0xP1i:"}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "--1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "--1 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"0xP1i:"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "--1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "--1sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<empty>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"p", "B"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"6", " "}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"6", " "}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTo", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTo", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}, {"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "010"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}, {"org.jsoup.parser.TokenQueue", "peek", ""}, {"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"http:0/example.com/a?b=c"}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:4>"}, {"org.jsoup.parser.TokenQueue", "matchChomp", "java.lang.String", "http://example.com/a?b=c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"http:0/example.com/a?b=c"}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:4>"}, {"org.jsoup.parser.TokenQueue", "peek", ""}, {"org.jsoup.parser.TokenQueue", "matchChomp", "java.lang.String", "http://example.com/a?b=c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"214483648"}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:4>"}, {"org.jsoup.parser.TokenQueue", "peek", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWord", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "chompTo", "java.lang.String", "{\"a\":1}"}, {"org.jsoup.parser.TokenQueue", "advance", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWord", ""}, {"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"X"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "java.lang.String[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"/"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "java.lang.String[]", "<empty>"}, {"org.jsoup.parser.TokenQueue", "chompTo", "java.lang.String", "1e10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesWord", ""}, {"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "-1.5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", "java.lang.String", "1.5e300"}, {"org.jsoup.parser.TokenQueue", "matchesWord", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", "java.lang.String", "1.5e300"}, {"org.jsoup.parser.TokenQueue", "matchesWord", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", "java.lang.String", "1.5e300"}, {"org.jsoup.parser.TokenQueue", "matchesWord", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "6", "a"}, {"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"3\n/..eb"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"3\013\n/-.ebmf,11http://example/com/b?b=c"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"2147383648"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", " "}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1EE-5"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "1.5f"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{"java.lang.String"}, new String[]{"1E-"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "mple {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"a", "{"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.parser.TokenQueue", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.parser.TokenQueue", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.parser.TokenQueue", "isEmpty", ""}, {"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"{.;FbA"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"`"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "`a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"\000"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}, {"org.jsoup.parser.TokenQueue", "matchesAny", "java.lang.String[]", "<sample:0>"}, {"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\000 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "advance", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "/a/b"}, {"org.jsoup.parser.TokenQueue", "consume", "java.lang.String", "1.5e300"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "/a/b"}, {"org.jsoup.parser.TokenQueue", "consume", "java.lang.String", "1.e300"}, {"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "/a/b"}, {"org.jsoup.parser.TokenQueue", "consume", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", "java.lang.String", "\u00e9"}, {"org.jsoup.parser.TokenQueue", "consume", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "\n/..b"}, {"org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", "java.lang.String", "-1.5"}, {"org.jsoup.parser.TokenQueue", "matchesWord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTagName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"0x1i:"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "--1sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"00/a/b"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "--1"}, {"org.jsoup.parser.TokenQueue", "toString", ""}, {"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "--1sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"00/Pa"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", ".-1"}, {"org.jsoup.parser.TokenQueue", "toString", ""}, {"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ".-1sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"\uffff", "\uffff"}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"o", "o"}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "mple {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"G", "5"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTo", new String[]{"java.lang.String"}, new String[]{"1e10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTo", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", "1.5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTo", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTo", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}, {"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"+1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "advance", ""}, {"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "0xP1i:"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"[1,2]00/a/b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]00/a/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"["}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"\000"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\000a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"\uffff"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\uffffa {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"A"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Aa {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"B"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Ba {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"X"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Xa {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "advance", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "peek", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWord", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWord", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWord", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWord", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1L"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompBalanced", new String[]{"char", "char"}, new String[]{"a", "0"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "1L"}, {"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"``"}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "remainder", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWord", ""}, {"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "peek", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}, {"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "consume", ""}, {"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", "+1"}, {"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"0xPc1i9"}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", "00/a/b"}, {"org.jsoup.parser.TokenQueue", "matchesWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"l"}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "matchChomp", "java.lang.String", "2020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("samp", String.valueOf(actual));
  assertEquals("receiver state after the call", "e {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matches", new String[]{"java.lang.String"}, new String[]{"1.eed30true0"}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}, {"org.jsoup.parser.TokenQueue", "matches", "java.lang.String", "1020-01-01"}, {"org.jsoup.parser.TokenQueue", "consumeCssIdentifier", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTagName", ""}, {"org.jsoup.parser.TokenQueue", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}, {"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "1.5d"}, {"org.jsoup.parser.TokenQueue", "matchesStartTag", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matches", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTagName", ""}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompToIgnoreCase", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"a b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "6", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesStartTag", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.parser.TokenQueue", "matches", "java.lang.String", "PT1i"}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "6", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeCssIdentifier", ""}, {"org.jsoup.parser.TokenQueue", "consumeTagName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWord", ""}, {"org.jsoup.parser.TokenQueue", "consume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "0", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"\n/..b"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "/a/b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"P\u00e90Tnlk"}, false, 10, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesWord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 10, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesWord", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"00/a/a"}, false, 10, new String[][]{{"org.jsoup.parser.TokenQueue", "advance", ""}, {"org.jsoup.parser.TokenQueue", "matchesWord", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"0/:AaA"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "remainder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "123456789012345678901234567890 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "remainder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "123456789012345678901234567890aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890aaaaaaaaaaaaaaaaaaaaaaaa<aaaaa"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "remainder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "123456789012345678901234567890aaaaaaaaaaaaaaaaaaaaaaaa<aaaaa {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890aaaaaaaaaaaaaaaaaaaaaaaa<aaaaa12345678901234567890"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "remainder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "123456789012345678901234567890aaaaaaaaaaaaaaaaaaaaaaaa<aaaaa12345678901234567890 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890aaaaaaaaaaaaaaaaaaaaaaa<aaaaa12345678901234567890"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "remainder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "123456789012345678901234567890aaaaaaaaaaaaaaaaaaaaaaa<aaaaa12345678901234567890 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeElementSelector", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeTagName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeAttributeKey", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToAny", "java.lang.String[]", "<sample:1>"}, {"org.jsoup.parser.TokenQueue", "consume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWord", ""}, {"org.jsoup.parser.TokenQueue", "matchesWhitespace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"11"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "http://example.com/a?b=c"}, {"org.jsoup.parser.TokenQueue", "consumeCssIdentifier", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"T"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTo", "java.lang.String", "http://example.com/a?b=c"}, {"org.jsoup.parser.TokenQueue", "consumeCssIdentifier", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "T {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"\uffff"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\uffffa {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"\000"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\000a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "0"}, {"org.jsoup.parser.TokenQueue", "chompTo", "java.lang.String", "a b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "0"}, {"org.jsoup.parser.TokenQueue", "chompTo", "java.lang.String", "a b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "00"}, {"org.jsoup.parser.TokenQueue", "chompTo", "java.lang.String", "a "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:4>"}, false, 15, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "a b"}, {"org.jsoup.parser.TokenQueue", "chompTo", "java.lang.String", "a "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"Uitle"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchChomp", new String[]{"java.lang.String"}, new String[]{"UUitle"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "/"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"i1X-5"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}, {"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"i1X-5"}, false, 9, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}, {"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"i.1X-5"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeCssIdentifier", ""}, {"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}, {"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWord", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeTagName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWord", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWord", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "matchChomp", "java.lang.String", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"0"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<sample:0>"}, {"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"/"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<sample:1>"}, {"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<sample:0>"}, {"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "/ {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"t"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<sample:1>"}, {"org.jsoup.parser.TokenQueue", "matchesAny", "char[]", "<sample:0>"}, {"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "t {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.Character"}, new String[]{"\001"}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "remainder", ""}, {"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", "\t1.35"}, {"org.jsoup.parser.TokenQueue", "consume", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"Title"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"Title1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "<null>"}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "\uffff", "\r"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToAny", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeElementSelector", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"00/a/b0xFFFFFFFF"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"1LH10"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "\000", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWord", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.parser.TokenQueue", "matchChomp", "java.lang.String", "00/anb"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWhitespace", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"0xP1i:"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", new String[]{"java.lang.String"}, new String[]{"0xP/ii:"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "isEmpty", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "http://example.com/a?b=c"}, {"org.jsoup.parser.TokenQueue", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "http://example.com/a?b=c {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "http://example.com/a?b=c"}, {"org.jsoup.parser.TokenQueue", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "http://example.com/a?b=ca {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "http://example.com/a?b=c"}, {"org.jsoup.parser.TokenQueue", "isEmpty", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "http://example.com/a?b="}, {"org.jsoup.parser.TokenQueue", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "http://example.com/a?b=a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "http://example.com/a?b="}, {"org.jsoup.parser.TokenQueue", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "http://example.com/a?b=a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "http://example.com/a?b="}, {"org.jsoup.parser.TokenQueue", "isEmpty", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "remainder", ""}, {"org.jsoup.parser.TokenQueue", "consumeCssIdentifier", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "a"}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", ":30:45asample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "["}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", ":30:45[sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "["}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", ":30:45[ {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "["}, {"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.String", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", ":30:45[a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "H"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeCssIdentifier", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "G"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("G0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesCS", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consumeWord", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.TokenQueue", "matchesCS", "java.lang.String", "00/a/b"}, {"org.jsoup.parser.TokenQueue", "chompBalanced", "char,char", "0", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ample", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "addFirst", new String[]{"java.lang.String"}, new String[]{"1"}, false, 14, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "k"}, {"org.jsoup.parser.TokenQueue", "consume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesWhitespace", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "-1.5"}, {"org.jsoup.parser.TokenQueue", "chompToIgnoreCase", "java.lang.String", "0x1ru345789Title"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", "java.lang.String", "I"}, {"org.jsoup.parser.TokenQueue", "consumeAttributeKey", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "consume", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", "java.lang.String", "H"}, {"org.jsoup.parser.TokenQueue", "consumeWhitespace", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "unescape", new String[]{"java.lang.String"}, new String[]{"00/a/b"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("00/a/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "chompTo", new String[]{"java.lang.String"}, new String[]{"\010B"}, false, 0, new String[][]{{"org.jsoup.parser.TokenQueue", "consumeToIgnoreCase", "java.lang.String", "/a/b"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "\r"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\r {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.TokenQueue", "org.jsoup.parser.TokenQueue", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"org.jsoup.parser.TokenQueue", "addFirst", "java.lang.Character", "\014"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\014 {isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
