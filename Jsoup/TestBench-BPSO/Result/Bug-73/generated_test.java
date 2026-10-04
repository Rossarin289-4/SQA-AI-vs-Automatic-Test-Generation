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
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:9>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<null>", "<sample:5>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:3>", "<sample:6>"}, false, 3, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:4>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:6>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:2>", "<sample:7>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:3>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:13>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:9>"}}), new String[][]{{"getNodeType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:2>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:6>"}}), new String[][]{{"getElementById", "java.lang.String", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}}), new String[][]{{"createEvent", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}), new String[][]{{"createElement", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.ElementImpl", actual.getClass().getName());
  assertEquals("[sample: null] {getBaseURI=null, getChildElementCount=0, getLength=0, getLocalName=null, getNamespaceURI=null, getNodeName=sample, getNodeType=1, getNodeValue=null, getPrefix=null, getReadOnly=false, ...#318#2083103748", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"getElementById", "java.lang.String", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:7>"}}), new String[][]{{"getDomConfig", "", "2"}, {"canSetParameter", "java.lang.String,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:4>"}}, 2), new String[][]{{"getElementById", "java.lang.String", "0"}, {"getFirstChild", "", "3"}, {"removeEventListener", "java.lang.String,org.w3c.dom.events.EventListener,boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.ElementNSImpl", actual.getClass().getName());
  assertEquals("[html: null] {getBaseURI=null, getChildElementCount=2, getLength=2, getLocalName=html, getNamespaceURI=null, getNodeName=html, getNodeType=1, getNodeValue=null, getPrefix=null, getReadOnly=false, getT...#311#1239070220", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 3), new String[][]{{"getNextSibling", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:7>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:2>", "<sample:3>"}}, 2), new String[][]{{"getStandalone", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}}), new String[][]{{"createComment", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.CommentImpl", actual.getClass().getName());
  assertEquals("[#comment: sample] {getBaseURI=null, getData=sample, getLength=6, getLocalName=null, getNamespaceURI=null, getNodeName=#comment, getNodeType=8, getNodeValue=sample, getPrefix=null, getReadOnly=false, ...#264#158741736", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"getNodeType", "", "6"}, {"createElementDefinition", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:4>"}}, 3), new String[][]{{"getOwnerDocument", "", "4"}, {"createDocumentType", "java.lang.String,java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentTypeImpl", actual.getClass().getName());
  assertEquals("[a: null] {getBaseURI=null, getInternalSubset=null, getLength=0, getLocalName=null, getName=a, getNamespaceURI=null, getNodeName=a, getNodeType=10, getNodeValue=null, getPrefix=null, getPublicId=0, ge...#299#1452128727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:2>", "<null>"}, false, 4, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:10>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}, 1), new String[][]{{"getLocalName", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:8>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"dispatchEvent", "org.w3c.dom.events.Event", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, null, 1), new String[][]{{"compareTreePosition", "org.w3c.dom.Node", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:5>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:7>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:6>", "<sample:2>"}}, 1), new String[][]{{"createComment", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.CommentImpl", actual.getClass().getName());
  assertEquals("[#comment: 0] {getBaseURI=null, getData=0, getLength=1, getLocalName=null, getNamespaceURI=null, getNodeName=#comment, getNodeType=8, getNodeValue=0, getPrefix=null, getReadOnly=false, getTextContent=...#244#-1735842163", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 3), new String[][]{{"getNamespaceURI", "", "1"}, {"appendChild", "org.w3c.dom.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:10>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}}, 1), new String[][]{{"getDomConfig", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DOMConfigurationImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:0>", "<sample:10>"}}, 3), new String[][]{{"createAttributeNS", "java.lang.String,java.lang.String,java.lang.String", "2"}, {"removeEventListener", "java.lang.String,org.w3c.dom.events.EventListener,boolean", "5"}, {"isDefaultNamespace", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:6>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:4>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:1>"}}, 1), new String[][]{{"createAttribute", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 3), new String[][]{{"createComment", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.CommentImpl", actual.getClass().getName());
  assertEquals("[#comment: a] {getBaseURI=null, getData=a, getLength=1, getLocalName=null, getNamespaceURI=null, getNodeName=#comment, getNodeType=8, getNodeValue=a, getPrefix=null, getReadOnly=false, getTextContent=...#244#79308877", SearchInputFactory_scaffolding.observe(actual));
 }
}
