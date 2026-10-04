package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"abc"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc", String.valueOf(actual));
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"--1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"[rue"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[rue", String.valueOf(actual));
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"m[rue"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m[rue", String.valueOf(actual));
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"m[r6ue"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m[r6ue", String.valueOf(actual));
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"m[r6te"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m[r6te", String.valueOf(actual));
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"m[s6te"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m[s6te", String.valueOf(actual));
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"m[6s6te"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m[6s6te", String.valueOf(actual));
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"m[t6te"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m[t6te", String.valueOf(actual));
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"m[t6t;"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m[t6t;", String.valueOf(actual));
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFF", String.valueOf(actual));
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"0xxFFFFFFFF{\"a\":1}"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xxFFFFFFFF{\"a\":1}", String.valueOf(actual));
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"0xxFFFFFFFF{\"a#:1}"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xxFFFFFFFF{\"a#:1}", String.valueOf(actual));
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"0WxFFFFFFFF{\"a#:1}"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0WxFFFFFFFF{\"a#:1}", String.valueOf(actual));
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"0WxFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0WxFFFFFF", String.valueOf(actual));
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"0WxFFrFFF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0WxFFrFFF", String.valueOf(actual));
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"\""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"", String.valueOf(actual));
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"\"4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"4", String.valueOf(actual));
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>", String.valueOf(actual));
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"ta>b</a>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ta>b</a>", String.valueOf(actual));
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"ta>b</"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ta>b</", String.valueOf(actual));
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFF", String.valueOf(actual));
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"0FFFFFFFF"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0FFFFFFFF", String.valueOf(actual));
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"0FFFFFGFF"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0FFFFFGFF", String.valueOf(actual));
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c", String.valueOf(actual));
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"http"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http", String.valueOf(actual));
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"hptp010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("hptp010", String.valueOf(actual));
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"hptp10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("hptp10", String.valueOf(actual));
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"htp10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("htp10", String.valueOf(actual));
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"-x-10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x-10", String.valueOf(actual));
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"--"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"nE,bbA,c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nE,bbA,c", String.valueOf(actual));
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{" "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"null"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"-d0.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-d0.0", String.valueOf(actual));
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"]"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]", String.valueOf(actual));
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"--"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"--_"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_", String.valueOf(actual));
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{".-_"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".-_", String.valueOf(actual));
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567", String.valueOf(actual));
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"1.12{45678901234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12{45678901234567", String.valueOf(actual));
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"1.12{45678801334567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12{45678801334567", String.valueOf(actual));
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"a"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"1E-5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E-5", String.valueOf(actual));
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"1E--5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E--5", String.valueOf(actual));
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"E--5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E--5", String.valueOf(actual));
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"F--5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F--5", String.valueOf(actual));
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"2020-02,30T25:61:611.1234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02,30T25:61:611.1234567", String.valueOf(actual));
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"`a,a"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`a,a", String.valueOf(actual));
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"`aa,a"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`aa,a", String.valueOf(actual));
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingHyphens", new String[]{"java.lang.String"}, new String[]{"--1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"\""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"013^"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("013^", String.valueOf(actual));
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"i\""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"\u00e9ello, World"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9ello, World", String.valueOf(actual));
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"-1.5202;0-02-30T25:61:61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5202;0-02-30T25:61:61", String.valueOf(actual));
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"-1.5212;0-02-30T25:61:611-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5212;0-02-30T25:61:611-1", String.valueOf(actual));
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"-1.5312;0-02-30T25:61:611-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5312;0-02-30T25:61:611-1", String.valueOf(actual));
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Util", "org.apache.commons.cli.Util", "stripLeadingAndTrailingQuotes", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567890", String.valueOf(actual));
 }
}
