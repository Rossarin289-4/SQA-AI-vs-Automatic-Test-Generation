package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public class HttpConnectionTest {
    @Test
    public void testConnectAndEncodedUrl() throws Exception {
        Connection con = HttpConnection.connect("http://example.com/a b");
        assertEquals("http://example.com/a%20b", con.request().url().toExternalForm());
    }

    @Test
    public void testUrlRejectsEmpty() throws Exception {
        try {
            HttpConnection.connect("");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testUrlRejectsMalformedUrl() throws Exception {
        try {
            HttpConnection.connect("not a URL");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testTimeoutZeroAndPositive() throws Exception {
        HttpConnection con = new HttpConnection();
        assertEquals(30000, con.request().timeout());
        con.timeout(0);
        assertEquals(0, con.request().timeout());
        con.timeout(1);
        assertEquals(1, con.request().timeout());
    }

    @Test
    public void testTimeoutRejectsNegative() throws Exception {
        try {
            new HttpConnection().timeout(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testMaxBodySizeZeroAndPositive() throws Exception {
        HttpConnection con = new HttpConnection();
        assertEquals(1024 * 1024, con.request().maxBodySize());
        con.maxBodySize(0);
        assertEquals(0, con.request().maxBodySize());
        con.maxBodySize(1);
        assertEquals(1, con.request().maxBodySize());
    }

    @Test
    public void testMaxBodySizeRejectsNegative() throws Exception {
        try {
            new HttpConnection().maxBodySize(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testRequestFlagsAndBody() throws Exception {
        HttpConnection con = new HttpConnection();
        assertTrue(con.request().followRedirects());
        assertFalse(con.request().ignoreHttpErrors());
        assertFalse(con.request().ignoreContentType());
        con.followRedirects(false).ignoreHttpErrors(true).ignoreContentType(true);
        con.requestBody("x");
        assertFalse(con.request().followRedirects());
        assertTrue(con.request().ignoreHttpErrors());
        assertTrue(con.request().ignoreContentType());
        assertEquals("x", con.request().requestBody());
    }

    @Test
    public void testMethodAndUrlSetters() throws Exception {
        HttpConnection con = new HttpConnection();
        URL url = new URL("http://example.com/");
        con.url(url).method(Connection.Method.POST);
        assertEquals(url, con.request().url());
        assertEquals(Connection.Method.POST, con.request().method());
    }

    @Test
    public void testRequestHeaderReplacementIsCaseInsensitive() throws Exception {
        HttpConnection con = new HttpConnection();
        con.header("X-Test", "one").header("x-test", "two");
        assertEquals("two", con.request().header("X-TEST"));
        assertEquals(1, con.request().multiHeaders().size() - 2);
    }

    @Test
    public void testHeaderAddAndLookupIgnoreCase() throws Exception {
        HttpConnection.Request req = new HttpConnection.Request();
        req.addHeader("X-Test", "one").addHeader("X-Test", "two");
        assertTrue(req.hasHeader("x-test"));
        assertTrue(req.hasHeaderWithValue("X-TEST", "TWO"));
        assertEquals("one, two", req.header("x-test"));
    }

    @Test
    public void testRemoveHeaderIgnoreCase() throws Exception {
        HttpConnection.Request req = new HttpConnection.Request();
        req.header("X-Test", "one");
        req.removeHeader("x-TEST");
        assertFalse(req.hasHeader("X-Test"));
        assertEquals(null, req.header("X-Test"));
    }

    @Test
    public void testCookieSetAndRemove() throws Exception {
        HttpConnection.Request req = new HttpConnection.Request();
        req.cookie("session", "abc");
        assertTrue(req.hasCookie("session"));
        assertEquals("abc", req.cookie("session"));
        req.removeCookie("session");
        assertFalse(req.hasCookie("session"));
        assertEquals(null, req.cookie("session"));
    }

    @Test
    public void testDataSetAndLookup() throws Exception {
        HttpConnection con = new HttpConnection();
        con.data("first", "1").data("second", "2");
        assertEquals("1", con.data("first").value());
        assertEquals("first=1", con.data("first").toString());
        assertEquals(null, con.data("missing"));
    }

    @Test
    public void testDataVarargsAcceptsEvenLength() throws Exception {
        HttpConnection con = new HttpConnection();
        con.data("key", "value");
        assertEquals("value", con.data("key").value());
    }

    @Test
    public void testDataVarargsRejectsEmptyKey() throws Exception {
        try {
            new HttpConnection().data("", "value");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testKeyValSettersAndInputStream() throws Exception {
        ByteArrayInputStream stream = new ByteArrayInputStream(new byte[] {1});
        HttpConnection.KeyVal kv = HttpConnection.KeyVal.create("upload", "a.txt");
        kv.inputStream(stream).contentType("text/plain");
        assertEquals("upload", kv.key());
        assertEquals("a.txt", kv.value());
        assertEquals("upload=a.txt", kv.toString());
        assertTrue(kv.hasInputStream());
        assertSame(stream, kv.inputStream());
        assertEquals("text/plain", kv.contentType());
    }

    @Test
    public void testPostCharsetSetAndGet() throws Exception {
        HttpConnection.Request req = new HttpConnection.Request();
        req.postDataCharset("UTF-8");
        assertEquals("UTF-8", req.postDataCharset());
    }

    @Test
    public void testPostCharsetRejectsIllegalName() throws Exception {
        try {
            new HttpConnection.Request().postDataCharset("bad charset");
            fail("expected IllegalCharsetNameException");
        } catch (IllegalCharsetNameException expected) { }
    }

    @Test
    public void testParserCanBeSet() throws Exception {
        HttpConnection.Request req = new HttpConnection.Request();
        Parser parser = Parser.xmlParser();
        req.parser(parser);
        assertSame(parser, req.parser());
    }

    @Test
    public void testConnectUrlSetterString() throws Exception {
        Connection con = HttpConnection.connect("http://example.com/");
        assertEquals("http://example.com/", con.request().url().toExternalForm());
    }

    @Test
    public void testUserAgentAndReferrerHeaders() throws Exception {
        HttpConnection con = new HttpConnection();
        con.userAgent("agent").referrer("http://ref.example/");
        assertEquals("agent", con.request().header("user-agent"));
        assertEquals("http://ref.example/", con.request().header("Referer"));
    }

    @Test
    public void testHeadersAndCookiesMaps() throws Exception {
        HttpConnection con = new HttpConnection();
        Map<String, String> headers = new LinkedHashMap<>();
        headers.put("X-A", "a");
        con.headers(headers);
        Map<String, String> cookies = new LinkedHashMap<>();
        cookies.put("c", "v");
        con.cookies(cookies);
        assertEquals("a", con.request().header("x-a"));
        assertEquals("v", con.request().cookie("c"));
    }

    @Test
    public void testProxyAndConnectionRequestResponseAccessors() throws Exception {
        HttpConnection con = new HttpConnection();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved("localhost", 8080));
        con.proxy(proxy);
        assertSame(proxy, con.request().proxy());
        assertSame(con.request(), con.request());
        assertSame(con.response(), con.response());
    }

    @Test
    public void testSslSocketFactoryNullSetter() throws Exception {
        HttpConnection con = new HttpConnection();
        con.sslSocketFactory(null);
        assertNull(con.request().sslSocketFactory());
    }

    @Test
    public void testExecuteRejectsNonHttpProtocol() throws Exception {
        HttpConnection con = new HttpConnection();
        con.url(new URL("file:/tmp/x"));
        try {
            con.execute();
            fail("expected MalformedURLException");
        } catch (MalformedURLException expected) { }
    }

    @Test
    public void testGetUsesHttpMethodBeforeExecuteValidation() throws Exception {
        HttpConnection con = new HttpConnection();
        con.url(new URL("file:/tmp/x"));
        try {
            con.get();
            fail("expected MalformedURLException");
        } catch (MalformedURLException expected) {
            assertEquals(Connection.Method.GET, con.request().method());
        }
    }

    @Test
    public void testPostUsesPostMethodBeforeExecuteValidation() throws Exception {
        HttpConnection con = new HttpConnection();
        con.url(new URL("file:/tmp/x"));
        try {
            con.post();
            fail("expected MalformedURLException");
        } catch (MalformedURLException expected) {
            assertEquals(Connection.Method.POST, con.request().method());
        }
    }

    @Test
    public void testUnexecutedResponseBodyOperationsReject() throws Exception {
        HttpConnection.Response response = new HttpConnection.Response();
        try {
            response.body();
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        try {
            response.bodyAsBytes();
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        try {
            response.bufferUp();
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        try {
            response.bodyStream();
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testUnexecutedResponseParseRejects() throws Exception {
        HttpConnection.Response response = new HttpConnection.Response();
        try {
            response.parse();
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }
}
