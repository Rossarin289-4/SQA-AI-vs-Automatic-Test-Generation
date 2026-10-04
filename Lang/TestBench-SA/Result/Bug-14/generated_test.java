package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotEmpty", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotEmpty", new String[]{"java.lang.CharSequence"}, new String[]{"<s:L>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147483647", "1.25"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.25", "1e10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviate", new String[]{"java.lang.String", "int", "int"}, new String[]{"NFD", "8191", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String"}, new String[]{"\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:0>", "<s:abc>", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllLowerCase", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllLowerCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllLowerCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:L>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllLowerCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultString", new String[]{"java.lang.String"}, new String[]{"I"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsWhitespace", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsWhitespace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:>", "<null>", "2080374783"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:>", "<s:abc>", "-1073741824"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s: >", "TITLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBeforeLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1F", "0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:a>", "<s:>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:a>", "<s:->"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:-<_>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfterLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" ", "2020-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<null>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfterLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "2020-02-30T25:61:60"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "sn.tdxtv.Normalizenr\t"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:abc>", "<s:->"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:abcc>", "<s:b>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAccents", new String[]{"java.lang.String"}, new String[]{"HCello, Word"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("HCello, Word", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:2>", ""}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:->", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:x-<__>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:x-<__>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "endsWithIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<null>", "<s:abd>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:abd>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:ab r>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:-<_>", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "strip", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:9 >"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String", "int", "int"}, new String[]{"<empty>", "0xFFFFFFFF", "-2147483648", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"-0.0", " vs ", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"-0./1.5e300", " vs ", "8192"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0./1.5e300 vs -0./1.5e300 vs -0./1.5e300 vs -0./1.5e300 vs -0./1.5e300 vs -0./1.5e300 vs -0./1.5e300 vs -0./1.5e300 vs -0./1.5e300 vs -0./1.5e300 vs -0./1.5e300 vs -0./1.5e300 vs -0./1.5e300 vs -0./1...#122876#-2014723683", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.CharSequence", "int", "int"}, new String[]{"<s:-<_>", "8192", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "char"}, new String[]{"null", "-2147483648", " "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lowerCase", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"1.25", "-1", "Strings must not be null"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int"}, new String[]{"12345678901234567890123457890", "-8191"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12345678901234567890123457890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "trimToEmpty", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:9 >", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "length", new String[]{"java.lang.CharSequence"}, new String[]{"<s:-<_>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "char", "char"}, new String[]{"normalize", "0", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("normalize", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.util.Iterator", "char"}, new String[]{"<null>", "\uffff"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviateMiddle", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"normalize", "; or a Sun JVM: ", "2080374783"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("normalize", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviateMiddle", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"normaalhye", "T6TLE", "-1073741824"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("normaalhye", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBefore", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a!:1}", "123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a!:1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lowerCase", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"0xFFFFFFFF", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xffffffff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chop", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"<null>", "null", "8"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "uncapitalize", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:L>", "<s:L>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:M>", "<s:ab >"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "equalsIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:-<_>", "<s:M>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "deleteWhitespace", new String[]{"java.lang.String"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "deleteWhitespace", new String[]{"java.lang.String"}, new String[]{"0xFFF\nfFFFF5."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFfFFFF5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abd>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:b>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abcc c>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:b>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:abdc c>", "<s:>", "4095"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:>", "<s:HM>", "2047"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:0>", "<s:HM>", "2047"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripToEmpty", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBetween", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"java.text.Normalizer", "0xFFFFFFFF"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByCharacterTypeCamelCase", new String[]{"java.lang.String"}, new String[]{"\ndI"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[\n, d, I]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByCharacterTypeCamelCase", new String[]{"java.lang.String"}, new String[]{"nnSull"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[nn, Sull]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByCharacterTypeCamelCase", new String[]{"java.lang.String"}, new String[]{"nSSull"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[n, S, Sull]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:->", "<s:8>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678901234567", "-0./1.5e300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "0./1.5e300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isWhitespace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:b>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"\t", "Title", "\ndI"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "int"}, new String[]{"\u00e9", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"Iello, World", "Title", "2020-01-01"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:abcc>", "<s:9 >", "8"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"Iello, Wnrmd", "", "02V-011-01"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"--1", "4095", "[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2][1,2]...#4095#-1869411823", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"-A1", "-4095", "5."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-A1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:HM>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"-0/0-6xe30L", "10", ".m."}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0/0-6xe30L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeEndIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"null", "Iello, World"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"b0.5ddW", "9223", "<"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<...#9223#1759027554", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"/0.5bdV", "4620", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#4620#-1966007116", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparator", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"1.12345678", "a,b,c", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[1.12345678]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:abbd>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a\":1}", "a b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:HM>", "<s:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:pM>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "endsWithIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:-<_>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{"--1", "2147483646", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<null>", "<s:K>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:x-<__>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:abc>", "<s:abc>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripToNull", new String[]{"java.lang.String"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripToNull", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripToNull", new String[]{"java.lang.String"}, new String[]{"\n"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1233567890134567890123447890"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567", "123356789ss0134567890123447890"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, ., , , , , , , ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByCharacterType", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[{, \", a, \":, 1, }]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int"}, new String[]{"2147483648", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "swapCase", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:n61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30t25:N61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:-<_>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abdc c>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "trimToNull", new String[]{"java.lang.String"}, new String[]{" vs "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("vs", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsWhitespace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ab >"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2key0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chop", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:0>", "<s:L>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:4.7>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"\nI", "2147483647", "8191"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:2>", "normaalhye"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[samp, , ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:x-<__>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<null>", "nSull"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfter", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t", "sn.tdxtv.Normalizenr\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:8>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "char"}, new String[]{"12345678901234567890123457890", "\000"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12345678901234567890123457890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:>", "1.6L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllUpperCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllUpperCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:L>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:HM>", "<s:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllUpperCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "upperCase", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "left", new String[]{"java.lang.String", "int"}, new String[]{"--1", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "endsWithAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:K>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:M>", "<s:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"0/FFFFFGFF", "/", "8="}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("08=FFFFFGFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"0/FFstn.text.NormalizerNFD", "", ":"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/FFstn.text.NormalizerNFD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBetween", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-01-01", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"0/FFtn.text.NormalizeqNFD", ".", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/FFtntextNormalizeqNFD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:abdc c>", "<s:L>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlpha", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ab >"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:abbd>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"", "b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"<null>", "."}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"jjavce_tTo5,1-5a-123446I78tJ133466\t1.1234567", "6"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("76\t1.123456I78tJ13346jjavce_tTo5,1-5a-12344", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"jjavE4]tTo6,1-5a-123446I7 8tJ133466\t1.1\n345775.HitlePT1H", "H"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("itlePT1HjjavE4]tTo6,1-5a-123446I7 8tJ133466\t1.1\n345775.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "endsWithAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:L>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:abdc c>", "<s:a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "ordinalIndexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:L>", "<s:-<_>", "8192"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "ordinalIndexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:cuB>", "<s:>", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "ordinalIndexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:cuB>", "<s:<>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:9 >", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:9 >", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:9 >", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int"}, new String[]{"/", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:8>", "<s:ab r>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAsciiPrintable", new String[]{"java.lang.CharSequence"}, new String[]{"<s:o>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:err_>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:reg_w>", "<s:<_>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparatorPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1.5d", "8"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "capitalize", new String[]{"java.lang.String"}, new String[]{"HCello, Word"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("HCello, Word", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "capitalize", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isWhitespace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\036>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nSull", "Iello, Wnrmd"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[Su]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "right", new String[]{"java.lang.String", "int"}, new String[]{"1e10", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", "00-5dd", "11d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphaSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:K7n>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphaSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ab r>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAsciiPrintable", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\037r>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:err_>", "<null>", "2047"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:xbX\037 !;r>", "<s:xb+  r>", "2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"--1", "10", "{\"!:0}1.1234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"!:0}1--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:-<_>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:xb+   rr>", "<s:xbX A  ;r>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:yb7b, ! Csr>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultIfEmpty", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s: >", "<s:M>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:abcc>", "<s:4!>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "trimToNull", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:H\014Yd9<scy>", "<s:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"1L", "0xFFFFFFFF", "normalize"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"0/FNFsttn.6ext.NormalizerNFD", "z0eD1.2[1,2];  os a Sun JVM: ", "Tjtle"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("j/FNFtt6txtNrmliTtrNFl", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastOrdinalIndexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:b r>", "<s:abdc c>", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfDifference", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<null>", "<s:pM>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:9 >", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:K7n>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviate", new String[]{"java.lang.String", "int"}, new String[]{"1L", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Iello, Wnrmd", "--1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Iello, Wnrmd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:>", ">0{a:1}L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "left", new String[]{"java.lang.String", "int"}, new String[]{"jjavce_tTo5,1-5a-123446I78tJ133466\t1.1234567", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("j", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEach", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"00-5dd", "<empty>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("00-5dd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", "", "r-.1.5fIjava.text.Normalizer"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfDifference", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:\036r>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBefore", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Strings mXst not", "i"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Str", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "java.lang.String"}, new String[]{"<sample:2>", "<"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:e:o>", "Str9ingt musu\n/ot c4e 3ulll:"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"11d", "8192", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBefore", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "-A1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.CharSequence", "int", "int"}, new String[]{"<null>", "-1", "9223"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{"x0e..1.e300", "-536862876", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x0e..1.e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "endsWithAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:\036r-t>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int"}, new String[]{"TB1.1234567", "18391"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#18391#-888188919", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAsciiPrintable", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"2147483648", ".", "-1073741824"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[2147483648]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfDifference", new String[]{"java.lang.CharSequence[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "endsWithAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:8>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEach", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"0", "<sample:0>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEach", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"0", "<sample:2>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEach", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"0", "<sample:0>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEach", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"", "<null>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"13-6L", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3-6L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"13-6L", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("13-6L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "normalizeSpace", new String[]{"java.lang.String"}, new String[]{"\\s+"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\s+", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "uncapitalize", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:abd>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfDifference", new String[]{"java.lang.CharSequence[]"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "TITLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String"}, new String[]{"-0E..0; or  a"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[-0E..0;, or, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"1233567890134567890123447890", "-61441", "8200"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1233567890134567890123447890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"{\"!:0}1.1234567", "noo7malize", "-2", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("noo7malize{\"!:0}1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"null", "n-o7malize", "8191", "8193"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nulln-o7malize", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"null", "<a>b</a>", "8191", "-55"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverse", new String[]{"java.lang.String"}, new String[]{"\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5g", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5g", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:err_>", "<s:abcc>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "countMatches", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:cuB>", "<s:\036r>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "countMatches", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:\036r>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfter", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"r--1.5fIjav`.text.NormalizerTITLE1.25", "1."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5fIjav`.text.NormalizerTITLE1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:>", "4116"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.CharSequence", "int", "int"}, new String[]{"<s:err_>", "8", "-55"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "java.lang.String"}, new String[]{"<null>", "\u00eaH"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripToEmpty", new String[]{"java.lang.String"}, new String[]{"\037r "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"1.1234567890123456", "<null>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String", "int", "int"}, new String[]{"<null>", "010", "-61441", "-2"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "char"}, new String[]{"<empty>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparatorPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,b,cHello, World", ""}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a,b,cHello,, World]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparatorPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,b7cHello, Worlc<a>b</a>", "a"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, ,b7cHello, Worlc<, >b</, >]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "right", new String[]{"java.lang.String", "int"}, new String[]{"I", "-1073741824"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultIfBlank", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:\036r>", "<s:4.7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\036r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"\\s+", "java.text.Normalizer", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"/", "-536862876", "Strings must not be null"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:\036r>", "; or a Sun JVM: "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<null>", "x0e..1.e300"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:abbd>", "Iello, Wnrmd"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:abbbm>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "upperCase", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"00-5dd", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("00-5DD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlpha", new String[]{"java.lang.CharSequence"}, new String[]{"<s:cuB>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int"}, new String[]{"1", "-61441"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", ":l1.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":l1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlpha", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEach", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"0./1.5e300a,b,c", "<sample:1>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0./1.5e300a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "equalsIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:abd>", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int"}, new String[]{"1.5[1,2]", "8"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:=>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeEndIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"sun.text.Normalizer1.5f", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sun.text.Normalizer1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"123356789ss0134567890123447890", "2020-02-30T25:61:60"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123356789ss0134567890123447890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "0/-5dd"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "deleteWhitespace", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBeforeLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1.1234567890123456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"8192", "1z", "1"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[8192]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "char"}, new String[]{"<null>", "H"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "int"}, new String[]{"123356789ss0134567890123447890", "1", "0./1.5e300", "4095"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0./1.5e30023356789ss00./1.5e300345678900./1.5e30023447890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:H\014Yd9<sbcy>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "12:0:45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfter", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "0-5dd"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviate", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.2224m567d105.", "-1073741888", "10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.2224m...", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:abdc c>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultIfEmpty", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:lx-<__>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("lx-<__", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<null>", "<s:\036r-t>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastOrdinalIndexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:\036r>", "<s:>", "4082"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String"}, new String[]{" vs "}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[vs]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", "/0.5bdV", "\u00eaH"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "char"}, new String[]{"123456789012345678901234567890", "0"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[123456789, 123456789, 123456789, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceOnce", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", "a,b7c4ello, Xnrlc<a>b</a> ", "/bn c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceOnce", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"1\t", "\t", ".\r.Hello, World0x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.\r.Hello, World0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "int"}, new String[]{")\n", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(")\n)\n)\n)\n)\n)\n)\n)\n)\n)\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"x0e.N1.e300; or\037a  Sun JVM: ", "<sample:0>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x0e.N1.e300; or\037  Sun JVM: ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"n3rracJHa,jbb</aE123true;Por a Sun JVL: ", "<sample:2>", "<sample:8>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"<m4CrLac3Hi,_b=/aE123truePJr\t a Sn IVM:\0371.25155fNFD", "<sample:8>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfDifference", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:xbX   ;r>", "<s:xbX   ;r>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:8>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:->", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
}
