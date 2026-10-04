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
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:7>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:7>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:1>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:1>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:1>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:3>", "<null>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:3>", "<sample:7>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:3>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:10>"}, false, 4, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<null>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:3>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<null>"}}), new String[][]{{"getStandalone", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<null>", "<sample:4>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:0>"}}), new String[][]{{"getElementById", "java.lang.String", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:7>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:7>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 11, new String[][]{}), new String[][]{{"createDocumentType", "java.lang.String,java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentTypeImpl", actual.getClass().getName());
  assertEquals("[a: null] {getBaseURI=null, getInternalSubset=null, getLength=0, getLocalName=null, getName=a, getNamespaceURI=null, getNodeName=a, getNodeType=10, getNodeValue=null, getPrefix=null, getPublicId=0, ge...#299#1452128727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<null>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:5>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<null>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:5>", "<sample:2>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:0>", "<sample:0>"}}, 1), new String[][]{{"getErrorChecking", "", "6"}, {"getInputEncoding", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:2>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:3>", "<sample:7>"}}), new String[][]{{"createAttributeNS", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.AttrNSImpl", actual.getClass().getName());
  assertEquals("sample=\"\" {getBaseURI=null, getLength=1, getLocalName=sample, getName=sample, getNamespaceURI=0, getNodeName=sample, getNodeType=2, getNodeValue=, getPrefix=null, getReadOnly=false, getSpecified=true,...#290#-490115497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:4>"}}), new String[][]{{"getElementsByTagName", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DeepNodeListImpl", actual.getClass().getName());
  assertEquals("{getLength=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:6>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<null>"}}), new String[][]{{"compareTreePosition", "org.w3c.dom.Node", "0"}, {"appendChild", "org.w3c.dom.Node", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<null>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:1>"}}), new String[][]{{"createComment", "java.lang.String", "0"}, {"cloneNode", "boolean", "7"}, {"getUserData", "", "5"}, {"addEventListener", "java.lang.String,org.w3c.dom.events.EventListener,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.CommentImpl", actual.getClass().getName());
  assertEquals("[#comment: ] {getBaseURI=null, getData=, getLength=0, getLocalName=null, getNamespaceURI=null, getNodeName=#comment, getNodeType=8, getNodeValue=, getPrefix=null, getReadOnly=false, getTextContent=, h...#240#-806631350", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:2>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:2>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:5>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:3>"}}, 2), new String[][]{{"createNodeIterator", "org.w3c.dom.Node,short,org.w3c.dom.traversal.NodeFilter", "2"}, {"previousNode", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:6>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:0>"}}, 2), new String[][]{{"createNodeIterator", "org.w3c.dom.Node,short,org.w3c.dom.traversal.NodeFilter", "2"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.NodeIteratorImpl", actual.getClass().getName());
  assertEquals("{getExpandEntityReferences=true, getWhatToShow=32767}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:6>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:0>"}}, 2), new String[][]{{"createNodeIterator", "org.w3c.dom.Node,short,org.w3c.dom.traversal.NodeFilter", "2"}, {"getWhatToShow", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:4>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:6>", "<sample:2>"}}, 1), new String[][]{{"getNodeName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#document", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"getDocumentElement", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.ElementNSImpl", actual.getClass().getName());
  assertEquals("[html: null] {getBaseURI=null, getChildElementCount=2, getLength=2, getLocalName=html, getNamespaceURI=null, getNodeName=html, getNodeType=1, getNodeValue=null, getPrefix=null, getReadOnly=false, getT...#311#1239070220", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:5>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:1>"}}, 1), new String[][]{{"getNodeType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}}, 1), new String[][]{{"createEntity", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:6>", "<sample:2>"}}, 2), new String[][]{{"getElementsByTagNameNS", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DeepNodeListImpl", actual.getClass().getName());
  assertEquals("{getLength=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:4>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:7>"}}, 3), new String[][]{{"getNamespaceURI", "", "2"}, {"getNamespaceURI", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<null>", "<sample:5>"}}, 2), new String[][]{{"getInputEncoding", "", "3"}, {"getImplementation", "", "1"}, {"createDocument", "java.lang.String,java.lang.String,org.w3c.dom.DocumentType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:6>"}, false, 5, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:3>", "<sample:3>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}}, 1), new String[][]{{"getPrefix", "", "4"}, {"clone", "", "0"}, {"getDoctype", "", "1"}, {"getStrictErrorChecking", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<null>"}}, 3), new String[][]{{"getNodeType", "", "2"}, {"createAttribute", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:7>"}}, 3), new String[][]{{"adoptNode", "org.w3c.dom.Node", "6"}, {"getParentNode", "", "2"}, {"replaceWholeText", "java.lang.String", "7"}, {"getData", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:6>"}}, 3), new String[][]{{"adoptNode", "org.w3c.dom.Node", "6"}, {"getParentNode", "", "2"}, {"replaceWholeText", "java.lang.String", "2"}, {"getData", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:0>", "<null>"}, false, 14, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:3>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<null>", "<sample:0>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
