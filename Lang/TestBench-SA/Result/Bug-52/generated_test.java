package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\u0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"Title"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "12:W30"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "0x1F"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"2020-\t0-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-\\t0-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "1.1234567"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "\\uc04"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"2020-\n/-01true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-\\n\\/-01true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "a,b,c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "8p,,n^2f5\\uabc"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"8p,,n^2f5\\uabc"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8p,,n^2f5\\uabc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"\013"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u000B", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "-1.X"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "\\ua"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "true''"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1.54f''"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.54f\\'\\'", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\\\\u00http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u00http://example.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{",,\\t"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",,\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:5>", "\r"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "\\u0100"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "\014"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"\\u0\u00e92:\\t/0\"0\\uI"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\u0\\u00E92:\\\\t\\/0\\\"0\\\\uI", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", "abb\010c"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "\\\u00e9\\uu11d1/"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.lang.exception.NestableRuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\\"v0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"v0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\b/"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\010/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\037"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u001F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\5G\\f0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5G\0140", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\'u6.58x11lE-5+ 01o.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'u6.58x11lE-5+ 01o.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\null"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\\r<0005."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\r<0005.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c12345678901233456789012345678901.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c12345678901233456789012345678901.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"htp://example.com/a?c==ec123456789012334456789012345678901.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("htp://example.com/a?c==ec123456789012334456789012345678901.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"\\u0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\u0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"1.1234568890123456"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234568890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"1.1234668890123456"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234668890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\u0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\5."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"]5."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"H5."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"H5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"G5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("G5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"H4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"41.1234567890123456"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("41.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "1.5e300"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"Thtke"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Thtke", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"Thuke"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Thuke", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"Tguke"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tguke", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"2020-\t0-011.5e300"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-\\t0-011.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\u0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\u0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\uu0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\uu0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\uu0truenull"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\uu0truenull", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\vu0truenull"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\vu0truenull", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\vu0truentll"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\vu0truentll", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\vu0trueotll"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\vu0trueotll", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\vu0trueotll-1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\vu0trueotll-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"http://exbmple.com/a?b=c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http:\\/\\/exbmple.com\\/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"2020-01-{1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-{1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"2020-01-{1null"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-{1null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"+1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"12:30:4h"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:4h", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"11:30:4h"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11:30:4h", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"TITLE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"TITLEp"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLEp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"TITMEp"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITMEp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"TIMEp"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TIMEp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"TIME"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TIME", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"202l0-\t0-01"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("202l0-\t0-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"202l0-\0100-01"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("202l0-\0100-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"302l0-\0100-01"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("302l0-\0100-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"301l0F-\0100-01"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("301l0F-\0100-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"13::30:45"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("13::30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"02::30:45"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("02::30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"02:"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("02:", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"I2:"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I2:", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"I22:"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I22:", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"^T1H"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("^T1H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{".5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"j"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("j", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"abc"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"9bc"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9bc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"9bb"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9bb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"9bb="}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9bb=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "-1.5"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "8p,,n^2f5\\uabc"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", "TITLE"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "^"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "^"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "f"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"20220--12-3XT25:61:61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("20220--12-3XT25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"2022B--1-XT5:61:61\\u"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2022B--1-XT5:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"202\rB--1-XT5:61:61\\u"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("202\rB--1-XT5:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "PS1H"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "Hello, World"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"TITLE"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "1L"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1.5e300."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"1.5e3/0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e3/0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "{\"a"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"Titke"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Titke", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"Thtke"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Thtke", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"20d0-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("20d0-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"20d0-01-01\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("20d0-01-01\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"20od0-01-01\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("20od0-01-01\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\\u000"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"\\u000\u00e9"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.lang.exception.NestableRuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"i"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"--1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"-0.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"/a/b2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/b2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"/n/b2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/n/b2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "1.1234567890123456"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"+1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"++n1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("++n1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"+p+n1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+p+n1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"\\"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"["}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"\tTITLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\tTITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"\tTIT"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\tTIT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"\tTIT\\u"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\tTIT\\u", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\u00"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\u00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\u000x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\u000x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\u000x123456785"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\u000x123456785", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\u100x123456785"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\u100x123456785", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\\u00e9u100x123455785"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\\\u00E9u100x123455785", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\\u00e9u10x123455785"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\\\u00E9u10x123455785", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"2020-d1-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-d1-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"2020-d0-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-d0-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"2020-\t0-011.5e300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-\\t0-011.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http:\\/\\/example.com\\/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"http://exbmple.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http:\\/\\/exbmple.com\\/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"null"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"nulm"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nulm", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"nullm2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nullm2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"nul}lm21477483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nul}lm21477483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "\\u000"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"1.1234467"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234467", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"a0,b,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a0,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"1L5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"1L>n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L>n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"1L>L>n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L>L>n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"1L>=>n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L>=>n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"1L><=>n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L><=>n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"/W"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/W", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"/WTitle"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/WTitle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"2020-\t0-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-\t0-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"202l0-\t0-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("202l0-\t0-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "\\uc04"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"2020-\t0-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-\\t0-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"2020-\t0-01true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-\\t0-01true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "a,b,c"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"+1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{"+1t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.lang.String"}, new String[]{",1t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",1t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"2_20-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2_20-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"2_30-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2_30-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"8p,,n^2ff5\\uabc"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8p,,n^2ff5\\uabc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"8p,,n^2ff5\\uabctrue"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8p,,n^2ff5\\uabctrue", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"8p,,n^2ff6\\uabctrue"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8p,,n^2ff6\\uabctrue", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"I"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"II"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("II", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"IH"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("IH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"223456789012345677901234567}890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("223456789012345677901234567}890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"I"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "'"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"2020-01-011"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-011", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"1.12345668901234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345668901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"1.123456b8901234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123456b8901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"1.123456b890123a568"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123456b890123a568", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.lang.String"}, new String[]{"1.12L46b890123a568"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12L46b890123a568", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"o0x123456689"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("o0x123456689", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"o0x1234o6689"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("o0x1234o6689", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"o0x1234o6X689"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("o0x1234o6X689", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"o0x12{4o6X689"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("o0x12{4o6X689", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"o0x12{"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("o0x12{", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"o0{12{"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("o0{12{", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"P[b[2H"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P[b[2H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"PZb[2H"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PZb[2H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"a b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"a c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"a c12:30:45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a c12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"a c12:30:455"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a c12:30:455", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "a baaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "a baaaaaaaaaaaaaaaaaaaaaaaaaaaHaa"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "1E-5"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"-1.5["}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5[", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"/a-/a null"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a-/a null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"/a-/a nul"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a-/a nul", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"/a-/"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a-/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{".a-/1.5d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".a-/1.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{".a-/15d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".a-/15d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{".a-/1d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".a-/1d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{".a-/0d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".a-/0d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{".a--/0d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".a--/0d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"[u00"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[u00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"[u0012:W30"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[u0012:W30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"[u002:W30"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[u002:W30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"Zu102:W30"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Zu102:W30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "--1"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "--1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "---1\\730-0.0"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"[1\u00e9-3]"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1\u00e9-3]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"[1\u00e9.3]"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1\u00e9.3]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"1.5e200"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e200", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"1.5e20"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"123456789012335678901234567890"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012335678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"123456799012335678901234567890"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456799012335678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\u000\u00e9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\\u000\\u00E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"PPT1H"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PPT1H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"PPT2H"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PPT2H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"PPT02H"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PPT02H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"PPT02"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PPT02", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"PPT/2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PPT/2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.lang.String"}, new String[]{".25"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "-\nC.poac1.5]u000x1F"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "-\nC.poa"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"-1-5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"-1-5\n"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1-5\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"-.1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-.1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"-..1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-..1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"-..1010"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-..1010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "<alb</a>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "<alb<.a>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "<ala=-`>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "<ala=-`>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"\\\u00e9u100x123455785"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9u100x123455785", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.lang.String"}, new String[]{"Helo, <World"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Helo, <World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"\\\u00e9u100x123455785"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\\u00e9u100x123455785", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"Title"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeHtml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "-1.5"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.lang.String"}, new String[]{"12]"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "\\\u00e9u100x123455785"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"2/30-01-01"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2/30-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"1/30401-01"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/30401-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeXml", new String[]{"java.lang.String"}, new String[]{"11/30401-01"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11/30401-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"129Wr30"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("129Wr30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"--1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"--p1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--p1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"--p1t8rue"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--p1t8rue", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"+1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"1/5f"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "0F"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeXml", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", ""}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeSql", new String[]{"java.lang.String"}, new String[]{"a"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:4>", "\\uahttp://example.com/a?b=c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.lang.exception.NestableRuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "2020-\n/-01tsue"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "[1,2]"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "escapeJavaScript", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "[1, 1]"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"o5C./a.b"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("o5C./a.b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"o5C-/a.b"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("o5C-/a.b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.StringEscapeUtils", "org.apache.commons.lang.StringEscapeUtils", "unescapeJava", new String[]{"java.lang.String"}, new String[]{"o5C-/a.b0xFFFFFFFF"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("o5C-/a.b0xFFFFFFFF", String.valueOf(actual));
 }
}
