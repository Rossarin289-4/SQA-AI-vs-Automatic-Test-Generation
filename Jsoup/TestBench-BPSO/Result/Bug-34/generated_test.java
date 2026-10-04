package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "1L"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "containsIgnoreCase", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.jsoup.parser.CharacterReader", "matches", "char", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{"_"}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "containsIgnoreCase", "java.lang.String", "abcc"}, {"org.jsoup.parser.CharacterReader", "matchesIgnoreCase", "java.lang.String", "2020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{"-.5"}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}, {"org.jsoup.parser.CharacterReader", "matchesDigit", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "rewindToMark", ""}, {"org.jsoup.parser.CharacterReader", "advance", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "current", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "char", "]"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\uffff", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "containsIgnoreCase", "java.lang.String", "`bcc"}, {"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterSequence", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "current", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "current", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesDigit", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{"a"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"nu.ll"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "containsIgnoreCase", "java.lang.String", "nu/ll"}, {"org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "pos", ""}, {"org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", "java.lang.String", "11"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesIgnoreCase", "java.lang.String", "a"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesLetter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "unconsume", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "char", "e"}, {"org.jsoup.parser.CharacterReader", "consume", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterSequence", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeAsString", ""}, {"org.jsoup.parser.CharacterReader", "matchesDigit", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{"aaabc"}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeAsString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "containsIgnoreCase", "java.lang.String", "[1,2]"}, {"org.jsoup.parser.CharacterReader", "consumeTo", "char", "p"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ple", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "Title"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<sample:5>"}, {"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "mple", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"0"}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "rewindToMark", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{" "}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"E"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "pos", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"{\"a\";:1}"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "advance", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesIgnoreCase", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", "java.lang.String", "65o535"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"tru_<a>b<ba>"}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "char", "\\"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", "java.lang.String", "214748"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesIgnoreCase", new String[]{"java.lang.String"}, new String[]{"64o535"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "containsIgnoreCase", "java.lang.String", " "}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "pos", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}, {"org.jsoup.parser.CharacterReader", "matchesDigit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\uffff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", "java.lang.String", "01b"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"_"}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "66o55"}, {"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "nextIndexOf", "char", "u"}, {"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "abcctrue"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "pos", ""}, {"org.jsoup.parser.CharacterReader", "nextIndexOf", "java.lang.CharSequence", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesDigit", ""}, {"org.jsoup.parser.CharacterReader", "matchesDigit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "nextIndexOf", "char", "="}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "advance", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "01r"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}, {"org.jsoup.parser.CharacterReader", "mark", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"Hello- World"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "4.="}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "char", "E"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{"1{\"a\":1}"}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesDigit", ""}, {"org.jsoup.parser.CharacterReader", "matchesDigit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesIgnoreCase", new String[]{"java.lang.String"}, new String[]{"null"}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesDigit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "nextIndexOf", "char", ":"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "current", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "unconsume", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesIgnoreCase", "java.lang.String", "p-0-1"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"abd"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "current", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\uffff", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"tr-e<a>b</a>1"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"PT0H"}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "char", "D"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", "java.lang.String", "{\"a\":1}"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "containsIgnoreCase", "java.lang.String", "EL"}, {"org.jsoup.parser.CharacterReader", "matchesLetter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "containsIgnoreCase", "java.lang.String", "-1..5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterSequence", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", "java.lang.String", "aTiule"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"`,b,c"}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "1.123\"4567890123456"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"a"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterSequence", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "advance", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "nextIndexOf", new String[]{"char"}, new String[]{"a"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "nextIndexOf", "char", "i"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}, {"org.jsoup.parser.CharacterReader", "consumeToEnd", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "rewindToMark", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToEnd", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"}"}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}, {"org.jsoup.parser.CharacterReader", "consumeAsString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{"{\"a\"D1}}"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{"p"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"6/2:30:45"}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesDigit", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "current", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{"b"}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeAsString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61-0.0"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "nextIndexOf", "char", "\000"}, {"org.jsoup.parser.CharacterReader", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"[12]"}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "nextIndexOf", "java.lang.CharSequence", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{"1a5f"}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "0x123456789+1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"a"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeDigitSequence", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "nextIndexOf", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "pos", ""}, {"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "nextIndexOf", "char", "9"}, {"org.jsoup.parser.CharacterReader", "mark", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesIgnoreCase", new String[]{"java.lang.String"}, new String[]{"11-5"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "rewindToMark", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{"PTH"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "containsIgnoreCase", "java.lang.String", "-0-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{"1234567890123456789012345678901.12345678901234567"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"true<a>b</a>"}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "0"}, {"org.jsoup.parser.CharacterReader", "matchesIgnoreCase", "java.lang.String", "1.123\"4567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "nextIndexOf", new String[]{"char"}, new String[]{"]"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{"2"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "advance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "toString", ""}, {"org.jsoup.parser.CharacterReader", "isEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesDigit", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "advance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}, {"org.jsoup.parser.CharacterReader", "current", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "toString", ""}, {"org.jsoup.parser.CharacterReader", "matchesLetter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"a"}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "true<a>b</a>true<a>b</a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{"a,b,c{\"a\":1}"}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.123\"45678901234561.25"}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "pos", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
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
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "current", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}, {"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "rewindToMark", ""}, {"org.jsoup.parser.CharacterReader", "consumeTo", "char", "n"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"2020-01-01 "}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{" b"}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesIgnoreCase", "java.lang.String", "01065o535"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{"aTitle"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesLetter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "1.124467"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "rewindToMark", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "unconsume", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "current", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{"2047483648"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "nextIndexOf", "java.lang.CharSequence", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"PTH"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "pos", ""}, {"org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "unconsume", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "advance", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "rewindToMark", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "--"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "nextIndexOf", new String[]{"char"}, new String[]{"+"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeAsString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{"]"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "nextIndexOf", new String[]{"char"}, new String[]{"]"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{"\010"}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "nextIndexOf", "java.lang.CharSequence", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "[1,2]0x123456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\uffff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "current", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"`"}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToEnd", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{"0"}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "http://example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:8>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "rewindToMark", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "1E-5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "nextIndexOf", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesIgnoreCase", new String[]{"java.lang.String"}, new String[]{"a\037b"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToAny", "char[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"\010"}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "advance", ""}, {"org.jsoup.parser.CharacterReader", "current", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{"3.f"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "nextIndexOf", "java.lang.CharSequence", "<s:abcx>"}, {"org.jsoup.parser.CharacterReader", "matches", "char", "+"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "advance", ""}, {"org.jsoup.parser.CharacterReader", "consumeDigitSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"1"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<null>"}, {"org.jsoup.parser.CharacterReader", "current", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesIgnoreCase", new String[]{"java.lang.String"}, new String[]{"a,b+c"}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"5.n"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "current", ""}, {"org.jsoup.parser.CharacterReader", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "char", "-"}, {"org.jsoup.parser.CharacterReader", "consumeAsString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "current", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "nextIndexOf", "java.lang.CharSequence", "<s:Ia>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{"1.5e3000"}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "toString", ""}, {"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesIgnoreCase", new String[]{"java.lang.String"}, new String[]{"ac"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "char", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsume", new String[]{"java.lang.String"}, new String[]{"\n.f"}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}, {"org.jsoup.parser.CharacterReader", "consumeTo", "char", "m"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.4e300"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "rewindToMark", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "rewindToMark", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterSequence", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "advance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", ""}, {"org.jsoup.parser.CharacterReader", "mark", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesIgnoreCase", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"5"}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesLetter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "nextIndexOf", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abcx>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeAsString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "nextIndexOf", new String[]{"char"}, new String[]{"a"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"2"}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{"{"}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "nextIndexOf", "java.lang.CharSequence", "<s:\037\037>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}, {"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<sample:4>"}, {"org.jsoup.parser.CharacterReader", "consume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "/a/b"}, {"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterSequence", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeDigitSequence", ""}, {"org.jsoup.parser.CharacterReader", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "<a>b</a>0dx123456789"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesDigit", ""}, {"org.jsoup.parser.CharacterReader", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<sample:1>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{"b"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", ""}, {"org.jsoup.parser.CharacterReader", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesDigit", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "nextIndexOf", "char", "j"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "nextIndexOf", "char", "{"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "/.5e3000"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{"8"}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "char", "0"}, {"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "11"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "char", "\000"}, {"org.jsoup.parser.CharacterReader", "consumeAsString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}, {"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "020-01-01"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", "java.lang.String", "5."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"_"}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeAsString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesIgnoreCase", "java.lang.String", "0x0F"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "nextIndexOf", new String[]{"java.lang.CharSequence"}, new String[]{"<s:aabc>"}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "nextIndexOf", new String[]{"char"}, new String[]{"a"}, false, 1, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}, {"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "1.50x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeAsString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "unconsume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "rewindToMark", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "current", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "containsIgnoreCase", "java.lang.String", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"a,b,ci123456789012345678901234567890"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeHexSequence", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"a"}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeDigitSequence", ""}, {"org.jsoup.parser.CharacterReader", "matches", "char", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "advance", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "advance", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{"."}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "containsIgnoreCase", "java.lang.String", "123456789012345678901234567890"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{"H"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}, {"org.jsoup.parser.CharacterReader", "consumeToEnd", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "11L"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\uffff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "nextIndexOf", new String[]{"char"}, new String[]{"7"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesLetter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}, {"org.jsoup.parser.CharacterReader", "matches", "char", "b"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "char", "C"}, {"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "11-5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "nextIndexOf", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc3>"}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<sample:7>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "rewindToMark", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesIgnoreCase", "java.lang.String", "65o535"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "nextIndexOf", new String[]{"char"}, new String[]{"`"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "0x2F"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"?_"}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesAny", "char[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"l"}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", ""}, {"org.jsoup.parser.CharacterReader", "consumeDigitSequence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("samp", String.valueOf(actual));
  assertEquals("receiver state after the call", "le", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "nextIndexOf", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0f>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"4"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "nextIndexOf", "java.lang.CharSequence", "<s:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "nextIndexOf", new String[]{"char"}, new String[]{","}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeDigitSequence", ""}, {"org.jsoup.parser.CharacterReader", "current", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"char"}, new String[]{"r"}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeDigitSequence", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeDigitSequence", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"anbc"}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "toString", ""}, {"org.jsoup.parser.CharacterReader", "mark", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "advance", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "java.lang.String", "[n,2]"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeTo", new String[]{"java.lang.String"}, new String[]{"-0.0C"}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}, {"org.jsoup.parser.CharacterReader", "nextIndexOf", "java.lang.CharSequence", "<s:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToAny", new String[]{"char[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "char", "E"}, {"org.jsoup.parser.CharacterReader", "rewindToMark", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesIgnoreCase", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.jsoup.parser.CharacterReader", "matchesDigit", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "consume", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "mple", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "current", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "char", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "current", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"char"}, new String[]{"."}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}, {"org.jsoup.parser.CharacterReader", "nextIndexOf", "java.lang.CharSequence", "<s:00>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeToEnd", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "toString", ""}, {"org.jsoup.parser.CharacterReader", "consumeDigitSequence", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterSequence", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesIgnoreCase", "java.lang.String", ".6"}, {"org.jsoup.parser.CharacterReader", "matches", "char", "\r"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{"..5"}, false, 2, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeAsString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"[1,2]null"}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "pos", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "containsIgnoreCase", new String[]{"java.lang.String"}, new String[]{"\t\t"}, false, 0, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}, {"org.jsoup.parser.CharacterReader", "nextIndexOf", "char", "\uffff"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchConsumeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "char", "7"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.CharacterReader", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "nextIndexOf", new String[]{"char"}, new String[]{"H"}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "advance", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "isEmpty", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "advance", ""}, {"org.jsoup.parser.CharacterReader", "isEmpty", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "pos", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "advance", ""}, {"org.jsoup.parser.CharacterReader", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "mark", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "matches", "java.lang.String", "1.5e200"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matchesAny", new String[]{"char[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeLetterSequence", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterThenDigitSequence", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "mark", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeDigitSequence", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesDigit", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeHexSequence", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "matchConsume", "java.lang.String", "1.251.5e300"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeLetterSequence", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.CharacterReader", "unconsume", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "matches", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consume", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "matchesLetter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "ample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "current", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "consumeAsString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeTo", "char", "\000"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.CharacterReader", "org.jsoup.parser.CharacterReader", "rewindToMark", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.CharacterReader", "consumeToEnd", ""}, {"org.jsoup.parser.CharacterReader", "unconsume", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
}
