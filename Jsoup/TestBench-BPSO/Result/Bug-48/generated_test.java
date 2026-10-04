package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, true), new String[][]{{"userAgent", "java.lang.String", "4"}, {"validateTLSCertificates", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, true), new String[][]{{"ignoreContentType", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:2>"}, true), new String[][]{{"maxBodySize", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, true), new String[][]{{"userAgent", "java.lang.String", "4"}, {"parser", "org.jsoup.parser.Parser", "7"}, {"userAgent", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"referrer", "java.lang.String", "7"}, {"followRedirects", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, true), new String[][]{{"request", "", "1"}, {"validateTLSCertificates", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:2>"}}, 1), new String[][]{{"cookie", "java.lang.String,java.lang.String", "2"}, {"validateTLSCertificates", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, true, 0, null, 2), new String[][]{{"response", "", "7"}, {"statusMessage", "", "6"}, {"statusCode", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{"Key val"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:9>"}, true), new String[][]{{"timeout", "int", "4"}, {"response", "", "4"}, {"statusCode", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, true, 0, null, 1), new String[][]{{"cookies", "java.util.Map", "2"}, {"data", "java.lang.String,java.lang.String,java.io.InputStream", "2"}, {"request", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true), new String[][]{{"response", "", "1"}, {"charset", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true), new String[][]{{"cookies", "java.util.Map", "7"}, {"request", "", "2"}, {"maxBodySize", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:2>"}, true), new String[][]{{"timeout", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, true, 0, null, 1), new String[][]{{"request", "", "2"}, {"followRedirects", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:7>"}, {"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:5>"}}, 2), new String[][]{{"cookies", "java.util.Map", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1), new String[][]{{"ignoreHttpErrors", "boolean", "5"}, {"postDataCharset", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=cAccept-Encoding"}, true), new String[][]{{"data", "java.lang.String,java.lang.String", "1"}, {"post", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.HttpStatusException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"1.5e300URL must not be nullUTF-8"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:0>"}}), new String[][]{{"data", "java.lang.String[]", "4"}, {"data", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "http://7xample.cpm/a?b=c", "0."}}), new String[][]{{"data", "java.lang.String[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http://7xample.comm/aa?b=c"}, true), new String[][]{{"data", "java.util.Map", "0"}, {"execute", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.net.UnknownHostException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c1e10"}, true), new String[][]{{"cookie", "java.lang.String,java.lang.String", "1"}, {"post", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.HttpStatusException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http://eample.com/a?b=c1e10true"}, true), new String[][]{{"get", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!doctype html>\n<html>\n <head>\n  <script>window.onload=function(){window.location.href=\"/lander?b=c1e10true\"}</script>\n </head>\n <body></body>\n</html> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:13>"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "true", "1.5e"}, {"org.jsoup.helper.HttpConnection", "validateTLSCertificates", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Charset must not be null", "1.5f"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "Key val must not be null", "abc"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "1.1234567890123456", "1.12345678", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"1p.5fTITLE"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "26"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"data", "java.util.Map", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"I", "5ewt/"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "1.24", "v", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"--25", "2020-02-30T25:61:61010", "<sample:2>"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"eccept-Encoding"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"HTTP error fetching URLHello, World", "\u00e9UTF-8", "<empty>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"0485M6"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "32"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xFFFFFFFF", "P9T1H"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "get", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "post", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"TILE"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"--2.5"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"response", "", "6"}, {"parse", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<null>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:2>"}}, 2), new String[][]{{"get", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "validateTLSCertificates", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"<null>", "1.12345678", "<sample:3>"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, true, 0, null, 2), new String[][]{{"data", "java.lang.String,java.lang.String,java.io.InputStream", "2"}, {"referrer", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:4>"}, true, 0, null, 2), new String[][]{{"parser", "org.jsoup.parser.Parser", "7"}, {"request", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"1048576"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "104857E"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 7, new String[][]{}, 1), new String[][]{{"data", "java.lang.String[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"2097152"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, null, 3), new String[][]{{"data", "java.util.Map", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "o"}, {"org.jsoup.helper.HttpConnection", "response", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"z\"a\":1}1", "Hello, World1.12345678901234567"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "1073741823"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 0, null, 3), new String[][]{{"data", "java.lang.String[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"1.123456789123456", "12:30:45", "<sample:0>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1", "1048576"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"ignoreContentType", "boolean", "5"}, {"execute", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "get", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<null>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "20", "textk"}}, 2), new String[][]{{"validateTLSCertificates", "boolean", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:8>"}, true, 0, null, 2), new String[][]{{"cookie", "java.lang.String,java.lang.String", "7"}, {"method", "org.jsoup.Connection$Method", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:9>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 1), new String[][]{{"data", "java.util.Map", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, true, 0, null, 2), new String[][]{{"execute", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, true, 0, null, 3), new String[][]{{"header", "java.lang.String,java.lang.String", "5"}, {"data", "java.lang.String,java.lang.String,java.io.InputStream", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"<a>b</a>http:/"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{"1E-"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Methhod must not be null", "5/"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "validateTLSCertificates", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"--2.5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "Hello, Xorld", "/a/b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "19"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "validateTLSCertificates", new String[]{"boolean"}, new String[]{"true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"0xFFFFFFFF", "1", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"04857A"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "get", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "0", "1.1234567890123456"}, {"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "Method must not be nulltrue", "214748364"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"4"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "httpsMethod must not be null", "Locaxtion"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "28"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"--2.5"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "1.5300"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{"UR, must not be null"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "-42"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\n", "2147483748"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "get", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Cookhe", "TITLE"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", ""}}), new String[][]{{"ignoreContentType", "boolean", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "post", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, true), new String[][]{{"execute", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "P10", "a1.1234567", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "-38"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true), new String[][]{{"get", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:0>"}, true), new String[][]{{"referrer", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:2>"}, true), new String[][]{{"data", "java.lang.String[]", "4"}, {"userAgent", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true), new String[][]{{"validateTLSCertificates", "boolean", "6"}, {"request", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:0>"}, true), new String[][]{{"method", "org.jsoup.Connection$Method", "4"}, {"ignoreContentType", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, true), new String[][]{{"parser", "org.jsoup.parser.Parser", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:2>"}, true), new String[][]{{"timeout", "int", "4"}, {"cookie", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "+a1"}}), new String[][]{{"data", "java.util.Map", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:4>"}, true), new String[][]{{"data", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:6>"}, false), new String[][]{{"data", "java.lang.String[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:2>"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, true), new String[][]{{"header", "java.lang.String,java.lang.String", "5"}, {"data", "java.lang.String[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false), new String[][]{{"data", "java.lang.String[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:6>"}, {"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "Con"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:10>"}, true), new String[][]{{"request", "org.jsoup.Connection$Request", "0"}, {"response", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, true), new String[][]{{"data", "java.util.Map", "5"}, {"cookies", "java.util.Map", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:0>"}}), new String[][]{{"data", "java.lang.String,java.lang.String,java.io.InputStream", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:2>"}, true), new String[][]{{"data", "java.util.Map", "5"}, {"data", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, true), new String[][]{{"postDataCharset", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"", "1e10", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, true), new String[][]{{"post", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, true), new String[][]{{"ignoreHttpErrors", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false), new String[][]{{"data", "java.lang.String[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "<a>b</a>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "http://example.com/a?b=c", "Hello, WorldCookie"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"+2", "a", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"data", "java.lang.String[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"38"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:10>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http://7xample.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "post", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Key val nust not be nulm", "2L"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, true, 0, null, 2), new String[][]{{"request", "", "4"}, {"parser", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, true, 0, null, 3), new String[][]{{"post", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Mk", ",a/b"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "validateTLSCertificates", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:3>"}, false), new String[][]{{"data", "java.lang.String[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 1), new String[][]{{"data", "java.lang.String[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"", "Location010 ", "<sample:6>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"68157439"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:7>"}}), new String[][]{{"data", "java.lang.String[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:4>"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "123456789002345678901234567890", "\t"}}), new String[][]{{"data", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"data", "java.lang.String,java.lang.String,java.io.InputStream", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "=1.251.5", "1048576http/"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 2), new String[][]{{"data", "java.util.Map", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"http:/"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, true, 0, null, 1), new String[][]{{"request", "org.jsoup.Connection$Request", "7"}, {"data", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:9>"}}, 2), new String[][]{{"postDataCharset", "", "0"}, {"ignoreContentType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "request", ""}}, 3), new String[][]{{"response", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, true), new String[][]{{"response", "", "6"}, {"contentType", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a b", "T"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"2147483648a"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true), new String[][]{{"request", "", "7"}, {"maxBodySize", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1048576", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:11>"}, true, 0, null, 3), new String[][]{{"parser", "org.jsoup.parser.Parser", "2"}, {"referrer", "java.lang.String", "3"}, {"data", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<null>"}, false, 3, new String[][]{}), new String[][]{{"data", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:8>"}, true, 0, null, 2), new String[][]{{"postDataCharset", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "validateTLSCertificates", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:4>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, true, 0, null, 3), new String[][]{{"postDataCharset", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"1E-51.1234567"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"1SSML"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:8>"}, true), new String[][]{{"request", "", "0"}, {"data", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}, 1), new String[][]{{"cookies", "java.util.Map", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:8>"}}, 3), new String[][]{{"method", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.Connection$Method", actual.getClass().getName());
  assertEquals("DELETE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "12:30:45"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "a"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"-35"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"postDataCharset", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:5>"}, false, 0, null, 3), new String[][]{{"get", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "validateTLSCertificates", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"response", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:1>"}}, 1), new String[][]{{"get", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:1>"}, false, 0, null, 3), new String[][]{{"ignoreHttpErrors", "boolean", "0"}, {"data", "java.lang.String[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"-524288"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"", "Reques", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, true, 0, null, 2), new String[][]{{"data", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:3>"}, false), new String[][]{{"request", "org.jsoup.Connection$Request", "1"}, {"request", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:3>"}, {"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "Contnt-Encoding"}}), new String[][]{{"data", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "a,b,c", "VTFF-8"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"request", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:9>"}}), new String[][]{{"request", "", "3"}, {"followRedirects", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"10"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"1234567890012345678901234567890"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:9>"}, {"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 0, null, 1), new String[][]{{"request", "org.jsoup.Connection$Request", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", ""}}, 3), new String[][]{{"data", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"tre-1", "1.1234567890H1234567"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false), new String[][]{{"request", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:0>"}, false, 0, null, 1), new String[][]{{"request", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, true), new String[][]{{"request", "", "6"}, {"data", "", "1"}, {"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:9>"}, true, 0, null, 1), new String[][]{{"response", "", "2"}, {"statusMessage", "", "6"}, {"statusCode", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"response", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c1.25"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http:"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:8>"}, false, 0, null, 2), new String[][]{{"data", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:0>"}, false, 0, null, 1), new String[][]{{"ignoreContentType", "boolean", "6"}, {"response", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:4>"}}, 2), new String[][]{{"execute", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"-1048575"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:5>"}}), new String[][]{{"request", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"1E-5", "Hell, XorldKey val must not be null", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:6>"}}, 1), new String[][]{{"validateTLSCertificates", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1", "1.1234567890124456"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", ""}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http:/"}, true, 0, null, 3), new String[][]{{"data", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:9>"}}), new String[][]{{"statusCode", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:4>"}}), new String[][]{{"charset", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Set-CookePT1H", "FAccept-Encoding"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "post", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", ".", "aaaaaaaaaaaaaaaaaaaa`aaaaaaaaa"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"request", "", "0"}, {"ignoreHttpErrors", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:7>"}, false, 6, new String[][]{}, 2), new String[][]{{"data", "java.lang.String[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http://7xample.com/a?b=c"}, true, 0, null, 1), new String[][]{{"request", "", "4"}, {"timeout", "", "3"}, {"validateTLSCertificates", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true), new String[][]{{"request", "", "6"}, {"parser", "", "1"}, {"parseInput", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  0\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:3>"}}, 1), new String[][]{{"data", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:8>"}, true, 0, null, 1), new String[][]{{"response", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:6>"}, {"org.jsoup.helper.HttpConnection", "timeout", "int", "21"}}), new String[][]{{"ignoreContentType", "boolean", "2"}, {"data", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:8>"}, {"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:5>"}}, 2), new String[][]{{"hasCookie", "java.lang.String", "0"}, {"bodyAsBytes", "", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[4, 5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"http:/"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "false"}, {"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 3, new String[][]{}, 1), new String[][]{{"data", "java.lang.String,java.lang.String,java.io.InputStream", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 2, new String[][]{}), new String[][]{{"data", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<null>"}}, 1), new String[][]{{"data", "java.lang.String,java.lang.String,java.io.InputStream", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:4>"}}), new String[][]{{"hasHeaderWithValue", "java.lang.String,java.lang.String", "1"}, {"ignoreHttpErrors", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:4>"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:7>"}}), new String[][]{{"hasHeader", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:0>"}}, 1), new String[][]{{"response", "", "6"}, {"charset", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:0>"}}), new String[][]{{"parse", "", "2"}, {"html", "", "7"}, {"appendChild", "org.jsoup.nodes.Node", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<!DOCTYPE a PUBLIC \"0\" \"sample\"> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"21"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:5>"}}), new String[][]{{"userAgent", "java.lang.String", "5"}, {"data", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"Key v`l"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:7>"}}), new String[][]{{"request", "", "6"}, {"timeout", "int", "0"}, {"cookie", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:1>"}}, 3), new String[][]{{"ignoreContentType", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"1048577"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:7>"}, {"org.jsoup.helper.HttpConnection", "timeout", "int", "2147483647"}}, 2), new String[][]{{"data", "java.lang.String,java.lang.String,java.io.InputStream", "1"}, {"method", "org.jsoup.Connection$Method", "4"}, {"postDataCharset", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:2>"}}), new String[][]{{"method", "org.jsoup.Connection$Method", "2"}, {"removeCookie", "java.lang.String", "7"}, {"method", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.Connection$Method", actual.getClass().getName());
  assertEquals("PUT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:12>"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:3>"}}), new String[][]{{"data", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{"Kfy va+l"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"http:/PT1H"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:3>"}}), new String[][]{{"request", "", "3"}, {"headers", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:3>"}}), new String[][]{{"parser", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 2, new String[][]{}), new String[][]{{"data", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "true"}}), new String[][]{{"response", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"21"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "17825791"}, {"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:6>"}}), new String[][]{{"response", "", "0"}});
  assertNull(actual);
 }
}
