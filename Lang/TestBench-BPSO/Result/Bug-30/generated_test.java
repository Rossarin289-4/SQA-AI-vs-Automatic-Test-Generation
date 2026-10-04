package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chop", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int"}, new String[]{"1.5d\t", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5d\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultString", new String[]{"java.lang.String"}, new String[]{".5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"java.text.ormalizer", "\t", "8161"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1.25"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "char"}, new String[]{"mulLl", "v"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "right", new String[]{"java.lang.String", "int"}, new String[]{"5", "4194282"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "char", "int", "int"}, new String[]{"<null>", "3", "-1", "2147483647"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "upperCase", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"`", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripToEmpty", new String[]{"java.lang.String"}, new String[]{"1.5e30"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeEndIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"java.text.ormalizer", "11.6"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.text.ormalizer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "left", new String[]{"java.lang.String", "int"}, new String[]{"", "4099"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:Ha>", "<s:4bc>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"/a", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.String", "char", "int"}, new String[]{"i", "3", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"3147483648", "0xFFFFFFE", "java.text.prmalizerNFD"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultIfEmpty", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:/>", "<s:\037>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparatorPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"0x1F", "1.5f", "-4194282"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0x1F]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastOrdinalIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"\u00e9", "1\t", "1073741823"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotEmpty", new String[]{"java.lang.CharSequence"}, new String[]{"<s:_>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "char"}, new String[]{"<null>", "I"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviateMiddle", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"8192", " 2157483647", "8188"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8192", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"214748364.", "nulm1L", "4194317", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("214748364.nulm1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.String", "char"}, new String[]{"1.1234567890123456", "\uffff"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfter", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"normaNize", "mvlLll"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\r\">"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "trimToNull", new String[]{"java.lang.String"}, new String[]{"\t1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"-7/a/b", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "equalsIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/a1.1234567", "0x12345678:-"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "char", "int"}, new String[]{" is less than 0: PT1H", "n", "-4186090"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:ac>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"", "w"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"11.6112345678901234567", "0xFFFFFFE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-01", "+1Hel"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "char"}, new String[]{"t3rueStrings must not be null", "3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("trueStrings must not be null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "countMatches", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:61:61", "1.5d"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "length", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\037H>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lowerCase", new String[]{"java.lang.String"}, new String[]{"2z"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverse", new String[]{"java.lang.String"}, new String[]{"}I"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1", "}I"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2.12345678", "/a1.1234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "char"}, new String[]{"1e10", "H"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"numk", "bI...", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"1\t", "/a/<b", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int"}, new String[]{"1.13345678", "8172"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfDifference", new String[]{"java.lang.CharSequence[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparatorPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2030-01-01", ""}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[2030-01-01]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String"}, new String[]{"0x1\"F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1\"F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:aac>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlpha", new String[]{"java.lang.CharSequence"}, new String[]{"<s:`>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"1E-5 is less than 0: ", "<empty>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E-5 is less than 0: ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"bbI..", "I"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("..Ibb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"I", "java.text.ormalizer"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeEndIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".-1--1", "-/a/b0xFFFFGFFF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".-1--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "char"}, new String[]{"<sample:0>", "V"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"0/", "-1.5", "CStrings must not be null"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.String", "char"}, new String[]{"<aa>b</>+1", "\uffff"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String", "int", "int"}, new String[]{"<empty>", " is less thanE 0: PT1H", "2147483647", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"ta/b", "t3rueStsings must not be null", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a/, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "ordinalIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{".5TITLE", "-7/`/b", "-34"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.4d", "1.1834567"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, , , d]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:\r>>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PTH", "PUH"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAccents", new String[]{"java.lang.String"}, new String[]{"aI.."}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "capitalize", new String[]{"java.lang.CharSequence"}, new String[]{"<s:4hb>c>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4hb>c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"xPT1N", "-9", "u--1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("xPT1N", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"/a/b1L", "<sample:2>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"...0x123456889", "..", "-I.0r"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-I.0r.0x123456889", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.d", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s:  >"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "char"}, new String[]{"-1.4", "-2147483648", "\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:\037>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "equals", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:\tc>", "<s:.>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByCharacterTypeCamelCase", new String[]{"java.lang.String"}, new String[]{"t3rueStsings must not be null2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[t, 3, rue, Stsings,  , must,  , not,  , be,  , null, 2147483647]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripToNull", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "uncapitalize", new String[]{"java.lang.CharSequence"}, new String[]{"<s:bb>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"0x1F0x123456789", "1.1234567i vs ", "536870875"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"", "Hello, World", "4132"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chop", new String[]{"java.lang.String"}, new String[]{"-J.0r"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-J.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "char", "char"}, new String[]{"trve", "W", "7"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("trve", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s: >", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "capitalize", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"normalizeTitle", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isWhitespace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\rx>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lowerCase", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"2030-01-0\t", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2030-01-0\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:4bfc>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByCharacterType", new String[]{"java.lang.String"}, new String[]{"1E,5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[1, E, ,, 5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{".-1-2", ".5d\t\t", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "java.lang.String"}, new String[]{"<null>", "2147483748"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.String", "char[]"}, new String[]{"0W1\"F0x123456789", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringsBetween", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"java.text.prmaliz", "<a>b</a>0", "[1,2]0xFEFFFFFF"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<empty>", "I7"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int"}, new String[]{"D/b1L", "-8192"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("D/b1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparator", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"normalizenormalizeI", "-1.0", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[normalizenormalizeI]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBetween", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1/6", "i"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"truPE", "u"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"{\"at:1}", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviate", new String[]{"java.lang.String", "int", "int"}, new String[]{"", "4124", "-4194282"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Iterable", "java.lang.String"}, new String[]{"<empty>", "114748364. "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "int"}, new String[]{"", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllLowerCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"I7--1", "/a1.124456712345678901234567890123456I890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I7--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"/a1.x12345672020-02-30T25:61:61", "a", "1"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[/a1.x12345672020-02-30T25:61:61]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "deleteWhitespace", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "strip", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12345678901234567890123456789L", "-7/`//b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:\rdx>", "<s:>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviateMiddle", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"1.11345678", "- b", "-4124"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.11345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s: \037>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeEnd", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"n", "a"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfDifference", new String[]{"java.lang.CharSequence[]"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int"}, new String[]{"11.55", "-13"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11.55", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int"}, new String[]{"1-12345678", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"java.text.prmaliz", "a4bc", "-21", "-1073512448"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a4bcjava.text.prmaliz", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBeforeLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" vs ", "1.d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" vs ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:5\t4b>", "<a>b</> "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<aa", "1..0234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<aa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "difference", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2\n", "2z--1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("z--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfDifference", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:4bc>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"/a1.124456712355{678901234567890123456I890", "1", "2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "leftPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"2e0", "-8192", "114748364. "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2e0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:.>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "deleteWhitespace", new String[]{"java.lang.String"}, new String[]{"normalize"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("normalize", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlpha", new String[]{"java.lang.CharSequence"}, new String[]{"<s:bc>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "abbreviate", new String[]{"java.lang.String", "int"}, new String[]{"TiimeToLive of ", "1073741823"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TiimeToLive of ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"a.5", "", "8191"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a.5a....#24573#-2066618136", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:.}X>", "1.4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "swapCase", new String[]{"java.lang.String"}, new String[]{"0x12345678:-2020-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0X12345678:-2020-02-30t25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", "", "2z"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEach", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"1.6\u00e9", "<sample:5>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.6\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"...0x1234566889", "-2147483648", "{\"at:1}"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("...0x1234566889", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:4bfdH>", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:54bcc>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"1.12", "9", "1E,5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E1.121E,", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "trimToEmpty", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.String", "char"}, new String[]{"<aa>b</>+1", "a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "right", new String[]{"java.lang.String", "int"}, new String[]{"/a1.x12345672020-02-30.T25:61:61", "14"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2-30.T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"<null>", "\r", "-1073512448"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "Title"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"11.12345671.12345678901234567", "25", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "countMatches", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TiimeToLive\037of ", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfterLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "deleteWhitespace", new String[]{"java.lang.String"}, new String[]{" vs "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("vs", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "left", new String[]{"java.lang.String", "int"}, new String[]{"javatextt.Normalizer12:30:45TITLE", "-6"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int", "char"}, new String[]{"1.123456789/123456", "4194282", "\uffff"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff...#4194282#-57122534", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isWhitespace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\014>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphaSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s:bP>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getLevenshteinDistance", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:4bfcc>", "<s:bac>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "char", "int"}, new String[]{"", "2", "-16384"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsAny", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"java.text", " .vs "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphanumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:0.>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String"}, new String[]{"\na,"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a,]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAsciiPrintable", new String[]{"java.lang.CharSequence"}, new String[]{"<s:bc>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllLowerCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:aNDc>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.String", "char"}, new String[]{"", "9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringAfterLast", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/a1.12345675.1.12345678901234567", "aI.j"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "upperCase", new String[]{"java.lang.String"}, new String[]{"2031-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2031-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEach", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"/`1.NFD", "<sample:0>", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/`1.NFD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{"ND", "-4186147", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ND", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "left", new String[]{"java.lang.String", "int"}, new String[]{"2//6", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.11345678Hello, WorldStrings must not be null", "2147483647", "67104740"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"202002-01", "<sample:0>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("202002-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "u--1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumeric", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<null>", "Titl"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "remove", new String[]{"java.lang.String", "char"}, new String[]{"", "v"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String", "int", "int"}, new String[]{"<null>", "D/b1LTITLE1E-5", "8235", "-1073774592"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "char"}, new String[]{"PT1HH", "H"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[PT1, , ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAsciiPrintable", new String[]{"java.lang.CharSequence"}, new String[]{"<s:\037>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "char"}, new String[]{"", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllLowerCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:x>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "right", new String[]{"java.lang.String", "int"}, new String[]{"truf", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substringBefore", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"java.text-Normalizer", "+<+1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.text-Normalizer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String"}, new String[]{" is less thanE 0: PU11H"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[is, less, thanE, 0:, PU11H]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:0>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:0a>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"<a>b</a>1234567880F12345678901234567890", "4194317", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>1234567880F12345678901234567890                                                                                                                                                                 ...#4194317#1812391655", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:2>", "1.12445678java.text.Noirmalizer"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[samp, , ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "overlay", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"--1normalize", "0.1844567", "8188", "-4177898"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.1844567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"14e3001.5", "java.text.prmaliz", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("14e3001.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:00W>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"", "<sample:6>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "split", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.6d", "1-12345678"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[., d]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<null>", "/a/a1L is less tha 0: "}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:>4bfcc>", "1..12abc"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:dh5bc>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"0", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"", "e-00.0", "0.5g301"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"5.", "."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.util.Iterator", "char"}, new String[]{"<null>", "M"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "reverseDelimited", new String[]{"java.lang.String", "char"}, new String[]{"PT1H0x16F", "P"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T1H0x16F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultIfEmpty", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:4hc>c>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4hc>c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "center", new String[]{"java.lang.String", "int"}, new String[]{" .12345678", "4087"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#4087#1163789646", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceOnce", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"a\037b", "", "_.."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\037b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"_.", "6", "\r"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_.\r\r\r\r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "uncapitalize", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{",0", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chomp", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/`1.NFD", "NFD"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/`1.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllUpperCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"D/b1Lnormalize", "1.5e", "2"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[D/b, Lnormalize]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.6\u00e91.1234567890123456", "-2147483648", "21"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.6\u00e91.123456789012345", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.String", "char", "int"}, new String[]{"", "7", "2147483624"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{"t3rteStsings must not be null2147483647", "67104740", "-16384"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceOnce", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{".-1-_2", "numl", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".-1-_2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"14e3003/20-02-30T25:61:61", "-2147483622", "8180"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("14e3003/20-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllUpperCase", new String[]{"java.lang.CharSequence"}, new String[]{"<s:Ha,>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"-1.4", "", "t3rueStsings must mot be null"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", ""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfDifference", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:0.>", "<s:0.>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEach", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{" is less thanE 0: PT1H", "<sample:11>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" is less thsamplenE : PT1H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1/6\u00e9", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "repeat", new String[]{"java.lang.String", "int"}, new String[]{"I8", "4132"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8I8...#8264#449504156", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotEmpty", new String[]{"java.lang.CharSequence"}, new String[]{"<s:>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"1/25", "0W1\"F0x123456789-1.5", "1.5e3I"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "-C"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/a1.x12345672020v-02-30.T25:61:61", "-"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "endsWith", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "0x1F0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEach", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"0W1lFabc", "<sample:11>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("W1lFsamplebc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"114748364. java.text.Normalizer", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("114748364. java.text.Normalizer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByWholeSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" .22335678", "5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[ .2233, 678]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "ordinalIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"0x1F0x123556789", "7", "2147483622"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"http://example.com/a?b=c", "11.1234567H1.12345678901234567", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<null>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"bI...", "bI..", "4194264"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAlphaSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s: .>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "mid", new String[]{"java.lang.String", "int", "int"}, new String[]{"<null>", "4096", "2147483647"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:54bn>", "2047483647TimeToLive of "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "ordinalIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{".9.", "", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{"1.", "30", "1S-5 is less than 1: {\"a\":1}"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1S-5 is less than 1: {\"a\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceOnce", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"tqve ", "e ", "2//62020-02-30T25:61:61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("tqv2//62020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isAllUpperCase", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAny", new String[]{"java.lang.CharSequence", "java.lang.String"}, new String[]{"<s:>", "xPT11O"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ha>b</a>0", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{"<null>", "-258057", "2147483647"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripToNull", new String[]{"java.lang.String"}, new String[]{" is less uhan 0: "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("is less uhan 0:", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNumericSpace", new String[]{"java.lang.CharSequence"}, new String[]{"<s: >"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "isNotBlank", new String[]{"java.lang.CharSequence"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s: .>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1d", "0x1F0x123456789 vs "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"e-00/0", "e-0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"{\"a\":{1}a b", "<null>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":{1}a b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceEachRepeatedly", new String[]{"java.lang.String", "java.lang.String[]", "java.lang.String[]"}, new String[]{"\na,", "<sample:0>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "substring", new String[]{"java.lang.String", "int", "int"}, new String[]{"2147483648", "-536879104", "-30"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfDifference", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:/>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "swapCase", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "startsWithIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/`1.1234567", "- b"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replaceChars", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"1.5f30", " is less than 0:t", "2020-01-01"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".5e30", "NFD"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStartIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5d\t\t", "PTH"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5d\t\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitPreserveAllTokens", new String[]{"java.lang.String", "char"}, new String[]{"TimeToLive of java.text.Normalizer", "I"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[TimeToLive of java.text.Normalizer]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:>", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOfAny", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"Hllo, World", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:0>", "Iello- World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "removeStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a b.5", "--1..."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.String", "char"}, new String[]{"1.5e30020", "a"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:! >", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"/a is kess than 0: ", "++1", "-7/a/b"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a is kess than 0: ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "equalsIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:3/:45", "1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfDifference", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:>", "<s:9\r\">"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripStart", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"normalizeNFD", "[e,2]0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("normalizeNFD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "stripAll", new String[]{"java.lang.String[]"}, new String[]{"<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "char"}, new String[]{"<empty>", "5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-,1", "Title"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"-a/b0xFFFFGFFF1.5f", "3", "1.5dr"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-a/b0xFFFFGFFF1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "getCommonPrefix", new String[]{"java.lang.String[]"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.util.Iterator", "char"}, new String[]{"<empty>", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "equalsIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".1--1", "bbI..[1,2]"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOf", new String[]{"java.lang.String", "char"}, new String[]{"a b", "d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "rightPad", new String[]{"java.lang.String", "int", "java.lang.String"}, new String[]{" is lTess tan 0: ", "-8388564", "TITLEPT1H"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" is lTess tan 0: ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "lastIndexOf", new String[]{"java.lang.String", "java.lang.String", "int"}, new String[]{"/a1.1234567--1\t", "i", "20"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfDifference", new String[]{"java.lang.CharSequence[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "splitByCharacterTypeCamelCase", new String[]{"java.lang.String"}, new String[]{"\n1.1234567 "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[\n, 1, ., 1234567,  ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultIfEmpty", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:/v>", "<s:\014>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/v", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "endsWith", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/a1.1244E567", "..."}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "contains", new String[]{"java.lang.String", "char"}, new String[]{"nPll-1", "2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "join", new String[]{"java.lang.Object[]", "java.lang.String", "int", "int"}, new String[]{"<sample:0>", "3..", "4096", "-4109"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "chop", new String[]{"java.lang.String"}, new String[]{"2020-01-0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "defaultIfEmpty", new String[]{"java.lang.CharSequence", "java.lang.CharSequence"}, new String[]{"<s:a>", "<s:ld >"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfIgnoreCase", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-5 is ldss than 0: ", ".5TITLEa"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsOnly", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:I>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "containsNone", new String[]{"java.lang.CharSequence", "char[]"}, new String[]{"<s:a>", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "endsWith", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"C11.6112345678901234567", "nulum1L"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "replace", new String[]{"java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"2147483647+1", "-..0", "12C:30:45"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483647+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.StringUtils", "org.apache.commons.lang3.StringUtils", "indexOfAnyBut", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"javatextt.Normalizer/a/b", "2147483744"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
}
