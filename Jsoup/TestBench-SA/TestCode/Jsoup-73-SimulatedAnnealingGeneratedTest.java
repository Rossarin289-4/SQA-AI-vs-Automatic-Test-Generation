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
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:3>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<null>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:3>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<null>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:2>"}}), new String[][]{{"getReadOnly", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:5>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:6>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:2>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:4>", "<sample:2>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:5>", "<sample:5>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:0>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:5>", "<null>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:0>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:0>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:3>", "<sample:0>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<null>", "<sample:0>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:5>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<null>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:6>", "<sample:3>"}, false, 12, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:7>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false), new String[][]{{"getLocalName", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:7>", "<null>"}}, 3), new String[][]{{"getNextSibling", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}}), new String[][]{{"getNextSibling", "", "0"}, {"getElementsByTagName", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DeepNodeListImpl", actual.getClass().getName());
  assertEquals("{getLength=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:7>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}}), new String[][]{{"createEntityReference", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:7>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}}, 2), new String[][]{{"createEntityReference", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:7>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:2>"}}), new String[][]{{"getDocumentElement", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.ElementNSImpl", actual.getClass().getName());
  assertEquals("[html: null] {getBaseURI=null, getChildElementCount=2, getLength=2, getLocalName=html, getNamespaceURI=null, getNodeName=html, getNodeType=1, getNodeValue=null, getPrefix=null, getReadOnly=false, getT...#311#1239070220", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:7>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:2>"}}), new String[][]{{"createComment", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.CommentImpl", actual.getClass().getName());
  assertEquals("[#comment: sample] {getBaseURI=null, getData=sample, getLength=6, getLocalName=null, getNamespaceURI=null, getNodeName=#comment, getNodeType=8, getNodeValue=sample, getPrefix=null, getReadOnly=false, ...#264#158741736", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:7>"}}, 3), new String[][]{{"createNodeIterator", "org.w3c.dom.Node,short,org.w3c.dom.traversal.NodeFilter", "1"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.NodeIteratorImpl", actual.getClass().getName());
  assertEquals("{getExpandEntityReferences=true, getWhatToShow=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "asString", new String[]{"org.w3c.dom.Document"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<null>", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:7>"}}), new String[][]{{"createNodeIterator", "org.w3c.dom.Node,short,org.w3c.dom.traversal.NodeFilter", "2"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.NodeIteratorImpl", actual.getClass().getName());
  assertEquals("{getExpandEntityReferences=true, getWhatToShow=32767}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:7>", "<sample:3>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<null>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, null, 1), new String[][]{{"dispatchEvent", "org.w3c.dom.events.Event", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:6>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:4>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:6>"}}, 1), new String[][]{{"getStrictErrorChecking", "", "2"}, {"createElementNS", "java.lang.String,java.lang.String", "6"}, {"isDerivedFrom", "java.lang.String,java.lang.String,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<null>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:5>", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<null>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:5>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<null>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:8>", "<sample:7>"}}, 2), new String[][]{{"compareDocumentPosition", "org.w3c.dom.Node", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("35", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DocumentImpl", actual.getClass().getName());
  assertEquals("[#document: null] {getAsync=false, getBaseURI=null, getDocumentURI=<a><b>t</b></a>, getEncoding=null, getErrorChecking=true, getInputEncoding=null, getLength=1, getLocalName=null, getNamespaceURI=null...#343#7333146", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}, 1), new String[][]{{"getImplementation", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DOMImplementationImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:1>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:7>"}}, 1), new String[][]{{"getReadOnly", "", "3"}, {"getNamespaceURI", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:1>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}}, 2), new String[][]{{"getInputEncoding", "", "0"}, {"createElementNS", "java.lang.String,java.lang.String,java.lang.String", "0"}, {"getAttributeNode", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:8>"}, false, 3, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:1>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:6>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:7>"}}, 1), new String[][]{{"createEvent", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "convert", new String[]{"org.jsoup.nodes.Document", "org.w3c.dom.Document"}, new String[]{"<sample:4>", "<sample:2>"}, false, 1, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:6>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.w3c.dom.DOMException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:3>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:0>"}}, 2), new String[][]{{"createTextNode", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.TextImpl", actual.getClass().getName());
  assertEquals("[#text: 0] {getBaseURI=null, getData=0, getLength=1, getLocalName=null, getNamespaceURI=null, getNodeName=#text, getNodeType=3, getNodeValue=0, getPrefix=null, getReadOnly=false, getTextContent=0, get...#317#-377543079", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:3>"}, {"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:0>"}}, 2), new String[][]{{"createTextNode", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.TextImpl", actual.getClass().getName());
  assertEquals("[#text: ] {getBaseURI=null, getData=, getLength=0, getLocalName=null, getNamespaceURI=null, getNodeName=#text, getNodeType=3, getNodeValue=, getPrefix=null, getReadOnly=false, getTextContent=, getWhol...#312#1695913252", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:5>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<sample:3>", "<sample:1>"}, {"org.jsoup.helper.W3CDom", "convert", "org.jsoup.nodes.Document,org.w3c.dom.Document", "<null>", "<sample:4>"}}, 3), new String[][]{{"createEntityReference", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.EntityReferenceImpl", actual.getClass().getName());
  assertEquals("[sample: null] {getBaseURI=null, getLength=0, getLocalName=null, getNamespaceURI=null, getNodeName=sample, getNodeType=5, getNodeValue=null, getPrefix=null, getReadOnly=true, getTextContent=, hasAttri...#233#1078033435", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:6>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:2>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:3>"}}, 3), new String[][]{{"getReadOnly", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.helper.W3CDom", "org.jsoup.helper.W3CDom", "fromJsoup", new String[]{"org.jsoup.nodes.Document"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"org.jsoup.helper.W3CDom", "fromJsoup", "org.jsoup.nodes.Document", "<sample:6>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<null>"}, {"org.jsoup.helper.W3CDom", "asString", "org.w3c.dom.Document", "<sample:7>"}}, 3), new String[][]{{"abort", "", "0"}, {"getElementsByTagNameNS", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.sun.org.apache.xerces.internal.dom.DeepNodeListImpl", actual.getClass().getName());
  assertEquals("{getLength=0}", SearchInputFactory_scaffolding.observe(actual));
 }
}
