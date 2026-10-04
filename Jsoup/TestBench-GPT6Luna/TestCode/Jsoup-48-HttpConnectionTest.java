package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;
import javax.net.ssl.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.*;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

public class HttpConnectionTest {
    @Test
    public void testConnectStringAndUrlEncoding() throws Exception {
        Connection con = HttpConnection.connect("http://example.com/a b");
        assertEquals("/a%20b", con.request().url().getFile());
        URL url = new URL("http://example.com/other");
        con.url(url);
        assertEquals(url, con.request().url());
    }

    @Test
    public void testRequestDefaults() throws Exception {
        Connection.Request req = HttpConnection.connect("http://example.com").request();
        assertEquals(3000, req.timeout());
        assertEquals(1024 * 1024, req.maxBodySize());
        assertTrue(req.followRedirects());
        assertEquals(Connection.Method.GET, req.method());
        assertEquals("gzip", req.header("Accept-Encoding"));
    }

    @Test
    public void testTimeoutZeroAndOne() throws Exception {
        Connection.Request req = HttpConnection.connect("http://example.com").request();
        req.timeout(0);
        assertEquals(0, req.timeout());
        req.timeout(1);
        assertEquals(1, req.timeout());
    }

    @Test
    public void testTimeoutRejectsNegativeOne() throws Exception {
        Connection.Request req = HttpConnection.connect("http://example.com").request();
        try { req.timeout(-1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        assertEquals(3000, req.timeout());
    }

    @Test
    public void testMaxBodySizeZeroAndOne() throws Exception {
        Connection.Request req = HttpConnection.connect("http://example.com").request();
        req.maxBodySize(0);
        assertEquals(0, req.maxBodySize());
        req.maxBodySize(1);
        assertEquals(1, req.maxBodySize());
    }

    @Test
    public void testMaxBodySizeRejectsNegativeOne() throws Exception {
        Connection.Request req = HttpConnection.connect("http://example.com").request();
        try { req.maxBodySize(-1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        assertEquals(1024 * 1024, req.maxBodySize());
    }

    @Test
    public void testConnectionOptionsPropagate() throws Exception {
        Connection.Request req = HttpConnection.connect("http://example.com")
                .userAgent("agent").referrer("http://ref.example")
                .followRedirects(false).ignoreHttpErrors(true)
                .ignoreContentType(true).validateTLSCertificates(false)
                .method(Connection.Method.POST).request();
        assertEquals("agent", req.header("User-Agent"));
        assertEquals("http://ref.example", req.header("Referer"));
        assertFalse(req.followRedirects());
        assertTrue(req.ignoreHttpErrors());
        assertTrue(req.ignoreContentType());
        assertFalse(req.validateTLSCertificates());
        assertEquals(Connection.Method.POST, req.method());
    }

    @Test
    public void testHeaderLookupCaseInsensitiveAndOverwrite() throws Exception {
        Connection.Request req = HttpConnection.connect("http://example.com").request();
        req.header("X-Mixed-Case", "first");
        assertEquals("first", req.header("x-MIXED-case"));
        assertTrue(req.hasHeader("X-MIXED-CASE"));
        assertTrue(req.hasHeaderWithValue("x-mixed-case", "FIRST"));
        req.header("x-mixed-case", "second");
        assertEquals(2, req.headers().size());
        assertEquals("second", req.header("X-Mixed-Case"));
    }

    @Test
    public void testRemoveHeaderCaseInsensitive() throws Exception {
        Connection.Request req = HttpConnection.connect("http://example.com").request();
        req.header("X-Test", "value");
        req.removeHeader("x-tEST");
        assertFalse(req.hasHeader("X-Test"));
        assertFalse(req.headers().containsKey("X-Test"));
    }

    @Test
    public void testCookiesAddLookupAndRemove() throws Exception {
        Connection.Request req = HttpConnection.connect("http://example.com").request();
        req.cookie("sid", "abc");
        assertTrue(req.hasCookie("sid"));
        assertEquals("abc", req.cookie("sid"));
        req.removeCookie("sid");
        assertFalse(req.hasCookie("sid"));
        assertEquals(null, req.cookie("sid"));
    }

    @Test
    public void testCookiesMapAndConnectionData() throws Exception {
        Map<String, String> cookies = new LinkedHashMap<String, String>();
        cookies.put("one", "1");
        cookies.put("two", "2");
        Connection.Request req = HttpConnection.connect("http://example.com")
                .cookies(cookies).data("q", "hello").request();
        assertEquals("1", req.cookie("one"));
        assertEquals("2", req.cookie("two"));
        assertEquals(1, req.data().size());
        assertEquals("q=hello", req.data().iterator().next().toString());
    }

    @Test
    public void testParserAndPostCharsetConfiguration() throws Exception {
        Parser parser = Parser.xmlParser();
        Connection.Request req = HttpConnection.connect("http://example.com")
                .parser(parser).postDataCharset("UTF-8").request();
        assertSame(parser, req.parser());
        assertEquals("UTF-8", req.postDataCharset());
    }

    @Test
    public void testPostCharsetRejectsInvalidName() throws Exception {
        Connection.Request req = HttpConnection.connect("http://example.com").request();
        try { req.postDataCharset("bad charset"); fail("expected IllegalCharsetNameException"); }
        catch (IllegalCharsetNameException expected) { }
        assertEquals("UTF-8", req.postDataCharset());
    }

    @Test
    public void testRequestObjectReplacement() throws Exception {
        Connection con = HttpConnection.connect("http://example.com");
        Connection.Request replacement = HttpConnection.connect("http://other.example").request();
        assertSame(con, con.request(replacement));
        assertSame(replacement, con.request());
    }

    @Test
    public void testResponseObjectReplacement() throws Exception {
        Connection con = HttpConnection.connect("http://example.com");
        Connection.Response replacement = new HttpConnection.Response();
        assertSame(con, con.response(replacement));
        assertSame(replacement, con.response());
    }

    @Test
    public void testKeyValMutationAndStreamFlag() throws Exception {
        HttpConnection.KeyVal kv = HttpConnection.KeyVal.create("a", "b");
        assertEquals("a=b", kv.toString());
        assertFalse(kv.hasInputStream());
        kv.key("c").value("d");
        assertEquals("c=d", kv.toString());
        kv.inputStream(new ByteArrayInputStream(new byte[0]));
        assertTrue(kv.hasInputStream());
    }

    @Test
    public void testDataKeyValueFormsPreserveOrder() throws Exception {
        Connection.Request req = HttpConnection.connect("http://example.com")
                .data("first", "1", "second", "2").request();
        Iterator<Connection.KeyVal> it = req.data().iterator();
        assertEquals("first=1", it.next().toString());
        assertEquals("second=2", it.next().toString());
        assertFalse(it.hasNext());
    }

    @Test
    public void testConnectionUrlRejectsMalformedUrl() throws Exception {
        try { HttpConnection.connect("not a url"); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testUserAgentAndReferrerHeaderValues() throws Exception {
        Connection.Request req = HttpConnection.connect("http://example.com")
                .userAgent("test-agent").referrer("http://from.example").request();
        assertEquals("test-agent", req.header("User-Agent"));
        assertEquals("http://from.example", req.header("Referer"));
    }

    @Test
    public void testTlsVerifierAndTrustManagerAcceptInputs() throws Exception {
        SSLSession session = null;
        HostnameVerifier verifier = new HostnameVerifier() {
            public boolean verify(String host, SSLSession sslSession) {
                return true;
            }
        };
        assertTrue(verifier.verify("example.com", session));
        X509TrustManager trustManager = new X509TrustManager() {
            public void checkClientTrusted(X509Certificate[] chain, String authType) { }
            public void checkServerTrusted(X509Certificate[] chain, String authType) { }
            public X509Certificate[] getAcceptedIssuers() { return null; }
        };
        trustManager.checkClientTrusted(new X509Certificate[0], "");
        trustManager.checkServerTrusted(new X509Certificate[0], "");
        assertNull(trustManager.getAcceptedIssuers());
    }

    @Test
    public void testGetRequiresNetworkResponse() throws Exception {
        Connection con = HttpConnection.connect("http://127.0.0.1:1");
        con.timeout(1);
        try { con.get(); fail("expected IOException"); }
        catch (IOException expected) { }
    }

    @Test
    public void testPostRequiresNetworkResponse() throws Exception {
        Connection con = HttpConnection.connect("http://127.0.0.1:1");
        con.timeout(1);
        try { con.post(); fail("expected IOException"); }
        catch (IOException expected) { }
    }

    @Test
    public void testExecuteRequiresNetworkResponse() throws Exception {
        Connection con = HttpConnection.connect("http://127.0.0.1:1");
        con.timeout(1);
        try { con.execute(); fail("expected IOException"); }
        catch (IOException expected) { }
    }

    @Test
    public void testResponseAccessorsRejectUnexecutedBodyAndParse() throws Exception {
        HttpConnection.Response response = new HttpConnection.Response();
        try { response.parse(); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        try { response.body(); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        try { response.bodyAsBytes(); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        assertEquals(0, response.statusCode());
        assertNull(response.statusMessage());
        assertNull(response.charset());
        assertNull(response.contentType());
    }

    @Test
    public void testResponseAccessorsAfterFailedExecuteRemainDefaults() throws Exception {
        Connection con = HttpConnection.connect("http://127.0.0.1:1");
        con.timeout(1);
        try { con.execute(); fail("expected IOException"); }
        catch (IOException expected) { }
        Connection.Response response = con.response();
        assertEquals(0, response.statusCode());
        assertNull(response.statusMessage());
        assertNull(response.charset());
        assertNull(response.contentType());
    }
}
