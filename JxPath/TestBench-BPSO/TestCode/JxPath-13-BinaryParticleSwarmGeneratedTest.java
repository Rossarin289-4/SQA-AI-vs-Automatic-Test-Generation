package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPrefix", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "getExternallyRegisteredPrefix", new String[]{"java.lang.String"}, new String[]{"1.He300"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.NamespaceResolver", "getExternallyRegisteredPrefix", "java.lang.String", "1.25"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"1.He300"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.NamespaceResolver", "setNamespaceContextPointer", "org.apache.commons.jxpath.ri.model.NodePointer", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "registerNamespace", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e300", "preserve"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:4>", "<b:true>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:3>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "remove", ""}}), new String[][]{{"createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isActual", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocalName", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeSetByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:4>", "<a>b</a>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:7>", "<sample:2>", "-2147483648", "<s:key>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.NamespaceResolver", actual.getClass().getName());
  assertEquals("{isSealed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isSealed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"1.1234567790123456"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:4>", "<sample:3>", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "isSealed", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.NamespaceResolver", "getNamespaceContextPointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isSealed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getNamespaceContextPointer", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals(" {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:2>", "<i:1>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateValuePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isLeaf", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals(" {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "getPrefix", new String[]{"java.lang.String"}, new String[]{"-875104&933894857319"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:1>", "<i:-2147483648>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceResolver", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("null {getName=null, getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:9>", "<null>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "seal", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.NamespaceResolver", "getNamespaceURI", "java.lang.String", "{\"ag\":1}"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "getPrefix", new String[]{"java.lang.String"}, new String[]{"1.5f0xFFFFFFFF"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.NamespaceResolver", "registerNamespace", "java.lang.String,java.lang.String", "", "l"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:5>", "0"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:1>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:5>", "PT1X", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals("id('0') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!NullPointerException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, is...#223#-682003494", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "getNamespaceContextPointer", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:6>", "<s:>"}, false, 7, new String[][]{}, 3), new String[][]{{"createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<null>", "xml1.12345678901234567"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setIndex", "int", "-29"}}, 1), new String[][]{{"getLocale", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/text()[199] {getDefaultNamespaceURI=null, getIndex=-29, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isNode...#219#-396524938", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "setNamespaceContextPointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.NamespaceResolver", "getNamespaceURI", "java.lang.String", "x\nmlns:"}, {"org.apache.commons.jxpath.ri.NamespaceResolver", "isSealed", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:5>", "true", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"hasAttributes", "", "2"}, {"setUserData", "java.lang.String,java.lang.Object,org.w3c.dom.UserDataHandler", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[200] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false...#227#1057044989", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"getDisplayVariant", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:2>", "3147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getParent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<i:-28>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isActual", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPrefix", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "12345678901234567890123446I7890", "0e10a bTitle"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.NamespacePointer", actual.getClass().getName());
  assertEquals("/text()[198]/namespace::1L {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRoot=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:6>", "<b:true>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLength", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValuePointer", ""}}, 3), new String[][]{{"compareTo", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "findEnclosingAttribute", new String[]{"org.w3c.dom.Node", "java.lang.String"}, new String[]{"<sample:0>", " "}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateValuePointer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getRootNode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"getAttributes", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPrefix", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getRootNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareTo", "java.lang.Object", "<s:>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateParentPointer", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPrefix", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"r_"}, false, 1, new String[][]{}, 2), new String[][]{{"createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:8>", "true", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "equals", "java.lang.Object", "<d:-4.5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPrefix", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPrefix", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:4>", "<b:false>"}, true, 0, null, 2), new String[][]{{"attributeIterator", "org.apache.commons.jxpath.ri.QName", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPrefix", new String[]{"org.w3c.dom.Node"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespacePointer", "java.lang.String", "-0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "findEnclosingAttribute", new String[]{"org.w3c.dom.Node", "java.lang.String"}, new String[]{"<sample:7>", "1.5Xf"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocalName", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:2>", "<<unknown namespace>>0x1F"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:4>", "<i:-2>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "remove", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals("id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "getPrefix", new String[]{"java.lang.String"}, new String[]{"2020-01-01Hello, World"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.NamespaceResolver", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals("id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", new String[]{"org.w3c.dom.Node", "org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:6>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", new String[]{"org.w3c.dom.Node", "org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:1>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isContainer", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals(" {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "getPrefix", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=2147483647, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true,...#213#-1504997071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getRootNode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "getExternallyRegisteredPrefix", new String[]{"java.lang.String"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", ".1", "-1I"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:3>", "0", "<i:-1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "getExternallyRegisteredNamespaceURI", new String[]{"java.lang.String"}, new String[]{"[1,2]1"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isCollection", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{".5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:2>", "&apos;"}}), new String[][]{{"getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:2>", "<s:n>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'n' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#-570952491", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:1>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getRootNode", ""}}), new String[][]{{"setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "1"}, {"getNamespaceURI", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"1e10a bTitle"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"&apor;"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isLeaf", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "findEnclosingAttribute", new String[]{"org.w3c.dom.Node", "java.lang.String"}, new String[]{"<sample:5>", "-1"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:2>", "2.5d"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals("id('2.5d') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!NullPointerException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false...#227#-357875328", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals(" {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"[1,2]1["}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setIndex", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=2147483647, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isNo...#221#-1795105951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "registerNamespace", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"xll", "PS1H+"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.NamespaceResolver", "registerNamespace", "java.lang.String,java.lang.String", "'<o>b</a>", "&apos;node()"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createAttribute", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:6>", "<sample:2>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("id('a')", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "remove", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<null>", "<sample:2>", "-2147483647", "<s:b>"}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPrefix", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:4>", "true", "<sample:4>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "setNamespaceContextPointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.NamespaceResolver", "getPrefix", "java.lang.String", "ab"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeSetByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:1>", "[", "<b:true>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateParentPointer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:5>", "<b:true>", "<sample:1>"}, true), new String[][]{{"getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setAttribute", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "getPrefix", new String[]{"java.lang.String"}, new String[]{"{\"ag\":1}"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:2>", "21L7483648", "<s:7>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"1.5&quot;"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPrefix", new String[]{"org.w3c.dom.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isContainer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"vll"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getRootNode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isNode", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "equals", "java.lang.Object", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:2>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<i:32>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "setIndex", "int", "-8135"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-8135, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true, isRo...#208#-1359596907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createAttribute", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:3>", "<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceResolver", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "getExternallyRegisteredNamespaceURI", new String[]{"java.lang.String"}, new String[]{"-5"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocalName", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "getNamespaceContextPointer", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"ab"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getIndex", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "getExternallyRegisteredNamespaceURI", new String[]{"java.lang.String"}, new String[]{"xmlIlannhi"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.NamespaceResolver", "seal", ""}, {"org.apache.commons.jxpath.ri.NamespaceResolver", "getPrefix", "java.lang.String", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"'%apos;"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPrefix", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:7>", "<sample:0>", "2147483647"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "toString", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("id('')", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<null>", "<d:-3.0>"}, false), new String[][]{{"clone", "", "2"}, {"compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isRoot", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValuePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceURI", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isActual", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLength", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isLeaf", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", "java.lang.String", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.NamespaceResolver", actual.getClass().getName());
  assertEquals("{isSealed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getRootNode", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("_A {getCountry=A, getDisplayCountry=A, getDisplayLanguage=, getDisplayName=A, getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=, getLanguage=, getScript...#236#-232682629", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals("id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isContainer", ""}}), new String[][]{{"getPosition", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:4>", "<sample:1>"}}), new String[][]{{"setValue", "java.lang.Object", "0"}, {"getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getIndex", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:3>", "xmlIlanh"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocale", ""}}), new String[][]{{"createPath", "org.apache.commons.jxpath.JXPathContext", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals("id('xmlIlanh') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!NullPointerException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=t...#230#2125804767", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<null>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getParent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isActual", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPrefix", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocalName", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getParent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "remove", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/text()[198] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false...#227#-1871139493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "printPointerChain", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "seal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.NamespaceResolver", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:0>", "false", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("null {getName=null, getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "/text()[1] {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, ...#225#919413756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals("id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocalName", new String[]{"org.w3c.dom.Node"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:5>", "<sample:3>"}}), new String[][]{{"getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}1"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.NamespaceResolver", "seal", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isSealed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValuePointer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getValue", ""}}), new String[][]{{"printPointerChain", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", actual.getClass().getName());
  assertEquals(" {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespaceIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespacePointer", "java.lang.String", "\u00e9"}}), new String[][]{{"getNodePointer", "", "6"}, {"getNodePointer", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "id('", "nullL"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:6>", "t6", "<s:b>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isAttribute", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.NamespaceResolver", actual.getClass().getName());
  assertEquals("{isSealed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "id('a') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=false, isN...#222#-1123907427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "remove", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "isActual", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNode=true...#214#1533101571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getParent", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getLanguage", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "getParent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "id('') {getDefaultNamespaceURI=null, getIndex=-2147483648, getLength=1, getNamespaceURI=!ClassCastException, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isLeaf=true, isNod...#220#-992264513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.NamespaceResolver", "getNamespaceURI", "java.lang.String", "cP&apos;"}}), new String[][]{{"isSealed", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isSealed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "findEnclosingAttribute", new String[]{"org.w3c.dom.Node", "java.lang.String"}, new String[]{"<sample:0>", "5."}, true, 0, null, 1);
  assertNull(actual);
 }
}
