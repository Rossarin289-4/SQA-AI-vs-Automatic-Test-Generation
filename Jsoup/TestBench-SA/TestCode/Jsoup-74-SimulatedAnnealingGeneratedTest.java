package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<sample:0>", "1.1234567890123456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<null>", "1.1234678901234456"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.net.URL", "java.lang.String"}, new String[]{"<sample:1>", ".5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:3>", "       "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:4>", "       "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("       a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:4>", "   6    "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("   6    a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:4>", "      "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("      a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:5>", "  \037  "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a  \037  0  \037  sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:5>", "  \037              "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a  \037              0  \037              sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:4>", "  \037              "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("  \037              a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<empty>", "  \037            a "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:4>", "  !\037 \037"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("  !\037 \037a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "appendNormalisedWhitespace", new String[]{"java.lang.StringBuilder", "java.lang.String", "boolean"}, new String[]{"<sample:2>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"i"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"            "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"   \037  \037     "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" \037 \037 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"   \037 "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" \037 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"   \037  \037     "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" \037 \037 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isNumeric", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.net.URL", "java.lang.String"}, new String[]{"<sample:5>", "1.5e300"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.MalformedURLException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.net.URL", "java.lang.String"}, new String[]{"<sample:7>", "-"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.MalformedURLException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.net.URL", "java.lang.String"}, new String[]{"<sample:7>", "."}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:4>", "tue1.54300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("tue1.54300a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isNumeric", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isNumeric", new String[]{"java.lang.String"}, new String[]{"PUU2C\u00e9Cwidth must be > 0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isWhitespace", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:2>", "    "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample        a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "    "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0    sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:2>", "[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample[1,2][1,2]a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:2>", "[1,2]4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample[1,2]4[1,2]4a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:2>", "1,2]4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample1,2]41,2]4a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"0x1F", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567890123456", "/a/b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"+1", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"+1", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"8193"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#8193#2143289376", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"                 ", "8192"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-01-01", "8192"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.net.URL", "java.lang.String"}, new String[]{"<null>", "   iac"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.MalformedURLException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"   "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"\037 "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"      "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"1L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"\037 "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\037 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"\036 "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\036 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"\036d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\036d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"\036"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\036", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"t        i        }[  "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t i }[ ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"t        i   C     }[  "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t i C }[ ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"t           C     }[  "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t C }[ ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"t       !   C      }[  "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t ! C }[ ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"t!      !   C     }[  "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t! ! C }[ ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"t!      !  EC     }[  "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t! ! EC }[ ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"t!!     !  EC     }[  "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t!! ! EC }[ ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"t!!     !  E     }[  "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t!! ! E }[ ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isInvisibleChar", new String[]{"int"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true), new String[][]{{"deleteCharAt", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isActuallyWhitespace", new String[]{"int"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isActuallyWhitespace", new String[]{"int"}, new String[]{"-10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isInvisibleChar", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<sample:0>", "    "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<null>", " 3      "}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"[,9]", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"\\,,9l]", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"http://eyample.com/a?b=c", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"http://eyample.com/a?b=c", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "appendNormalisedWhitespace", new String[]{"java.lang.StringBuilder", "java.lang.String", "boolean"}, new String[]{"<null>", "I", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isNumeric", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "appendNormalisedWhitespace", new String[]{"java.lang.StringBuilder", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "21474f3648", "false"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "appendNormalisedWhitespace", new String[]{"java.lang.StringBuilder", "java.lang.String", "boolean"}, new String[]{"<sample:2>", "    ", "true"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:0>", "1.25"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<empty>", "1.251.25010"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isWhitespace", new String[]{"int"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isActuallyWhitespace", new String[]{"int"}, new String[]{"-16386"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("          ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"-8388598"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"-8199"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"23"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                       ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:1>", "0x1F"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a0x1F0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"c0L"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"  "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"\t"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isActuallyWhitespace", new String[]{"int"}, new String[]{"10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"-1.x"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.x", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"    6      "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"              "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<empty>", "                 "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isNumeric", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isActuallyWhitespace", new String[]{"int"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isNumeric", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1.1234567890123456"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isNumeric", new String[]{"java.lang.String"}, new String[]{"1252147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:2>", "5."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample5.5.a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("          ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("     ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"ul{43 5H58899224561    }    a9c 91x1F h    \r\037 F.5Hello, Worlc"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ul{43 5H58899224561 } a9c 91x1F h \037 F.5Hello, Worlc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"v__{54 5589989I11510  \037| 0 a9u9HPx/ h5 !\r\036XFa              "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("v__{54 5589989I11510 \037| 0 a9u9HPx/ h5 ! \036XFa ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:0>", "Title"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"-1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"1e10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"A{wv-^ 44835?I8dP78,I2L1610,J\037 |\0370 U9uWGx h.5  \014{WAp?!!n\037  00"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A{wv-^ 44835?I8dP78,I2L1610,J\037 |\0370 U9uWGx h.5 {WAp?!!n\037 00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"A{wdv-^ 44835?I8dP78I2L151\t0,J\037 |\0370 U9uWGx h.[5  \r{[fAp?!!n\037  00"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A{wdv-^ 44835?I8dP78I2L151 0,J\037 |\0370 U9uWGx h.[5 {[fAp?!!n\037 00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"@\037v^ 9!\"458L35?{8dO79J22L1-400> > |\037\037 V9vW{Gxch.h5  ;\014[_{\"xAL50A-25n1.12345678  "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("@\037v^ 9!\"458L35?{8dO79J22L1-400> > |\037\037 V9vW{Gxch.h5 ; [_{\"xAL50A-25n1.12345678 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"a?+Fnv8 klu5AD3955M)Q_}=f|4m\tOx9tRL0hh-2\"t=0!\035\037Cr2llpvVVTdGF:--<\r\t\th66  Cv:\0141[_"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a?+Fnv8 klu5AD3955M)Q_}=f|4m Ox9tRL0hh-2\"t=0!\035\037Cr2llpvVVTdGF:--< h66 Cv: 1[_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "1.5e300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("01.5e300sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"II88?\n+m6\tl97D396N\t)QPE_=c3f|6plO9tSKBg=/_-8EFtF0\"\034\u00e9\u00e9DcE3lkvWW6,d]F_.,\r\r\ts\tDh66 "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("II88? +m6 l97D396N )QPE_=c3f|6plO9tSKBg=/_-8EFtF0\"\034\u00e9\u00e9DcE3lkvWW6,d]F_., s Dh66 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isNumeric", new String[]{"java.lang.String"}, new String[]{"        "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "1E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("01E-5sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:1>", "\t"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\t0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"{8P?/F\t,h8ijjnf7e;G2\nDW+nW]_B0;<Khd1++ueL=p\rBB0h=Ba,,t\u00e95\"\035\u00ea\u00eb\u00ea\u00eaEu\u00e9bE3llk99,d\\F_  "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{8P?/F ,h8ijjnf7e;G2 DW+nW]_B0;<Khd1++ueL=p BB0h=Ba,,t\u00e95\"\035\u00ea\u00eb\u00ea\u00eaEu\u00e9bE3llk99,d\\F_ ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"??88\t?3\u00e9F]\toui}k4n7e:3GAX2\nDW+o]-6Bc]W=c1*vaeIL=q\rBL0u9B++\tt\u00e95\035\u00ea5."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("??88 ?3\u00e9F] oui}k4n7e:3GAX2 DW+o]-6Bc]W=c1*vaeIL=q BL0u9B++ t\u00e95\035\u00ea5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "normaliseWhitespace", new String[]{"java.lang.String"}, new String[]{"s?8<\t3^En\toui}}m4zn\te:{H@72\nD\"Xo]66BccW=4Fcva9IL>q\rBK0uF9B+\tt\035\u00ea5.-1/null1.1234  "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("s?8< 3^En oui}}m4zn e:{H@72 D\"Xo]66BccW=4Fcva9IL>q BK0uF9B+ t\035\u00ea5.-1/null1.1234 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true), new String[][]{{"append", "double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("0.0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "appendNormalisedWhitespace", new String[]{"java.lang.StringBuilder", "java.lang.String", "boolean"}, new String[]{"<sample:2>", ".4d", "false"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "appendNormalisedWhitespace", new String[]{"java.lang.StringBuilder", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "33    ", "true"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:6>", "?0x13,567s"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:0>", "?x1,567s"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<null>", "?x1,567s"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:3>", "?\u00e91,567s"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", "?\u00e91,567s"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0?\u00e91,567ssample?\u00e91,567s", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", "?\u00e91,557s"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0?\u00e91,557ssample?\u00e91,557s", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"8", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:3>", "?"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"A{wv-^ 44835?I8dP78,I2L1610,J\037 |\0370 U9uWGx h.5  \014{WAp?!!n\037  00", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isActuallyWhitespace", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isActuallyWhitespace", new String[]{"int"}, new String[]{"10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:1>", "          "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a          0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", " t"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 tsample t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", " o"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 osample o", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", " pp"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 ppsample pp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", " p"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 psample p", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", ""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:4>", ""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:4>", "2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("02sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("01sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<empty>", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isInvisibleChar", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isWhitespace", new String[]{"int"}, new String[]{"0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("          ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"8193"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#8193#2143289376", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{" !   !                 ", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "appendNormalisedWhitespace", new String[]{"java.lang.StringBuilder", "java.lang.String", "boolean"}, new String[]{"<null>", "\u00e9          ", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isInvisibleChar", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "appendNormalisedWhitespace", new String[]{"java.lang.StringBuilder", "java.lang.String", "boolean"}, new String[]{"<null>", "1.1:34567901234562020-02-30T25:61:61123456789012345678901234567890", "true"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true), new String[][]{{"lastIndexOf", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true), new String[][]{{"append", "float", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("-1.0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"4118"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                                                                        ...#4118#-1869009920", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("          ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"-11.1234467true", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:0>", "      "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true), new String[][]{{"appendCodePoint", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("\004", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isNumeric", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", "ul{43 5H58899224561    }\037   a9c 91x1F h    \r\037 F.5Hello, \norlc"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0ul{43 5H58899224561    }\037   a9c 91x1F h    \r\037 F.5Hello, \norlcsampleul{43 5H58899224561    }\037   a9c 91x1F h    \r\037 F.5Hello, \norlc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true), new String[][]{{"appendCodePoint", "int", "3"}, {"append", "boolean", "4"}, {"insert", "int,java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sample\001false", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true), new String[][]{{"append", "boolean", "6"}, {"append", "java.lang.String", "0"}, {"insert", "int,float", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("fal0.0se", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:5>", "widh mut bne > 0null010.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("awidh mut bne > 0null010.50widh mut bne > 0null010.5sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", "widh lut bne > 0null010.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0widh lut bne > 0null010.5samplewidh lut bne > 0null010.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:2>", "widh lut bn"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0widh lut bnsamplewidh lut bn", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:5>", "widh lut bn"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("awidh lut bn0widh lut bnsample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<empty>", "widh lut bn"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:4>", "widh lut bn"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("widh lut bna", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:4>", "widh ltt bn"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("widh ltt bna", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "appendNormalisedWhitespace", new String[]{"java.lang.StringBuilder", "java.lang.String", "boolean"}, new String[]{"<sample:2>", "1", "true"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "appendNormalisedWhitespace", new String[]{"java.lang.StringBuilder", "java.lang.String", "boolean"}, new String[]{"<null>", "1", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<null>", "abc"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"TTITLE", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.net.URL", "java.lang.String"}, new String[]{"<sample:1>", "?"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.MalformedURLException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.net.URL", "java.lang.String"}, new String[]{"<sample:1>", "?"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.MalformedURLException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isWhitespace", new String[]{"int"}, new String[]{"0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.net.URL", "java.lang.String"}, new String[]{"<null>", "?0 ; K      -1.5"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"{,\"`\":1}010", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<empty>", "     "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isWhitespace", new String[]{"int"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<sample:0>", "123456789012345678901234567890"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"A{wdv-^ 44835?I8dP78I2L151\t0,J\037 |\0370 U9uWGx h.[5  \r{[fAp?!!n\037  00", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?b=c", "          "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:9>", "?0x13,567s"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Collection", "java.lang.String"}, new String[]{"<sample:1>", "?0x13,567s"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a?0x13,567s0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"\ri"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1//PTT1H", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<null>", "-1.6"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "-1.\u00e9   >!"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0-1.\u00e9   >!sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "-1.\u00e9   > "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0-1.\u00e9   > sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "-1."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0-1.sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:2>", "1.se33/D0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample1.se33/D01.se33/D0a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "                 "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0                 sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"append", "char", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("  ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.net.URL", "java.lang.String"}, new String[]{"<sample:4>", "http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c {getAuthority=example.com, getDefaultPort=80, getFile=/a?b=c, getHost=example.com, getPath=/a, getPort=-1, getProtocol=http, getQuery=b=c, getRef=null, getUserInfo=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"indexOf", "java.lang.String,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"insert", "int,float", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<null>", "1.1234567"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"insert", "int,boolean", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "1L"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("01Lsample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", ".5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.5sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<empty>", "I"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"append", "char[]", "2"}, {"append", "int", "3"}, {"appendCodePoint", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"append", "char", "5"}, {"insert", "int,long", "2"}, {"append", "char[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isActuallyWhitespace", new String[]{"int"}, new String[]{"10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("  ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"indexOf", "java.lang.String", "5"}, {"insert", "int,char[]", "2"}, {"append", "float", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("\0001.0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "inSorted", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.net.URL", "java.lang.String"}, new String[]{"<sample:6>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isInvisibleChar", new String[]{"int"}, new String[]{"8292"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "              "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0              sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:1>", "       1e10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0       1e10sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("     ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("    ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"11"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("           ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"7"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("       ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"12"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("            ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.lang.String[]", "java.lang.String"}, new String[]{"<sample:2>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sampleaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?b=c", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://exampl.com/a?\nb=c", "\ro"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://exampl.com/o", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.net.URL", "java.lang.String"}, new String[]{"<sample:3>", "http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"toURI", "", "6"}, {"compareTo", "java.net.URI", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("56", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "resolve", new String[]{"java.net.URL", "java.lang.String"}, new String[]{"<sample:3>", "http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"toURI", "", "6"}, {"compareTo", "java.net.URI", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "padding", new String[]{"int"}, new String[]{"2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("  ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"append", "char[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"append", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("true", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"append", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("2", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "join", new String[]{"java.util.Iterator", "java.lang.String"}, new String[]{"<null>", "J"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isBlank", new String[]{"java.lang.String"}, new String[]{"\014i"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isNumeric", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "isWhitespace", new String[]{"int"}, new String[]{"10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"append", "java.lang.CharSequence", "2"}, {"insert", "int,float", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "stringBuilder", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"append", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("2", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.StringUtil", "org.jsoup.helper.StringUtil", "in", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"a", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
}
