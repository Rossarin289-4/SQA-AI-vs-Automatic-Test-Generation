package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isWhitespace", new String[]{"int"}, new String[]{"19"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isInvisibleChar", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"{\"\":1}"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.net.URL", "java.lang.String"}, new String[]{"<sample:4>", "        \037   "}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.MalformedURLException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isNumeric", new String[]{"java.lang.String"}, new String[]{"2020,01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"202/,01-01", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" ", "PT1H"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e10", "a b"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"/5", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:0>", "aaaaaaaaaaaaabaaaaaaaaaaaaaaaa"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:0>", "\u00e91.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"4095"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#4095#2045805600", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true), new String[][]{{"insert", "int,char[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("\000", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"201/,01-01         "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"\u00e91", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.net.URL", "java.lang.String"}, new String[]{"<sample:5>", "    !            "}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.MalformedURLException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isActuallyWhitespace", new String[]{"int"}, new String[]{"-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "2/2/,d01-01"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("02/2/,d01-01sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "appendNormalisedWhitespace", new String[]{"java.lang.StringBuilder", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "aaaaaaaaaaaaabaaaaaaaaaaaaaaaa1.5f", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"\u00e90          "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e90 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true), new String[][]{{"append", "java.lang.String", "5"}, {"insert", "int,double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("1.0a", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<null>", "202c-02-30T25:61:61a,b,c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"a_b,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a_b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<empty>", "                 "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{" ,  "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" , ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"2/30-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2/30-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<sample:2>", "202001-01"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true), new String[][]{{"insert", "int,long", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1-5", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "-.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0-.0sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:1>", "0x\u00e9FPT1H"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a0x\u00e9FPT1H0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<null>", "Hello, WoA"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:3>", "\u00e98192"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.5", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:0>", "\u00e90         \037"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isNumeric", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<empty>", "1/5f?"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"a", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"1.251.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.251.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:0>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"    3\037           "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 3\037 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.net.URL", "java.lang.String"}, new String[]{"<sample:7>", "        \037   1.5e300"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.MalformedURLException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"append", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("true", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"[12]+1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[12]+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "Hello"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0Hellosample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"        \037      ! ", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"1.5e>00"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e>00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true), new String[][]{{"append", "java.lang.CharSequence,int,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("e", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:7>", "_       \037          "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample_       \037          ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true), new String[][]{{"lastIndexOf", "java.lang.String,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true), new String[][]{{"lastIndexOf", "java.lang.String,int", "4"}, {"append", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("a", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:1>", ""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isNumeric", new String[]{"java.lang.String"}, new String[]{"X-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isWhitespace", new String[]{"int"}, new String[]{"18"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isInvisibleChar", new String[]{"int"}, new String[]{"65488"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"/y1F"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/y1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:1>", "?"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a?0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"   "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", "1.55"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("01.55sample1.55", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "ht9p://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0ht9p://example.com/a?b=csample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"0xFFGFFFFF"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFGFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true), new String[][]{{"append", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("-1", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true), new String[][]{{"append", "long", "4"}, {"append", "java.lang.CharSequence", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("9223372036854775807a", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:0>", "    "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:2>", "\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample\t\ta", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:2>", "1.5e300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample1.5e3001.5e300a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"append", "float", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Infinity", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isActuallyWhitespace", new String[]{"int"}, new String[]{"8193"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<empty>", ".4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?b=c", "aaaaaaaaaaaaabaaaaaaaaaaaaaaaa1.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/aaaaaaaaaaaaabaaaaaaaaaaaaaaaa1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "appendNormalisedWhitespace", new String[]{"java.lang.StringBuilder", "java.lang.String", "boolean"}, new String[]{"<null>", "I         ", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"append", "char[],int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"Hello+ Worle"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello+ Worle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<null>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", " "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 sample ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"       "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"\u00e9;"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isActuallyWhitespace", new String[]{"int"}, new String[]{"4194314"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<null>", "2020-02-30T26:61:61"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<null>", "aaaaabaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.5", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"append", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("b", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.12345678901234e67", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"\u00e91"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e91", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"\u00e9\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:5>", "a,b,c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aa,b,c0a,b,csample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"a b"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"\u00e9\r"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "appendNormalisedWhitespace", new String[]{"java.lang.StringBuilder", "java.lang.String", "boolean"}, new String[]{"<sample:2>", "\u00e910t          ", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1224567890123456789012345678b90", "1e1u"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "appendNormalisedWhitespace", new String[]{"java.lang.StringBuilder", "java.lang.String", "boolean"}, new String[]{"<null>", "Hello, World", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"15"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("               ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isNumeric", new String[]{"java.lang.String"}, new String[]{"-2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:4>", ""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isNumeric", new String[]{"java.lang.String"}, new String[]{"80922"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("   ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isWhitespace", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1.5", "2/2/,d01-01          x "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"      p         [  "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"1/1234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:0>", "0F20"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isNumeric", new String[]{"java.lang.String"}, new String[]{"112345678"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"width mus=t be > 00", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "appendNormalisedWhitespace", new String[]{"java.lang.StringBuilder", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "0101.5e300", "true"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"\nI"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isInvisibleChar", new String[]{"int"}, new String[]{"0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<sample:4>", "a1.1234567890123456"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"a5."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isInvisibleChar", new String[]{"int"}, new String[]{"8234"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isWhitespace", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.net.URL", "java.lang.String"}, new String[]{"<sample:3>", "1.12345778"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.MalformedURLException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isActuallyWhitespace", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"  \n        "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "         \037 5."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0         \037 5.sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"r", "http:/example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http:/example.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isInvisibleChar", new String[]{"int"}, new String[]{"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<null>", "-s-1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "appendNormalisedWhitespace", new String[]{"java.lang.StringBuilder", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "1", "false"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<null>", "--"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:3>", "aaaba"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"     "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", "  r     "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0  r     sample  r     ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "appendNormalisedWhitespace", new String[]{"java.lang.StringBuilder", "java.lang.String", "boolean"}, new String[]{"<sample:2>", "!  \037      ", "false"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "TIULD"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0TIULDsample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isWhitespace", new String[]{"int"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"   \t     \037   "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:3>", "\u00e910t          a,b,"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<sample:0>", "[1_,2]"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"TileTITLE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TileTITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"       "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "appendNormalisedWhitespace", new String[]{"java.lang.StringBuilder", "java.lang.String", "boolean"}, new String[]{"<sample:0>", "   ", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", "   \u00e9      d "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0   \u00e9      d sample   \u00e9      d ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"1E-5           "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E-5 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.net.URL", "java.lang.String"}, new String[]{"<sample:5>", "?_"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.MalformedURLException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"    1.5d"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 1.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"compareTo", "java.lang.StringBuilder", "6"}, {"insert", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:5>", "?"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a?0?sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", "              "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0              sample              ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"      .5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" .5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "aaaaaaaaaaaaabaaaaaaaaaaaaaaaaW.5f1.5e300"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0aaaaaaaaaaaaabaaaaaaaaaaaaaaaaW.5f1.5e300sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"5      I    "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5 I ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"1D.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1D.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"80922PT1H"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("80922PT1H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"indexOf", "java.lang.String", "2"}, {"insert", "int,long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("1", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"append", "java.lang.StringBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sample", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"append", "java.lang.Object", "6"}, {"append", "char[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("0\000 ", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isActuallyWhitespace", new String[]{"int"}, new String[]{"32"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", " = \n        "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 = \n        sample = \n        ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:4>", "        !  "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("        !  a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:0>", ""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isNumeric", new String[]{"java.lang.String"}, new String[]{"202/,11-01"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:1>", "1E-5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a1E-50", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"append", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("  ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"8193"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#8193#2143289376", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"22"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                      ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{".5                "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:2>", "http:/example.com/a?b=c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("samplehttp:/example.com/a?b=chttp:/example.com/a?b=ca", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", "     "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0     sample     ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"8193"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#8193#2143289376", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", " "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 sample ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<null>", "1.123456789012395a6"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:2>", "       12:30:45"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample       12:30:45       12:30:45a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"compareTo", "java.lang.StringBuilder", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<null>", "  4  "}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{",1", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "{\"\":19"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0{\"\":19sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"insert", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"appendCodePoint", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"append", "java.lang.CharSequence,int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<null>", "/`/b"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"8"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("        ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:3>", "220,01-01"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("    ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"append", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("4", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("     ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:1>", "[1L"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a[1L0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:1>", "TXitle"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aTXitle0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:7>", "  \037  ."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample  \037  .", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"insert", "int,java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sample", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"-2147483592"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"insert", "int,double", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:5>", "    "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0    sample    ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<empty>", "81920xFFFFFFFFa"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"\u00e9            ", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"append", "java.lang.StringBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sample", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"   \t     \037!                  ", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "\n           "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0\n           sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"\u00e9\014"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"I", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.net.URL", "java.lang.String"}, new String[]{"<sample:7>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:5>", "2147836481.1234567890123456"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a2147836481.123456789012345602147836481.1234567890123456sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"8082\r", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:1>", "1L        "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a1L        0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0-1sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:2>", "F"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sampleFFa", String.valueOf(actual));
 }
}
