package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "char", "int"}, new String[]{"1.5e300", " ", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"i", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviate", new String[]{"java.lang.String", "int"}, new String[]{"true", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "length", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAccents", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "int"}, new String[]{"/a/b", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String", "int", "int"}, new String[]{"<null>", "java.text.Normalizer", "8191", "1"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumericSpace", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "capitalize", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"2020-02-30T25:61:61", "1.5f", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"Title", "--1", "0x123456789"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.String", "char[]"}, new String[]{"0", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.String", "char[]"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.String", "char[]"}, new String[]{"aaaaaaaaaaaaaaaaaabaaaaaaaaa", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumericSpace", new String[]{"java.lang.String"}, new String[]{"a b"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByCharacterType", new String[]{"java.lang.String"}, new String[]{"! "}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[!,  ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int"}, new String[]{"12:30:45", "-8192"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "trimToNull", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceOnce", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"1.5f", " ", "010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "char"}, new String[]{"itle", "-8191", "\ufffe"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("itle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllLowerCase", new String[]{"java.lang.String"}, new String[]{"normalize"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllLowerCase", new String[]{"java.lang.String"}, new String[]{"noqm`ize"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "upperCase", new String[]{"java.lang.String"}, new String[]{" vs "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" VS ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "countMatches", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:45", "TimeToLive of "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aa<aaaaaaaaaaaaaaabaaaaaaaaa", "/`/b{\"a0:1}"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"java.text..Normalizer", "{\"a\":1}"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultIfEmpty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b</a>", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"2147483647", "i", "-1"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[2147483647]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviate", new String[]{"java.lang.String", "int"}, new String[]{"010", "2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.String", "char", "int"}, new String[]{"1E-5", "a", "8193"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e300", "itle"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "char"}, new String[]{"8192", "\000"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "char"}, new String[]{"8-cc:3", "-"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8cc:3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lowerCase", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"/`/b{\"a0:1}", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/`/b{\"a0:1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.String", "char"}, new String[]{"+1", "\ufffe"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumeric", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumeric", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumeric", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "right", new String[]{"java.lang.String", "int"}, new String[]{"java.text..Normalizer", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Normalizer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "right", new String[]{"java.lang.String", "int"}, new String[]{"java.text..Normalizer", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "right", new String[]{"java.lang.String", "int"}, new String[]{"java.text..NorNmali{er", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.text..NorNmali{er", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparator", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"2147483648[1,2]", "2", "0"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[147483648[1,, ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparator", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"", "3", "-1"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAsciiPrintable", new String[]{"java.lang.String"}, new String[]{"java.text.Normalizer"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2030-W1-01", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("030-W1-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,b,c", "abaaaaaaaaaaaaaaaabaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("baaaaaaaaaaaaaaaabaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<empty>", "abaaaaaaaaaaaaaaaabaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<null>", "abaaaaaaaaaaaaaaaabaaaaaaaaa"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.String", "char"}, new String[]{"1E-5", "a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlpha", new String[]{"java.lang.String"}, new String[]{"TimeToLive of "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "char"}, new String[]{"2020-02-30T25:61:61", "\ufffe"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"3", "8-cc:3", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"1", "9,cS;3", "8191"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("19,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,cS;319,c...#57331#1734293169", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "char"}, new String[]{"<sample:0>", "-"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"null", "5."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nvll1", "51.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"1.1234567", "-8191", "java.text.Normalizer"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-5", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[E-5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "upperCase", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"0xFFFFFFFF", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0XFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "[1,2Hello,rWorld"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"12:30:45", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"normalize", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int"}, new String[]{"aaaaaaaaaaaaaaaaaabaaaaaaaaa", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaabaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"123456789012345678901234567890", "  "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBeforeLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:61:61", "Strings must not be null"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "uncapitalize", new String[]{"java.lang.String"}, new String[]{"nvll1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nvll1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "char", "int", "int"}, new String[]{"<null>", "0", "2", "2147483646"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.String", "char[]"}, new String[]{"3", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int"}, new String[]{"TimeToLivve", "16452"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#16452#125305472", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "char", "char"}, new String[]{"5.", "\uffff", "-"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int"}, new String[]{"<null>", "32879"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "java.lang.String"}, new String[]{"<sample:2>", "1.25"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfDifference", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultString", new String[]{"java.lang.String"}, new String[]{"8-cc:3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8-cc:3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.String", "char[]"}, new String[]{"Hello, World", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"! ", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBefore", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITLE", "1.12345678901234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int"}, new String[]{"H6Thttp://exampple.cnm/a?b=c1.5", "10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H6Thttp://exampple.cnm/a?b=c1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.String", "char[]"}, new String[]{"2030-W1-01", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphaSpace", new String[]{"java.lang.String"}, new String[]{"\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByCharacterTypeCamelCase", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"0x123456789", "PT1H", "-2", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "java.lang.String"}, new String[]{"<null>", "A"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678", "12:30:45"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[1,2]", "-1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:8>", " is less than 0: "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, , mp]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "ordinalIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"Strings must not be null", "< ", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "ordinalIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"[1,2]", "< ", "8192"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"\u00e9", "-2147483647", "a,b,c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"-1.5", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"http://example.com/a?b=c", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.1_34567890222441", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBeforeLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.6", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBeforeLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBeforeLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", ""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lowerCase", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"<null>", "<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-01-01", "1.5e300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567-0.0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".1234567-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567-0.0", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeEndIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a\":1}", "  "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"abc", "I"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "int"}, new String[]{"", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripToEmpty", new String[]{"java.lang.String"}, new String[]{"Ze,3\\"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ze,3\\", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0", "TimeToLivve"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"H6Thttp://exampple.cnm/a?b=c1.5", "http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[H6T, , , , , , , , , , , , , , , , , n, , , , , , , 1, 5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAsciiPrintable", new String[]{"java.lang.String"}, new String[]{"\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "equals", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a", "java.text.Normalizer"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripToNull", new String[]{"java.lang.String"}, new String[]{"TimeToLive of "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TimeToLive of", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfterLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--1", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "left", new String[]{"java.lang.String", "int"}, new String[]{"[1,2]", "8193"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2", "123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", ">a>b<a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBefore", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.25", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverse", new String[]{"java.lang.String"}, new String[]{"2120-01-z\"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1\"z-10-0212", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "3"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1.5", "[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "123"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.String", "char"}, new String[]{"Strings must ot be null", "i"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"Ze,3\\", "-2", "0x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ze,3\\", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfter", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\n", "abaaaaaaaaaaaaaaaabaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "endsWithIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1.5", "1237456789012345678:012346670x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{".5", "-2147483648", "2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{".5", "-2147483648", "-12"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"..55", "8226", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567-0.0", "i"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".5", "I"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"F0xFFFFFFFF", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "Hr"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.String", "char[]"}, new String[]{"null", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("truec", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"-1", "10", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("        -1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "swapCase", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "swapCase", new String[]{"java.lang.String"}, new String[]{"Strings mEust nnr be null19.1234567"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sTRINGS MeUST NNR BE NULL19.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllUpperCase", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"Ze,3\\", "12:30:45", "-12", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfterLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:61:61", "Hr"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripToNull", new String[]{"java.lang.String"}, new String[]{"  "}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumericSpace", new String[]{"java.lang.String"}, new String[]{"..55"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "left", new String[]{"java.lang.String", "int"}, new String[]{"<null>", "0"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripToEmpty", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "trimToEmpty", new String[]{"java.lang.String"}, new String[]{"5."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "equalsIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1", "TITLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.123456", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "TimdToLvc pf "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotEmpty", new String[]{"java.lang.CharSequence"}, new String[]{"<s:abc>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotEmpty", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparatorPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"java.text.Normalizer", "a,b,c", "1"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[java.text.Normalizer]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"true", "java.text..Normalizer"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:11>", "2<>25494}f6482020-01-01"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"51.5f", "<null>", "null"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("51.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"51.5f", "1.5", "null"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5nullf", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chop", new String[]{"java.lang.String"}, new String[]{"9,cS;3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9,cS;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"-1", "java.text..NorNmali{er", "/`/b{\"a\":1}"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isWhitespace", new String[]{"java.lang.String"}, new String[]{" is less than 0: "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", "a1aaaaa\t1E-5.5", "50"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"1.55", "_2147483v647", ""}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceOnce", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "[1,2]", "2147483647"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"TITLE", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"TITLE", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeEnd", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1", "a b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"819F", "4", "55", "-16452"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{" ", "<sample:7>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{" ", "<sample:7>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"", "<sample:7>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{" ", "<null>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"java.text.Normalizer", "<sample:7>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("j0v0.text.Norm0lizer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"java.tdxt", "<empty>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.tdxt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"awa..tdxt", "<sample:7>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("awa..tdxt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"awa.G.dxt", "<sample:2>", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{">a>b<a>", "-8191", "-12"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"hhf", "abc"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"Strings must ot be null", "-2147483600", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("St", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"3-p2f\t", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaabaaaaaaaaa", "1.55", "0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaabaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaababaaaaaa1-1", "1.566\ree10202I0002-01normalize", "60hx12o56on891.1234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bb646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"21474946448a", "", "0A000PT1HTITLE"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21474946448a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphaSpace", new String[]{"java.lang.String"}, new String[]{"a b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "deleteWhitespace", new String[]{"java.lang.String"}, new String[]{"_2147483v647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_2147483v647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "countMatches", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "<a>b</a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.String", "char[]"}, new String[]{"0x1G", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "; P"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ii", "1.566\ree10302I002-0normalize"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfter", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1F", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"hFFI", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"Hq8192", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "deleteWhitespace", new String[]{"java.lang.String"}, new String[]{"1.1244567-0./UITLE123456789012345678901234567890\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1244567-0./UITLE123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "uncapitalize", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeEndIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeEndIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"J", ""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("J", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllUpperCase", new String[]{"java.lang.String"}, new String[]{"J"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllUpperCase", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", "5.", "Strinhs must ot be null[,2]+1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.12345678901234567", "55", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"java.tdxt", "00223456789", "-2147483600"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripEnd", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "1.55"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int"}, new String[]{"\t", "8226"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int"}, new String[]{"1.1234667-0.0a b", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234667-0.0a b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String"}, new String[]{"7/.w_W\t\t "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[7/.w_W, , , ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "uncapitalize", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"", "3"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"jav", "v"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ja", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<null>", "1.6"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String"}, new String[]{"  "}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"Hello, orld", "l"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("dlo, orlHe", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int"}, new String[]{"<null>", "-16452"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumeric", new String[]{"java.lang.String"}, new String[]{"1.6"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lowerCase", new String[]{"java.lang.String"}, new String[]{"java.text..Normalizer"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.text..normalizer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "endsWith", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "{\"a\":1}"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "1.1234667-0.0a b"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<A0u0/PU1vHTILEa b", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"0", "X", "55"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0X0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"0", "", "55"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0000000000000000000000000000000000000000000000000000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "equalsIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "/`/Eb"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String"}, new String[]{"java.text..NorNm1.12245678901234567\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.text..NorNm1.12245678901234567\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"\033", "", "8202"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033\033...#8202#521183456", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isWhitespace", new String[]{"java.lang.String"}, new String[]{"\n"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "left", new String[]{"java.lang.String", "int"}, new String[]{"1.12345678", "-12"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfterLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-01-01", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfterLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147483647", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("47483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"java.text..Normalizer", "8226", "\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n...#8226#1489805676", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"java.text..Normalizer\n", "8226", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#8226#870560236", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "strip", new String[]{"java.lang.String"}, new String[]{"; P"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("; P", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "trimToNull", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"+1", "4", "[11,2]"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1[1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "char"}, new String[]{"I", "I"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByCharacterTypeCamelCase", new String[]{"java.lang.String"}, new String[]{".5--1BHx"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[., 5, --, 1, B, Hx]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByCharacterTypeCamelCase", new String[]{"java.lang.String"}, new String[]{"0x1TimeToLive of "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, x, 1, Time, To, Live,  , of,  ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "2W-p2f\t"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.String", "char[]"}, new String[]{"", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlpha", new String[]{"java.lang.String"}, new String[]{"NFD"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBetween", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"21474946448a", ""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String"}, new String[]{"J"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("J", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String"}, new String[]{"{8\"a\":1}}\r"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{8\"a\":1}}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "capitalize", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumericSpace", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "int"}, new String[]{"/`/Ebu", "/`/Eb", "  ", "1048466"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("  u", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{"0xFFFFFFFF", "2", "16473"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumericSpace", new String[]{"java.lang.String"}, new String[]{"3 "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "char"}, new String[]{"<null>", "1"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.util.Iterator", "char"}, new String[]{"<null>", "\n"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"010", "010", "00223456789"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"F+xFFFFFTF1.12345678", ""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F+xFFFFFTF1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"60h}x13o56on8991.D234567.0x123a456789-1<a>b</a>", "2", "9c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("60h}x13o56on8991.D234567.0x123a456789-1<a>b</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"<null>", "8218", ""}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".5", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultIfEmpty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "e,3\\"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("e,3\\", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.String", "char[]"}, new String[]{"1.5d", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", ""}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:61:61", "", "<PP"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chop", new String[]{"java.lang.String"}, new String[]{"2\n\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chop", new String[]{"java.lang.String"}, new String[]{"["}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"4", "4", "-1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"\u00e9", "4", "-.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-.5\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"00223456789", "2", "3"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"00223456789", "2", "31.5"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumeric", new String[]{"java.lang.String"}, new String[]{"1L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String"}, new String[]{"1.1244567-0./UITLE123456789012345678901234567890\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1244567-0./UITLE123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfterLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1.1244567-0./UITLE123456789012345678901234567890\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aw", "a"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[w]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/a/b", "b"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[/a/]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "char"}, new String[]{"<null>", "r"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparatorPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"java.text.Normaliz,r1.5e300", ""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[java.text.Normaliz,r1.5e300]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEach", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"0<A0u/PU1vHTILEaP bNFD", "<sample:4>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample<Asampleu/PU1vHTILE0P bNFD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "java.tdxt"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "aw", "1e10"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparator", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"TITLE", "<null>", "8218"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[TITLE]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAccents", new String[]{"java.lang.String"}, new String[]{"\u00eaah vs "}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "int"}, new String[]{"/`/b{\"`0:1}{\"a\":1}", "-61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "int"}, new String[]{"/`/b{\"`0:1}{\"a\":1} ", "61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/`/b{\"`0:1}{\"a\":1} /`/b{\"`0:1}{\"a\":1} /`/b{\"`0:1}{\"a\":1} /`/b{\"`0:1}{\"a\":1} /`/b{\"`0:1}{\"a\":1} /`/b{\"`0:1}{\"a\":1} /`/b{\"`0:1}{\"a\":1} /`/b{\"`0:1}{\"a\":1} /`/b{\"`0:1}{\"a\":1} /`/b{\"`0:1}{\"a\":1} /`/b{\"`0:1...#1159#1133094893", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "int"}, new String[]{"8`/b{\"`0:1}{\"a\":1} ", "122"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8`/b{\"`0:1}{\"a\":1} 8`/b{\"`0:1}{\"a\":1} 8`/b{\"`0:1}{\"a\":1} 8`/b{\"`0:1}{\"a\":1} 8`/b{\"`0:1}{\"a\":1} 8`/b{\"`0:1}{\"a\":1} 8`/b{\"`0:1}{\"a\":1} 8`/b{\"`0:1}{\"a\":1} 8`/b{\"`0:1}{\"a\":1} 8`/b{\"`0:1}{\"a\":1} 8`/b{\"`0:1...#2318#-361148608", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumericSpace", new String[]{"java.lang.String"}, new String[]{"0`/b{#a0:1}"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumericSpace", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\u00e9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s:v->"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s:bbc>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int"}, new String[]{"java.text.Normalizer", "8192"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#8192#-588118342", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int"}, new String[]{"123456789012345678901234567890", "-16384"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int"}, new String[]{"12345678d9012345678901234567890", "-16384"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12345678d9012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "char"}, new String[]{"12:30:45", "4048", "\""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"...#4048#-2108653403", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "char"}, new String[]{"12:30:45", "4048", "#"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("########################################################################################################################################################################################################...#4048#1612549413", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "countMatches", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12;30D", "TimeoLdNe if "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aa<aaaaaaaaaaaaaaabaaaaaaaaa", "o/ull"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultIfEmpty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"java.text.Norma", ""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.text.Norma", String.valueOf(actual));
 }
}
