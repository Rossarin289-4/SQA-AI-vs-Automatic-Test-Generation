package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:5>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:5>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:6>", "<null>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:5>"}, false, 7, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:6>", "<sample:6>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<null>", "<sample:7>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:3>", "<sample:4>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:2>", "<sample:3>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:9>", "<sample:4>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:2>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:5>", "<sample:8>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:8>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<null>", "<sample:7>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:10>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:6>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:5>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:1>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:1>", "<sample:8>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:2>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:2>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:1>", "<sample:2>"}}), new String[][]{{"createProcessingInstruction", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.ProcessingInstructionImpl", actual.getClass().getName());
  assertEquals("[sample: ] {getBaseURI=null, getData=, getLength=0, getLocalName=null, getNamespaceURI=null, getNodeName=sample, getNodeType=7, getNodeValue=, getPrefix=null, getReadOnly=false, getTarget=sample, getT...#254#1185465825", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:2>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:1>", "<sample:2>"}}), new String[][]{{"getStandalone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:6>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:1>", "<sample:2>"}}), new String[][]{{"createTextNode", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.TextImpl", actual.getClass().getName());
  assertEquals("[#text: 0] {getBaseURI=null, getData=0, getLength=1, getLocalName=null, getNamespaceURI=null, getNodeName=#text, getNodeType=3, getNodeValue=0, getPrefix=null, getReadOnly=false, getTextContent=0, get...#317#-377543079", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:0>", "<sample:3>"}, false, 2, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<null>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:5>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:7>", "<sample:6>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:6>"}}), new String[][]{{"getLastChild", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.ElementNSImpl", actual.getClass().getName());
  assertEquals("[html: null] {getBaseURI=null, getChildElementCount=2, getLength=2, getLocalName=html, getNamespaceURI=null, getNodeName=html, getNodeType=1, getNodeValue=null, getPrefix=null, getReadOnly=false, getT...#311#1239070220", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:7>", "<sample:6>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:6>"}}), new String[][]{{"getErrorChecking", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:7>", "<sample:6>"}}, 1), new String[][]{{"getDocumentElement", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.ElementNSImpl", actual.getClass().getName());
  assertEquals("[html: null] {getBaseURI=null, getChildElementCount=2, getLength=2, getLocalName=html, getNamespaceURI=null, getNodeName=html, getNodeType=1, getNodeValue=null, getPrefix=null, getReadOnly=false, getT...#311#1239070220", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:9>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:9>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:1>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:5>", "<null>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:0>"}}, 1), new String[][]{{"getOwnerDocument", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:1>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:5>", "<null>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:0>"}}, 1), new String[][]{{"getDomConfig", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DOMConfigurationImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:3>", "<sample:5>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<null>"}}, 1), new String[][]{{"createAttributeNS", "java.lang.String,java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:3>", "<sample:5>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:3>", "<sample:5>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:1>"}}, 1), new String[][]{{"getElementsByTagName", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DeepNodeListImpl", actual.getClass().getName());
  assertEquals("{getLength=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:4>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:0>"}}, 3), new String[][]{{"getChildNodes", "", "5"}, {"getLocalName", "", "1"}, {"getNextSibling", "", "7"}, {"createEvent", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<null>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:6>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:6>"}}, 2), new String[][]{{"getChildNodes", "", "5"}, {"getReadOnly", "", "1"}, {"getNextSibling", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<null>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:5>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:5>"}}, 3), new String[][]{{"createDocumentFragment", "", "5"}, {"getLastChild", "", "1"}, {"getAttributes", "", "7"}, {"cloneNode", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentFragmentImpl", actual.getClass().getName());
  assertEquals("[#document-fragment: null] {getBaseURI=null, getLength=0, getLocalName=null, getNamespaceURI=null, getNodeName=#document-fragment, getNodeType=11, getNodeValue=null, getPrefix=null, getReadOnly=false,...#259#-602671601", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<null>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}}, 3), new String[][]{{"createTreeWalker", "org.w3c.dom.Node,short,org.w3c.dom.traversal.NodeFilter", "5"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.TreeWalkerImpl", actual.getClass().getName());
  assertEquals("{getExpandEntityReferences=true, getWhatToShow=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 14, new String[][]{}, 3), new String[][]{{"getUserData", "", "7"}, {"getDoctype", "", "2"}, {"getLastChild", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.ElementNSImpl", actual.getClass().getName());
  assertEquals("[html: null] {getBaseURI=null, getChildElementCount=2, getLength=2, getLocalName=html, getNamespaceURI=null, getNodeName=html, getNodeType=1, getNodeValue=null, getPrefix=null, getReadOnly=false, getT...#311#1239070220", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:0>", "<sample:8>"}}, 3), new String[][]{{"getUserData", "", "7"}, {"getDoctype", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:0>", "<sample:7>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:4>"}}, 2), new String[][]{{"createTreeWalker", "org.w3c.dom.Node,short,org.w3c.dom.traversal.NodeFilter", "3"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.TreeWalkerImpl", actual.getClass().getName());
  assertEquals("{getExpandEntityReferences=true, getWhatToShow=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:0>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}}, 2), new String[][]{{"getOwnerDocument", "", "4"}, {"getErrorChecking", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:2>", "<sample:6>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:6>", "<sample:1>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:6>"}}, 2), new String[][]{{"createDocumentType", "java.lang.String,java.lang.String,java.lang.String", "4"}, {"getSystemId", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:6>", "<sample:8>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:2>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:1>"}}, 2), new String[][]{{"createDocumentType", "java.lang.String,java.lang.String,java.lang.String", "4"}, {"getSystemId", "", "7"}, {"removeEventListener", "java.lang.String,org.w3c.dom.events.EventListener,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentTypeImpl", actual.getClass().getName());
  assertEquals("[: null] {getBaseURI=null, getInternalSubset=null, getLength=0, getLocalName=null, getName=, getNamespaceURI=null, getNodeName=, getNodeType=10, getNodeValue=null, getPrefix=null, getPublicId=a, getRe...#291#217388465", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:6>", "<sample:8>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:2>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:5>"}}, 2), new String[][]{{"createDocumentType", "java.lang.String,java.lang.String,java.lang.String", "4"}, {"getSystemId", "", "7"}, {"removeEventListener", "java.lang.String,org.w3c.dom.events.EventListener,boolean", "3"}, {"getName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<null>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<null>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<null>", "<sample:5>"}, false, 10, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
