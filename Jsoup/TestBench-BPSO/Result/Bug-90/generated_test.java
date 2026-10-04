package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "<sample:7>"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "-307"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:11>"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "requestBody", "java.lang.String", ""}}, 3), new String[][]{{"cookie", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"request", "org.jsoup.Connection$Request", "2"}, {"postDataCharset", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String"}, new String[]{"Key val must not be +ull"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "-19"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "Location"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<null>"}, {"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<empty>"}}), new String[][]{{"request", "org.jsoup.Connection$Request", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.lang.String", "int"}, new String[]{"1.5", "20"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<null>"}}, 3), new String[][]{{"referrer", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", ""}, {"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "false"}}), new String[][]{{"followRedirects", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:5>"}, {"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "gzip", "h"}}), new String[][]{{"charset", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"statusCode", "", "7"}, {"charset", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{"Key val mvst not be +ull", "1.12345678", "<empty>", ",-1"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:0>"}}, 1), new String[][]{{"followRedirects", "boolean", "5"}, {"requestBody", "java.lang.String", "3"}, {"response", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:3>"}}), new String[][]{{"data", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ontent-EncodingHello, World", "1.5e300"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "123456789012345678902234567890", "<null>"}}), new String[][]{{"ignoreHttpErrors", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"RIquest m3st not be null", "0xFFFFFFFF"}, false), new String[][]{{"response", "", "5"}, {"statusMessage", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"010Content-Encoding"}, false, 0, null, 3), new String[][]{{"request", "", "3"}, {"parser", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Parser", actual.getClass().getName());
  assertEquals("{isTrackErrors=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:4>"}, false), new String[][]{{"data", "java.lang.String", "1"}, {"key", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$KeyVal", actual.getClass().getName());
  assertEquals("sample=0 {hasInputStream=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "proxy", "java.net.Proxy", "<sample:5>"}}, 3), new String[][]{{"data", "java.util.Map", "0"}, {"data", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "ISO-8859-1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http://exampleUcom/a?b=cContent-Type"}, true), new String[][]{{"requestBody", "java.lang.String", "5"}, {"get", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "19"}}, 2), new String[][]{{"postDataCharset", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"maxBodySize", "int", "4"}, {"post", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "ISO-8859-1", "htsp://example.com/a?b=c"}}), new String[][]{{"post", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.HttpStatusException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "http://example.com/a?b=cRequest must not be null"}}), new String[][]{{"get", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.HttpStatusException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=cRequest must not be null"}, true), new String[][]{{"data", "java.lang.String,java.lang.String,java.io.InputStream", "6"}, {"post", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.HttpStatusException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1F", "\u00e9URL must not be null010null"}, false, 0, null, 3), new String[][]{{"requestBody", "java.lang.String", "4"}, {"response", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http://e>ample.com/a?b=cRequest must not be null"}, true), new String[][]{{"proxy", "java.lang.String,int", "6"}, {"post", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{"Acce.pt-Encoding", "", "<sample:3>", "1.1234567890123456"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "encodeUrl", new String[]{"java.net.URL"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 3), new String[][]{{"followRedirects", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<sample:5>"}, false, 0, null, 2), new String[][]{{"cookies", "java.util.Map", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"12:30:45ISO-8859-1", "5", "<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "Method must not be null1.12345671e10"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2), new String[][]{{"post", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.lang.String", "int"}, new String[]{"-v7", "32768"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "proxy", "java.net.Proxy", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"Location202020-01-01"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "false"}}, 3), new String[][]{{"followRedirects", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "sslSocketFactory", new String[]{"javax.net.ssl.SSLSocketFactory"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xF,FFFFFFF-0.0", "5."}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "a,b+="}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "I10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"b", "0"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "a"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 7, new String[][]{}, 3), new String[][]{{"cookie", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2), new String[][]{{"proxy", "java.net.Proxy", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "Locati\non"}, {"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"65536"}, false, 7, new String[][]{}, 3), new String[][]{{"url", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "post", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "21"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{"32768a", "1.123", "<sample:2>", "Accept-EncodingAccept-Encoding"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<empty>"}, {"org.jsoup.helper.HttpConnection", "proxy", "java.net.Proxy", "<sample:3>"}}, 3), new String[][]{{"get", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "get", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "sslSocketFactory", new String[]{"javax.net.ssl.SSLSocketFactory"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "50"}, {"org.jsoup.helper.HttpConnection", "post", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"http"}, false, 4, new String[][]{}, 2), new String[][]{{"cookies", "java.util.Map", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{"I", "1.113456781.5f", "<sample:1>", ",-1"}, false, 5, new String[][]{}, 2), new String[][]{{"timeout", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String"}, new String[]{"1230:45ISO-859-1"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,b-c", ""}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "execute", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "l5", "12:3"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"HTTP error fetching URL", "0xFFFFFGFF"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:8>"}}, 3), new String[][]{{"postDataCharset", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "response", ""}, {"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:1>"}}, 2), new String[][]{{"data", "java.util.Map", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "true"}}, 2), new String[][]{{"request", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"text/", "Key val mus:t not be +ull"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "TITL9", "{\"a\":1}"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "Key val mu5st not be +ull0", "Rdquest m3st not be null"}}, 2), new String[][]{{"data", "java.lang.String[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "5.2147483648b"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "Jez val lust not be 9null", "0xFFFFxFFF"}, {"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "Hello,World"}}, 3), new String[][]{{"timeout", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "a"}, {"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "URL must not be ntllhttp"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"17"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "Hello, WorldKey val must not be null", ", -.1", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"32769"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Title", "2020-02-31T25:61:61"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "post", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "0y123456789"}}, 1), new String[][]{{"response", "org.jsoup.Connection$Response", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"Method must not beKnull"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "1048627"}}, 1), new String[][]{{"data", "java.util.Map", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "execute", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{":"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String"}, new String[]{"UsVer-Agent"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:8>"}, true, 0, null, 2), new String[][]{{"response", "org.jsoup.Connection$Response", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"32778"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "-2147483648"}, {"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "1041.5d", "I4"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "20"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "5Content-Type", "2147483F648"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "L20"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "5.21474864a"}}, 3), new String[][]{{"url", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "encodeUrl", new String[]{"java.net.URL"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"getFile", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "encodeUrl", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, true, 0, null, 1), new String[][]{{"openConnection", "java.net.Proxy", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.net.Proxy"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "-10"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{"b,b,c"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "1048576"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Request m3st not be nll", "2147483648"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "false"}}, 2), new String[][]{{"cookies", "java.util.Map", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"32769"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "HTTP error fetching URL1.5e300"}}, 2), new String[][]{{"data", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "Hello5 World"}}, 3), new String[][]{{"response", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "get", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "proxy", "java.lang.String,int", "HTTP error fetching URLCharset must not be null", "-65536"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"16384"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:4>"}, {"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "327682020-02-30T25:61:61", "acbc"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.lang.String", "int"}, new String[]{"", "-2147483648"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"612"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:2>"}}, 2), new String[][]{{"postDataCharset", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.net.Proxy"}, new String[]{"<sample:0>"}, false, 0, null, 3), new String[][]{{"url", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "requestBody", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", " 2147483638", "12:30:45"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"12:30:45ISO-9859-1", "-1.5", "<sample:1>"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "Use-Agent"}}, 2), new String[][]{{"userAgent", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:0>"}}, 2), new String[][]{{"headers", "java.util.Map", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"Con4tent-Encoding"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "<sample:2>"}}, 2), new String[][]{{"cookie", "java.lang.String,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"42"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.net.Proxy"}, new String[]{"<sample:5>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:4>"}, {"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String"}, new String[]{"1L"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "5.2147483648a", "URL must not be nullhttp"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "63"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "sslSocketFactory", new String[]{"javax.net.ssl.SSLSocketFactory"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "post", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", ""}, {"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1048576Request musst not be null", "3D07"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.lang.String", "int"}, new String[]{"Request m3st not be null", "126"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"-65536"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"-32705"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<sample:7>"}, false), new String[][]{{"execute", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}}), new String[][]{{"data", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:0>"}}), new String[][]{{"method", "org.jsoup.Connection$Method", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"2020-0b1-01"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"+2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"requestBody", "java.lang.String", "0"}, {"response", "org.jsoup.Connection$Response", "7"}, {"proxy", "java.net.Proxy", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"j", "Hello, Wlrld"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "1048576"}, {"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "UTF--8"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1", "nu-1.5"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "02F", "Locatio_"}}), new String[][]{{"execute", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "32748"}}), new String[][]{{"postDataCharset", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"Jey val lust not be null"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http", "Jey val lust not be null1.12345678901234567"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "Method mutt not be null", "11"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, false), new String[][]{{"followRedirects", "boolean", "1"}, {"sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "requestBody", new String[]{"java.lang.String"}, new String[]{"trud"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "request", ""}, {"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "32768"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "get", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"2147483391"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "true"}, {"org.jsoup.helper.HttpConnection", "timeout", "int", "1048614"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "requestBody", new String[]{"java.lang.String"}, new String[]{"B"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:3>"}}), new String[][]{{"ignoreContentType", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "1.Xe300"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "referrer", new String[]{"java.lang.String"}, new String[]{"4d"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "execute", ""}}), new String[][]{{"data", "java.lang.String[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "sslSocketFactory", new String[]{"javax.net.ssl.SSLSocketFactory"}, new String[]{"<null>"}, false), new String[][]{{"request", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "encodeUrl", new String[]{"java.net.URL"}, new String[]{"<sample:4>"}, true), new String[][]{{"getDefaultPort", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream,java.lang.String", "Method must not be null", "<null>", "<sample:2>", "User-Ageent"}}), new String[][]{{"post", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.lang.String", "int"}, new String[]{"1E-5", "-131041"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, false), new String[][]{{"postDataCharset", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"post", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false), new String[][]{{"body", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{", H5", "0x1F", "<empty>", "gzi4"}, false), new String[][]{{"execute", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"d1.50x1F", "TITLE32768", "<sample:2>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "requestBody", "java.lang.String", "+2010"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String"}, new String[]{"UTF.8"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "encodeUrl", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Request m3st not be nullhttps", "00"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "{\"a\":1}"}}), new String[][]{{"data", "java.lang.String,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{"0", "2020-02-30T25;61:61", "<sample:2>", "2147483648"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "Request must not be null-0.0", "307", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{}), new String[][]{{"data", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{",!"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream,java.lang.String", "gzoip", "1.1234567890123456", "<sample:1>", "32768"}}), new String[][]{{"maxBodySize", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1048576", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "{\"a\":2}", "--1", "<sample:4>"}, {"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "", "Reuest m3st not be null"}}), new String[][]{{"request", "org.jsoup.Connection$Request", "5"}, {"response", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", "org.jsoup.Connection$Response", "<sample:2>"}}), new String[][]{{"data", "java.lang.String[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String", ""}}), new String[][]{{"data", "java.lang.String", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "3C07"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream,java.lang.String", "Content-Encoding", "0x2F", "<sample:1>", ".a/"}}), new String[][]{{"request", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}), new String[][]{{"response", "org.jsoup.Connection$Response", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "sslSocketFactory", new String[]{"javax.net.ssl.SSLSocketFactory"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}), new String[][]{{"data", "java.lang.String", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"2147483647"}, false), new String[][]{{"data", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"Jey v7l lust not be oull"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}}), new String[][]{{"postDataCharset", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream,java.lang.String", "2020-02-30T25:61:61", "-307", "<sample:0>", "http"}, {"org.jsoup.helper.HttpConnection", "postDataCharset", "java.lang.String", "2020-02-30T25:61:61"}}), new String[][]{{"proxy", "java.net.Proxy", "7"}, {"data", "java.lang.String", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "requestBody", new String[]{"java.lang.String"}, new String[]{"21474836481.5"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "Location", "Title32768", "<sample:5>"}}), new String[][]{{"data", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "encodeUrl", new String[]{"java.net.URL"}, new String[]{"<sample:8>"}, true), new String[][]{{"getAuthority", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:2>"}, true), new String[][]{{"proxy", "java.net.Proxy", "0"}, {"post", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<null>"}, {"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "trve1.1234567", "1.1234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:5>"}, false), new String[][]{{"execute", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.net.Proxy"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "true"}}), new String[][]{{"data", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "response", ""}}), new String[][]{{"data", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "te_t/", "agzip"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "Hllo, Wo"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "Locaion"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:2>"}, true), new String[][]{{"request", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "", "Heello, World"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String"}, new String[]{"ISs8859-1"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Methxd must not be null1.12345671e10", "1.5e300"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "sslSocketFactory", "javax.net.ssl.SSLSocketFactory", "<sample:3>"}}, 1), new String[][]{{"followRedirects", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "Ueo-Agent", "1L"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "encodeUrl", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"openStream", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 3, new String[][]{}), new String[][]{{"maxBodySize", "int", "2"}, {"postDataCharset", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"SUUser-Agent"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<empty>"}}), new String[][]{{"header", "java.lang.String,java.lang.String", "6"}, {"data", "java.lang.String,java.lang.String,java.io.InputStream", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "maxBodySize", "int", "-32461"}}, 1), new String[][]{{"header", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"-1", "5.", "<empty>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "requestBody", "java.lang.String", "F\"a\":1}"}}), new String[][]{{"data", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookie", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"9I", "1E-5"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "execute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "requestBody", "java.lang.String", "01012:30:45"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"2097154"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:6>"}}, 3), new String[][]{{"proxy", "java.net.Proxy", "3"}, {"postDataCharset", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "Content-Type", "5.+1="}}), new String[][]{{"data", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", ", "}}, 1), new String[][]{{"header", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.net.Proxy"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, false, 0, null, 2), new String[][]{{"proxy", "java.net.Proxy", "3"}, {"post", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:3>"}, false), new String[][]{{"data", "java.lang.String,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:4>"}, false), new String[][]{{"data", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "proxy", "java.net.Proxy", "<sample:5>"}}), new String[][]{{"charset", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"1Lhttp"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "encodeUrl", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"openConnection", "java.net.Proxy", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"12:30:45ISO-785", "{sa\":1}", "<sample:0>"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "PT"}}), new String[][]{{"request", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"htp:/", "PT1H0x123456789", "<sample:1>"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "User-Agent"}}), new String[][]{{"response", "", "7"}, {"bodyAsBytes", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "sslSocketFactory", new String[]{"javax.net.ssl.SSLSocketFactory"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "0x123456789"}}), new String[][]{{"data", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"postDataCharset", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "sslSocketFactory", new String[]{"javax.net.ssl.SSLSocketFactory"}, new String[]{"<sample:7>"}, false, 0, null, 2), new String[][]{{"header", "java.lang.String,java.lang.String", "5"}, {"response", "", "0"}, {"charset", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "encodeUrl", new String[]{"java.net.URL"}, new String[]{"<sample:9>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.net.URL", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String", "Key vval must not be +ull", "0xFFFFFFFFF"}}, 2), new String[][]{{"proxy", "java.net.Proxy", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"2021-01-01", "trrue", "<sample:0>"}, false, 6, new String[][]{}), new String[][]{{"postDataCharset", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreHttpErrors", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{}, 2), new String[][]{{"url", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Helko, Wormd", "abcHello,World"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "parser", "org.jsoup.parser.Parser", "<sample:2>"}}, 3), new String[][]{{"post", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:7>"}}, 2), new String[][]{{"data", "java.lang.String", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "url", "java.lang.String", "0"}}), new String[][]{{"request", "", "7"}, {"postDataCharset", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.net.Proxy"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:6>"}}), new String[][]{{"get", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"HTTP error fetching URL", "[,2]"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "requestBody", "java.lang.String", ",1"}}, 3), new String[][]{{"post", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "sslSocketFactory", new String[]{"javax.net.ssl.SSLSocketFactory"}, new String[]{"<sample:0>"}, false), new String[][]{{"get", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "headers", "java.util.Map", "<sample:4>"}}), new String[][]{{"request", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 3), new String[][]{{"data", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}, 1), new String[][]{{"referrer", "java.lang.String", "1"}, {"data", "java.lang.String,java.lang.String,java.io.InputStream", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, true), new String[][]{{"referrer", "java.lang.String", "5"}, {"data", "java.lang.String[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "request", ""}}, 1), new String[][]{{"data", "org.jsoup.Connection$KeyVal", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "sslSocketFactory", new String[]{"javax.net.ssl.SSLSocketFactory"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "2147473648", "Charset must not be nullPT1H"}}, 1), new String[][]{{"referrer", "java.lang.String", "6"}, {"execute", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"32768"}, false), new String[][]{{"data", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "aaaaaaaaaaaaaaaaaaaaaaaaaa`aaa", "a b", "<sample:6>"}, {"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "followRedirects", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "false"}}, 1), new String[][]{{"execute", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "sslSocketFactory", new String[]{"javax.net.ssl.SSLSocketFactory"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"parser", "org.jsoup.parser.Parser", "6"}, {"requestBody", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:4>"}, false), new String[][]{{"request", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "requestBody", "java.lang.String", "1e1012:30:45"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"true", "0xFFFFFFFF", "<empty>"}, false, 0, null, 3), new String[][]{{"data", "java.lang.String[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{}, 3), new String[][]{{"cookies", "java.util.Map", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{"org.jsoup.Connection$Request"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "response", ""}}, 2), new String[][]{{"response", "org.jsoup.Connection$Response", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String"}, new String[]{"CharseE must not be nulk"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{"Accept-En4oding", "Hello, World", "<sample:2>", "Content-Enoding"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "0123456789012345678901234567890", "Key val must not be null"}}), new String[][]{{"request", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, null, 2), new String[][]{{"execute", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"PT1Hh"}, false, 0, null, 3), new String[][]{{"request", "org.jsoup.Connection$Request", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream,java.lang.String", "ISO-8859-1", "a,b,c-1.5", "<sample:1>", "12:30:45ISO-8859-1"}, {"org.jsoup.helper.HttpConnection", "request", ""}}), new String[][]{{"request", "", "7"}, {"ignoreContentType", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "false"}}), new String[][]{{"postDataCharset", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "requestBody", "java.lang.String", "1.35"}}, 1), new String[][]{{"requestBody", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "false"}}, 3), new String[][]{{"postDataCharset", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.lang.String", "int"}, new String[]{"https", "0"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "proxy", "java.lang.String,int", "1234567890\r12345678901234567890", "1073741823"}}, 1), new String[][]{{"maxBodySize", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "encodeUrl", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, true, 0, null, 3), new String[][]{{"toExternalForm", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"A", "a", "<sample:9>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "true"}}, 2), new String[][]{{"postDataCharset", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.lang.String"}, new String[]{"1.1234556790123456"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream,java.lang.String", "=", "5.21464836648a", "<empty>", "http:/"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "header", "java.lang.String,java.lang.String", "RequetDt must not be null", "Method musu not be nullabc"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:6>"}}, 2), new String[][]{{"url", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "Key val must not be 4null", "text/", "<sample:0>"}}, 2), new String[][]{{"data", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:5>"}, false), new String[][]{{"data", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "requestBody", new String[]{"java.lang.String"}, new String[]{"URL mus\rt ot be null"}, false, 0, null, 1), new String[][]{{"method", "org.jsoup.Connection$Method", "6"}, {"ignoreContentType", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "maxBodySize", new String[]{"int"}, new String[]{"32715"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "timeout", "int", "-1048559"}}, 3), new String[][]{{"ignoreContentType", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<sample:5>"}}, 2), new String[][]{{"response", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"12:3/I45"}, false, 2, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}), new String[][]{{"response", "", "2"}, {"statusCode", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, null, 1), new String[][]{{"request", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream,java.lang.String", "a", "Acce7pt-Encoing", "<sample:0>", "\t"}}, 1), new String[][]{{"data", "java.lang.String,java.lang.String,java.io.InputStream", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{"0x1F", "12;3/I55", "<sample:3>", "1.5d300"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "91Accept-Encoding", "text/", "<sample:0>"}}), new String[][]{{"data", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"ohttp:/", "0.25-0.0", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "1.12345678901234561.12345678901234567"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<sample:8>"}, true, 0, null, 2), new String[][]{{"data", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, null, 1), new String[][]{{"data", "java.lang.String[]", "1"}, {"method", "org.jsoup.Connection$Method", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "postDataCharset", new String[]{"java.lang.String"}, new String[]{"[1,2]="}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "referrer", "java.lang.String", "/Eabc"}, {"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{"UTF.8", "1.5e300", "<empty>", "620"}, false, 4, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreHttpErrors", "boolean", "false"}}, 1), new String[][]{{"data", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"TITLE1.5f", "1048576Request\037musst not be null", "<sample:0>"}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "proxy", "java.net.Proxy", "<sample:0>"}}, 3), new String[][]{{"response", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "requestBody", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 1, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "HTTP error fetching URLURL must not be null", "URLmust not be nullhttpContent-Encoding"}}), new String[][]{{"postDataCharset", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"Ettp", "text/", "<sample:2>"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:4>"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "1.5d"}}), new String[][]{{"response", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}), new String[][]{{"response", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 7, new String[][]{}, 2), new String[][]{{"data", "java.lang.String", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<sample:1>"}, {"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:4>"}}, 1), new String[][]{{"response", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "request", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "false"}, {"org.jsoup.helper.HttpConnection", "data", "java.lang.String[]", "<sample:2>"}}), new String[][]{{"ignoreHttpErrors", "boolean", "4"}, {"postDataCharset", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"--g", "htp:/", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookies", "java.util.Map", "<sample:3>"}}, 1), new String[][]{{"requestBody", "java.lang.String", "2"}, {"response", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}, 2), new String[][]{{"request", "org.jsoup.Connection$Request", "4"}, {"ignoreHttpErrors", "boolean", "7"}, {"response", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"0http", "1E-5q", "<empty>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String,java.lang.String,java.io.InputStream", "5", "0.25", "<sample:2>"}, {"org.jsoup.helper.HttpConnection", "userAgent", "java.lang.String", "User-Agent"}}, 2), new String[][]{{"timeout", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "cookies", new String[]{"java.util.Map"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "execute", ""}, {"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:4>"}}), new String[][]{{"response", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false), new String[][]{{"timeout", "int", "7"}, {"request", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "timeout", new String[]{"int"}, new String[]{"7"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "get", ""}}), new String[][]{{"response", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Map", "<sample:1>"}}), new String[][]{{"request", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "ignoreContentType", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.jsoup.helper.HttpConnection", "followRedirects", "boolean", "false"}}, 3), new String[][]{{"post", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:0>"}, {"org.jsoup.helper.HttpConnection", "proxy", "java.net.Proxy", "<sample:3>"}}), new String[][]{{"post", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.lang.String", "int"}, new String[]{"User-Ageot", "2147483647"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream", "java.lang.String"}, new String[]{"5", "Hello, World", "<sample:5>", "-15"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "UTF-8null", "Requestmmust not be null"}}), new String[][]{{"response", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "cookie", "java.lang.String,java.lang.String", "2020-02-30T25:61:61", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String", "java.io.InputStream"}, new String[]{"32768http", "1", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "request", "org.jsoup.Connection$Request", "<null>"}, {"org.jsoup.helper.HttpConnection", "post", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "url", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, false, 3, new String[][]{}), new String[][]{{"post", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:0>"}}), new String[][]{{"statusCode", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "parser", new String[]{"org.jsoup.parser.Parser"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}, 2), new String[][]{{"url", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-1-01", "2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "true"}}), new String[][]{{"postDataCharset", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "method", new String[]{"org.jsoup.Connection$Method"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.util.Collection", "<null>"}}), new String[][]{{"cookie", "java.lang.String,java.lang.String", "6"}, {"postDataCharset", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "proxy", new String[]{"java.lang.String", "int"}, new String[]{"URL must not e nullhttp", "16384"}, false, 6, new String[][]{{"org.jsoup.helper.HttpConnection", "proxy", "java.lang.String,int", "2LL", "2147483647"}}), new String[][]{{"postDataCharset", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.charset.IllegalCharsetNameException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "method", "org.jsoup.Connection$Method", "<sample:5>"}}, 3), new String[][]{{"referrer", "java.lang.String", "6"}, {"ignoreHttpErrors", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "post", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.helper.HttpConnection", "data", "java.lang.String", "J"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.lang.String"}, new String[]{"http://exampleUcom/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "data", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"text/", "hzip"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "userAgent", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 4, new String[][]{}), new String[][]{{"response", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "headers", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "url", "java.net.URL", "<sample:4>"}}), new String[][]{{"followRedirects", "boolean", "0"}, {"data", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "header", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ContentyEncoiing", "htt"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "post", ""}}), new String[][]{{"response", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Response", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "connect", new String[]{"java.net.URL"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.HttpConnection", "org.jsoup.helper.HttpConnection", "response", new String[]{"org.jsoup.Connection$Response"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.HttpConnection", "ignoreContentType", "boolean", "false"}}), new String[][]{{"request", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.helper.HttpConnection$Request", actual.getClass().getName());
 }
}
