package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "_PT1H"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"1xFFFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "1L"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=ca"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http:\\/\\/example.com\\/a?b=ca", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b==ca"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b==ca", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"I123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"r1.12345678901234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("r1.12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"''"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("''", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "12:300:45"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "TITLE"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\t2020-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\t2020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "<<a>b</a>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "-\u00e9"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "0yFFFFFFFF"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "1.5lf"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "-\u00e9"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"[1,2\\"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2\\", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"I123456789012345678901234567890'"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I123456789012345678901234567890\\'", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"[1,2\\i"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:5>", "\n"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"-;1.5\""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-;1.5\\\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", "[1\r2\\"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "\\t"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"[1,2\\ri"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2\ri", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "\037"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:7>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"''\\u001E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("''\036-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "\010"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"[1\0162\\"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1\\u000E2\\\\", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:7>", "[1\0142\\"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:6>", "[1\r2\\'"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"1.1234567890123L45\\nulla b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123L45\nulla b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:5>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\\\"u00"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"u00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1.5\\fn"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5\014n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "\\bt"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:8>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "\\\\\\u1.1234567"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.lang.exception.NestableRuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "1e10"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"1xFFFFFFF1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1xFFFFFFF1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"010"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "I123456789012345678901234567890"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"Hello- World"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello- World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1e100"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", "1"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "Hello, World0xFFFFFFFF"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"1.1244567890123456nulla b"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1244567890123456nulla b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"/<a>b</a>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\/<a>b<\\/a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"1.5e1.12345678"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"+112:30:45"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+112:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"0_x1235678"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0_x1235678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"a,a,c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,a,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "1.123456781.5f"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"\\u00"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\u00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "."}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "1"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "0yFFFGFFFF/a/b"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "aPT1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{" "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"2147383648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147383648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"1xFFFFFFFF"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "[1,B2]"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"''"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("''", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "4."}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"r"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"0x123356689"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123356689", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"22:300:45"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("22:300:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"r1.12345678901234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("r1.12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"a,b,cc"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,cc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"12:400:44"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:400:44", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\u00"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\u00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "5."}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"0yFFFFFFFF"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0yFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", "L.5"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\t2020-02-30T25:6:61"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t2020-02-30T25:6:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\\v0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("v0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:6>", "[1,2]i"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", ""}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"[1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"http://eampl[.com/a?b==ca"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http:\\/\\/eampl[.com\\/a?b==ca", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "\n"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"r-12345678901234567"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("r-12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"1/5d12:30:45"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/5d12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", ",\u00e9"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:9>", "_PT1H"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"\t2020-03-30T25:61:61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\t2020-03-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", ""}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"[1,3\\iTitle"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,3\\\\iTitle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"0yFFFFFFFF{\"a\":1}\n"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0yFFFFFFFF{&quot;a&quot;:1}\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"I123456789012345678901234567890"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "null1xFFFFFFFF"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", "r1+1"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "\\u001.12345678"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"<<a>b</a>0xFFFFFFFF"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<<a>b</a>0xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"/b/b\r"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/b/b\r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"204743648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("204743648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c5."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http:\\/\\/example.com\\/a?b=c5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{" ,"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ,", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1-5'"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-5'", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "-;1"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"_PT1H+}"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_PT1H+}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"\u00e9\\TITLE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&eacute;\\TITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"[1,2^"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2^", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"<a>b/a>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b\\/a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "[1,2\\Title"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"1.-0.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "5."}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "Hello, World"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "1.5e300"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"atrue"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("atrue", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", ""}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"\u00e9''"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9''''", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456nulla b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456nulla b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", "1LL"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"nulll"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nulll", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"-1true1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1true1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"\\u'00"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u'00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"H1.12345678"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"http://exam;ple.com/a?b=catrue"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http:\\/\\/exam;ple.com\\/a?b=catrue", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"Hello, World.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"r1.113456789012345677"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("r1.113456789012345677", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"''nullF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("''nullF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "0x12356789"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"+1o-1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1o-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"1234467890123456789012345567890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1234467890123456789012345567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\u0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"xa,b,ca"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("xa,b,ca", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"[2,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[2,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{".55"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".55", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"0x12356789<a>b</a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x12356789<a>b</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"1\\u"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1\\u", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"1.1234567890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"011"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("011", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"1.1234{567890123456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234{567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"i"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"2147483648 "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483648 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"Ielmo, World"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ielmo, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"0x12356789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x12356789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"T,b,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"v"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("v", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"21474836481.12345678901234557"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21474836481.12345678901234557", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"trve"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("trve", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"]u"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]u", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"00"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{",1/a/b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",1\\/a\\/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"-0.}"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"1.12345671L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345671L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"Title"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "12:30:45"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\tB"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\tB", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"1.26"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.26", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"11234567890123456nulla c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11234567890123456nulla c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"12:3:45>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:3:45>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"1.5d2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5d2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"1-25"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"aabaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aabaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"Title"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"^T1H"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("^T1H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"a2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"aabc"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aabc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFFhttp://example.co"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFFhttp://example.co", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"{\"a\""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{&quot;a&quot;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"[1,22]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,22]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"6b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "http://example.com/a?b==ca"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"\u00e85"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&egrave;5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"-15"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"abc"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "1.5f\\uTITLE"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.lang.exception.NestableRuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"\t2020-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t2020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"1EX-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1EX-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"{\"a\":1P"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1P", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"I"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:6>", "\\u00true"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "00"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaabaaaaaaaaaa"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaabaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456nulla\037b0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456nulla\037b0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"<a>b</0>http://example.com/a?b=ca"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&lt;a&gt;b&lt;/0&gt;http://example.com/a?b=ca", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456nulla bTitle"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456nulla bTitle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"-;0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-;0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"02:30:45"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("02:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"-;1.5\"_ "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-;1.5\"_ ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\\\\\u"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"Title"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{".\u00e912:30:45"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".\u00e912:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"[1,29]"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,29]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"<<a>b</a>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<<a>b</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"1.12345688"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345688", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"[1-3\\i"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1-3\\i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"aaaaaa`aaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaa`aaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"1-:300:45"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-:300:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"\\u000"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\u000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{";-1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(";-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"[1{\r2\\"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1{\r2\\", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"5.2020-,02-30T25:61:61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.2020-,02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"a/b\t"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a/b\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "[0,2\\i"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"1.1234567Title1E-5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567Title1E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"-1.5\""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5\\\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"<a>b</a>2020-01-01"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"I123456789012345678901234567890'"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I123456789012345678901234567890'", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=ci"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=ci", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\n5D."}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n5D.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456nulla b1L"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456nulla b1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"20220-02-3 0T25:61:61"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("20220-02-3 0T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"-;1.5\"i"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-;1.5\"i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"[1,2[_PT1H"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2[_PT1H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"1.x5f\\uTITLE"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.x5f\\\\uTITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"\\u0001xFFFFFFFF"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0001xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"2020-0x-01"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-0x-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"e2:300:45"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("e2:300:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"12:300:45-0.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:300:45-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"PTT1CH"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PTT1CH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"2.5lf"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2.5lf", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"<<a>xb<</a>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<<a>xb<</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "_PT1H"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"[1,2\\1.5d/a/b"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,21.5d/a/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"a "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"mi"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("mi", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"12:301:45"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:301:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"I123456789012345678901234567890'1.5d"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I123456789012345678901234567890'1.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"-1ap,b,c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1ap,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1.5e3002020-0101"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e3002020-0101", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"5.T"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.T", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"0x12356W7t9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x12356W7t9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"12345679012345678901234567890"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12345679012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"1.6d"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.6d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"-1.C"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.C", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u00E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "1e10Title"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"\t2020-12-30T25:61:612020-02-30T25:61:61"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\t2020-12-30T25:61:612020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"iP"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("iP", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"PT1H<"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"1.]23456781e10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.]23456781e10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\\"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"\\u0.5/a/b"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0.5/a/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"1F5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1F5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", "\\u001xFFFFFFFF"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.lang.exception.NestableRuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"<<a>b</a>\u00e9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<<a>b</a>\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "http://example.com/a?b=ca"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "Hello, World"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "\\T000"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"0x12346789\\u000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x12346789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"]"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"<a>b</a>null"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&lt;a&gt;b&lt;/a&gt;null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"a,b,chttp://example.com/a?b=c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,chttp://example.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"..5lf"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("..5lf", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{">"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&gt;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"5\u00e9\t"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5\u00e9\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"2147483649"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483649", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"ht.p://e"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ht.p://e", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"PT1H2020-02-30T25:61:610x123456789"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H2020-02-30T25:61:610x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "-1f"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"-1.55]"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.55]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"TITKE1.5e300"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITKE1.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"[1,2\\i12:30:45"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2i12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"Sitle"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Sitle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"ahttp://example.com/a?b=cahttp://example.com/a?b=ca"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ahttp://example.com/a?b=cahttp://example.com/a?b=ca", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"[1,2\\ri"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2\\\\ri", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"x\\\\u12:30:45"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x\\\\\\\\u12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "TITTLE"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "2"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
