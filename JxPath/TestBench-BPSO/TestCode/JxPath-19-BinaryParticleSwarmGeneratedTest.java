package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createAttribute", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:0>", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "asPath", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getPrefix", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocalName", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPrefix", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:3>", "false", "<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:3>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isRoot", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "equals", "java.lang.Object", "<s:La>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getBaseValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"12:30:451.25"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[157] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false...#227#-1216197666", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:4>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getDefaultNamespaceURI", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValuePointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isDefaultNamespace", "java.lang.String", "null"}}), new String[][]{{"getBaseValue", "", "4"}, {"getNamespaceResolver", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.NamespaceResolver", actual.getClass().getName());
  assertEquals("{isSealed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isRoot", ""}}), new String[][]{{"getPosition", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespaceIterator", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespacePointer", "java.lang.String", "preserve"}}), new String[][]{{"getNamespaceResolver", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.NamespaceResolver", actual.getClass().getName());
  assertEquals("{isSealed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:1>", "1.123456789013456"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:6>", "<sample:7>", "2147483647"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", "java.lang.Object", "<s:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals("id('1.123456789013456') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!NullPointerException, isActual=true, isAttribute=false, isCollection=false, isContainer=false,...#239#896003813", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createAttribute", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareTo", "java.lang.Object", "<i:2>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceResolver", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getImmediateNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:1>", "<sample:0>", "-2147483648", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:6>", ""}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<null>", "<null>"}}, 3), new String[][]{{"getNamespaceResolver", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.NamespaceResolver", actual.getClass().getName());
  assertEquals("{isSealed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:7>", "<sample:6>", "10", "<s:>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isLanguage", "java.lang.String", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"numl"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:5>", "<sample:1>", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isRoot", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:3>", "<sample:6>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:7>", "1.25", "["}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValuePointer", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"getImmediateValuePointer", "", "1"}, {"namespacePointer", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.NamespacePointer", actual.getClass().getName());
  assertEquals("'b'/text()[200]/namespace:: {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=fals...#229#-1772752519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocalName", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:3>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "asPath", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValuePointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:5>", "<sample:1>"}}), new String[][]{{"testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:4>", "<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:0>", "<s:c>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:6>", "0x2F", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:8>", "false", "<null>"}}), new String[][]{{"getNodePointer", "", "6"}, {"getPosition", "", "3"}, {"getPosition", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isNode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getAbstractFactory", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocale", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "remove", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "findEnclosingAttribute", new String[]{"org.w3c.dom.Node", "java.lang.String"}, new String[]{"<sample:7>", "1.12345678901234567.5"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getRootNode", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", "java.lang.Object", "<i:-17>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:3>", "<s:Xb>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/0:sample/:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarati...#258#-1712856162", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isCollection", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isContainer", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<s:ky>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", actual.getClass().getName());
  assertEquals(" {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<null>", "<sample:2>", "-4194303"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLength", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:5>", "Hello, WorldPT1Ha,b,c"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLength", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getImmediateParentPointer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"[1.5d"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isContainer", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"1"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isLeaf", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:7>", "true", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:2>", "<s:)La,>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValuePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespaceIterator", ""}}, 2), new String[][]{{"createPath", "org.apache.commons.jxpath.JXPathContext", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", actual.getClass().getName());
  assertEquals(" {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isActual", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:8>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "asPath", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "escape", "java.lang.String", "{\"a/:1}"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", actual.getClass().getName());
  assertEquals(" {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isRoot", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setIndex", new String[]{"int"}, new String[]{"536870911"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValuePointer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=536870911, getLength=1, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isCollection", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isContainer", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getAbstractFactory", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:8>", "<sample:3>", "<s:Wb>"}, true, 0, null, 1), new String[][]{{"childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isContainer", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "clone", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", actual.getClass().getName());
  assertEquals(" {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"000"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "asPath", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isActual", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValuePointer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isLeaf", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createAttribute", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isDefaultNamespace", "java.lang.String", "1L1.12346678901234567"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocalName", new String[]{"java.lang.Object"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValuePointer", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", actual.getClass().getName());
  assertEquals(" {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:0>", "1.123467"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:1>", "false", "<sample:1>"}}, 1), new String[][]{{"getNodeValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "findEnclosingAttribute", new String[]{"java.lang.Object", "java.lang.String", "org.jdom.Namespace"}, new String[]{"<d:15.0>", "1.1234567", "<sample:2>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValuePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "clone", ""}}, 2), new String[][]{{"createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getIndex", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespaceIterator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:1>", "<sample:6>", "1610612734"}}, 2), new String[][]{{"isDefaultNamespace", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"-1I-1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:6>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaiaa"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "-2147583648", "wmk"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setValue", "java.lang.Object", "<i:44>"}}, 1), new String[][]{{"setPosition", "int", "1"}, {"getPosition", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isActual", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getRootNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106079", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isLeaf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setIndex", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=0, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateParentPointer", ""}}, 2), new String[][]{{"asPath", "", "3"}, {"compareTo", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:3>", "<b:true>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=t...#231#1763306355", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<null>", "1.25"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getPrefix", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getImmediateValuePointer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=true, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLength", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isAttribute", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getRootNode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", actual.getClass().getName());
  assertEquals(" {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isRoot", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isActual", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=fals...#229#-1772752519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setIndex", new String[]{"int"}, new String[]{"1073741823"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "/text()[158] {getDefaultNamespaceURI=null, getIndex=1073741823, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false,...#226#1048558771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=true, isCollection=false, isContainer=false, isLeaf=true, isNode...#219#-886255622", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:5>", "20200-01-01"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isRoot", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setIndex", "int", "-2147483648"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isNode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespaceIterator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{"-21474836481.12345578"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceResolver", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-21474836481.12345578", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setValue", "java.lang.Object", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=true, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespacePointer", "java.lang.String", "["}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:2>", "<sample:8>", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createAttribute", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:5>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:0>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'a' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#149996488", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"1.12345678901234577.5"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{"org.w3c.dom.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLength", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespaceIterator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:6>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDec...#264#-129025237", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isCollection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:4>", "<i:-1>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("-1 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=t...#217#1078243985", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "asPath", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:7>", "<sample:3>", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPrefix", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:7>", "a ba b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getImmediateParentPointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<null>", "http//example.com/a?b=c"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:3>", "<sample:8>", "536870911"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<i:-17>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:8>", "<sample:3>", "-2147483591", "<s:key>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:11>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareTo", "java.lang.Object", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "findEnclosingAttribute", new String[]{"org.w3c.dom.Node", "java.lang.String"}, new String[]{"<sample:3>", "nuulgl"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/text()[195] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=fa...#231#1242605469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:5>", "<sample:3>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getDefaultNamespaceURI", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getBaseValue", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNodeSetByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:6>", "id('true", "<i:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"http//example.com/a?b=c;"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:2>", "<i:-2097169>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("-2097169 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, is...#223#1158593994", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "http://exammple.com/a?b=c", "Wlan"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValuePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setIndex", new String[]{"int"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=1, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLe...#235#-2010793274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:3>", "<sample:0>", "2147483590"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getParent", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareTo", "java.lang.Object", "<i:-67108863>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:3>", "2147483647", "<s:a>>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:7>", "1073741823", "<i:-2>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getIndex", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "asPath", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("id('')", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespaceIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "clone", ""}}), new String[][]{{"getPosition", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"()"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPrefix", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespaceIterator", new String[]{}, new String[]{}, false), new String[][]{{"getNodePointer", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "asPath", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getParent", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=...#246#787018635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isLeaf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isActual", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "clone", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}), new String[][]{{"getNodePointer", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", new String[]{"org.w3c.dom.Node", "org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<null>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.NamespaceResolver", actual.getClass().getName());
  assertEquals("{isSealed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValuePointer", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals(" {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:6>", "<s:kex>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getRootNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getAbstractFactory", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"space"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"mull"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"xmlns"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer", actual.getClass().getName());
  assertEquals("/namespace::xmlns {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'b'/text()[196] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=fa...#231#1836094140", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:7>", "<sample:6>", "<sample:3>"}, true), new String[][]{{"childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValuePointer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "remove", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", actual.getClass().getName());
  assertEquals("'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isRoot", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setIndex", "int", "2147483641"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=2147483641, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isNo...#221#-320321957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", new String[]{"org.w3c.dom.Node", "org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:7>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValuePointer", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", actual.getClass().getName());
  assertEquals(" {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLength", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceResolver", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:1>", "false", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", "java.lang.String", "2020-02-30T25:61:61"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setIndex", new String[]{"int"}, new String[]{"-2147483646"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setIndex", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483646, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#-1514943507", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setNamespaceResolver", new String[]{"org.apache.commons.jxpath.ri.NamespaceResolver"}, new String[]{"<sample:5>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "escape", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setIndex", "int", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getIndex=4, getLength=1, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/text()[158]", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isActual", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValuePointer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNodeValue", ""}}), new String[][]{{"isActual", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isActual", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "escape", "java.lang.String", "{\"2a\":1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValuePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setAttribute", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=true, isCollection=false, isContainer=fa...#244#-1364632086", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=true, isCollection=false, isContainer=fa...#244#-1364632086", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer", actual.getClass().getName());
  assertEquals("/namespace::+1 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setIndex", "int", "536870927"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setIndex", "int", "38"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=38, getLength=1, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<null>", "Btrue"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:0>", "<sample:7>", "2147483647"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:5>", "-1I"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}), new String[][]{{"getImmediateParentPointer", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isRoot", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "toString", ""}}), new String[][]{{"getChildNodes", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "findEnclosingAttribute", new String[]{"java.lang.Object", "java.lang.String", "org.jdom.Namespace"}, new String[]{"<s:a>", "20>2/-01-01", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals(" {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "remove", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=true, isCollection=false, isContainer=false, isLeaf=true, isNode=true,...#213#1273417782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:4>", "<i:58>", "<null>"}, true), new String[][]{{"createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:6>", "false", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<null>", "false", "<sample:3>"}}), new String[][]{{"getPosition", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"nll"}, false), new String[][]{{"getBaseValue", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:2>", "TITLE"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals("id('TITLE') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!NullPointerException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true...#227#691814626", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValuePointer", new String[]{}, new String[]{}, false), new String[][]{{"getLocale", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample__a {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample (a), getDisplayScript=, getDisplayVariant=a, getISO3Country=, getISO3Language=!MissingResourceException, ge...#264#2001601015", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceResolver", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "asPath", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/text()[196]", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=fals...#229#-1772752519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "equals", "java.lang.Object", "<i:1>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=true, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:7>", "true", "<sample:10>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isAttribute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getImmediateValuePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getAbstractFactory", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=true, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setAttribute", "boolean", "false"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getIndex", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:5>", "<<uknown names\tpace>>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1231", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:0>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getImmediateNode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:8>", "<sample:5>", "<sample:7>"}, true), new String[][]{{"isNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:3>"}, false), new String[][]{{"getPosition", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isActual", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isAttribute", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isActual", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isContainer", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isContainer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"a1e10"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setValue", "java.lang.Object", "<s:+>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setIndex", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=2147483647, getLength=1, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "setIndex", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getAbstractFactory", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceURI", "java.lang.String", "-0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", actual.getClass().getName());
  assertEquals("id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<null>", "-2147483648"}, false), new String[][]{{"getBaseValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"/a//b"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getIndex", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "remove", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=fals...#229#-1772752519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"010"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("null {getName=null, getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValuePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}}), new String[][]{{"getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals("id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!NullPointerException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, is...#223#-1115844405", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=f...#245#856773359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValuePointer", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getImmediateParentPointer", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true...#228#-1010695189", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespaceIterator", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:4>", "false", "<sample:7>"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("id('')", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getBaseValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getIndex", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValuePointer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getNodeValue", ""}}), new String[][]{{"createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("null {getName=null, getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getLength", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:5>", "<sample:2>", "<sample:0>"}, true), new String[][]{{"attributeIterator", "org.apache.commons.jxpath.ri.QName", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setIndex", new String[]{"int"}, new String[]{"131073"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=131073, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isR...#209#-1638172320", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:10>", "<s:key>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'key' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNod...#220#-154309242", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:0>", "false", "<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "isActual", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:3>", "<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false...#201#-833205893", SearchInputFactory_scaffolding.receiverState());
 }
}
