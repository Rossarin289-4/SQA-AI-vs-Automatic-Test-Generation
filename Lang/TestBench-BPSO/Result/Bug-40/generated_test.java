package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "char"}, new String[]{" is le:ss than 0: 010", "0"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[ is le:ss than , : , 1, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E\t5", "T6itle"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E\t5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isWhitespace", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "contains", new String[]{"java.lang.String", "char"}, new String[]{"[1,3]", "g"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "containsAny", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"..", "StCings must+ not be null"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "char", "int"}, new String[]{"\u00e9", "f", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\u00e9811921L", "21W4743647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21W4743647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "splitByWholeSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" is less tian 0: ", "2147483648"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[ is less tian 0: ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "remove", new String[]{"java.lang.String", "char"}, new String[]{" is lfss than 0: ", "g"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" is lfss than 0: ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "split", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678801234567", "--1http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[234567880, 234567]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "lowerCase", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "1e10", "/a/b1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isNumericSpace", new String[]{"java.lang.String"}, new String[]{"2147483648<a>b</a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOf", new String[]{"java.lang.String", "char", "int"}, new String[]{" is less tian 0: ", "/", "-24"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.lang.Object[]"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "chomp", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789a", " b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.util.Iterator", "char"}, new String[]{"<sample:2>", "."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"2020-011-01", "4081", "4096"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOfDifference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2021-01-01d", "214783648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substringBetween", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.222020-02-30T25:61:61", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\037H", "/a/b1.F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"2147483648<a></a>", "21W4743646", "8192"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substringAfterLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Title", "T"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("itle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isNotEmpty", new String[]{"java.lang.CharSequence"}, new String[]{"<s:bbc>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"-0.0", "-536866831", "8191"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.util.Collection", "char"}, new String[]{"<sample:2>", "g"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0gsampleg", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "reverse", new String[]{"java.lang.String"}, new String[]{"1.2252020-02-30T25:61:618192"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("291816:16:52T03-20-0202522.1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "center", new String[]{"java.lang.String", "int", "char"}, new String[]{"1.5d", "-1048575", "\r"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substring", new String[]{"java.lang.String", "int"}, new String[]{"Hello, World", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "strip", new String[]{"java.lang.String"}, new String[]{"1.250x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.250x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12345677890l2345678901234567890", "-0.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("29", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "abbreviate", new String[]{"java.lang.String", "int", "int"}, new String[]{"+1", "8161", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "lowerCase", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1.2252020-42-30T25:61TimeToLive of ", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.2252020-42-30t25:61timetolive of ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "abbreviate", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.5d", "2147483647", "-4096"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isAlphaSpace", new String[]{"java.lang.String"}, new String[]{"Strinngs must not be null"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "countMatches", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".,1", "-"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "containsAny", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567890123456", "2020-0-30T25:1:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "removeEnd", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-11.12345678901234567", "1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-11.12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"01F", "mull", "11", "1025"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("01Fmull", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "left", new String[]{"java.lang.String", "int"}, new String[]{"--1http://example.com0a?b=c", "4096"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1http://example.com0a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "stripToNull", new String[]{"java.lang.String"}, new String[]{" 6vs "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6vs", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "char"}, new String[]{"2020-1-11", "l"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "rightPad", new String[]{"java.lang.String", "int"}, new String[]{"1.1", "-536866831"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "splitByCharacterType", new String[]{"java.lang.String"}, new String[]{"21W3744647"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[21, W, 3744647]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "length", new String[]{"java.lang.String"}, new String[]{"[1-3\u00e9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "upperCase", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"21W37", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21W37", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOfAnyBut", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "21W37446f7"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"22W3743647", "<sample:1>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"-11.123456789s01234567", "oull5.", "a b2020-02-30T25:61:61"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "remove", new String[]{"java.lang.String", "char"}, new String[]{"", "."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"\037H0xFFFFFFFF", "Titletrue", "B"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isAlphaSpace", new String[]{"java.lang.String"}, new String[]{"[1-3]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "defaultString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/a/11.5", "1147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/11.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "startsWithAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"abc", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"2147483648", "21W4743646", "512"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, , , , , 8, , , 8]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "splitByCharacterTypeCamelCase", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"1.22520020-02-30T25:61:61", "12;3:35", "-4096"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "containsNone", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\u00e92147s83647", "1.1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "defaultIfEmpty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"21W37446f7", "0xf1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21W37446f7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "strip", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.2253020-02-30T2:61:61", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.2253020-02-30T2:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String", "int", "int"}, new String[]{"<null>", "", "-10", "-25"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"T6itle\n", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "int"}, new String[]{"214783648", " is less tian 0: ", "<null>", "6"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("214783648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "21W3743647"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOfAny", new String[]{"java.lang.String", "char[]"}, new String[]{" is fss than 0: ", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "chop", new String[]{"java.lang.String"}, new String[]{"\u00e9abc"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9ab", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "center", new String[]{"java.lang.String", "int"}, new String[]{"-", "4082"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#4082#507062419", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s:Labc,>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "chop", new String[]{"java.lang.String"}, new String[]{"!"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{"1234577890l2345678901234567890", "-2147483648", "2147483612"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1234577890l2345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"oull5.1020-01-01", "--1http://example.cpm/a?b=c", "aSb+c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ou5b020a0ba0b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"200-01-01", "1.222020-02-30e25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "deleteWhitespace", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "splitByWholeSeparatorPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"1.22520020-02-30T25:61:61", "213743547", "-10"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[1.22520020-02-30T25:61:61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isAsciiPrintable", new String[]{"java.lang.String"}, new String[]{" is lWe:ss than 0: 010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:1>", "21"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a210", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "split", new String[]{"java.lang.String"}, new String[]{" vCs "}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[vCs]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.2252020-42-30T25:612147383648", "22", "13"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("147383648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substring", new String[]{"java.lang.String", "int"}, new String[]{"1.2252020-42-30\nT25:61", "2040"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "chomp", new String[]{"java.lang.String"}, new String[]{" 6vs "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 6vs ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "ordinalIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"-0b5", "0x123456789a", "-536866756"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"21", "/a/Ib1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "remove", new String[]{"java.lang.String", "char"}, new String[]{"-0.5", "-"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "endsWith", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2/20-1-11", "01F"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "trimToEmpty", new String[]{"java.lang.String"}, new String[]{"12:3:45TimeToLive of "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:3:45TimeToLive of", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceOnce", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"1.5e30/", "1.5", "2020-1-112020-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-1-112020-02-30T25:61:61e30/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "ordinalIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"1.5e0/", "1234577890l2345678901\u00e9234567890", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "defaultString", new String[]{"java.lang.String"}, new String[]{"1.250x1234567891E\t5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.250x1234567891E\t5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<empty>", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "equals", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" c", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isAlphanumeric", new String[]{"java.lang.String"}, new String[]{"2.20-0-11"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "lastIndexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "removeEndIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e30/ is less than 0: ", "2020-01-01"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e30/ is less than 0: ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "repeat", new String[]{"java.lang.String", "int"}, new String[]{"`", "13"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`````````````", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"\t", "[1,3]", "a1:1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "chomp", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1E\t5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "trimToNull", new String[]{"java.lang.String"}, new String[]{"Strings must not be null vs "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Strings must not be null vs", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "containsNone", new String[]{"java.lang.String", "char[]"}, new String[]{"[1-35", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "capitalize", new String[]{"java.lang.String"}, new String[]{"\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isAlphanumericSpace", new String[]{"java.lang.String"}, new String[]{"H"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "containsIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"H0ello, World", "/a/b1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substringBeforeLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"oull5.1020-01-01", "..--1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("oull5.1020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.6", "16362", "-67112960"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "containsAny", new String[]{"java.lang.String", "char[]"}, new String[]{"1234}77890l2345678901234567890", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"}2;", "<null>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("}2;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<null>", ""}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceChars", new String[]{"java.lang.String", "char", "char"}, new String[]{"*1", "8", "\037"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "equalsIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678901234567", "1.225302"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOf", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b</`>", " "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "lastIndexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.2252020-02-30T25:61:61", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"{\"a\":1}", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"a,b,c8192", "21W47443646", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{"[1--34", "2147483647", "-1073741818"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isAlphanumeric", new String[]{"java.lang.String"}, new String[]{"nullI"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"1E-5o us ", "123456777890012345678901234567890", "1025"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "containsOnly", new String[]{"java.lang.String", "char[]"}, new String[]{"1E-5o us ", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "containsNone", new String[]{"java.lang.String", "char[]"}, new String[]{"T6itle", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOfAnyBut", new String[]{"java.lang.String", "char[]"}, new String[]{"", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"{\"a74\":1}", "<empty>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a74\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"1eo0", "", "4092"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "removeEndIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".5", "1.1234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "right", new String[]{"java.lang.String", "int"}, new String[]{"", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.util.Iterator", "char"}, new String[]{"<null>", "i"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isAlpha", new String[]{"java.lang.String"}, new String[]{"21W47F436647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"1.250x123456789", "TimeToLive o", "1025", "-536870909"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TimeToLive o", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0e10", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "char", "int"}, new String[]{"", "0", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "containsOnly", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" is less than 0: {\"a\":1}", " vCs "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "right", new String[]{"java.lang.String", "int"}, new String[]{"}2:", "6"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("}2:", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.lang.Object[]", "char", "int", "int"}, new String[]{"<null>", "W", "43", "22"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "stripAll", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<null>", "[1,]"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String", "int", "int"}, new String[]{"<sample:4>", " 7vs ", "8239", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "contains", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/a/b1-5", ".-1http://example..com0a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substringAfter", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"}", "1E-51"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.util.Collection", "char"}, new String[]{"<sample:3>", "n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isAsciiPrintable", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF1E\t5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"1.12344567", "<sample:0>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12344567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "splitByWholeSeparatorPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"214783648", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[2, 4783648]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "containsAny", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:61:60", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.2253120-022-30T2:61:61", "10", "4098"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("022-30T2:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOf", new String[]{"java.lang.String", "char"}, new String[]{"1.5d", "S"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceEach", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"21W47443646", "<sample:0>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21W47443646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substringAfterLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"d0.5", " b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "chop", new String[]{"java.lang.String"}, new String[]{"123456777890012345678901234567890-1\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456777890012345678901234567890-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:3>", "tre"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "startsWithAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.123", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "left", new String[]{"java.lang.String", "int"}, new String[]{"2147483648abc", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "stripAll", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substringAfter", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"n2345p677890l2345678901234567890", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "deleteWhitespace", new String[]{"java.lang.String"}, new String[]{"abc"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITLhE is le:ss than 0: 010", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLhE is le:ss than 0: 010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"mull0xFFFFFFFF", "./", "-8103", "-61456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("./mull0xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"", "<empty>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "remove", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\037vs ", " "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\037vs", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.util.Collection", "char"}, new String[]{"<null>", "9"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String"}, new String[]{" 6vg "}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, 6vg, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isNumeric", new String[]{"java.lang.String"}, new String[]{"221W4743647..."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "splitByCharacterTypeCamelCase", new String[]{"java.lang.String"}, new String[]{"/a/Ib1.5"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[/, a, /, Ib, 1, ., 5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "contains", new String[]{"java.lang.String", "char"}, new String[]{" is llfss than 0: Title", "l"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"8193", "\u00e9", "8161"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e98193\u00e9...#40804#1088362451", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "stripToEmpty", new String[]{"java.lang.String"}, new String[]{"-11.12345678901234577"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-11.12345678901234577", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "countMatches", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Titmetrue", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.lang.Object[]", "char"}, new String[]{"<null>", "p"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "splitByWholeSeparator", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"", "TITLLhE", "-2"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"2146", "<null>", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isNumeric", new String[]{"java.lang.String"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"0x1F", "<sample:5>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ax1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "leftPad", new String[]{"java.lang.String", "int", "char"}, new String[]{"true1.5", "16384", "P"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP...#16384#1438094106", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "containsOnly", new String[]{"java.lang.String", "char[]"}, new String[]{"-11.02345678901234567", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substringBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{" 00", "/aCb1-5", "...TITLE"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substringBefore", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"b", " W"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "ordinalIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"[1-[3]", "", "8181"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isNumericSpace", new String[]{"java.lang.String"}, new String[]{" is ess than 0: {\"a\":1}"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "stripAll", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:2>", " is\037llfss than 0: Title"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[mp, , ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "leftPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"C\t", "17", "--1http://example.com0a?b=c0Hello, World"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1http://exampC\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceOnce", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"819", "", ",B1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("819", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "uncapitalize", new String[]{"java.lang.String"}, new String[]{"1.123456677901234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123456677901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "leftPad", new String[]{"java.lang.String", "int"}, new String[]{"1.250xC123456789", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.250xC123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOfAny", new String[]{"java.lang.String", "char[]"}, new String[]{"..TITLE", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "upperCase", new String[]{"java.lang.String"}, new String[]{"1.2253120-022-30T2:61:61"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.2253120-022-30T2:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"ture1.1234567890123456", "-2147483648", "17"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ture1.12345678901", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.2252020-42-30T25:61TimeToLive of ", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "rightPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"i ", "10", "21W374364712:30:45"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i 21W37436", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "stripEnd", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a", "--1http:/example.com0a?b=c0Hello, W"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{"--1http:/.example.com0a?b=c0Hello, W", "-2147483648", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOfDifference", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "int"}, new String[]{"", "0", "0x123456789a", "-1073741823"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "char"}, new String[]{"", "L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isNumericSpace", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "rightPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"2.20-0-111", "-4068", "--1http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2.20-0-111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOfAnyBut", new String[]{"java.lang.String", "char[]"}, new String[]{"TIT}LhE is le:ss than 0: 010", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isAllUpperCase", new String[]{"java.lang.String"}, new String[]{"TTjmeToLive o"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{" s ess than 0: {\"a\":1}1.5f", "-2147483648", "2147483648abc"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" s ess than 0: {\"a\":1}1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"--1http://example.com0a?b=c0Gello, World", "<sample:4>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "splitByWholeSeparatorPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-11.123456789e123577", ""}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[-11.123456789e123577]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "remove", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--1http://example.com0a?b=c0Helgo, World", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1http://example.com0a?b=c0Helgo, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "stripToNull", new String[]{"java.lang.String"}, new String[]{"\n"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "removeEndIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "12;45677890l2345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"H0ello, Workd", "2046", "1.2520020-02-30T25:61:61PT1H"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.2520020-02-30T25:61:61PT1H1.2520020-02-30T25:61:61PT1H1.2520020-02-30T25:61:61PT1H1.2520020-02-30T25:61:61PT1H1.2520020-02-30T25:61:61PT1H1.2520020-02-30T25:61:61PT1H1.2520020-02-30T25:61:61PT1H1.25...#2046#1955509891", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[[1--3\u00e9", "\037vs "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"...TITLD", "1", "--1http://example.com0a?b=c0Hello, World1.25"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("...TITLD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substringBefore", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.55e30/", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<null>", " i le:ss than 0: 010"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "containsOnly", new String[]{"java.lang.String", "char[]"}, new String[]{"", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceEach", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"1.2520020-", "<sample:4>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.252samplesample2sample-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "abbreviate", new String[]{"java.lang.String", "int"}, new String[]{"--1ittp://example.com0a?b=c0Helgo, World1.12345678901234567", "53"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1ittp://example.com0a?b=c0Helgo, World1.12345678...", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"7", "8196", "\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t...#8196#-2042960146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "rightPad", new String[]{"java.lang.String", "int"}, new String[]{"2147483648<a>b</a>", "16362"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483648<a>b</a>                                                                                                                                                                                      ...#16362#-1440934490", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"", ";"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "repeat", new String[]{"java.lang.String", "int"}, new String[]{"e", "32712"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee...#32712#-1809568128", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "chomp", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"..TILE", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("..TILE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOfAnyBut", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"oul", ""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", "21\"V37446f7", ";vs "}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOfAnyBut", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:3:45SimeToLive of ", "1.225202-02-30T25:61:618192"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "int"}, new String[]{"TITLhE", "a;c", "2020-001-02", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLhE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOfAnyBut", new String[]{"java.lang.String", "char[]"}, new String[]{"a", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"22020-1-112020-02-30T25:61:61", "", "..TILEHTello, World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("22020-1-112020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isAlpha", new String[]{"java.lang.String"}, new String[]{"IH"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "deleteWhitespace", new String[]{"java.lang.String"}, new String[]{"..}vs "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("..}vs", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "countMatches", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "abb"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOfDifference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\rull55.", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\rull55.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", "-11.123456789s01234567TimeToLive of ", "[10x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "left", new String[]{"java.lang.String", "int"}, new String[]{"[1-3\u00e9", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "leftPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"/a/Ib1.5", "-253901", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/Ib1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isAlphanumericSpace", new String[]{"java.lang.String"}, new String[]{" is lWe:rs than 0: 010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "Str]ngs must n0t be null"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "int"}, new String[]{"[[1-[3]", "-", "a b2020-02-30T25:61:61", "253901"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[[1a b2020-02-30T25:61:61[3]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "remove", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "contains", new String[]{"java.lang.String", "char"}, new String[]{"", "P"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.250xC123456789", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isWhitespace", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"/a/Ib15", "/"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ib15/a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"n2345p677890l234567890123456:7890", "2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[n, 345p677890l, 345678901, 3456:7890]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "trimToNull", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "right", new String[]{"java.lang.String", "int"}, new String[]{"1.5e30/ is less than 0: ", "21"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("e30/ is less than 0: ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "TI[LhE is le:ss than 0: 010"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "containsAny", new String[]{"java.lang.String", "char[]"}, new String[]{"", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isNotEmpty", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"19", "", "1048575"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("19191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919191919...#2097150#2036633560", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"<null>", "<sample:7>", "<sample:5>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "splitByCharacterTypeCamelCase", new String[]{"java.lang.String"}, new String[]{"0xFFFFEEgF"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, x, FFFFE, Eg, F]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "swapCase", new String[]{"java.lang.String"}, new String[]{"--1ittp://example.com0a?b=c0Gello, World"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1ITTP://EXAMPLE.COM0A?B=C0gELLO, wORLD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOfAnyBut", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ba", "--1ahttp://example.com0a?b=c0Helgo, World"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "substringBeforeLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" s We:rs than 0: 010", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" s We:rs than 0: 010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "removeEndIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.225202e-42-30\nT25:61", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.225202e-42-30\nT25:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "stripStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "..TILE0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "split", new String[]{"java.lang.String", "char"}, new String[]{"[1-35a is less than 0: ", " "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[[1-35a, is, less, than, 0:]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOf", new String[]{"java.lang.String", "char", "int"}, new String[]{"", "/", "-32"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1.1234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isAllLowerCase", new String[]{"java.lang.String"}, new String[]{"oull5."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "startsWithAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"sTITLhE Bs le:ss than 0: 010", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOf", new String[]{"java.lang.String", "char"}, new String[]{"", "<"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "repeat", new String[]{"java.lang.String", "int"}, new String[]{"", "17"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "length", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isAllLowerCase", new String[]{"java.lang.String"}, new String[]{"nul"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isAllUpperCase", new String[]{"java.lang.String"}, new String[]{"o us "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "strip", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.2252020-02-30T25:61:61", "1234567789012345678901234567890"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".2252020-02-30T25:61:", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"\037H", "<sample:3>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\037H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "split", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.22520020-02-30T25:61:61", "12:3:45"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[., 00, 0-0, -, 0T, 6, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isNotEmpty", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "chomp", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-1-21", "2020-011-01"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-1-21", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOf", new String[]{"java.lang.String", "char", "int"}, new String[]{"Xa/b1/F", "c", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.util.Iterator", "char"}, new String[]{"<empty>", ","}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String", "int", "int"}, new String[]{"<sample:3>", "1.25", "8161", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isNotEmpty", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"null", "12;3:45"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "abbreviate", new String[]{"java.lang.String", "int", "int"}, new String[]{"2147583648", "-32769", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147583648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOfDifference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hello, orld", "oull5."}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "leftPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"1.2252020-02-30T25:61:n61<a>b</a>", "-1", "21W3744f6"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.2252020-02-30T25:61:n61<a>b</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "remove", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"21W37436470xFFFFF", "1.22X52020-02-30T25:61:618192"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21W37436470xFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "containsAny", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5.", "0x123356789a"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "abbreviate", new String[]{"java.lang.String", "int"}, new String[]{"--1http://example.com/a?b=c", "-8161"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "indexOfDifference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" is les", "Strinngs!must not be null"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "center", new String[]{"java.lang.String", "int"}, new String[]{"StCi", "-1048575"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("StCi", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<sample:1>", "/a\u00e9b1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b/a\u00e9b1.52", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "removeEnd", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"21478s648", "TITLE"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21478s648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "stripAll", new String[]{"java.lang.String[]"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "chop", new String[]{"java.lang.String"}, new String[]{"1E-50x123456789"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E-50x12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "center", new String[]{"java.lang.String", "int"}, new String[]{"2147483648<a></a>", "8191"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#8191#-1287934428", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String"}, new String[]{"12;45677890l2345678901234567890"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[12;45677890l2345678901234567890]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "isAsciiPrintable", new String[]{"java.lang.String"}, new String[]{"21W373647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "abbreviate", new String[]{"java.lang.String", "int"}, new String[]{"\0371", "11"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\0371", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "containsOnly", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" i le:ss than 0: [010", "--1ht"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"0xFFFFEFgF", "4"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFEFgF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "splitByWholeSeparatorPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"21W27446f7", "/a/bb1.5", "8219"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[21W27446f7]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "containsIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1-5\"", "TITLE0x1234567890"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"Titmetrue", "1.2253020-02-30T2:61:611.25", "-8161", "4081"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.2253020-02-30T2:61:611.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"2020-1-11...-0.0", "1.250X12345789", "--1http//example.com/a?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1t1t---------t-t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"oull5.1e10", "TWTLE"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringUtils", "org.apache.commons.lang.StringUtils", "chop", new String[]{"java.lang.String"}, new String[]{"--1http://examqle.com0a?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1http://examqle.com0a?b=", String.valueOf(actual));
 }
}
