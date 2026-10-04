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

    // Test case for the static connect(String url) method
    @Test
    public void testConnectStringUrl() throws Exception {
        Connection con = HttpConnection.connect("http://example.com");
        assertNotNull(con);
        assertEquals("http://example.com", con.request().url().toString());
    }

    // Test case for the static connect(URL url) method
    @Test
    public void testConnectURL() throws Exception {
        URL url = new URL("http://example.com");
        Connection con = HttpConnection.connect(url);
        assertNotNull(con);
        assertEquals(url, con.request().url());
    }

    // Test case for url(URL url) method
    @Test
    public void testUrlSetter() throws Exception {
        URL url = new URL("http://example.com/path");
        Connection con = HttpConnection.connect("http://initial.com").url(url);
        assertEquals(url, con.request().url());
    }

    // Test case for url(String url) method with valid URL
    @Test
    public void testUrlStringSetterValid() throws Exception {
        Connection con = HttpConnection.connect("http://initial.com").url("http://example.com/path");
        assertEquals("http://example.com/path", con.request().url().toString());
    }

    // Test case for url(String url) method with malformed URL
    @Test
    public void testUrlStringSetterMalformed() throws Exception {
        try {
            HttpConnection.connect("http://initial.com").url("invalid-url");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Malformed URL"));
        }
    }

    // Test case for proxy(Proxy proxy) method
    @Test
    public void testProxySetterProxy() throws Exception {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved("proxy.example.com", 8080));
        Connection con = HttpConnection.connect("http://example.com").proxy(proxy);
        assertEquals(proxy, con.request().proxy());
    }

    // Test case for proxy(String host, int port) method
    @Test
    public void testProxySetterHostPort() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").proxy("proxy.example.com", 8080);
        Proxy proxy = con.request().proxy();
        assertNotNull(proxy);
        assertEquals(Proxy.Type.HTTP, proxy.type());
        assertEquals(new InetSocketAddress("proxy.example.com", 8080), proxy.address());
    }

    // Test case for userAgent(String userAgent) method
    @Test
    public void testUserAgentSetter() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").userAgent("MyAgent/1.0");
        // The User-Agent header is added using `header` method internally by `userAgent`
        assertEquals("MyAgent/1.0", con.request().header("User-Agent"));
    }

    // Test case for timeout(int millis) method
    @Test
    public void testTimeoutSetter() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").timeout(5000);
        assertEquals(5000, con.request().timeout());
    }

    // Test case for maxBodySize(int bytes) method
    @Test
    public void testMaxBodySizeSetter() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").maxBodySize(10240);
        assertEquals(10240, con.request().maxBodySize());
    }

    // Test case for followRedirects(boolean followRedirects) method
    @Test
    public void testFollowRedirectsSetter() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").followRedirects(false);
        assertFalse(con.request().followRedirects());
    }

    // Test case for referrer(String referrer) method
    @Test
    public void testReferrerSetter() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").referrer("http://referrer.com");
        assertEquals("http://referrer.com", con.request().header("Referer"));
    }

    // Test case for method(Method method)
    @Test
    public void testMethodSetter() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").method(Connection.Method.POST);
        assertEquals(Connection.Method.POST, con.request().method());
    }

    // Test case for ignoreHttpErrors(boolean ignoreHttpErrors)
    @Test
    public void testIgnoreHttpErrorsSetter() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").ignoreHttpErrors(true);
        assertTrue(con.request().ignoreHttpErrors());
    }

    // Test case for ignoreContentType(boolean ignoreContentType)
    @Test
    public void testIgnoreContentTypeSetter() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").ignoreContentType(true);
        assertTrue(con.request().ignoreContentType());
    }

    // Test case for data(String key, String value)
    @Test
    public void testDataSetterStringString() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").data("key", "value");
        Connection.KeyVal foundKeyVal = null;
        for(Connection.KeyVal kv : con.request().data()) {
            if (kv.key().equals("key")) {
                foundKeyVal = kv;
                break;
            }
        }
        assertNotNull(foundKeyVal);
        assertEquals("value", foundKeyVal.value());
    }

    // Test case for data(String key, String filename, InputStream inputStream)
    @Test
    public void testDataSetterStringStringInputStream() throws Exception {
        InputStream stream = new ByteArrayInputStream("test data".getBytes());
        Connection con = HttpConnection.connect("http://example.com").data("key", "file.txt", stream);
        Connection.KeyVal keyVal = null;
        for(Connection.KeyVal kv : con.request().data()) {
            if (kv.key().equals("key")) {
                keyVal = kv;
                break;
            }
        }
        assertNotNull(keyVal);
        assertEquals("file.txt", keyVal.value());
        assertTrue(keyVal.hasInputStream());
    }

    // Test case for data(String key, String filename, InputStream inputStream, String contentType)
    @Test
    public void testDataSetterStringStringInputStreamContentType() throws Exception {
        InputStream stream = new ByteArrayInputStream("test data".getBytes());
        Connection con = HttpConnection.connect("http://example.com").data("key", "file.txt", stream, "text/plain");
        Connection.KeyVal keyVal = null;
        for(Connection.KeyVal kv : con.request().data()) {
            if (kv.key().equals("key")) {
                keyVal = kv;
                break;
            }
        }
        assertNotNull(keyVal);
        assertEquals("text/plain", keyVal.contentType());
    }

    // Test case for data(Map<String, String> data)
    @Test
    public void testDataSetterMap() throws Exception {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        Connection con = HttpConnection.connect("http://example.com").data(map);

        Connection.KeyVal kv1 = null, kv2 = null;
        for(Connection.KeyVal kv : con.request().data()) {
            if (kv.key().equals("key1")) kv1 = kv;
            if (kv.key().equals("key2")) kv2 = kv;
        }
        assertNotNull(kv1);
        assertNotNull(kv2);
        assertEquals("value1", kv1.value());
        assertEquals("value2", kv2.value());
    }

    // Test case for data(String... keyvals)
    @Test
    public void testDataSetterVarargs() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").data("key1", "value1", "key2", "value2");
        Connection.KeyVal kv1 = null, kv2 = null;
        for(Connection.KeyVal kv : con.request().data()) {
            if (kv.key().equals("key1")) kv1 = kv;
            if (kv.key().equals("key2")) kv2 = kv;
        }
        assertNotNull(kv1);
        assertNotNull(kv2);
        assertEquals("value1", kv1.value());
        assertEquals("value2", kv2.value());
    }

    // Test case for data(Collection<Connection.KeyVal> data)
    @Test
    public void testDataSetterCollection() throws Exception {
        Collection<Connection.KeyVal> data = new ArrayList<>();
        data.add(HttpConnection.KeyVal.create("key1", "value1"));
        data.add(HttpConnection.KeyVal.create("key2", "value2"));
        Connection con = HttpConnection.connect("http://example.com").data(data);

        Connection.KeyVal kv1 = null, kv2 = null;
        for(Connection.KeyVal kv : con.request().data()) {
            if (kv.key().equals("key1")) kv1 = kv;
            if (kv.key().equals("key2")) kv2 = kv;
        }
        assertNotNull(kv1);
        assertNotNull(kv2);
        assertEquals("value1", kv1.value());
        assertEquals("value2", kv2.value());
    }

    // Test case for KeyVal.create(String key, String value)
    @Test
    public void testKeyValCreateStringString() throws Exception {
        Connection.KeyVal kv = HttpConnection.KeyVal.create("key", "value");
        assertEquals("key", kv.key());
        assertEquals("value", kv.value());
        assertFalse(kv.hasInputStream());
    }

    // Test case for KeyVal.create(String key, String filename, InputStream stream)
    @Test
    public void testKeyValCreateStringStringInputStream() throws Exception {
        InputStream stream = new ByteArrayInputStream("stream data".getBytes());
        Connection.KeyVal kv = HttpConnection.KeyVal.create("key", "filename.txt", stream);
        assertEquals("key", kv.key());
        assertEquals("filename.txt", kv.value());
        assertTrue(kv.hasInputStream());
        assertEquals(stream, kv.inputStream());
    }

    // Test case for requestBody(String body)
    @Test
    public void testRequestBodySetter() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").requestBody("my body");
        assertEquals("my body", con.request().requestBody());
    }

    // Test case for header(String name, String value)
    @Test
    public void testHeaderSetter() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").header("X-Custom-Header", "CustomValue");
        assertEquals("CustomValue", con.request().header("X-Custom-Header"));
    }

    // Test case for headers(Map<String,String> headers)
    @Test
    public void testHeadersSetter() throws Exception {
        Map<String, String> headers = new LinkedHashMap<>();
        headers.put("Header1", "Value1");
        headers.put("Header2", "Value2");
        Connection con = HttpConnection.connect("http://example.com").headers(headers);
        assertEquals("Value1", con.request().header("Header1"));
        assertEquals("Value2", con.request().header("Header2"));
    }

    // Test case for cookie(String name, String value)
    @Test
    public void testCookieSetter() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").cookie("sessionid", "12345");
        assertEquals("12345", con.request().cookie("sessionid"));
    }

    // Test case for cookies(Map<String, String> cookies)
    @Test
    public void testCookiesSetter() throws Exception {
        Map<String, String> cookies = new LinkedHashMap<>();
        cookies.put("cookie1", "value1");
        cookies.put("cookie2", "value2");
        Connection con = HttpConnection.connect("http://example.com").cookies(cookies);
        assertEquals("value1", con.request().cookie("cookie1"));
        assertEquals("value2", con.request().cookie("cookie2"));
    }

    // Test case for parser(Parser parser)
    @Test
    public void testParserSetter() throws Exception {
        Parser xmlParser = Parser.xmlParser();
        Connection con = HttpConnection.connect("http://example.com").parser(xmlParser);
        assertEquals(xmlParser, con.request().parser());
    }

    // Test case for postDataCharset(String charset)
    @Test
    public void testPostDataCharsetSetter() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").postDataCharset("UTF-16");
        assertEquals("UTF-16", con.request().postDataCharset());
    }

    // Test case for sslSocketFactory(SSLSocketFactory sslSocketFactory)
    @Test
    public void testSslSocketFactorySetter() throws Exception {
        SSLSocketFactory mockSslFactory = null; // In a real test, you might use a mock object
        Connection con = HttpConnection.connect("https://example.com").sslSocketFactory(mockSslFactory);
        assertEquals(mockSslFactory, con.request().sslSocketFactory());
    }

    // Test case for KeyVal.key(String key)
    @Test
    public void testKeyValKeySetter() throws Exception {
        Connection.KeyVal kv = HttpConnection.KeyVal.create("initial", "value").key("newKey");
        assertEquals("newKey", kv.key());
    }

    // Test case for KeyVal.value(String value)
    @Test
    public void testKeyValValueSetter() throws Exception {
        Connection.KeyVal kv = HttpConnection.KeyVal.create("key", "initialValue").value("newValue");
        assertEquals("newValue", kv.value());
    }

    // Test case for KeyVal.inputStream(InputStream inputStream)
    @Test
    public void testKeyValInputStreamSetter() throws Exception {
        InputStream stream = new ByteArrayInputStream("new stream".getBytes());
        Connection.KeyVal kv = HttpConnection.KeyVal.create("key", "filename.txt", new ByteArrayInputStream("old stream".getBytes()))
            .inputStream(stream);
        assertEquals(stream, kv.inputStream());
        assertTrue(kv.hasInputStream());
    }

    // Test case for KeyVal.contentType(String contentType)
    @Test
    public void testKeyValContentTypeSetter() throws Exception {
        Connection.KeyVal kv = HttpConnection.KeyVal.create("key", "value").contentType("application/json");
        assertEquals("application/json", kv.contentType());
    }

    // Test case for KeyVal.toString()
    @Test
    public void testKeyValToString() throws Exception {
        Connection.KeyVal kv = HttpConnection.KeyVal.create("key", "value");
        assertEquals("key=value", kv.toString());
    }

    // Test case for addHeader(String name, String value)
    @Test
    public void testAddHeader() throws Exception {
        Connection con = HttpConnection.connect("http://example.com");
        con.request().addHeader("Header-A", "Value-A");
        assertTrue(con.request().hasHeader("Header-A"));
        assertEquals("Value-A", con.request().header("Header-A"));
    }

    // Test case for multiHeaders() to check if all headers are returned
    @Test
    public void testMultiHeaders() throws Exception {
        Connection con = HttpConnection.connect("http://example.com");
        con.request().addHeader("Header-1", "Value-1");
        con.request().addHeader("Header-2", "Value-2a");
        con.request().addHeader("Header-2", "Value-2b");
        Map<String, List<String>> multiHeaders = con.request().multiHeaders();
        assertNotNull(multiHeaders.get("Header-1"));
        assertEquals(1, multiHeaders.get("Header-1").size());
        assertEquals("Value-1", multiHeaders.get("Header-1").get(0));
        assertNotNull(multiHeaders.get("Header-2"));
        assertEquals(2, multiHeaders.get("Header-2").size());
        assertEquals("Value-2a", multiHeaders.get("Header-2").get(0));
        assertEquals("Value-2b", multiHeaders.get("Header-2").get(1));
    }

    // Test case for hasHeader(String name)
    @Test
    public void testHasHeader() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").header("Existing-Header", "Value");
        assertTrue(con.request().hasHeader("Existing-Header"));
        assertFalse(con.request().hasHeader("Non-Existing-Header"));
    }

    // Test case for hasHeaderWithValue(String name, String value)
    @Test
    public void testHasHeaderWithValue() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").header("Test-Header", "TestValue");
        assertTrue(con.request().hasHeaderWithValue("Test-Header", "TestValue"));
        assertFalse(con.request().hasHeaderWithValue("Test-Header", "DifferentValue"));
        assertFalse(con.request().hasHeaderWithValue("Another-Header", "TestValue"));
    }

    // Test case for removeHeader(String name)
    @Test
    public void testRemoveHeader() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").header("Header-To-Remove", "Value");
        assertTrue(con.request().hasHeader("Header-To-Remove"));
        con.request().removeHeader("Header-To-Remove");
        assertFalse(con.request().hasHeader("Header-To-Remove"));
    }

    // Test case for hasCookie(String name)
    @Test
    public void testHasCookie() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").cookie("ExistingCookie", "Value");
        assertTrue(con.request().hasCookie("ExistingCookie"));
        assertFalse(con.request().hasCookie("NonExistingCookie"));
    }

    // Test case for removeCookie(String name)
    @Test
    public void testRemoveCookie() throws Exception {
        Connection con = HttpConnection.connect("http://example.com").cookie("Cookie-To-Remove", "Value");
        assertTrue(con.request().hasCookie("Cookie-To-Remove"));
        con.request().removeCookie("Cookie-To-Remove");
        assertFalse(con.request().hasCookie("Cookie-To-Remove"));
    }

    // Test case for get() method (basic GET request)
    // This test does not perform actual network calls, but checks API usage.
    @Test
    public void testGetConfiguration() throws Exception {
        Connection con = HttpConnection.connect("http://example.com");
        con.method(Connection.Method.GET);
        // The actual execution is complex and would require mocking or a real server.
        // This test confirms the basic API calls can be made.
        assertEquals(Connection.Method.GET, con.request().method());
    }

    // Test case for post() method (basic POST request)
    // This test does not perform actual network calls, but checks API usage.
    @Test
    public void testPostConfiguration() throws Exception {
        Connection con = HttpConnection.connect("http://example.com");
        con.method(Connection.Method.POST);
        assertEquals(Connection.Method.POST, con.request().method());
    }

    // Test case for execute() method (simulating a GET with data)
    @Test
    public void testExecuteGetWithDataConfiguration() throws Exception {
        Connection con = HttpConnection.connect("http://example.com/search?q=jsoup");
        con.data("key", "value");
        con.method(Connection.Method.GET);
        // Verifies that the data is added to the request, which would be serialized to URL for GET.
        assertEquals(1, con.request().data().size());
        assertEquals("key", con.request().data().iterator().next().key());
    }

    // Test case for execute() method (simulating a POST with data)
    @Test
    public void testExecutePostWithDataConfiguration() throws Exception {
        Connection con = HttpConnection.connect("http://example.com/submit");
        con.data("field1", "value1");
        con.method(Connection.Method.POST);
        // Verifies that the data is added to the request, to be sent in the body for POST.
        assertEquals(1, con.request().data().size());
        assertEquals("field1", con.request().data().iterator().next().key());
    }

    // Test case for status code retrieval - using a mocked response

    // Test case for status message retrieval - using a mocked response

    // Test case for charset() retrieval - using a mocked response

    // Test case for contentType() retrieval - using a mocked response

    // Test case for parse() method using a mocked Response

    // Test case for body() method using a mocked Response

    // Test case for bodyAsBytes() method using a mocked Response

    // Test case for bufferUp()

    // Test case for bodyStream() using a mocked Response

    // Test case for KeyVal.toString() with InputStream
    @Test
    public void testKeyValToStringWithInputStream() throws Exception {
        InputStream stream = new ByteArrayInputStream("stream data".getBytes());
        Connection.KeyVal kv = HttpConnection.KeyVal.create("key", "filename.txt", stream);
        // toString() for KeyVal with an InputStream does not append the stream data.
        // It usually represents key=value or key=filename.
        assertEquals("key=filename.txt", kv.toString());
    }

    // Test case for HttpConnection.Request.proxy() with null
    @Test
    public void testRequestProxyNull() throws Exception {
        HttpConnection.Request req = new HttpConnection.Request();
        req.proxy((Proxy) null);
        assertNull(req.proxy());
    }

    // Test case for HttpConnection.Request.timeout() with 0
    @Test
    public void testRequestTimeoutZero() throws Exception {
        HttpConnection.Request req = new HttpConnection.Request();
        req.timeout(0);
        assertEquals(0, req.timeout());
    }

    // Test case for HttpConnection.Request.maxBodySize() with 0
    @Test
    public void testRequestMaxBodySizeZero() throws Exception {
        HttpConnection.Request req = new HttpConnection.Request();
        req.maxBodySize(0);
        assertEquals(0, req.maxBodySize());
    }

    // Test case for HttpConnection.Request.ignoreHttpErrors() with false
    @Test
    public void testRequestIgnoreHttpErrorsFalse() throws Exception {
        HttpConnection.Request req = new HttpConnection.Request();
        req.ignoreHttpErrors(false);
        assertFalse(req.ignoreHttpErrors());
    }

    // Test case for HttpConnection.Request.ignoreContentType() with false
    @Test
    public void testRequestIgnoreContentTypeFalse() throws Exception {
        HttpConnection.Request req = new HttpConnection.Request();
        req.ignoreContentType(false);
        assertFalse(req.ignoreContentType());
    }

    // Test case for HttpConnection.Request.followRedirects() with true
    @Test
    public void testRequestFollowRedirectsTrue() throws Exception {
        HttpConnection.Request req = new HttpConnection.Request();
        req.followRedirects(true);
        assertTrue(req.followRedirects());
    }
}


