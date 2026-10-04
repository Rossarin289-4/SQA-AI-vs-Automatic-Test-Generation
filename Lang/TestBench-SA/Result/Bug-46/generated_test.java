package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "\t"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "21"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "p\n342147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"''"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("''", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "'("}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "-1.5"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"\\u"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"[1,2]\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "http://example.com/a?b=c"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "1.1234567890123456"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "[1,2]"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "0"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "'ull"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"/n"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\/n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "o14748W\"3648"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:6>", "IHello. Wor\rd1/5fnull"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:5>", "'("}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "010aaaaaaaaaaaaaaaaaaaa"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"ltp9//exanoplfFc\u00e9\u00e9;pm/a?b=+\n"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ltp9//exanoplfFc\\u00E9\\u00E9;pm/a?b=+\\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "{\"a\":1}"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\t\\u00"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\t\\\\u00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "I"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "\t\\[u0"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "\t\\\\u0"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{" \\u00<0"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.lang.exception.NestableRuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"\037"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u001F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"o\n3?4214748368\010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("o\\n3?4214748368\\b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"c5\013"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c5\\u000B", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"cc4\014"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("cc4\\f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1E_5>\\tm000Title"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E_5>\tm000Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\\"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\\b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "\t\\f<a>b</a>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:5>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\u0000"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"\".5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\".5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:6>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\\\""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:6>", "<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"\"\""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "\\'"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\null"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\ru/9a/mb"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ru/9a/mb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"\"\"\""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1.5di"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5di", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"4.5d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"4.r5d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4.r5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"4.r5d44"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4.r5d44", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"-1.''"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.''", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"-1.'''"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.'''", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"-1.'"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.'", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"-1.'http://example.com/a?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.'http://example.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"-1W'http://example.com/a?"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1W'http://example.com/a?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"null"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"3ull"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3ull", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"3uull"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3uull", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "2011"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "21"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "21"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "p\n34"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"rHhe\nllo, World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("rHhe\\nllo, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"+'''"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+'''", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"+'('"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+'('", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"]+"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]+", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"0+"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0+", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"/"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"p"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("p", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "1.25"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"_"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"_=\n"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_=\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"=\013"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=\013", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"=\013\013"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=\013\013", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{">\013\013"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">\013\013", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"\013"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\013", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"/"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "/a/b"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "/a/bp\n342147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "B1f10"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "B1f10"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "null"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "null"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", " "}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", " "}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"Hello"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"Hello.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"p\n342147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("p\n342147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"1e10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"010"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"110"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("110", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{" htlp//exampl\ne.coma?b=c2E.-5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" htlp//exampl\ne.coma?b=c2E.-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"?"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{">"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&gt;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"0xGBFWEFFGFX-0.1[1,2]"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xGBFWEFFGFX-0.1[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"0xGBFWEFFGFX-1.1[1,2]"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xGBFWEFFGFX-1.1[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"bbc"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bbc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"bbcc"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bbcc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"Hello, WorlL"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, WorlL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"Hello+ WorlL"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello+ WorlL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"Hello[ WorlL"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello[ WorlL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "1.rfx1F\\u0"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "1.rfx1F\\u0"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"0n"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "1-5e<3002;30:46"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "HHello, World1.5f"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "PPT1HTITLE\\u000"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"d"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"P"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"\\u000}"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u000}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"-1."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"-1.''"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.''", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "5."}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"Title"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"Ti7tle"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ti7tle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"T?tle"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T?tle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"T?tle-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T?tle-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"+1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"r1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("r1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"r"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"rHello, World"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("rHello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"rHeollo, World"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("rHeollo, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"rHe\nllo, World"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("rHe\\nllo, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"&''"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&''", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"+'''"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+'''", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "rHe\nllo, World"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"1."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"E-5\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E-5\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"E-5\t21"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E-5\t21", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"E-5\t22"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E-5\t22", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "''"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"/n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", ";"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"xpu"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("xpu", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1>34568890123456789013456780"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1>34568890123456789013456780", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1>345688901234567891'3456780"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1>345688901234567891\\'3456780", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"/"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"e"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("e", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"ee"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ee", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"e\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("e\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"Hello, Wor,ld"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, Wor,ld", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"0yFFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0yFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"]yFFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]yFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"--1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"21"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"20"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"TITLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"TITE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"THTE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("THTE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"/n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"/nt34"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/nt34", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"/t34"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/t34", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"/"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "/a/dp3414484834821"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"rHe\nllo, World"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"rHe\nllo, World\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"rHe\nlln, World"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"rHe\nlln, World\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"]1/"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"^"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("^", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"_"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{" http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" http://example.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{" http://exampl\ne.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" http://exampl\ne.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{" http//exampl\ne.com/a?b=c2E.-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" http//exampl\ne.com/a?b=c2E.-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{" htlp//exampl\ne.coma?b=c2E.-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" htlp//exampl\ne.coma?b=c2E.-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"44"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"21"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"211"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("211", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"22"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"2c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"22c}"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("22c}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"22c}t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("22c}t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\t\\u00"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\t\\[u0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t[u0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"--2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"u"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("u", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "1.5e300"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "1.5e300"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"[u"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[u", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"Zu"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Zu", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"i12:30:45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"i12:40:45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i12:40:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"1E.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "5///a/b"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:9>", "5"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "p\n3421474i82648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{" "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"abc"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"abc1L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"abc1L"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"abc0LTitle"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc0LTitle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"abc0LTitl.e"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc0LTitl.e", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"5."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"5.."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5..", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"5..1.1234567890123456"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5..1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"5..1.123H45678901234566"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5..1.123H45678901234566", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "-1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "-1"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"0x123456789[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"0x123456789[o1,F]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789[o1,F]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"0x12456789[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x12456789[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"0x12356789[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x12356789[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{".5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"Helln, World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Helln, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"http://examqle.com/a?b=c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://examqle.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"http://exaqle.com/a?b=c0x1F"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://exaqle.com/a?b=c0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"\n"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:6>", "010aaaba6aaaaaaaa\n`aaaaaa.5"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "<a>b</a>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"F.5e3001e10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F.5e3001e10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"F.5e3W001e10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F.5e3W001e10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"Hello, Vorld"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, Vorld", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"Hello, Vorld1.5f"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, Vorld1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:8>", "-1"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"aa"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"ab"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ab", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"aba b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aba b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"TITLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "44"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"-0<0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0<0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"-0<00"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0<00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"-0<10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0<10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"--1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:5>", "010aaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "010aaaaaaaaaaaaaa\"aaaaoa<a>b</a>-1.5"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "A"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"IHello. Wor\rd1/5fnull"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("IHello. Wor\rd1/5fnull", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{" "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"\037"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\037", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "123456789012345678901234567890"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"{ShVKE=a?b</aa>\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{ShVKE=a?b</aa>\\u00E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"ltp://exanoplfFc\u00e9\u00e9;pm/a?b=+\n"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ltp://exanoplfFc\\u00E9\\u00E9;pm/a?b=+\\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"5."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"-2\\u00"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"-2\tu00"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2\tu00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"2\tu00"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\tu00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"2\tv00"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\tv00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "PP1HTI\nLE\\u000"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"IHe5ln. Wor\rd1/4foullaaaaaaaaabaaaaaaaaaa;"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("IHe5ln. Wor\rd1/4foullaaaaaaaaabaaaaaaaaaa;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"IHe5ln. Wor\t\rd1/4foullaaaaaaaaabaaaaaaaaaa;"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("IHe5ln. Wor\t\rd1/4foullaaaaaaaaabaaaaaaaaaa;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"IHe5ln. Wor\t\rd14foullaaaaaaaaabaaaaaaaaaa;"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("IHe5ln. Wor\t\rd14foullaaaaaaaaabaaaaaaaaaa;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"IHWe5ln. Wor\t\rd14foullaaaaaaaaabaaaaaaaaaa;"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("IHWe5ln. Wor\t\rd14foullaaaaaaaaabaaaaaaaaaa;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"IHXe5ln. Wor\t\rd14foulaaaaaaaaabaaaaaaaaaa;I"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("IHXe5ln. Wor\t\rd14foulaaaaaaaaabaaaaaaaaaa;I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"IHXe5\\n. Wor\t\rd14foulaaaaaaaaabaaaaaaaaa;I"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("IHXe5\\n. Wor\t\rd14foulaaaaaaaaabaaaaaaaaa;I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"0x12345678m9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x12345678m9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"21474836481.5d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21474836481.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"21474o36481.5d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21474o36481.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"21474o364.81.5d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21474o364.81.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"aaeaaWaaaaaa}aaaab`aaaaaabaaaaaaa\\u0001.25"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaeaaWaaaaaa}aaaab`aaaaaabaaaaaaa\\\\u0001.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"1.\\L5e3d00"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.\\L5e3d00", String.valueOf(actual));
 }
}
