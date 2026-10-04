package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "char", "\uffff"}, {"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}, {"org.jsoup.parser.CharacterReader", "matchesDigit", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{"\0370x1F"}, false, 9, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{"\000"}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<null>"}, {"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<null>"}, {"org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", "java.lang.String", "http://example.com/a?b=c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeDigitSequence", ""}, {"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "0.5f"}, {"org.jsoup.parser.CharacterReader", "consumeTo", "char", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\uffff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "current", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesLetter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\uffff", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}, {"org.jsoup.parser.CharacterReader", "rewindToMark", ""}, {"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesLetter", ""}, {"org.jsoup.parser.CharacterReader", "containsIgnoreCase", "java.lang.String", "1L"}, {"org.jsoup.parser.CharacterReader", "pos", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"-0.<[[0"}, false, 9, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesLetter", ""}, {"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}, {"org.jsoup.parser.CharacterReader", "consumeAsString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}, {"org.jsoup.parser.CharacterReader", "unconsume", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "char", "0"}, {"org.jsoup.parser.CharacterReader", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterSequence", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeAsString", ""}, {"org.jsoup.parser.CharacterReader", "matches", "char", " "}, {"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("mple", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "current", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}, {"org.jsoup.parser.CharacterReader", "advance", ""}, {"org.jsoup.parser.CharacterReader", "consume", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("m", String.valueOf(actual));
  assertEquals("receiver state after the call", "mple", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "char", "l"}, {"org.jsoup.parser.CharacterReader", "matchesDigit", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "le", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}, {"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}, {"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "1.12345678"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{" "}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}, {"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{" "}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}, {"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{"\000"}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "2147483648"}, {"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}, {"org.jsoup.parser.CharacterReader", "consume", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}, {"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}, {"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}, {"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}, {"org.jsoup.parser.CharacterReader", "unconsume", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "advance", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "advance", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}, {"org.jsoup.parser.CharacterReader", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}, {"org.jsoup.parser.CharacterReader", "matchesDigit", ""}, {"org.jsoup.parser.CharacterReader", "matchesDigit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}, {"org.jsoup.parser.CharacterReader", "matchesDigit", ""}, {"org.jsoup.parser.CharacterReader", "matchesDigit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}, {"org.jsoup.parser.CharacterReader", "matchesDigit", ""}, {"org.jsoup.parser.CharacterReader", "matchesDigit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}, {"org.jsoup.parser.CharacterReader", "matchesDigit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"1.13457890123456"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"1.13457890123456"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "123456789012345678901234567890"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "advance", ""}, {"org.jsoup.parser.CharacterReader", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "mple", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "toString", ""}, {"org.jsoup.parser.CharacterReader", "pos", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{"[P,,2]"}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{"0"}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{"f"}, false, 9, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesIgnoreCase", "java.lang.String", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{"-0//"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", "java.lang.String", "2.25"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{"{"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{"6.T3TLE"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeAsString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "containsIgnoreCase", "java.lang.String", "-0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1m55"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}, {"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "1.25"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "containsIgnoreCase", "java.lang.String", "true"}, {"org.jsoup.parser.CharacterReader", "consume", ""}, {"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "1.25A"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "965535"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 18, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "advance", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "advance", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "advance", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{"\uffff"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<null>"}, {"org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", "java.lang.String", "http://example.com/a?b=c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "unconsume", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}, {"org.jsoup.parser.CharacterReader", "current", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "unconsume", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}, {"org.jsoup.parser.CharacterReader", "current", ""}, {"org.jsoup.parser.CharacterReader", "consumeToEnd", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "e", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "unconsume", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}, {"org.jsoup.parser.CharacterReader", "current", ""}, {"org.jsoup.parser.CharacterReader", "consumeToEnd", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "rewindToMark", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "containsIgnoreCase", "java.lang.String", "-1.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "rewindToMark", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "containsIgnoreCase", "java.lang.String", "-1.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "rewindToMark", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "rewindToMark", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesIgnoreCase", new String[]{"java.lang.String"}, new String[]{"655c35"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "char", "0"}, {"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "2020-02-30T25:61:61"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{"r2020-02FW3/T25:62:61"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{"r2020-0BFW3/T25:62:61"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "frA"}, {"org.jsoup.parser.CharacterReader", "consumeTo", "char", "\uffff"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeDigitSequence", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeDigitSequence", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "rewindToMark", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "1.12345678"}, {"org.jsoup.parser.CharacterReader", "unconsume", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "rewindToMark", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "1.12345678"}, {"org.jsoup.parser.CharacterReader", "unconsume", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesIgnoreCase", "java.lang.String", "-0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}, {"org.jsoup.parser.CharacterReader", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}, {"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}, {"org.jsoup.parser.CharacterReader", "isEmpty", ""}, {"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "1.12345678"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}, {"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}, {"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}, {"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}, {"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{"a"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "5."}, {"org.jsoup.parser.CharacterReader", "isEmpty", ""}, {"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "rewindToMark", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "rewindToMark", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "rewindToMark", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "rewindToMark", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeAsString", ""}, {"org.jsoup.parser.CharacterReader", "rewindToMark", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{" "}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}, {"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "unconsume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToEnd", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"\000"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}, {"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "current", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "current", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "current", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "current", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\uffff", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "char", "\000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "current", ""}, {"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "a-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "advance", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "advance", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesDigit", ""}, {"org.jsoup.parser.CharacterReader", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesDigit", ""}, {"org.jsoup.parser.CharacterReader", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{"1.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", "java.lang.String", "PT1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", "java.lang.String", "PT1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", "java.lang.String", "LPT1H"}, {"org.jsoup.parser.CharacterReader", "toString", ""}, {"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{".F\"2444671.5d"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "rewindToMark", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesLetter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesLetter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesLetter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeAsString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}, {"org.jsoup.parser.CharacterReader", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}, {"org.jsoup.parser.CharacterReader", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}, {"org.jsoup.parser.CharacterReader", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "advance", ""}, {"org.jsoup.parser.CharacterReader", "unconsume", ""}, {"org.jsoup.parser.CharacterReader", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{"[P,2]"}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "advance", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{"true"}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}, {"org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", "java.lang.String", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesDigit", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "pos", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{" "}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeAsString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesLetter", ""}, {"org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", "java.lang.String", "1..925"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}, {"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\uffff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesIgnoreCase", new String[]{"java.lang.String"}, new String[]{"+"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "toString", ""}, {"org.jsoup.parser.CharacterReader", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesIgnoreCase", new String[]{"java.lang.String"}, new String[]{"5.\u00e9"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeAsString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "current", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "unconsume", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "char", "\000"}, {"org.jsoup.parser.CharacterReader", "current", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "e", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "rewindToMark", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "rewindToMark", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "rewindToMark", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "rewindToMark", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{"1..12345678901234567"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesIgnoreCase", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesDigit", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesIgnoreCase", "java.lang.String", "-0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesIgnoreCase", "java.lang.String", "-0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesIgnoreCase", "java.lang.String", "-0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 21, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 22, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 23, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "unconsume", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesIgnoreCase", "java.lang.String", "0x1F1.1234567"}, {"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"--1OT1H"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"--1OT1H"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "current", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeAsString", ""}, {"org.jsoup.parser.CharacterReader", "current", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "mple", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ample", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "0xFFFFFFFF"}, {"org.jsoup.parser.CharacterReader", "consume", ""}, {"org.jsoup.parser.CharacterReader", "matchesIgnoreCase", "java.lang.String", "{\"a\":1}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "char", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "containsIgnoreCase", "java.lang.String", "oull"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeAsString", ""}, {"org.jsoup.parser.CharacterReader", "consumeTo", "char", "0"}, {"org.jsoup.parser.CharacterReader", "consume", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "mple", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}, {"org.jsoup.parser.CharacterReader", "consumeAsString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}, {"org.jsoup.parser.CharacterReader", "consumeAsString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "ple", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}, {"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "mple", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{"\uffff"}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "i"}, {"org.jsoup.parser.CharacterReader", "containsIgnoreCase", "java.lang.String", "0123455789"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"0"}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "1E-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"1"}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "1E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"!"}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "E-6"}, {"org.jsoup.parser.CharacterReader", "unconsume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"\t"}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "pos", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"00KTile"}, false, 10, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}, {"org.jsoup.parser.CharacterReader", "advance", ""}, {"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "current", ""}, {"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<sample:2>"}, {"org.jsoup.parser.CharacterReader", "unconsume", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "e", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 13, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesDigit", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "toString", ""}, {"org.jsoup.parser.CharacterReader", "advance", ""}, {"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "a"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ample", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"II"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesDigit", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeDigitSequence", ""}, {"org.jsoup.parser.CharacterReader", "consumeAsString", ""}, {"org.jsoup.parser.CharacterReader", "pos", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeDigitSequence", ""}, {"org.jsoup.parser.CharacterReader", "consumeAsString", ""}, {"org.jsoup.parser.CharacterReader", "pos", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeDigitSequence", ""}, {"org.jsoup.parser.CharacterReader", "consumeAsString", ""}, {"org.jsoup.parser.CharacterReader", "pos", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "current", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<sample:1>"}, {"org.jsoup.parser.CharacterReader", "consumeAsString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("m", String.valueOf(actual));
  assertEquals("receiver state after the call", "ple", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}, {"org.jsoup.parser.CharacterReader", "matches", "char", "a"}, {"org.jsoup.parser.CharacterReader", "consumeAsString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "mple", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}, {"org.jsoup.parser.CharacterReader", "matches", "char", "a"}, {"org.jsoup.parser.CharacterReader", "consumeAsString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\uffff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "advance", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesDigit", ""}, {"org.jsoup.parser.CharacterReader", "consumeTo", "char", "a"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "mple", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterSequence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "I"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterSequence", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "I"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesLetter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesLetter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesLetter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesLetter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.parser.CharacterReader", "advance", ""}, {"org.jsoup.parser.CharacterReader", "matchesLetter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeAsString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeAsString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "advance", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterSequence", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "char", "\000"}, {"org.jsoup.parser.CharacterReader", "consumeToEnd", ""}, {"org.jsoup.parser.CharacterReader", "pos", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.250x1F"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "unconsume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}, {"org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", "java.lang.String", ".5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "unconsume", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}, {"org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", "java.lang.String", ".5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "unconsume", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesDigit", ""}, {"org.jsoup.parser.CharacterReader", "consume", ""}, {"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "0xFFFFFFFF"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "unconsume", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesDigit", ""}, {"org.jsoup.parser.CharacterReader", "consume", ""}, {"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "0xFFFFFFFF"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterSequence", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterSequence", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterSequence", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterSequence", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "1.12345678"}, {"org.jsoup.parser.CharacterReader", "consume", ""}, {"org.jsoup.parser.CharacterReader", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "ple", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "1.12345678"}, {"org.jsoup.parser.CharacterReader", "consume", ""}, {"org.jsoup.parser.CharacterReader", "advance", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "\t"}, {"org.jsoup.parser.CharacterReader", "consume", ""}, {"org.jsoup.parser.CharacterReader", "advance", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "ple", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "\t"}, {"org.jsoup.parser.CharacterReader", "consume", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "mple", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesIgnoreCase", new String[]{"java.lang.String"}, new String[]{"rd+1"}, false, 9, new String[][]{{"org.jsoup.parser.CharacterReader", "pos", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesIgnoreCase", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "mple", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}, {"org.jsoup.parser.CharacterReader", "matchesLetter", ""}, {"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"0"}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "1e10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "1e10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"E--300"}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}, {"org.jsoup.parser.CharacterReader", "consume", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"9"}, false, 8, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<empty>"}, {"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{""}, false, 8, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<empty>"}, {"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<sample:5>"}, {"org.jsoup.parser.CharacterReader", "rewindToMark", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{""}, false, 9, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<empty>"}, {"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<sample:5>"}, {"org.jsoup.parser.CharacterReader", "rewindToMark", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"a"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "rewindToMark", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "unconsume", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "pos", ""}, {"org.jsoup.parser.CharacterReader", "advance", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "unconsume", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "pos", ""}, {"org.jsoup.parser.CharacterReader", "advance", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "unconsume", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "pos", ""}, {"org.jsoup.parser.CharacterReader", "advance", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 29, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 30, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 32, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"\uffff"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
}
