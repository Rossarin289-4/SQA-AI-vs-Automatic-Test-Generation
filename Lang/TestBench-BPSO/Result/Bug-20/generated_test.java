package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:\">", "<s:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:aacL>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" vs ", "\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" vs ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "upperCase", new String[]{"java.lang.String"}, new String[]{"Title"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"decoFpose", "a,b,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("decoFpose", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparatorPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"a b", "12:30:455", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotEmpty", new String[]{"java.lang.CharSequence"}, new String[]{"<s:b>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultString", new String[]{"java.lang.String"}, new String[]{"12:30:4558192"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:4558192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "char"}, new String[]{"<empty>", " "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:acLL>", "<s:bc>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "char", "char"}, new String[]{"1.5d2020-02-30T25:61:61", "c", "P"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5d2020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"0xFFFFFFFFi", " 1.5e300", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFFi", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "deleteWhitespace", new String[]{"java.lang.String"}, new String[]{"trueTITLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("trueTITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviate", new String[]{"java.lang.String", "int"}, new String[]{"0", "8192"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.124567", ";10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.124567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int"}, new String[]{"1.58192", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.58192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:acLLz>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastOrdinalIndexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:>", "<s:9b>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "\\s+", "Stringr must not be null"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:T>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphaSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\"9{>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:b>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultIfBlank", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:bac>", "<s:af>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bac", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultIfEmpty", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:acLLy>", "<s:0s>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("acLLy", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chop", new String[]{"java.lang.String"}, new String[]{"1.5e3001"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "left", new String[]{"java.lang.String", "int"}, new String[]{"java.texs.", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.texs.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviateMiddle", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"--1n8ull is less than 0: ", ".5 is\037less than 0: ", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1n8ull is less than 0: ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:aac>", "<s:CaadLL>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:309455", "decompose+1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:309455", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviate", new String[]{"java.lang.String", "int"}, new String[]{"2147483648", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"TimeToLiive of c", "-16386", "C0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TimeToLiive of c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "trimToNull", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "endsWithAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:aLLzN>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:pT>", "<s:.b>", "-16386"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:tSC>", "-134217727"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "java.lang.String"}, new String[]{"<sample:2>", "0xFFFFFFcFF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "ordinalIndexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:>", "<s:m4>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "0x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.CharSequence", "int", "int"}, new String[]{"<s:acLLx>", "-134217727", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBefore", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Stringr must not be null", "0x13456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Stringr must not be null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeEndIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1et0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1et0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllLowerCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:9W>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "equalsIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:b>", "<s:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "char"}, new String[]{"0x1Ft", "@"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1Ft", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:>I/>", "noqmaljze"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "length", new String[]{"java.lang.CharSequence"}, new String[]{"<s:9L>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:aaIcL>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"1.1233456781E-5", "12:0:451.25", "-2147483648", "10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:0:451.2581E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "char"}, new String[]{"+1", "l"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[+1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"sun.text.Normalizera[1,2]", "normalize12:30:451.5f", "+1d"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isWhitespace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:9bb>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeEnd", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TIT\rE", "0x13456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TIT\rE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAsciiPrintable", new String[]{"java.lang.CharSequence"}, new String[]{"<s:aTcLL>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:bcLDy>", "\tx123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfterLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:45TimeToLive of ", "\tx123456789"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "countMatches", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:9L>", "<s:9L>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:\"t9{9>", "<s:  >"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllLowerCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:pTTB>", "<s:>I/>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:,a>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastOrdinalIndexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:`cLLz>", "<s:aTcLK>", "8221"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int"}, new String[]{"j\tava.text.Normalizer\n", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("j\tava.text.Normalizer\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lowerCase", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"12:30:4558192", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:4558192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlpha", new String[]{"java.lang.CharSequence"}, new String[]{"<s:a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "deleteWhitespace", new String[]{"java.lang.String"}, new String[]{"Hello, Worldsun.text.Normalizer"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello,Worldsun.text.Normalizer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEach", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"-", "<null>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviateMiddle", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"1.123456789012346", "Str{ngr must not be null", "32766"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123456789012346", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"0xF{FFFFGFFi", "true", "-8191"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0xF{FFFFGFFi]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int"}, new String[]{"1-.124567", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-.124567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAccents", new String[]{"java.lang.String"}, new String[]{"decompose+1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("decompose+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByCharacterTypeCamelCase", new String[]{"java.lang.String"}, new String[]{"1.35d2020-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[1, ., 35, d, 2020, -, 02, -, 30, T, 25, :, 61, :, 61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "capitalize", new String[]{"java.lang.String"}, new String[]{"01021474836647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("01021474836647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:aaac>", "<s:9a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"", "E"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:99sW>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"a HHb", "2147483647", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2key0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:\"t9{9>", "<s:a4bc>", "-2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:bc>", "<s:bx>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "normalizeSpace", new String[]{"java.lang.String"}, new String[]{"012356789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("012356789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphaSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:b>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{"0x13456789 vs ", "2147483647", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverse", new String[]{"java.lang.String"}, new String[]{"normalize"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ezilamron", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"dfcoFpose", "1.1234567", "24577"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("dfcoFpose1.1234567dfcoFpose1.1234567dfcoFpose1.1234567dfcoFpose1.1234567dfcoFpose1.1234567dfcoFpose1.1234567dfcoFpose1.1234567dfcoFpose1.1234567dfcoFpose1.1234567dfcoFpose1.1234567dfcoFpose1.1234567df...#442377#-420750807", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"[`,2]", "", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[`,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"n", "<null>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:bc+>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:\u00e9>", "aa"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.CharSequence", "int", "int"}, new String[]{"<s:\\9>", "2147483647", "4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.util.Iterator", "char"}, new String[]{"<null>", "C"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:cc>", "<s:9W>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:acLLx>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:CaadLL>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"http//example.com/a?b=c1.12345678901234567", "4", "1L0xFFEFFGFF-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http//example.com/a?b=c1.12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"", ".{..j", "-8191"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "swapCase", new String[]{"java.lang.String"}, new String[]{"Iello, Worldsun.texu.Normalizer"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("iELLO, wORLDSUN.TEXU.nORMALIZER", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"enT\rE", " is less than 0: ", ""}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultIfEmpty", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:aTcLK>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aTcLK", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ormalhzei", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ormalhzei", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:ac>", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsWhitespace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:aasc>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:C9>", "<s:aadL>", "-8134"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5", "1L0xFFEFFGFE-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L0xFFEFFGFE-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:aTcKK>", "<s:bc>", "8192"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlpha", new String[]{"java.lang.CharSequence"}, new String[]{"<s:aa+TcKK>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", "0x123456789-1", "012356789v012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:d7Dbc>", "<s:0>", "4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:tSc>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultIfBlank", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:9a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:C 9>", "<s: >"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "swapCase", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\u00e9tNSC>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\037 >"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"214474483648\t", "-2147483616", "-8193"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:M\tm>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"C00-1", "-2147483640", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:5fEb>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String"}, new String[]{" 1.1.5d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 1.1.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:abc>", "<s:,a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "strip", new String[]{"java.lang.String"}, new String[]{"/`/b"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/`/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s: \037>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBetween", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"trueTISLE", "1A5"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "left", new String[]{"java.lang.String", "int"}, new String[]{"decooFjp\\se\\s+", "-134217727"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "endsWithAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:-La>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfter", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"72:30:445", "1.12345678901234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "char"}, new String[]{"<null>", "8"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lowerCase", new String[]{"java.lang.String"}, new String[]{"12:3009455"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:3009455", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBeforeLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Stringt 1ust not be nulltrue", "1.12345678W023456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Stringt 1ust not be nulltrue", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:M<\tm>", "<s:abc>", "-2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"0y0F", "10", "na b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("na 0y0Fna ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.58192a,b,c", "-2147483648", "2026"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.58192a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s::a>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:`>", "1013"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:>", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfter", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1.58192"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:!9{{>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:CaaaadLL>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s:cmW>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "char"}, new String[]{"1L0xFF", "1", "\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L0xFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "trimToEmpty", new String[]{"java.lang.String"}, new String[]{"[a,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{"1E--5", "-24561", "2026"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E--5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int"}, new String[]{"B0x13456789 vs 123456789012345678901234567890", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "char", "int", "int"}, new String[]{"<null>", "p", "32774", "-4"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlpha", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"a GHb5.", "5--", "123456789012345678901234567890"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:5>", "dgcoFposXe"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, ampl, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByCharacterType", new String[]{"java.lang.String"}, new String[]{"12:0:441.25"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[12, :, 0, :, 441, ., 25]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "endsWithAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:.c>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ca+TcKK>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:9bE>", "<s:9L>", "2028"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "trimToNull", new String[]{"java.lang.String"}, new String[]{"0y0{a,b,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0y0{a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllLowerCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int"}, new String[]{";102020-01-01", "-2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(";102020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int"}, new String[]{"1.58193a,b,c{\"a\":1}", "32837"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#32837#-761230555", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparatorPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1et0f-1", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[1et0f-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "z"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1/123456789\u00e91234567", "trNe"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/123456789\u00e91234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:acLvz>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "right", new String[]{"java.lang.String", "int"}, new String[]{"{\"a\":1}\t", "16383"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1c.5", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String", "int", "int"}, new String[]{"<null>", ",", "32837", "0"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:aaTc/>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripToEmpty", new String[]{"java.lang.String"}, new String[]{"1/123456789\u00e9123567\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/123456789\u00e9123567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "uncapitalize", new String[]{"java.lang.String"}, new String[]{"--11/5d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--11/5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "java.lang.String"}, new String[]{"<null>", "nT\rE"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:>", "<s:A >", "2028"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:\\\\a>", "nnormalize"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "capitalize", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<aCb</a>", "1"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[<aCb</a>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsWhitespace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chop", new String[]{"java.lang.String"}, new String[]{"\u00ea"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:+agS>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotEmpty", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:ac>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "strip", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"QT<0H", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("QT<0H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAsciiPrintable", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\u00e9\u00e8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:aclL>", "<s:cLLDx>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String"}, new String[]{"<null>", "NecoFjp\\se"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String"}, new String[]{"\tx123456789 vs normalize"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, x123456789, vs, normalize]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:aac>", "http//example.com/a?b=c1.12345678901234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "72:30:445Titke"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastOrdinalIndexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:oT>TB>", "<s:>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "int"}, new String[]{"", "[a,2\\1.25", "Stringt 1ust not be nullltrue", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "endsWithAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"\t\tx123456789decompose", ".{.-j", "2055", "-2147482624"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".{.-j", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:CaadLL>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String", "int", "int"}, new String[]{"<sample:3>", "aaNFD", "-268435454", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBeforeLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1.12345678W023456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripToNull", new String[]{"java.lang.String"}, new String[]{" 1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a", "0y0{a,b,c\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"decompose1.250xFFFFFFFF", "<sample:5>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"0xFFFEFFFF1L", "<empty>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFEFFFF1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "right", new String[]{"java.lang.String", "int"}, new String[]{"\"a\":L1}", "-1073741808"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"Stringt 1ust not be numltruue", "<sample:0>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<null>", " "}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:B N>", "0x1345679 vs "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"", "<sample:7>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http//examHple.com/a?bW=c1.12345678901234567", "B0x13456789 vs 123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[http//e, amHple.com/a?bW=c, ., , , , , , , , , , , , , , , , , ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String"}, new String[]{" v \\s+"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[v, \\s+]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:Aaf>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:acLXv>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:8>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByCharacterType", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"214474683648\t", "<sample:2>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("214474683648\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"2020-01-02a", "NFCi", "94", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-02aNFCi", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.CharSequence", "int", "int"}, new String[]{"<s:>", "2147483647", "8236"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"2A5", "<sample:5>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2A5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:bT>", "<null>", "64"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparatorPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567890123l\\567", ""}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[1.1234567890123l\\567]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:bxX>", "<s:b>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String"}, new String[]{"012356789012345678901234567890\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("012356789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"a\037HHb", "0xFFFFFFcFF", ".5d202-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\037HHb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<null>", "NecoFjp\\seTITLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"NFDTitle", "ormalizea,b,c", "..."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NFDTt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"{\"a\":1}-0.0", "16386", "!"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!...#16386#1143410498", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"10xFFFFFFFF", "0xFFFFFFFF", ".5 is\037bess!tha 0: "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5        ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:aaTc>", "a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparator", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"0\u00e9", "decoFpose", "-2147483618"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0\u00e9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"0x123456789-1.5", "-4", "b1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:acLy>", "<s:aTcLL>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "int"}, new String[]{"", "8194"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:aS>", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllUpperCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"2020-02-30T25:61:610x123456789", "1", "142"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[2020-02-30T25:6, :6, 0x, 23456789]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:AdDbb>", "<s:bb>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"72:30:445Titke1e10", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":445Titke1e1072:3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:EafT>", "72:30:445Titke"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"orma<hzei0xFFFFFFFFi", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("xFFFFFFFFi0orma<hzei", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:afS>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "char"}, new String[]{"0x123456789", "8"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x12345679", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeEndIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "f0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:>", "{\"a\":1}12:30:45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"a1.1234567890123456", "1", "1C.58192TITLE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparatorPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "-0.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:\u00e9tNS>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.CharSequence", "int", "int"}, new String[]{"<s:>", "94", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.CharSequence", "int"}, new String[]{"<s:>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:>I0>", "<s:>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "char"}, new String[]{"<null>", "H"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfter", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a\u00e9", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviate", new String[]{"java.lang.String", "int"}, new String[]{"--11/5da", "4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-...", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:tS >"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "right", new String[]{"java.lang.String", "int"}, new String[]{"1.123456789012335670", "14"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("56789012335670", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfAny", new String[]{"java.lang.CharSequence", "java.lang.CharSequence[]"}, new String[]{"<s:cLLz>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "upperCase", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"TTWH", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TTWH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllUpperCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:BE N\n>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceOnce", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"decompose1.250xFFFFFFFF123456789012345678901234567890i", "1", "\u00e8\u00e8"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("decompose\u00e8\u00e8.250xFFFFFFFF123456789012345678901234567890i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"-1.5 is less than 0: ", "<sample:8>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5 is less thn : ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "int"}, new String[]{"1.12345678901234567 is less than 0: ", "i", "012356789012345678901234567890\na,b,c", "-268435454"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567 012356789012345678901234567890\na,b,cs less than 0: ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"decompose+11.4d", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("decompose+11.4d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "int"}, new String[]{"2", "8221"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222...#8221#1455147186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{".-1n8ull is less than 0: ", "16418", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#16418#1317323727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{"TITLEE", "4", "24610"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("EE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "left", new String[]{"java.lang.String", "int"}, new String[]{"12:0:P45", "2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:\ta>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "0xFFFEFFFF1L\\s+0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsWhitespace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:  i\037>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "int"}, new String[]{"ka", "Stringt 1ust not be numlsruud", "", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ka", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfDifference", new String[]{"java.lang.CharSequence[]"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"TITLEnull", "", "122:30:445TimeToLive of {\"a\":1}"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLEnull", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfterLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"C00--1", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<null>", "<s:>", "-2147483584"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"260p20-01-01", "", "94"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("260p20-01-01260p20-01-01260p20-01-01260p20-01-01260p20-01-01260p20-01-01260p20-01-01260p20-01-01260p20-01-01260p20-01-01260p20-01-01260p20-01-01260p20-01-01260p20-01-01260p20-01-01260p20-01-01260p20-0...#1128#233223868", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "ordinalIndexOf", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:>", "<s:>", "136"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t1.1234W67890123455", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t1.1234W67890123455", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:t>", "<s:tQ>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"1E-5", "16427", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#16427#1487432956", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "countMatches", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:a4bec>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEach", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"1L0xFFFFFFFF", "<sample:9>", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L0xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparatorPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xFFFFFFFFF", "0xFFFFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int"}, new String[]{"<null>", "2147483590"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,0b-c", "a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",0b-c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "strip", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"123456789012345678901234567890", "0x1234567890xFFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:00>", "<s:>", "-2147483633"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int", "char"}, new String[]{"1L0xFFFFFFFF", "-8193", "_"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L0xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isEmpty", new String[]{"java.lang.CharSequence"}, new String[]{"<s:U>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:AT>", "<s: 0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfIgnoreCase", new String[]{"java.lang.CharSequence", "java.lang.CharSequence", "int"}, new String[]{"<s:a,dL>", "<s:aacL>", "-8380458"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripToEmpty", new String[]{"java.lang.String"}, new String[]{"Stringt 1ust not be null"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Stringt 1ust not be null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "countMatches", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:#>", "<s:acLLz>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWith", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:N>", "<s:>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripEnd", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".5 is\037bess!than 0: ", "010"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5 is\037bess!than 0: ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"12309455", "decoFjp\\se", "19", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("decoFjp\\se", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String", "int", "int"}, new String[]{"<sample:0>", "1.5d2020-/2-I30T25:61:61", "16382", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotEmpty", new String[]{"java.lang.CharSequence"}, new String[]{"<s:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
}
