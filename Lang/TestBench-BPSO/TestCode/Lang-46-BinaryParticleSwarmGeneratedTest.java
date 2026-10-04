package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "abcn<a>b</a>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "-1-4"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", "\nW"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", "+1"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:6>", "A-5f"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "<a>bb</a>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"4>-1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4&gt;-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:7>", "\\u00:0''"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"http://example.con/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.con/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "-1-0.0\\u000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"TITTLLE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITTLLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "2020-01-01"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"'"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\'", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "-1.50"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\\vd"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("vd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"http://example.coma?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.coma?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "-/.1m\""}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\\\\ud"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\ud", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"\u00e90x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e90x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:5>", "http://example.coma?b=pc"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"A-5f\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A-5f\\u00E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:8>", "-1-0.0\\u000{\"a\":1}"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.lang.exception.NestableRuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:9>", "-1-0.0\\u0002020-02-30T25;61:61"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:8>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:7>", "\013"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"-1-04.0\\u00{\"a\":1}"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1-04.0\\\\u00{\\\"a\\\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"\010\nW"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\b\\nW", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"S"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:11>", "\\t0"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:6>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"-/.1m\"\""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"-/.1m\"\"\"\"\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"34\\"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("34\\", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\\f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\014", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:8>", "21\r47483648"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:8>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:11>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:5>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\t\014"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\t\\f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:6>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "\037"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"\"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\\\"u0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"u0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\'"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\rfP"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\rfP", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\\bt0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\010t0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"\"\""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "<>b<a>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:9>", "[1,2]d"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"4."}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:7>", "-2-4\n"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "http://edxample.con/a?b=c\t"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"1.25-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"http://example.]com/a?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.]com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"."}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"\thttp://example.com/a?b=c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\thttp://example.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"http://example.coma?b=c0xFFFFFFFF"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.coma?b=c0xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "true"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", "2147583748"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"ab123456789012345678901234567890"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ab123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"\t "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:8>", "1/1234567"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"W"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("W", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"<a>bb</a>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>bb</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"2147483648+1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483648+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:5>", "1LA"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"ittp://example.coma?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ittp://example.coma?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaabaaaa"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaabaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"\\u0005p."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0005p.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"12C456789012345678901234567890"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12C456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", ">-0.0\n"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"0x23456A789"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x23456A789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"Ca"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ca", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"-1-5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"12:0:450x1F"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:0:450x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"TITLEtrue"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLEtrue", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"\t\nW"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\t\nW\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "bL"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"-/ m\""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-/ m\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"E"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"010"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "12:30:45\t0TITLE"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:6>", "i2020-00-01"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"2120-01-0e1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2120-01-0e1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:8>", "1e11"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"=1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"1.Ie300"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.Ie300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"0100x1F"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0100x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"(("}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("((", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"1o2:30:4u\t0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1o2:30:4u\t0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:7>", "1.123456789012r34567"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"\u00e90x1F,\\u0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&eacute;0x1F,\\u0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "a0xx1F"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"TITTLLE2147483448"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITTLLE2147483448", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"/-"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"2020-E1-01"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-E1-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", ""}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"A-5f\u00e9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A-5f\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"TITTL4E0x1F"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITTL4E0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\ui0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"+."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{" "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"-/o.1m\""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-/o.1m\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:7>", "1.112345678"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", "-1.50abcn<a></a>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"\\u0000"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"4>d-1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4>d-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"-/.1m\"true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-/.1m\"true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b<\\/a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"+1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "1.1234567890123456"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "x020-01-013"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "12:30:45\t0"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"34"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("34", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\t\nW"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t\nW", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"1/5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"A-5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A-5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"-1.5-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "2147583648"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"x020-01-013"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x020-01-013", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "II"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", ",0.0"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"0y1F\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0y1F\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"TITLD"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "-/.0\""}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"Hello, WorlFd"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, WorlFd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1.1234H567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234H567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"{\"\":1}"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "1.1234567890123456<a>b</a>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"21475836487"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21475836487", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"4>-1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4>-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"\t\tW"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t\tW", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"214748364844"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("214748364844", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"1e10a b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e10a b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"12:\t30:45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:\\t30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"12:30:55\t0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:55\t0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"0x1123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"Title0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"4.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"<a>bb</a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&lt;a&gt;bb&lt;/a&gt;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"http://example.com`?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com`?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"TITLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "r34"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"213758836487"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("213758836487", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"+1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"-0.0abc\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0abc\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"X"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"0.26"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.26", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"13:30:45\t0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("13:30:45\t0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"1.123456785."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123456785.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"-1-0.0\\d000"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1-0.0\\d000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"!1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("!1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"A-5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A-5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"Ha"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ha", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"<a>b</a>1.5d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>1.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"\nW"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\nW", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"1.123456789P0123456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123456789P0123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1.123456I"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123456I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{".1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"-.0\""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-.0\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"\\u0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"4>-1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4&gt;-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"a\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"\"10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&quot;10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"1.5f\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "0L"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"\t\nW"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t\nW", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"ITLTLLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ITLTLLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"1.5e\n001.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e\n001.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"true5."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"Titlea\\u000"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Titlea\\u000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"\\\\udabcn<a>b</a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\udabcn<a>b</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:8>", ""}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"TLTTLLEL"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TLTTLLEL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"abcn<a>b<10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abcn<a>b<10>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"TIITTL6LE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TIITTL6LE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"\\vc"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\vc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"n'll0x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("n''ll0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"Title"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"TITTLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITTLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"e10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("e10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:8>", "\\u00:0''"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.lang.exception.NestableRuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"I+1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"1e20"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"abc "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"a,b,-"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"<ca>b</a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<ca>b</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"*1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"a,b,c1.1234567"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"a,b,c1.1234567\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"-0..0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0..0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"a,b+c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b+c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"\\u000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"44"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1.1>23+4567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1>23+4567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"Title4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", "\\f"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"02c30:45\t0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("02c30:45\t0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"\\{u1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\{u1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"Avd"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Avd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"\\u0 "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\u0 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "-1-0.0\\u0d"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"a,b,ca b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,ca b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"\n\\"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\n\\\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "\n"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:5>", "44"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\\\\uFc"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\uFc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"iTITKE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("iTITKE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "0<a>b</a"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:7>", "15-5"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\\u0:0''\\u"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.lang.exception.NestableRuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"/10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "2047583648"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"0x122456789"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x122456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"[1,:2]"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,:2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"a bDu"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a bDu", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"-,11"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-,11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:9>", "[1,1]"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"a"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "aaaaaaaabaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"http://example.coma?b=c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.coma?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"-1-0.0\\u000{\"a\":1}1.12345678"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1-0.0\\u000{&quot;a&quot;:1}1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", "d1L"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"h b"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("h b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:7>", "-/.0r\""}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"abucn<a>b<8/a>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abucn<a>b<8/a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"11.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"i["}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i[", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890\\u000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567890\\u000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"I"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"./.1m\""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("./.1m\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{",2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"/'/bHello, World"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/'/bHello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{"HellC, World"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("HellC, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"-1.50"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.50", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\u00e901F"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e901F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeCsv", new String[]{"java.lang.String"}, new String[]{";Title"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(";Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"+1'"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1'", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"-1'"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1''", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"-1-0.0\\u0002020-02-30T25;61:51"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1-0.0\\\\u0002020-02-30T25;61:51", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"-/.0\"{ "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-/.0\"{ ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"\t\nWW?"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t\nWW?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"TITTMLE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITTMLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"4>-1.5123456789012345678901234567890"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4>-1.5123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\t\tW"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t\tW", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"abcm<a>b</a>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abcm<a>b</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"\u00e90'x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e90'x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"0I"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "Title-1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"a\037Fb"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\037Fb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"\\u00:0''"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u00:0''", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeCsv", new String[]{"java.lang.String"}, new String[]{"m1-0.0\\3u000"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m1-0.0\\3u000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"TIT+E"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TIT+E", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "\\u0001"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"-1.o50"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.o50", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"o0xFFFFF,FF"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("o0xFFFFF,FF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"{{a"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{{a", String.valueOf(actual));
 }
}
