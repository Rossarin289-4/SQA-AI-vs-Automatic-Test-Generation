package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "execute", ""}, {"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "true"}, {"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "-1.5", "6xFFF"}}), new String[][]{{"charset", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:4>"}, false), new String[][]{{"timeout", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"contentType", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:8>"}, true), new String[][]{{"cookie", "java.lang.String,java.lang.String", "6"}, {"maxBodySize", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "proxy", "java.net.Proxy", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}, {"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "a"}, {"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "ab,"}}), new String[][]{{"maxBodySize", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:6>"}, false, 0, null, 3), new String[][]{{"requestBody", "java.lang.String", "6"}, {"data", "java.lang.String,java.lang.String", "7"}, {"data", "java.lang.String,java.lang.String,java.io.InputStream", "1"}, {"request", "org.jsoup.Connection$Request", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"66yFF", "-09", "<sample:0>"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}, {"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "false"}}), new String[][]{{"request", "", "6"}, {"parser", "", "0"}, {"setTreeBuilder", "org.jsoup.parser.TreeBuilder", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"Method mss  not be nuull", "1", "<sample:0>"}, false, 15, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "2;4f483548", "20", "<empty>"}, {"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "false"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "3eHfkop Wo.qd"}}, 3), new String[][]{{"ignoreContentType", "boolean", "7"}, {"userAgent", "java.lang.String", "2"}, {"parser", "org.jsoup.parser.Parser", "2"}, {"followRedirects", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:4>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "67yFI", "b", "<sample:4>"}, {"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:3>"}}), new String[][]{{"maxBodySize", "int", "3"}, {"data", "java.lang.String", "5"}, {"inputStream", "", "1"}, {"contentType", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:17>"}, false, 12, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:4>"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "35"}}), new String[][]{{"ignoreHttpErrors", "boolean", "1"}, {"data", "java.lang.String", "1"}, {"hasInputStream", "", "5"}, {"value", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "+DDc"}, {"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", ""}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:4>"}}, 2), new String[][]{{"ignoreHttpErrors", "boolean", "0"}, {"ignoreContentType", "boolean", "1"}, {"data", "java.lang.String", "5"}, {"inputStream", "java.io.InputStream", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$KeyVal", actual.getClass().getName());
  assertEquals("a=0 {hasInputStream=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:10>"}, false, 14, new String[][]{{"org.jsoup.helper.HttpConnection", "proxy", "java.lang.String,int", "Method must not be null", "32768"}, {"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "true"}, {"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "http://example.com/a?b=c:"}}), new String[][]{{"post", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.UnknownHostException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "true"}, {"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "http://example.com/a?b=c:1048576"}}, 1), new String[][]{{"post", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.HttpStatusException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http://example.co/La?a=cq1E-5"}, true), new String[][]{{"post", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.UnknownHostException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"false"}, false, 14, new String[][]{{"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "1.5f", "<null>"}, {"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", ""}}), new String[][]{{"response", "", "4"}, {"statusMessage", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "0x1F", "Method must not be null", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "timeout", "int", "307"}, {"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "ISO-8859-1"}}), new String[][]{{"url", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "URL must not be null"}, {"org.jsoup.helper.HttpConnection", "post", ""}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "Request must not be null", "Charset must not be null"}}, 2), new String[][]{{"ignoreContentType", "", "6"}, {"maxBodySize", "", "4"}, {"sslSocketFactory", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.lang.String", "int"}, new String[]{"e", "19"}, false, 8, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "\u00ea/_`\u00e9;BT48-aoSll20Charset must not be null"}, {"org.jsoup.helper.HttpConnection", "proxy", "java.net.Proxy", "<sample:6>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "b", "1.1234467890123456"}}, 1), new String[][]{{"data", "java.util.Map", "7"}, {"cookies", "java.util.Map", "0"}, {"data", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{"B++K", ",0,5dul0xFFFFFFFF", "<sample:0>", "20200-01-/1"}, false, 14, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream,java.lang.String", "http://example.co/La?a=cq1E-5", "0xFFFFFFFF", "<sample:0>", "\ty"}, {"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", ".11.12345678gzip"}}, 2), new String[][]{{"data", "java.lang.String", "2"}, {"key", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$KeyVal", actual.getClass().getName());
  assertEquals("a=sample {hasInputStream=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "<sample:4>"}}, 2), new String[][]{{"response", "", "7"}, {"statusCode", "", "0"}, {"charset", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "get", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "http://example.co/La?a=cq1E-5"}, {"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "false"}, {"org.jsoup.helper.HttpConnection", "requestBody", "java.lang.String", "bContent-Type"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "get", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "http://example.co/La?a=cq1E-5"}, {"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.UnknownHostException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123466788", "-0.6"}, false, 1, new String[][]{}, 2), new String[][]{{"execute", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "sslSocketFactory", new String[]{"javax.net.ssl.SSLSocketFactory"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "21"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "21"}}, 3), new String[][]{{"data", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{"m0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}, 2), new String[][]{{"response", "org.jsoup.Connection$Response", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}, 2), new String[][]{{"response", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{"Titleed", "/x1F", "<sample:0>", "Method must not be numl"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "proxy", "java.lang.String,int", "i", "153"}}, 3), new String[][]{{"ignoreContentType", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1F", "1.5d"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Title", "1.743d276"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<null>"}, {"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<null>"}}, 3), new String[][]{{"execute", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Title", "1.743d276"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:3>"}}, 3), new String[][]{{"execute", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"DTTjtle", "1.74432276"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:6>"}}, 3), new String[][]{{"data", "java.lang.String[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"DTTjtle", "1.74432276"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:6>"}}, 3), new String[][]{{"request", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{" ", "Method must not be numl", "<sample:0>", "1.5e3/0"}, false, 0, null, 3), new String[][]{{"ignoreContentType", "boolean", "5"}, {"header", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{}, 2), new String[][]{{"data", "java.lang.String,java.lang.String,java.io.InputStream", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{}, 3), new String[][]{{"data", "java.lang.String,java.lang.String,java.io.InputStream", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "[1_a]"}, {"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "https", "1048576"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{".51.5e300"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "https", "10495576"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{".51.5e33/0"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "https", "10495576"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{"+1", "-1", "<sample:3>", "I"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "proxy", "java.net.Proxy", "<null>"}, {"org.jsoup.helper.HttpConnection", "execute", ""}}, 1), new String[][]{{"cookie", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "<sample:3>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:1>"}}, 1), new String[][]{{"maxBodySize", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "get", ""}, {"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<null>"}}, 2), new String[][]{{"data", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "sslSocketFactory", new String[]{"javax.net.ssl.SSLSocketFactory"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "http:/"}}, 1), new String[][]{{"data", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "sslSocketFactory", new String[]{"javax.net.ssl.SSLSocketFactory"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "http:/"}}, 1), new String[][]{{"data", "java.lang.String,java.lang.String", "7"}, {"cookies", "java.util.Map", "6"}, {"header", "java.lang.String,java.lang.String", "2"}, {"headers", "java.util.Map", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Lethod must nom be null", "010URL must not be null"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream,java.lang.String", "R-1", "1.5d", "<sample:2>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.jsoup.helper.HttpConnection", "response", ""}, {"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "1.1234567890123456"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Lethod must nom be null", "010URL must not be null"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream,java.lang.String", "R-1", "1.5d", "<sample:2>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.jsoup.helper.HttpConnection", "response", ""}, {"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "1.1234567890123456"}}, 1), new String[][]{{"post", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"false"}, false, 11, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "` b"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"rSHelllos, WorHTTP error fetching URL1E-5"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "response", ""}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "20HTTP error fetching URL"}}, 3), new String[][]{{"proxy", "java.lang.String,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "123456789012345678901234567890", "0x123466789"}}, 1), new String[][]{{"cookie", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "sslSocketFactory", new String[]{"javax.net.ssl.SSLSocketFactory"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "1L", "Title"}}, 3), new String[][]{{"post", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Titlered", " "}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"300", "TIQE", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}}, 1), new String[][]{{"data", "java.util.Map", "0"}, {"referrer", "java.lang.String", "6"}, {"response", "", "1"}, {"bodyAsBytes", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"30B", "TIQE", "<sample:0>"}, false, 0, null, 1), new String[][]{{"data", "java.util.Map", "0"}, {"referrer", "java.lang.String", "6"}, {"data", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:5>"}, {"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "http://example.com/a?b=c"}, {"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 8, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "btrue"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", " ", "10495576", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "requestBody", "java.lang.String", "="}}, 2), new String[][]{{"request", "", "7"}, {"ignoreContentType", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"Contuent-Type", "\r", "<sample:3>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<sample:3>"}, {"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:0>"}}, 2), new String[][]{{"maxBodySize", "int", "3"}, {"sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "6"}, {"data", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"32769"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<null>"}, {"org.jsoup.helper.HttpConnection", "request", ""}}, 1), new String[][]{{"maxBodySize", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "-1"}}, 2), new String[][]{{"header", "java.lang.String,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "post", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"1234567890123x46789012345678901.1234567", "null", "<sample:4>"}, false, 0, null, 2), new String[][]{{"data", "java.util.Map", "5"}, {"postDataCharset", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, false, 15, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<null>"}}, 3), new String[][]{{"parser", "org.jsoup.parser.Parser", "3"}, {"cookie", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "1.5f", "Method must not be null"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String"}, new String[]{"225."}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "2147483648"}, {"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "1.5e300"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String"}, new String[]{"1e00"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "306"}, {"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "1.15"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "1048576"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "execute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "1E-5", "{\"a\":1}", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"true"}, false, 10, new String[][]{{"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:3>"}, {"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<sample:0>"}}, 2), new String[][]{{"data", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "proxy", "java.lang.String,int", "KI\n", "2147483647"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "1.25", " ", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "get", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"-16384"}, false, 8, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}, {"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"153"}, false, 14, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}}, 3), new String[][]{{"data", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.lang.String", "int"}, new String[]{"2020-01-01", "2147483647"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:4>"}, {"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "false"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:3>"}, {"org.jsoup.helper.HttpConnection", "proxy", "java.net.Proxy", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"="}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:10>"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "false"}, {"org.jsoup.helper.HttpConnection", "sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "<sample:4>"}, {"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "1.1134567"}}, 3), new String[][]{{"get", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"contentType", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"contentType", "", "4"}, {"statusMessage", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}, 2), new String[][]{{"contentType", "", "4"}, {"statusMessage", "", "7"}, {"charset", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"2147483608"}, false, 0, null, 1), new String[][]{{"url", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:1>"}}, 2), new String[][]{{"headers", "java.util.Map", "0"}, {"response", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.lang.String", "int"}, new String[]{"-1", "307"}, false, 0, null, 3), new String[][]{{"requestBody", "java.lang.String", "2"}, {"request", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 15, new String[][]{}, 2), new String[][]{{"headers", "java.util.Map", "0"}, {"cookie", "java.lang.String,java.lang.String", "3"}, {"request", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "Sitle"}, {"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:0>"}}, 1), new String[][]{{"get", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"TISLE"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "Key val must not be null", "{\"a\":1}"}, {"org.jsoup.helper.HttpConnection", "sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false), new String[][]{{"statusCode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "-1.5"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123466789", "-1.6"}, false, 1, new String[][]{}), new String[][]{{"execute", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "sslSocketFactory", new String[]{"javax.net.ssl.SSLSocketFactory"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "a b"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.net.Proxy"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "0x123456789", "gzip"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.net.Proxy"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "0x123456789", "gzip"}}), new String[][]{{"header", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.net.Proxy"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "0x123456789", "gzip"}, {"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:0>"}}), new String[][]{{"header", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "requestBody", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.net.Proxy"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "0x123456789", "gzip"}}), new String[][]{{"header", "java.lang.String,java.lang.String", "3"}, {"get", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.net.Proxy"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "1.12345678", "gzip"}, {"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:0>"}}), new String[][]{{"header", "java.lang.String,java.lang.String", "3"}, {"get", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "post", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{"-1.6", "2020-02-30T25:61:61", "<sample:1>", "+1"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"SKeHello, World", "R-1"}, false), new String[][]{{"parser", "org.jsoup.parser.Parser", "6"}, {"response", "org.jsoup.Connection$Response", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"SKeHello, World", "R-1"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:6>"}}), new String[][]{{"parser", "org.jsoup.parser.Parser", "6"}, {"response", "org.jsoup.Connection$Response", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"true"}, false, 11, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}), new String[][]{{"response", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{"Titled", "/x1F", "<sample:0>", "Method must not be null"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "32767"}, {"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<null>"}}), new String[][]{{"ignoreContentType", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}, {"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{"Titled", "/x1F", "<sample:0>", "Method must not be null"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "proxy", "java.lang.String,int", "i", "306"}, {"org.jsoup.helper.HttpConnection", "timeout", "int", "32767"}}), new String[][]{{"ignoreContentType", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{"Titleed", "/x1F", "<sample:0>", "Method must not be numl"}, false, 10, new String[][]{{"org.jsoup.helper.HttpConnection", "proxy", "java.lang.String,int", "i", "153"}, {"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:0>"}}), new String[][]{{"ignoreContentType", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"6xFFF", "1.743d276"}, false, 9, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Title", "1.743d276"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xFFFFFFFF", "1e10"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "response", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{" ", "Method must not be numl", "<null>", "1.74432276"}, false), new String[][]{{"ignoreContentType", "boolean", "5"}, {"header", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "66xFFF", "HTTP error fetching URL"}}), new String[][]{{"data", "java.lang.String,java.lang.String,java.io.InputStream", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{}), new String[][]{{"data", "java.lang.String,java.lang.String,java.io.InputStream", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{"0x123466789"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "[1,2]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{"SKeHello, World"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "[1_2]"}, {"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "https", "1048576"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"32768"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "[1_2]"}, {"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "https", "1048576"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "--1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "false"}, {"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "execute", ""}, {"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:1>"}}), new String[][]{{"maxBodySize", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "requestBody", new String[]{"java.lang.String"}, new String[]{"URL must not be null"}, false), new String[][]{{"post", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "requestBody", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false), new String[][]{{"postDataCharset", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:5>"}}), new String[][]{{"get", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{" ", "a b", "<empty>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"false"}, false, 10, new String[][]{{"org.jsoup.helper.HttpConnection", "execute", ""}, {"org.jsoup.helper.HttpConnection", "requestBody", "java.lang.String", "PT1H"}, {"org.jsoup.helper.HttpConnection", "get", ""}}), new String[][]{{"data", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "sslSocketFactory", new String[]{"javax.net.ssl.SSLSocketFactory"}, new String[]{"<sample:4>"}, false), new String[][]{{"data", "java.lang.String,java.lang.String", "6"}, {"cookies", "java.util.Map", "6"}, {"post", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"true"}, false, 11, new String[][]{}), new String[][]{{"data", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.lang.String", "int"}, new String[]{"Hello, World", "32768"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "20"}}), new String[][]{{"proxy", "java.lang.String,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"rS"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "20"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"1048575"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"19"}, false, 13, new String[][]{}), new String[][]{{"execute", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"postDataCharset", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String"}, new String[]{"tr.ue2.12344678901234567, "}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "DTTjtle"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "\u00e9", "abc", "<null>"}, {"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "encodeUrl", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"1.25aLoca1E-5Hello, World"}, false, 1, new String[][]{}), new String[][]{{"data", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{}), new String[][]{{"data", "java.lang.String", "1"}, {"data", "java.lang.String", "6"}, {"response", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"Key val must not be null", "\t", "<empty>"}, false), new String[][]{{"data", "java.util.Map", "0"}, {"referrer", "java.lang.String", "6"}, {"response", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"Key val must ot b3 null0x123456789", "TIRE", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}}), new String[][]{{"data", "java.util.Map", "0"}, {"referrer", "java.lang.String", "6"}, {"response", "", "1"}, {"bodyAsBytes", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "http://example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:3>"}, {"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "http://example.com/a?b="}, {"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "true"}}), new String[][]{{"data", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"SoU"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:4>"}, {"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "true"}}), new String[][]{{"request", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "1.5"}, {"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream,java.lang.String", "1.12345678901234567", "010", "<sample:2>", "0xFFFFFFFF"}}), new String[][]{{"data", "java.lang.String[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"[1,2]", "\u00e9", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:7>"}}), new String[][]{{"postDataCharset", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Method must not be null", "Charset must not be null"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "[1_2]"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "1048576"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"a"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "1.5e3001.25"}, {"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<sample:3>"}, {"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "-1.6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"postDataCharset", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"proxy", "java.lang.String,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "get", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "false"}, {"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:7>"}, {"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"1048446"}, false, 8, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}, {"org.jsoup.helper.HttpConnection", "proxy", "java.lang.String,int", "-1.5", "76"}, {"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:1>"}}), new String[][]{{"data", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}}), new String[][]{{"timeout", "int", "5"}, {"data", "java.lang.String", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.lang.String", "int"}, new String[]{"2020-01-01", "2147483647"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:4>"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Content-Encoding", "1.1234567"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream,java.lang.String", "+1", "Titleed", "<empty>", "null"}}), new String[][]{{"followRedirects", "boolean", "0"}, {"ignoreContentType", "boolean", "6"}, {"response", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b</a>Hello, Wouldq", "1/+3"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}), new String[][]{{"followRedirects", "boolean", "0"}, {"ignoreContentType", "boolean", "4"}, {"response", "", "7"}, {"statusCode", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b</a>Helo, Wouldq", "20"}, false, 4, new String[][]{}), new String[][]{{"followRedirects", "boolean", "0"}, {"maxBodySize", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"Content-Type"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "https", "-1", "<sample:3>"}}), new String[][]{{"referrer", "java.lang.String", "5"}, {"data", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:1>"}}), new String[][]{{"headers", "java.util.Map", "0"}, {"response", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:0>"}}), new String[][]{{"get", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "Key val must not be null", "{\"a\":1}"}, {"org.jsoup.helper.HttpConnection", "sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "Key val must not be null", "{\"a\":1}"}, {"org.jsoup.helper.HttpConnection", "sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 16, new String[][]{}, 2), new String[][]{{"header", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 16, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"response", "org.jsoup.Connection$Response", "5"}, {"data", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:3>"}, {"org.jsoup.helper.HttpConnection", "proxy", "java.lang.String,int", "5.", "2147483647"}, {"org.jsoup.helper.HttpConnection", "post", ""}}, 1), new String[][]{{"parser", "org.jsoup.parser.Parser", "4"}, {"ignoreContentType", "boolean", "7"}, {"get", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "post", ""}, {"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:7>"}}, 1), new String[][]{{"parser", "org.jsoup.parser.Parser", "4"}, {"ignoreContentType", "boolean", "7"}, {"get", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:6>"}, {"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:7>"}}, 1), new String[][]{{"parser", "org.jsoup.parser.Parser", "4"}, {"ignoreContentType", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:6>"}, false), new String[][]{{"request", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}, 1), new String[][]{{"request", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}, 1), new String[][]{{"header", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"URL muust nLot\r be nulltrue", "<U9G-8https"}, false, 8, new String[][]{{"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:7>"}}), new String[][]{{"request", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "1.12345678901234567", ", "}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "1.12345678901234567", ", "}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"uttps-", "CHarset must mot be null"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "request", ""}}, 2), new String[][]{{"ignoreHttpErrors", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "proxy", "java.net.Proxy", "<sample:0>"}}), new String[][]{{"charset", "java.lang.String", "3"}, {"bodyAsBytes", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<empty>"}, {"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "proxy", "java.net.Proxy", "<sample:0>"}}, 1), new String[][]{{"charset", "java.lang.String", "3"}, {"bodyAsBytes", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "Accept-Encoding"}, {"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "UTF-8", "Charset must not be null"}}), new String[][]{{"postDataCharset", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:3>"}, false, 0, null, 2), new String[][]{{"header", "java.lang.String,java.lang.String", "3"}, {"userAgent", "java.lang.String", "3"}, {"post", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "requestBody", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "10"}}), new String[][]{{"response", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "PT1H"}, {"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "false"}, {"org.jsoup.helper.HttpConnection", "sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}, {"org.jsoup.helper.HttpConnection", "get", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}, {"org.jsoup.helper.HttpConnection", "get", ""}}), new String[][]{{"postDataCharset", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "sslSocketFactory", new String[]{"javax.net.ssl.SSLSocketFactory"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:1>"}}, 3), new String[][]{{"proxy", "java.net.Proxy", "1"}, {"request", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:1>"}}), new String[][]{{"proxy", "java.net.Proxy", "1"}, {"request", "", "3"}, {"sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false), new String[][]{{"sslSocketFactory", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"sslSocketFactory", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "2147483648", "http:/"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{".51.5e33/0"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "execute", ""}}), new String[][]{{"data", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{".T.5D33"}, false, 12, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream,java.lang.String", "1.12345678", "Key val must not be null", "<null>", "2120-01-01"}, {"org.jsoup.helper.HttpConnection", "timeout", "int", "307"}, {"org.jsoup.helper.HttpConnection", "execute", ""}}, 3), new String[][]{{"data", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "2020-01-01--1", "1.12345s7", "<empty>"}, {"org.jsoup.helper.HttpConnection", "sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "<sample:3>"}}, 3), new String[][]{{"bodyStream", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "2020-01-01.--1", "1.1245s7", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "U"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "2020-01-01.--1", "1.1245s7", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "U"}}, 3), new String[][]{{"charset", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "encodeUrl", new String[]{"java.net.URL"}, new String[]{"<sample:0>"}, true), new String[][]{{"openStream", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "requestBody", "java.lang.String", "Method must not be null"}, {"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "false"}, {"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "\u00e9", "User-Agent"}}, 3), new String[][]{{"maxBodySize", "int", "7"}, {"execute", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "Request must not be null", "Key val must not be null"}, {"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", ".51.5e33/0"}}), new String[][]{{"data", "java.lang.String[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:4>"}, true), new String[][]{{"execute", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}, {"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "false"}}, 1), new String[][]{{"proxy", "java.net.Proxy", "5"}, {"data", "java.lang.String", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 10, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "get", ""}, {"org.jsoup.helper.HttpConnection", "request", ""}}, 2), new String[][]{{"proxy", "java.net.Proxy", "5"}, {"data", "java.lang.String", "2"}, {"data", "java.lang.String", "7"}, {"cookies", "java.util.Map", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "Charset must not be null", "u", "<sample:2>"}}), new String[][]{{"proxy", "java.net.Proxy", "5"}, {"data", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 10, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<empty>"}, {"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "1.74432276", "i\n0"}, {"org.jsoup.helper.HttpConnection", "post", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".11", "Key val!must not be null"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:4>"}}), new String[][]{{"postDataCharset", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"ethpd musC not be null"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<null>"}}), new String[][]{{"data", "java.lang.String[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{", qN"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "\t", "123456789012345678901234567890"}}), new String[][]{{"response", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{", qN"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "\t", "123456789012345678901234567890"}}), new String[][]{{"response", "", "5"}, {"statusMessage", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"0"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "\t", "123456789012345678901234567890"}}, 1), new String[][]{{"response", "", "5"}, {"statusMessage", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "requestBody", "java.lang.String", "1.1234567890123456"}, {"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:3>"}}), new String[][]{{"sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "7"}, {"postDataCharset", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "encodeUrl", new String[]{"java.net.URL"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 10, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "21"}, {"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<null>"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "16384"}}, 2), new String[][]{{"referrer", "java.lang.String", "5"}, {"cookie", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 10, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "21"}, {"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<null>"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "16384"}}, 2), new String[][]{{"referrer", "java.lang.String", "5"}, {"cookie", "java.lang.String,java.lang.String", "6"}, {"request", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 10, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "21"}, {"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "Titled"}, {"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<null>"}}, 2), new String[][]{{"referrer", "java.lang.String", "5"}, {"cookie", "java.lang.String,java.lang.String", "6"}, {"request", "", "2"}, {"data", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 10, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "21"}, {"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "Titled"}, {"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:3>"}, {"org.jsoup.helper.HttpConnection", "requestBody", "java.lang.String", "-1.6"}, {"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "false"}}), new String[][]{{"get", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.net.Proxy"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "DTTjtle"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.net.Proxy"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "DTTjtle"}}, 1), new String[][]{{"get", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"0"}, false, 12, new String[][]{{"org.jsoup.helper.HttpConnection", "requestBody", "java.lang.String", "0x1F"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "timeout", "int", "32711"}}, 2), new String[][]{{"url", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}}), new String[][]{{"data", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "/x1F"}}, 3), new String[][]{{"requestBody", "java.lang.String", "6"}, {"referrer", "java.lang.String", "6"}, {"postDataCharset", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"false"}, false, 12, new String[][]{{"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "true"}}), new String[][]{{"requestBody", "java.lang.String", "6"}, {"referrer", "java.lang.String", "6"}, {"postDataCharset", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String"}, new String[]{"Titleed"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "a"}, {"org.jsoup.helper.HttpConnection", "timeout", "int", "19"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "12:30:45", "2020-02-30T25:61:61"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "Charset must not be null"}, {"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "12:30:45", "2020-02-30T25:61:61"}}, 3), new String[][]{{"ignoreHttpErrors", "boolean", "3"}, {"cookie", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "false"}}), new String[][]{{"userAgent", "java.lang.String", "7"}, {"post", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "false"}, {"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:3>"}}, 3), new String[][]{{"userAgent", "java.lang.String", "7"}, {"post", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:3>"}, {"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "--1", "1.12345678901234567"}}, 1), new String[][]{{"cookie", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "execute", ""}}), new String[][]{{"post", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "execute", ""}}), new String[][]{{"postDataCharset", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "requestBody", new String[]{"java.lang.String"}, new String[]{"`+"}, false, 0, null, 2), new String[][]{{"postDataCharset", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "requestBody", new String[]{"java.lang.String"}, new String[]{",`3b=G/iBb>307"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "requestBody", "java.lang.String", "I"}, {"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "Content-Type"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:4>"}}, 2), new String[][]{{"postDataCharset", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "<sample:6>"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "1048577"}}, 2), new String[][]{{"statusMessage", "", "0"}, {"bufferUp", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", ""}}, 3), new String[][]{{"headers", "java.util.Map", "5"}, {"cookie", "java.lang.String,java.lang.String", "2"}, {"proxy", "java.net.Proxy", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", ""}, {"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:0>"}}, 1), new String[][]{{"headers", "java.util.Map", "5"}, {"cookie", "java.lang.String,java.lang.String", "2"}, {"proxy", "java.net.Proxy", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream,java.lang.String", "Hello, World", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:0>", "<null>"}, {"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:5>"}}, 1), new String[][]{{"headers", "java.util.Map", "5"}, {"cookie", "java.lang.String,java.lang.String", "2"}, {"data", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:0>"}, false), new String[][]{{"requestBody", "java.lang.String", "7"}, {"request", "", "4"}, {"followRedirects", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true), new String[][]{{"data", "java.lang.String", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"tr.ue2.12344678901234567, ", "SKeHello, World", "<sample:3>"}, false, 15, new String[][]{{"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "Request must not be nvll"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:1>"}}, 2), new String[][]{{"request", "org.jsoup.Connection$Request", "2"}, {"post", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"\ty", "SeHeklop Word", "<sample:0>"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:1>"}}, 2), new String[][]{{"request", "", "4"}, {"proxy", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "encodeUrl", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"toExternalForm", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"6xFFF", "Usser-Agent", "<sample:2>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:1>"}}, 2), new String[][]{{"request", "", "6"}, {"proxy", "", "0"}, {"data", "org.jsoup.Connection$KeyVal", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"6yFFF", "Usser-AXfdnt", "<sample:2>"}, false, 14, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}, {"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:3>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:1>"}}), new String[][]{{"request", "", "6"}, {"proxy", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"66yFFF", "", "<sample:1>"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:0>"}}), new String[][]{{"request", "", "6"}, {"proxy", "", "0"}, {"data", "org.jsoup.Connection$KeyVal", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"66FF", "-09y", "<sample:4>"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}, {"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "true"}}), new String[][]{{"request", "", "6"}, {"parser", "", "0"}, {"parseFragmentInput", "java.lang.String,org.jsoup.nodes.Element,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  0\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"66FF", "-09y", "<sample:4>"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "true"}}), new String[][]{{"request", "", "6"}, {"parser", "", "0"}, {"parseFragmentInput", "java.lang.String,org.jsoup.nodes.Element,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\nsample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"66F", "-009y", "<sample:4>"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}, 2), new String[][]{{"request", "", "6"}, {"parser", "", "0"}, {"parseFragmentInput", "java.lang.String,org.jsoup.nodes.Element,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\nsample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"66F", "-01y", "<sample:7>"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}, 2), new String[][]{{"request", "", "6"}, {"parser", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"0x123466789", "-01y", "<sample:7>"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:6>"}, {"org.jsoup.helper.HttpConnection", "post", ""}, {"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:1>"}}, 2), new String[][]{{"request", "", "6"}, {"requestBody", "", "0"}, {"maxBodySize", "int", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"00x1234667898", "ac", "<sample:8>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}, {"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:3>"}}, 2), new String[][]{{"request", "", "6"}, {"parser", "", "0"}, {"getErrors", "", "7"}, {"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"SeHeklop Word", "T", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "SeHfklop Word"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream,java.lang.String", "/a/b", "[1_2]", "<empty>", "abc"}}, 1), new String[][]{{"cookies", "java.util.Map", "2"}, {"data", "java.util.Map", "2"}, {"ignoreHttpErrors", "boolean", "7"}, {"ignoreHttpErrors", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"teFcop!Word", "", "<sample:1>"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "1iLL", "1.5"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "tr.ue2.12344678901234567, ", "-1", "<empty>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "SeHfklop Word"}}, 3), new String[][]{{"cookies", "java.util.Map", "7"}, {"data", "java.util.Map", "2"}, {"data", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false), new String[][]{{"followRedirects", "", "4"}, {"requestBody", "java.lang.String", "1"}, {"postDataCharset", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "-1", "-0.0", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "-1", "-0.0", "<sample:6>"}}, 3), new String[][]{{"url", "java.net.URL", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"7h1Hh4ups12:30:45gzip"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "2147483647"}, {"org.jsoup.helper.HttpConnection", "requestBody", "java.lang.String", "Key val must not be null"}}, 2), new String[][]{{"proxy", "java.lang.String,int", "5"}, {"post", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:6>"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:3>"}}, 3), new String[][]{{"proxy", "java.net.Proxy", "7"}, {"postDataCharset", "java.lang.String", "4"}, {"execute", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:5>"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:3>"}}, 3), new String[][]{{"proxy", "java.net.Proxy", "7"}, {"postDataCharset", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:1>"}}, 3), new String[][]{{"method", "org.jsoup.Connection$Method", "7"}, {"data", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
