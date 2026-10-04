package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "equals", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getPrefix", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getRootNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getRootNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:4>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<null>", "+1"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getBaseValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals("id('+1') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!NullPointerException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, i...#224#-1300374140", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespaceIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isDefaultNamespace", "java.lang.String", "]"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.NamespaceResolver", actual.getClass().getName());
  assertEquals("{isSealed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:1>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("null {getName=null, getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:3>", "<s:>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "remove", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:2>", "<s:a>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"1.123456789012456"}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('sample') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false...#227#-1406164480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"xl:sp0ce"}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValuePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:3>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{"D2:30:45"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:0>", "I", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("D2:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:2>", "-2147483648", "<s:\t\t>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:5>", "<sample:0>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "escape", "java.lang.String", "-8751046933894857319"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:4>", "<s:a>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isLanguage", "java.lang.String", "/"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocalName", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{""}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:4>", "<s:aa>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isLanguage", "java.lang.String", "-0.0"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<null>", "I"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:5>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isCollection", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:1>", "<sample:1>", "-2147483648"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:1>", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", "java.lang.Object", "<s:aa>"}}), new String[][]{{"setNodeValue", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:1>", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", "java.lang.Object", "<s:aa>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceResolver", ""}}, 2), new String[][]{{"normalize", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "/text()[200] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false...#227#1057044989", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getBaseValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:3>", "true", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{".abc"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateParentPointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<null>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "equals", "java.lang.Object", "<s:a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"[1,2^"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespaceIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isAttribute", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isLanguage", "java.lang.String", "/a/b"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", new String[]{}, new String[]{}, false, 8, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("null {getName=null, getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, i...#225#623730043", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:3>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{"labg"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:6>", "<s:>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", "java.lang.String", ".1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("labg", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", "java.lang.String", "1E-5"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:0>", "a,b,c", "1.25"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:2>", "1", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespacePointer", "java.lang.String", "D2:30:45"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isLeaf", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPrefix", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer", actual.getClass().getName());
  assertEquals("/namespace::1.12345678 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:10>", "<sample:0>", "2147483647", "<s:a\t\t>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:3>", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocalName", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", ""}}, 3), new String[][]{{"getFeature", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("value", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isNode=tru...#215#584170022", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "findEnclosingAttribute", new String[]{"java.lang.Object", "java.lang.String", "org.jdom.Namespace"}, new String[]{"<b:true>", "\n", "<sample:3>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "findEnclosingAttribute", new String[]{"org.w3c.dom.Node", "java.lang.String"}, new String[]{"<sample:5>", "hi"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getRootNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:4>", "0x123456789"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:4>", "0x123456789"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:4>", "0x123456789"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getDefaultNamespaceURI", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:2>", "<s:a>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "java.lang.Object", "org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<null>", "<d:1.5>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:3>", "<s:>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:3>", "<s:>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:4>", "<s:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:5>", "<sample:1>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:4>", "<d:1.5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "id('0') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"/a4b"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "equals", "java.lang.Object", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:2>", "<s:a>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:2>", "<s:a>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"1.1234H56789012456f"}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('sample') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false...#227#-1406164480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"xml:space"}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValuePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:3>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('sample') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false...#227#-1406164480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('sample') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("_A_0 {getCountry=A, getDisplayCountry=A, getDisplayLanguage=, getDisplayName=A (0), getDisplayScript=, getDisplayVariant=0, getISO3Country=!MissingResourceException, getISO3Language=, getLanguage=, ge...#244#-1938314541", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('0') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample__a {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample (a), getDisplayScript=, getDisplayVariant=a, getISO3Country=, getISO3Language=!MissingResourceException, ge...#264#2001601015", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3), new String[][]{{"getDisplayCountry", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3), new String[][]{{"getDisplayCountry", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespaceIterator", ""}}, 3), new String[][]{{"getDisplayCountry", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:4>", "<i:-1>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespaceIterator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:4>", "<i:-1>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespaceIterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("_A_0 {getCountry=A, getDisplayCountry=A, getDisplayLanguage=, getDisplayName=A (0), getDisplayScript=, getDisplayVariant=0, getISO3Country=!MissingResourceException, getISO3Language=, getLanguage=, ge...#244#-1938314541", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:4>", "<i:1>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespaceIterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('0') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:4>", "<i:1>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespaceIterator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:4>", "<i:1>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespaceIterator", ""}}, 1), new String[][]{{"getExtensionKeys", "", "2"}, {"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{"D2:30:45"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:0>", "I", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("D2:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{"D2:30F45"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:0>", "I", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("D2:30F45", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:0>", "I", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:0>", "I", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:0>", "I0xFFFFFFFF", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "escape", "java.lang.String", "-8751046933894857319"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:4>", "<s:a>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isLanguage", "java.lang.String", "/"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:1>", "<sample:1>", "1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespaceIterator", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:1>", "]"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", "java.lang.Object", "<s:apa>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceResolver", ""}}, 3), new String[][]{{"getTextContent", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[200] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false...#227#1057044989", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isLeaf", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isLeaf", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "id('sample') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{".abc"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:5>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"jd)("}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:7>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isContainer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "123456789012345678901234567890", "1.1234567"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "printPointerChain", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:4>", "<sample:2>"}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1), new String[][]{{"getPrefix", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1), new String[][]{{"getPrefix", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1), new String[][]{{"getPrefix", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, i...#225#623730043", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1), new String[][]{{"getPrefix", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isNode=tru...#215#584170022", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValuePointer", ""}}, 1), new String[][]{{"getPrefix", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('0') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNo...#221#1232643963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:7>", "<null>", "2147483647", "<s:aa>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:7>", "<null>", "2147483583", "<s:>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "escape", "java.lang.String", "+1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:7>", "<null>", "2147483583", "<s:>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getImmediateParentPointer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getImmediateParentPointer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "printPointerChain", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespaceIterator", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "printPointerChain", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespaceIterator", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "printPointerChain", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "printPointerChain", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", "java.lang.String", "-8751046933894\u00e9857319"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "equals", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('sample') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('0') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<null>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<null>", "<sample:4>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<null>", "<sample:4>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}}), new String[][]{{"getChildNodes", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}}), new String[][]{{"getChildNodes", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}}), new String[][]{{"getChildNodes", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=fals...#229#-1772752519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}}), new String[][]{{"getChildNodes", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}}), new String[][]{{"getFeature", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[200] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false...#227#1057044989", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getBaseValue", ""}}), new String[][]{{"getFeature", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[200] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false...#227#1057044989", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getBaseValue", ""}}), new String[][]{{"getFeature", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getBaseValue", ""}}), new String[][]{{"getFeature", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isCollection", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getBaseValue", ""}}), new String[][]{{"getFeature", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('sample') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false...#227#-1406164480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}}), new String[][]{{"getFeature", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("value", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, i...#225#623730043", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}}), new String[][]{{"getFeature", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("value", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isNode=tru...#215#584170022", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", ""}}), new String[][]{{"getFeature", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("value", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isNode=tru...#215#584170022", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", ""}}), new String[][]{{"getFeature", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('0') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNo...#221#1232643963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", ""}}), new String[][]{{"getFeature", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", ""}}), new String[][]{{"getFeature", "java.lang.String,java.lang.String", "6"}, {"getPrefix", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:3>", "false", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getBaseValue", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", "java.lang.Object", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "findEnclosingAttribute", new String[]{"org.w3c.dom.Node", "java.lang.String"}, new String[]{"<sample:3>", "i"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:2>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateParentPointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:2>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateParentPointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:2>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateParentPointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocale", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateParentPointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=fals...#229#-1772752519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocale", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateParentPointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNodeSetByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:0>", "", "<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getRootNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getRootNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getRootNode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:4>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('sample') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:2>", "<s:a>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"<<unknown namespace>>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isActual", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:2>", "1", "<i:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "asPath", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:6>", "<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValuePointer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:1>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:2>", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isRoot", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=...#246#787018635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", new String[]{"org.w3c.dom.Node", "org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:6>", "<s:key>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getImmediateNode", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isNode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", actual.getClass().getName());
  assertEquals(" {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceURI", "java.lang.String", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "equals", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"/a4b"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setAttribute", "boolean", "true"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "equals", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=true, isCollection=false, isContainer=fa...#244#-1364632086", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"/a4b"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "equals", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getAbstractFactory", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setIndex", "int", "-2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValuePointer", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", actual.getClass().getName());
  assertEquals("id('a') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('a') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespaceIterator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:3>", "<b:true>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/0:sample/:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarati...#258#-1712856162", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "a", "1e10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:4>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample__a {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample (a), getDisplayScript=, getDisplayVariant=a, getISO3Country=, getISO3Language=!MissingResourceException, ge...#264#2001601015", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:1>", "<sample:6>"}}), new String[][]{{"getScript", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:1>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:1>", "<sample:6>"}}), new String[][]{{"getScript", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:1>", "<sample:6>"}}), new String[][]{{"getScript", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"getScript", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('sample') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('sample') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:5>", "<i:0>"}, true), new String[][]{{"setAttribute", "boolean", "6"}, {"getNamespaceResolver", "", "3"}, {"compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespaceIterator", ""}}), new String[][]{{"getDisplayCountry", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SAMPLE", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:4>", "<i:-1>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespaceIterator", ""}}), new String[][]{{"getDisplayCountry", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", "boolean", "true"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:0>", "I", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=true, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", "boolean", "true"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:0>", "I", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=true, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:0>", "I", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{"D2:30:45"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:0>", "I", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("D2:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<null>", "<sample:2>", "32871", "<s:\t>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getBaseValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<s:\n\t>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "escape", "java.lang.String", "-8751046933894857319"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceResolver", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<s:\n\010r0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "escape", "java.lang.String", "-8751046933894\u00e9857319"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:4>", "<s:a>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isLanguage", "java.lang.String", "/"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getRootNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getImmediateNode", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceURI", "java.lang.String", "{\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false), new String[][]{{"getScript", "", "7"}, {"getUnicodeLocaleKeys", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:2>", "<sample:1>", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespaceIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespaceIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=fals...#229#-1772752519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespaceIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespaceIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:1>", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:1>", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:1>", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:1>", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'b'/text()[199] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=fa...#231#-678407143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:1>", "1"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:1>", "1e10", "<s:>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'b'/text()[201] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=fa...#231#-99001417", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:1>", "1"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", "java.lang.Object", "<s:aa>"}}), new String[][]{{"setNodeValue", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'b'/text()[200] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=fa...#231#-692490088", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setIndex", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483647, getLength=1, getNamespaceURI=null, isActual=false, isAttribute=true, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setNamespaceResolver", new String[]{"org.apache.commons.jxpath.ri.NamespaceResolver"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:1>", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", "java.lang.Object", "<s:aa>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceResolver", ""}}), new String[][]{{"getTextContent", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[200] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false...#227#1057044989", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:1>", "]"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", "java.lang.Object", "<s:apa>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceResolver", ""}}), new String[][]{{"getTextContent", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceURI", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getAbstractFactory", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<null>", "<sample:1>", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.NamespaceResolver", actual.getClass().getName());
  assertEquals("{isSealed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "escape", "java.lang.String", "Title"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setIndex", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=2147483647, getLength=1, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-133349676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=true, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getBaseValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getBaseValue", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:3>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "asPath", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("null {getName=null, getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "asPath", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("null {getName=null, getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("null {getName=null, getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("null {getName=null, getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", new String[]{}, new String[]{}, false, 11, new String[][]{}), new String[][]{{"getPrefix", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('0') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNo...#221#1232643963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isLeaf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getImmediateNode", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isLeaf", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:1>", "false", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<null>", "<null>", "-2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setValue", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getAbstractFactory", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:3>", "<d:1.5>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", "java.lang.String", "D2:30:45"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:1>", "<i:2>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("2 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=tr...#216#2058684483", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getParent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setIndex", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:5>", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-1, getLength=1, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{".5"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", "java.lang.String", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{"."}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", "java.lang.String", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{":."}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", "java.lang.String", ".1"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "asPath", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":.", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{":"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", "java.lang.String", ".1"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "asPath", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{":TITLE"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", "java.lang.String", ".1"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "asPath", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":TITLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{"gTITLE"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLength", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", "java.lang.String", ".1"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "asPath", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("gTITLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{"g"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLength", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", "java.lang.String", ".1"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "asPath", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("g", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{"g"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLength", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", "java.lang.String", ".1"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "asPath", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("g", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLength", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", "java.lang.String", ".1"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "asPath", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{"labng"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("labng", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[158] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false...#227#49873119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/text()[195] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=fa...#231#1242605469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "findEnclosingAttribute", new String[]{"java.lang.Object", "java.lang.String", "org.jdom.Namespace"}, new String[]{"<s:aa>", "2147483648", "<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=true, isCollection=false, isContainer=fa...#244#-1364632086", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", "java.lang.String", "1E-5"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:0>", "[1,2^", "1.25"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=true, isCollection=false, isContainer=fa...#244#-1364632086", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getIndex", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:4>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", "java.lang.String", "1E-5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", "java.lang.String", "1E-5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=true, isCollection=false, isContainer=false, isLeaf=true, isNode=true,...#213#1273417782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getRootNode", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", "java.lang.String", "E,5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('0') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=true, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-2061410370", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", "java.lang.String", "E,5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('0') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNo...#221#1232643963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:3>", "<s:>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=t...#217#-1938886699", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isDefaultNamespace", "java.lang.String", "[1,2^"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isDefaultNamespace", "java.lang.String", "[1,2^"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isDefaultNamespace", "java.lang.String", "[1,2^"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isDefaultNamespace", "java.lang.String", "[1,2^I"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=true, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isDefaultNamespace", "java.lang.String", "[1,2^I1.12345671.12345678901234567"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isRoot", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isDefaultNamespace", "java.lang.String", "1.5"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=true, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isDefaultNamespace", "java.lang.String", "1.5"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceResolver", new String[]{}, new String[]{}, false), new String[][]{{"isSealed", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "asPath", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLength", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setAttribute", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=true, isCollection=false, isContainer=fa...#244#-1364632086", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "escape", "java.lang.String", ".1"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "equals", "java.lang.Object", "<d:1.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocalName", new String[]{"java.lang.Object"}, new String[]{"<s:\n\t>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:1>", "')"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{"')"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:10>", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&apos;)", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:4>"}, false), new String[][]{{"getPosition", "", "3"}, {"getPosition", "", "3"}, {"getNodePointer", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isAttribute", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
}
