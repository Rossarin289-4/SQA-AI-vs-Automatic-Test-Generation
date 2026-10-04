package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:5>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:2>", "<sample:7>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:1>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:1>", "<sample:4>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:5>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:0>", "<sample:2>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:2>", "<sample:0>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<null>", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:5>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:6>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:1>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:6>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:6>", "<sample:0>"}}), new String[][]{{"getImplementation", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DOMImplementationImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:5>"}}), new String[][]{{"createProcessingInstruction", "java.lang.String,java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:1>", "<sample:6>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}), new String[][]{{"getReadOnly", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:9>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:7>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:0>", "<sample:3>"}}, 1), new String[][]{{"createTextNode", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.TextImpl", actual.getClass().getName());
  assertEquals("[#text: a] {getBaseURI=null, getData=a, getLength=1, getLocalName=null, getNamespaceURI=null, getNodeName=#text, getNodeType=3, getNodeValue=a, getPrefix=null, getReadOnly=false, getTextContent=a, get...#317#1448925258", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}), new String[][]{{"getDocumentURI", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:0>", "<sample:5>"}}), new String[][]{{"getBaseURI", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 3), new String[][]{{"getElementsByTagNameNS", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DeepNodeListImpl", actual.getClass().getName());
  assertEquals("{getLength=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:7>", "<sample:7>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:0>", "<sample:7>"}}, 2), new String[][]{{"getErrorChecking", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:5>", "<sample:6>"}, false, 5, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:1>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:4>"}}, 2), new String[][]{{"getFeature", "java.lang.String,java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<null>", "<sample:12>"}, false, 6, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:3>", "<sample:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:7>"}}, 3), new String[][]{{"createDocumentType", "java.lang.String,java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentTypeImpl", actual.getClass().getName());
  assertEquals("[sample: null] {getBaseURI=null, getInternalSubset=null, getLength=0, getLocalName=null, getName=sample, getNamespaceURI=null, getNodeName=sample, getNodeType=10, getNodeValue=null, getPrefix=null, ge...#308#286339287", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:5>"}}), new String[][]{{"getElementsByTagNameNS", "java.lang.String,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DeepNodeListImpl", actual.getClass().getName());
  assertEquals("{getLength=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}, 2), new String[][]{{"adoptNode", "org.w3c.dom.Node", "1"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DeferredElementImpl", actual.getClass().getName());
  assertEquals("[root: null] {getBaseURI=null, getChildElementCount=2, getLength=5, getLocalName=null, getNamespaceURI=null, getNodeIndex=1, getNodeName=root, getNodeType=1, getNodeValue=null, getPrefix=null, getRead...#311#318956588", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:7>", "<sample:2>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:5>"}}), new String[][]{{"getFirstChild", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.ElementNSImpl", actual.getClass().getName());
  assertEquals("[html: null] {getBaseURI=null, getChildElementCount=2, getLength=2, getLocalName=html, getNamespaceURI=null, getNodeName=html, getNodeType=1, getNodeValue=null, getPrefix=null, getReadOnly=false, getT...#311#1239070220", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, null, 1), new String[][]{{"getUserData", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<null>", "<sample:4>"}}, 1), new String[][]{{"appendChild", "org.w3c.dom.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 2), new String[][]{{"createNotation", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.NotationImpl", actual.getClass().getName());
  assertEquals("[a: null] {getBaseURI=null, getLength=0, getLocalName=null, getNamespaceURI=null, getNodeName=a, getNodeType=12, getNodeValue=null, getPrefix=null, getPublicId=null, getReadOnly=false, getSystemId=nul...#265#-426541771", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"createElementNS", "java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}, 3), new String[][]{{"getStandalone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:1>"}}, 3), new String[][]{{"createEntity", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.EntityImpl", actual.getClass().getName());
  assertEquals("[a: null] {getBaseURI=null, getInputEncoding=null, getLength=0, getLocalName=null, getNamespaceURI=null, getNodeName=a, getNodeType=6, getNodeValue=null, getNotationName=null, getPrefix=null, getPubli...#303#-43086061", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:7>"}}, 3), new String[][]{{"getUserData", "", "5"}, {"dispatchEvent", "org.w3c.dom.events.Event", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:0>", "<sample:2>"}}, 1), new String[][]{{"getDocumentURI", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:10>", "<sample:10>"}}, 1), new String[][]{{"createNodeIterator", "org.w3c.dom.Node,short,org.w3c.dom.traversal.NodeFilter", "5"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.NodeIteratorImpl", actual.getClass().getName());
  assertEquals("{getExpandEntityReferences=true, getWhatToShow=4}", SearchInputFactory_scaffolding.observe(actual));
 }
}
