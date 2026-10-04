package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<null>", "<s:abc>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfterLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"true", "0x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e10", " vs "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByCharacterTypeCamelCase", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" is less than 0: ", "Hello, World"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, is, , , ss, than, 0:, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverse", new String[]{"java.lang.String"}, new String[]{"Title"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("eltiT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "char"}, new String[]{"i", " "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "char", "int"}, new String[]{"1.6", "\uffff", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBefore", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678", "normalize"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBefore", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.+124578", "."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBefore", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"19.+1224578i", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "strip", new String[]{"java.lang.String"}, new String[]{"5."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllUpperCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotEmpty", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotEmpty", new String[]{"java.lang.CharSequence"}, new String[]{"<s:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeEnd", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e300", "normalize"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripToNull", new String[]{"java.lang.String"}, new String[]{"gP5ph/\t"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("gP5ph/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripToNull", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"}12:x0:45abc", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("}12:x0:45abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2120-01-30T25:61:61", "2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("120-01-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:a>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:a>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "char", "char"}, new String[]{"0x1F", "\uffff", "a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "g", "}12:x0::45adIc1.1234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:,0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1F", "0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chop", new String[]{"java.lang.String"}, new String[]{"5."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" is\037lvss\u00e9 uhan\t[1,22L{\"a\":1}", "2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:sa<>", "normali\"e"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:a>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{".5", "-2147483648", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{".55", "0", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "char"}, new String[]{"<a>b</a>", "\uffff"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "char"}, new String[]{"<null>", " "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "capitalize", new String[]{"java.lang.CharSequence"}, new String[]{"<s:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "trimToEmpty", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:a>", "1e10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:a>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:>", "0e1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{".", "TITLE", ".55d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{".55d", "-2147483648", "1.12345678901234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".55d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "length", new String[]{"java.lang.CharSequence"}, new String[]{"<s:,0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:,0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "ordinalIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"2", "1.1234567", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITLE", ".5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfDifference", new String[]{"java.lang.CharSequence[]"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfDifference", new String[]{"java.lang.CharSequence[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeEndIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5d", "1.\tPT1H"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1.5", "a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeEndIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1.5", ".5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultString", new String[]{"java.lang.String"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByCharacterType", new String[]{"java.lang.String"}, new String[]{"5."}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[5, .]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[<a>b</a>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\037>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"-1.5", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "deleteWhitespace", new String[]{"java.lang.String"}, new String[]{"}128:w0:45abc vs Strings must not be null"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("}128:w0:45abcvsStringsmustnotbenull", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "deleteWhitespace", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "deleteWhitespace", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeEndIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "upperCase", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5D", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:abc>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b</a>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2a>b</a>", "1.1234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2a>b</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"a,b,cTimeToLiveof a", "0", ".5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,cTimeToLiveof a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"0x1F", "<null>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"0x1F", "<empty>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"0x1W", "<sample:2>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"0x1W", "<sample:2>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1W", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "equalsIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1", "-3.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"a,b,c", "g", "33554430", "8193"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,cg", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.String", "char"}, new String[]{"5.", "\000"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"", "<sample:4>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"aXX2020-02-30T25:61:61", "<sample:4>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "0x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"0x1W", "2020-02-30T25:61:61", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "char"}, new String[]{"NF\"D", "-8192", "\uffff"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NF\"D", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int"}, new String[]{"Strings must not be null", "-8193"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Strings must not be null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEach", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"a", "<sample:4>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviate", new String[]{"java.lang.String", "int"}, new String[]{" vs ", "8193"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" vs ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "countMatches", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "1.5d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "ordinalIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"1.5d", "0xF", "8191"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "java.lang.String"}, new String[]{"<sample:2>", "}12:x0:45abc"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{".55d", "0x1Vnull", "\t"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "left", new String[]{"java.lang.String", "int"}, new String[]{"0e1", "-8193"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "uncapitalize", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.String", "char[]"}, new String[]{"20l0j01-01", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAsciiPrintable", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAsciiPrintable", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<empty>", "2020-0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<null>", "-0"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:5\037>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"g", "1E-5", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[g]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllUpperCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:W0j>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllUpperCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:EE>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".55", "2020-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "ordinalIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"jav.text.Normalizer 1.5f", "", "2147475455"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s: >", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfterLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"b", ""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"1.12345678901234567", "-2", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1F", "0xFFFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"PT1H", "b", "26"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lowerCase", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("hello, world", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.String", "char", "int"}, new String[]{".55d", "\uffff", "33554430"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "endsWith", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"}128:w0:45abc vs Strings must not be null", "NFD"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"eeTite", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("eeTite", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"", "1.25", "8193"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,b,c", "a,b,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int"}, new String[]{"}128:w0:45abc vs Strings must not be null", "-16"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("}128:w0:45abc vs Strings must not be null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:\037>", "<s:a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviate", new String[]{"java.lang.String", "int"}, new String[]{"8192", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lowerCase", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"a", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphaSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphaSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:5\037>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "trimToNull", new String[]{"java.lang.String"}, new String[]{"8192"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", "010", "java.text.Normalizer"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "uncapitalize", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int"}, new String[]{"-1.5", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int"}, new String[]{"-2.5Ea/b", "17324"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#17324#2081031995", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlpha", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"a0bc1.5e300", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bc1.5e30a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"<null>", "0"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"00`,,0,,a,b,c1D-51L[1,2]", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",,a,b,c1D-51L[1,2]0`,,", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1c_TimeToLive of ", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "left", new String[]{"java.lang.String", "int"}, new String[]{"2020-02-30T25:61:61", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"\n", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultIfEmpty", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:\037>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\037", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.35f147483648", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aXX2020-02-30T25:62:611.12345678901234567", "."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlpha", new String[]{"java.lang.CharSequence"}, new String[]{"<s:EE>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"1.5e300", "10", "NFD"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NFD1.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"1.5e300", "10", "_NFD"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_NF1.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"1.5e300", "2097107", ""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#2097107#817772710", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Txa", "2020-02-30T25:61:61"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "trimToNull", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"T0H1\"5f\t", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "char"}, new String[]{"<sample:0>", "\000"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "char", "int", "int"}, new String[]{"<sample:0>", "\000", "8192", "-16"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.+124578", "1.12345670895123456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12345670895123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[1-2]2147493648", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:\u00e9L>", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:>", ","}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int"}, new String[]{"5.", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "right", new String[]{"java.lang.String", "int"}, new String[]{"1.1234567", "-8193"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "java.lang.String"}, new String[]{"<null>", "2020-02-30T25:61:61"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.util.Iterator", "char"}, new String[]{"<null>", " "}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:>>>", "0wE<`0></a>isu lertl than  09 "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{" is\037lvss\u00e9 uhan\t[1,22L{\"a\":1}", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:abc>", "C-FE;`/h0=\ra"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.String", "char"}, new String[]{"2120-01-30T25:61:61", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "0xF"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"\u00e9", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAccents", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0100Title", "i"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isWhitespace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:D>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviateMiddle", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"0x123456789", "-1.5", "-8192"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviateMiddle", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"0x1234567891.6", "12x45678j012345678901234567890", "253952"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1234567891.6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"http://example.com/a?b=c", "/", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[http:, example.com, a?b=c]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBetween", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-2.5Ea/b", "."}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBetween", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-2.5Ea/b", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "char", "int", "int"}, new String[]{"<null>", "/", "-122", "16"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripEnd", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "SP"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:5\037>", "<s:\037>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:5\037>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0CG/1e11", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0CG/e", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAsciiPrintable", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\t>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfter", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"g", "SP"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllLowerCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:z\036F>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"0100Title", "1.1234567", "8191"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0100Title1.12345670100Title1.12345670100Title1.12345670100Title1.12345670100Title1.12345670100Title1.12345670100Title1.12345670100Title1.12345670100Title1.12345670100Title1.12345670100Title1.123456701...#147429#-1747711081", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"1E", "/`12", "-2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "upperCase", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{".5", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultIfEmpty", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:E>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{" is\037lvss\u00e9 umShan\t[1,22L{\"a\":1}", "eeTite", "-270275", "-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("eeTite is\037lvss\u00e9 umShan\t[1,22L{\"a\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "capitalize", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllLowerCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEach", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"tthttp://example.com/a?b=c", "<sample:4>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("tthttp://ex0mple.com/0?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"java.text.Normalizer", "eeTite"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.text.Normalizer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"<a>b</a>", "33554702", "33554430"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"<null>", "2a>b</a>", "253952"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:2>", "aX is less than 0: "}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[mp, , ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<empty>", "`X js less than 0: -1.5"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:0>", ""}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{" is less than 0: ", "17324", "-2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"b", "1", "253952"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1...#507903#-47764911", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"", "1", "253952"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...#253951#1305168465", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBeforeLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"eeTite", "Tfi8tl"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("eeTite", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isWhitespace", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"", "", "4194288"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "swapCase", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBeforeLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "fg"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBeforeLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"S", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"_NFD", "16", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_NFDaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllLowerCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.s12445671.6", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".74", "1.12345678"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:5\037e>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"a,b,cTimeToLiveof a", "-8193", "4194288"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,cTimeToLiveof a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<null>", "0"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String", "int", "int"}, new String[]{"<null>", "--1", "4194288", "33554430"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllUpperCase", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfter", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".a", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int"}, new String[]{"1.25", "253952"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int"}, new String[]{"1.25", "-245760"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "19.+1224678i"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"1.1234567", "0wE<`0></a>isu lertl than  09 ", "17324", "-270275"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0wE<`0></a>isu lertl than  09 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"normalize", "1", "1.5d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("normalize", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "swapCase", new String[]{"java.lang.String"}, new String[]{"1.5ee3000xFFFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5EE3000Xffffffff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "char"}, new String[]{"<null>", "17324", "\uffff"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<null>", "12;x0:b\u00e86}bc{a bittt://exalple.com/a1b=cStrings must not be null"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"}T1HTim\u00e9eToLivge of 1.25", "8191", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222...#8191#-471540143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"}T1HTim\u00e9ehoLivge of 1.25", "16323", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#16323#28028243", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,bcTimeToLiveof a8192", "java.text.Normalizer"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String", "char"}, new String[]{"<null>", "\uffff"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String", "char"}, new String[]{"", "\ufffe"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceOnce", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"20l0j01-01", "", "Title"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("20l0j01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"<null>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "char"}, new String[]{"<null>", "!"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastOrdinalIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"}128:w0:45abc_ vs Strings must not be null2147483648", "m", "8126416"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastOrdinalIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"}128:w0:45abc_ vs Strings must not be null2147483648", "", "8126435"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("52", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBeforeLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,b,cTimeToLiveof a", "a,b,cTimeToLiveof a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"tthttp://example.com/a?b=c", "abc"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "19.+1224678i"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparator", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"-E1E-5", "-", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[E1E, 5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.String", "char"}, new String[]{"12x45678j012345678901234567890", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"T01.!5f1.5e3002.12345a79023456", "<sample:11>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T1.!5f1.5e32.123457923456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"T01.!5f1.5e3002.12345a79023456", "<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "right", new String[]{"java.lang.String", "int"}, new String[]{"5.", "33554702"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "1.35f147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparator", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"<null>", ".55d", "4194288"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2key0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"\t", "Title", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"tthttp://example.com/a?b=c", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparatorPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"`X js less than 0: -1.5", "1E"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[`X js less than 0: -1.5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "char", "int"}, new String[]{"<null>", "/", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"8192", "1", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int", "char"}, new String[]{"<null>", "-2", "/"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviateMiddle", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"", "1.26", "4063217"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparatorPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"is\037ms\u00e9umm 1x5  b", "", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[is, ms\u00e9umm, 1x5, , b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chop", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"-0/2a/b1.5Hello, World", "-268437504", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0/2a/b1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:`a>", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"-1.5", "8192", "NF\"D"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1L", "0x123456789"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"aXX", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{":XXX", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripToEmpty", new String[]{"java.lang.String"}, new String[]{" "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", ".fe10", "/1.6iI:"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"sii", "ff11", ""}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", "m", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "19-55"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<null>", "n.*T12457\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String"}, new String[]{"m"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"I", ".55"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", ".55"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", "0x1W"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{"-E", "10", "2097107"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"ba`a`FabaA```aaaaaaeaLaa.aPva`aax", "P", "+jb"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\t>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"aaa```b<0fz```LAarnagt/Na.aPO,F<>b</>..normalize010", "z", "0"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[```LAarnagt/Na.aPO,F<>b</>..normalize]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"<null>", "{\"a\":1}", "8193"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:W0j>", " is less than 0: "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfterLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-h2.5EasEukl_5.", ".5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("EasEukl_5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "capitalize", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "char"}, new String[]{"aaa````b<0fz```LAarnagt/N.aPO,CF=>b</>..normali", "a"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, , , ````b<0fz```LA, rn, gt/N., PO,CF=>b</>..norm, li]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "char"}, new String[]{"aaa````b<0fz``tLAarnagt/N.aPO,CF=>b</>..normali", "i"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[aaa````b<0fz``tLAarnagt/N.aPO,CF=>b</>..normal, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:!>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "countMatches", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5ed300b0xFFFFFFFF", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "countMatches", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5ed300b0xFF_FFFFFF", "x"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceOnce", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"-0/2a/b1.5Hello+ World", "2", "t\nueg"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0/t\nuega/b1.5Hello+ World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "left", new String[]{"java.lang.String", "int"}, new String[]{"}T1HTim\u00e9e-ToLivge of 1.25", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("}T1HTim\u00e9e-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByCharacterTypeCamelCase", new String[]{"java.lang.String"}, new String[]{"aaa```b<0fz```LAarnagt/Na.aPO,F<>b</>..normalize010"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[aaa, ```, b, <, 0, fz, ```, L, Aarnagt, /, Na, ., a, PO, ,, F, <>, b, <, /, >, .., normalize, 010]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isWhitespace", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"1/6d1e10{", "}T1HTimj\u00e9ehoLiuge bof 1.21.5d+1", "go5h/\t-x"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5/6550{", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"20l0j001B-01", "", "-536870889"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "uncapitalize", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:8 >"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
}
