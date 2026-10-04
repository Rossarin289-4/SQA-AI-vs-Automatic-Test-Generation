package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "execute", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "1e10", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"data", "java.util.Map", "1"}, {"data", "java.util.Map", "2"}, {"ignoreContentType", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{"Method must not be null"}, false, 8, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}, {"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:10>"}, true), new String[][]{{"cookies", "java.util.Map", "7"}, {"userAgent", "java.lang.String", "2"}, {"maxBodySize", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, true, 0, null, 3), new String[][]{{"method", "org.jsoup.Connection$Method", "7"}, {"header", "java.lang.String,java.lang.String", "3"}, {"cookies", "java.util.Map", "6"}, {"response", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"validateTLSCertificates", "boolean", "1"}, {"header", "java.lang.String,java.lang.String", "5"}, {"followRedirects", "boolean", "5"}, {"method", "org.jsoup.Connection$Method", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, true, 0, null, 2), new String[][]{{"validateTLSCertificates", "boolean", "6"}, {"header", "java.lang.String,java.lang.String", "5"}, {"data", "java.lang.String,java.lang.String,java.io.InputStream", "5"}, {"ignoreHttpErrors", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, true, 0, null, 2), new String[][]{{"response", "", "1"}, {"contentType", "", "1"}, {"contentType", "", "1"}, {"charset", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:10>"}, true), new String[][]{{"cookie", "java.lang.String,java.lang.String", "2"}, {"header", "java.lang.String,java.lang.String", "6"}, {"request", "", "5"}, {"postDataCharset", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:10>"}, true, 0, null, 2), new String[][]{{"timeout", "int", "6"}, {"header", "java.lang.String,java.lang.String", "7"}, {"maxBodySize", "int", "3"}, {"data", "java.lang.String[]", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, true), new String[][]{{"request", "", "7"}, {"parser", "", "0"}, {"setTreeBuilder", "org.jsoup.parser.TreeBuilder", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:0>"}, true), new String[][]{{"response", "", "6"}, {"statusCode", "", "3"}, {"body", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:11>"}, true, 0, null, 2), new String[][]{{"maxBodySize", "int", "6"}, {"userAgent", "java.lang.String", "3"}, {"userAgent", "java.lang.String", "4"}, {"postDataCharset", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"false"}, false, 8, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "response", ""}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "-6"}}, 1), new String[][]{{"validateTLSCertificates", "boolean", "2"}, {"data", "java.lang.String,java.lang.String", "3"}, {"data", "java.util.Map", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, true), new String[][]{{"parser", "org.jsoup.parser.Parser", "5"}, {"validateTLSCertificates", "boolean", "6"}, {"timeout", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http:E0cg>bbtt1dd0T15.tX.Co,ie5ia0xFF:FFFFFF"}, true), new String[][]{{"data", "java.lang.String,java.lang.String,java.io.InputStream", "1"}, {"execute", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.MalformedURLException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true), new String[][]{{"data", "java.lang.String,java.lang.String,java.io.InputStream", "1"}, {"execute", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.HttpStatusException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"22/0-", "-0.0"}, false, 10, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:7>"}, {"org.jsoup.helper.HttpConnection", "validateTLSCertificates", "boolean", "true"}, {"org.jsoup.helper.HttpConnection", "post", ""}}, 1), new String[][]{{"parser", "org.jsoup.parser.Parser", "2"}, {"referrer", "java.lang.String", "5"}, {"data", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:11>"}, true), new String[][]{{"response", "", "7"}, {"statusMessage", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, true), new String[][]{{"data", "java.util.Map", "0"}, {"request", "", "6"}, {"ignoreContentType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false, 10, new String[][]{{"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "PT1H1.5", ""}, {"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<empty>"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:7>"}}), new String[][]{{"followRedirects", "boolean", "3"}, {"followRedirects", "boolean", "5"}, {"request", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http://example.cpm/a?b=c"}, true, 0, null, 1), new String[][]{{"get", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.UnknownHostException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "null", "[1,2]"}, {"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "ruei"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"Location"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:5>"}}, 1), new String[][]{{"data", "java.lang.String[]", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"gzip"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:4>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "null", "1.12345678901234567", "<sample:1>"}}, 1), new String[][]{{"data", "java.lang.String[]", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"/a/<b"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "false"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "text/", "Key val must fnot be null"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "false"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "text/", "Key val must fnot be null"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", ";", "\n", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"Charset must not be null"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"1.5ee300"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<sample:0>"}}, 1), new String[][]{{"execute", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "true"}, {"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".5", "\u00e9"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"data", "java.util.Map", "1"}, {"data", "java.util.Map", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 8, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "-0.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"HT8T errr fdtching"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1x-", "1E-1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1x-", "1E-1"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "1L"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1x-RSL", "1E-0"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "L"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"+", "q:S", "<sample:0>"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "text/"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"+1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"1.234567890123456"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", ""}, {"org.jsoup.helper.HttpConnection", "timeout", "int", "19"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"010"}, false, 8, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:7>"}, false, 0, null, 1), new String[][]{{"method", "org.jsoup.Connection$Method", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "post", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "1048576"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "<tp://exampple.com/a?b="}, {"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "2020-01-010xx1F-1.5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "validateTLSCertificates", "boolean", "false"}, {"org.jsoup.helper.HttpConnection", "post", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aX\036b", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "validateTLSCertificates", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "PT1H1.5", "Loca5tion"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "PT1H1.5", "Loca5tion"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:0>"}}, 1), new String[][]{{"ignoreHttpErrors", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:3>"}}, 3), new String[][]{{"ignoreHttpErrors", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:6>"}, {"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "L"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "validateTLSCertificates", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"execute", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"data", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xFFFFGFFF", "Content-EmbodingMethod musu not be null"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"21"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<null>"}, {"org.jsoup.helper.HttpConnection", "execute", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "false"}, {"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{"aURL must not be nu8ll"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "validateTLSCertificates", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{"1.5e300abc"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"2147483648", "0xFFFFFFFF", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "get", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "post", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1-1", "mm"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "1e10"}, {"org.jsoup.helper.HttpConnection", "post", ""}, {"org.jsoup.helper.HttpConnection", "post", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"000y0", "1.5f300", "<empty>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "execute", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "1.11445678901234567"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "-10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<null>"}, {"org.jsoup.helper.HttpConnection", "execute", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "Request must not be null", "1048576"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "20"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "request", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"12345678901235678901234567890"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "request", ""}, {"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"12345677901235678901234567890"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "request", ""}, {"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"PT1H", "a b", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"Method must not be null"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"https"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"https"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:5>"}}), new String[][]{{"data", "java.lang.String[]", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--1", "="}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"http://ex aple-con/\n?b=c"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:3>"}}), new String[][]{{"data", "java.lang.String[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "20"}, {"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "mtll"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "validateTLSCertificates", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 14, new String[][]{{"org.jsoup.helper.HttpConnection", "response", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "post", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "2020-02-30T25:61:61", "Location"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:3>"}, false), new String[][]{{"execute", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"1048575"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "12345678901235678901234567890"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"abc"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".5<ocation", "f\u00eb"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, true), new String[][]{{"header", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true), new String[][]{{"header", "java.lang.String,java.lang.String", "1"}, {"data", "java.util.Map", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "0"}, {"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", ""}, {"org.jsoup.helper.HttpConnection", "post", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"12345677901235678901234567890"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-5", "1E-5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"", ";4", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:1>"}, false), new String[][]{{"userAgent", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 9, new String[][]{}), new String[][]{{"get", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"U3T"}, false, 9, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:7>"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "validateTLSCertificates", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:3>"}}), new String[][]{{"ignoreHttpErrors", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"0rFFFFFFFF"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"0r-FFEFFF"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "SSL"}, {"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "false"}}), new String[][]{{"url", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:7>"}, {"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<empty>"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, true), new String[][]{{"execute", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 1, new String[][]{}), new String[][]{{"response", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "false"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:0>"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:1>"}}), new String[][]{{"hasCookie", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:2>"}}), new String[][]{{"hasCookie", "java.lang.String", "1"}, {"statusMessage", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 10, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:4>"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:7>"}}), new String[][]{{"parser", "org.jsoup.parser.Parser", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:6>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "validateTLSCertificates", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:4>"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "get", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:4>"}, true), new String[][]{{"data", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<null>"}, {"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.helper.HttpConnection", "validateTLSCertificates", "boolean", "false"}, {"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:7>"}}), new String[][]{{"followRedirects", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"20"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"17"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"11.123;5457"}, false, 8, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "1e10", "1.f"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, true), new String[][]{{"referrer", "java.lang.String", "7"}, {"postDataCharset", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:4>"}, true, 0, null, 2), new String[][]{{"referrer", "java.lang.String", "7"}, {"postDataCharset", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:9>"}, true, 0, null, 3), new String[][]{{"referrer", "java.lang.String", "7"}, {"postDataCharset", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true), new String[][]{{"referrer", "java.lang.String", "7"}, {"postDataCharset", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"referrer", "java.lang.String", "7"}, {"postDataCharset", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"cookies", "java.util.Map", "7"}, {"postDataCharset", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"<null>", "i", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"cookies", "java.util.Map", "7"}, {"userAgent", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, true, 0, null, 1), new String[][]{{"cookies", "java.util.Map", "7"}, {"userAgent", "java.lang.String", "6"}, {"data", "java.lang.String,java.lang.String,java.io.InputStream", "6"}, {"response", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, true), new String[][]{{"cookies", "java.util.Map", "7"}, {"parser", "org.jsoup.parser.Parser", "2"}, {"data", "java.lang.String,java.lang.String,java.io.InputStream", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"cookies", "java.util.Map", "7"}, {"userAgent", "java.lang.String", "2"}, {"execute", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"cookies", "java.util.Map", "6"}, {"userAgent", "java.lang.String", "0"}, {"execute", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"method", "org.jsoup.Connection$Method", "3"}, {"userAgent", "java.lang.String", "3"}, {"execute", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:1>"}}), new String[][]{{"data", "java.util.Map", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "get", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:0>"}, true), new String[][]{{"method", "org.jsoup.Connection$Method", "6"}, {"maxBodySize", "int", "2"}, {"execute", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, true, 0, null, 3), new String[][]{{"method", "org.jsoup.Connection$Method", "6"}, {"request", "", "2"}, {"validateTLSCertificates", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:10>"}, true, 0, null, 2), new String[][]{{"cookie", "java.lang.String,java.lang.String", "6"}, {"header", "java.lang.String,java.lang.String", "5"}, {"cookies", "java.util.Map", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "\n", "123456789012345678901234567890", "<null>"}}, 2), new String[][]{{"validateTLSCertificates", "boolean", "0"}, {"data", "java.lang.String,java.lang.String,java.io.InputStream", "7"}, {"url", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, true), new String[][]{{"validateTLSCertificates", "boolean", "6"}, {"data", "java.lang.String,java.lang.String", "3"}, {"data", "java.lang.String,java.lang.String,java.io.InputStream", "5"}, {"method", "org.jsoup.Connection$Method", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:2>"}, true), new String[][]{{"data", "java.lang.String,java.lang.String", "6"}, {"header", "java.lang.String,java.lang.String", "2"}, {"data", "java.lang.String,java.lang.String,java.io.InputStream", "5"}, {"request", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:2>"}, true), new String[][]{{"request", "", "4"}, {"data", "", "4"}, {"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "request", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, true, 0, null, 2), new String[][]{{"get", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"parser", "org.jsoup.parser.Parser", "5"}, {"header", "java.lang.String,java.lang.String", "6"}, {"data", "java.lang.String,java.lang.String,java.io.InputStream", "1"}, {"response", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, true), new String[][]{{"parser", "org.jsoup.parser.Parser", "1"}, {"header", "java.lang.String,java.lang.String", "5"}, {"data", "java.lang.String,java.lang.String,java.io.InputStream", "1"}, {"response", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<null>"}, false), new String[][]{{"data", "java.lang.String[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "false"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"false"}, false, 8, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"true"}, false, 9, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, true), new String[][]{{"post", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:5>"}, false), new String[][]{{"data", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:4>"}, false, 0, null, 1), new String[][]{{"data", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "false"}}), new String[][]{{"response", "org.jsoup.Connection$Response", "0"}, {"data", "java.lang.String[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "12345677901235678901234567890"}, {"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" ", "12345677901235678901234567890"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"C"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"17"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"LocatiDon"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "1.5e300", "i"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, null, 2), new String[][]{{"timeout", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "get", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:4>"}, {"org.jsoup.helper.HttpConnection", "post", ""}, {"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "post", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:7>"}}, 1), new String[][]{{"parse", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:6>"}, {"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:7>"}, {"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "{a\":1}", "http"}}), new String[][]{{"parse", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:7>"}, {"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:7>"}, {"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "{a\":1}", "http"}}), new String[][]{{"parse", "", "6"}, {"getElementsByClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "I"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "I"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:0>"}}, 1), new String[][]{{"request", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "I"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:0>"}}, 1), new String[][]{{"request", "", "5"}, {"hasHeader", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "I"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:0>"}}), new String[][]{{"request", "", "5"}, {"hasHeader", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "="}, {"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:1>"}}), new String[][]{{"hasCookie", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "PT1H1.5"}, {"org.jsoup.helper.HttpConnection", "response", ""}, {"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:1>"}}, 3), new String[][]{{"hasCookie", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "gzip", "true", "<sample:3>"}, {"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "5."}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"0xFFFFFFFF", "E1", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "Content-Encoding"}, {"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:4>"}}, 2), new String[][]{{"execute", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "\t", "1.5e300"}}, 2), new String[][]{{"data", "java.util.Map", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:3>"}, false, 0, null, 1), new String[][]{{"data", "java.lang.String,java.lang.String,java.io.InputStream", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "{\"a\":1}"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"20"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "--1", ".5", "<sample:3>"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:7>"}, {"org.jsoup.helper.HttpConnection", "request", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:0>"}, false, 14, new String[][]{}, 3), new String[][]{{"post", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "true"}}, 3), new String[][]{{"response", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http:/"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, true, 0, null, 3), new String[][]{{"request", "", "7"}, {"parser", "", "0"}, {"setTreeBuilder", "org.jsoup.parser.TreeBuilder", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, true, 0, null, 3), new String[][]{{"request", "", "7"}, {"parser", "", "0"}, {"getTreeBuilder", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.HtmlTreeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:2>"}}), new String[][]{{"data", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:5>"}}, 1), new String[][]{{"data", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "\t"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:5>"}, {"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "\t"}}, 1), new String[][]{{"url", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"0x1E"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:5>"}, {"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:5>"}, {"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "true"}}, 3), new String[][]{{"url", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "1e0"}, {"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "true"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:7>"}}, 1), new String[][]{{"url", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "validateTLSCertificates", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<null>"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"010", "a"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", ";"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:0>"}}), new String[][]{{"request", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\n", "Loca5tion"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "validateTLSCertificates", "boolean", "true"}, {"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 14, new String[][]{{"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "Title"}}, 3), new String[][]{{"validateTLSCertificates", "boolean", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "URL must not be null", "+1"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "9"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"true"}, false, 8, new String[][]{{"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "Title"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "request", ""}}, 3), new String[][]{{"followRedirects", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "1.1234567"}, {"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<empty>"}}, 3), new String[][]{{"data", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "validateTLSCertificates", "boolean", "false"}, {"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:1>"}}, 2), new String[][]{{"data", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 15, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "1048575"}}), new String[][]{{"response", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "a b", "1"}, {"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "1.123456789012345671.5", "Consent-Encoding"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 0, null, 3), new String[][]{{"postDataCharset", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"", "a,b,c", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:7>"}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", ";"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "<null>", "-1", "<null>"}}), new String[][]{{"request", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}), new String[][]{{"data", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:0>"}}, 2), new String[][]{{"response", "", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:0>"}}), new String[][]{{"data", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "/a"}, {"org.jsoup.helper.HttpConnection", "execute", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "true"}}), new String[][]{{"request", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?b=c", "1.5f"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"data", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 0, null, 2), new String[][]{{"data", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:11>"}, true, 0, null, 2), new String[][]{{"maxBodySize", "int", "2"}, {"userAgent", "java.lang.String", "6"}, {"data", "java.lang.String[]", "4"}, {"request", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, true, 0, null, 3), new String[][]{{"maxBodySize", "int", "6"}, {"referrer", "java.lang.String", "3"}, {"data", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".5", "4I"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Lpca+tion+15.", "10-E4885"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
}
