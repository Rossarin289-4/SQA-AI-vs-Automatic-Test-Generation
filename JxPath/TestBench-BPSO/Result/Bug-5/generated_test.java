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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:3>", "false", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "namespaceIterator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:2>", "<s:ee>"}, true), new String[][]{{"getNodeValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ee", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "clone", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isLeaf", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:4>", "<i:-1>", "<sample:0>"}, true), new String[][]{{"isAttribute", "", "4"}, {"createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:4>", "<i:1>", "<sample:2>"}, true), new String[][]{{"testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "6"}, {"isAttribute", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:0>", "<null>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("null() {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isN...#222#550737049", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createAttribute", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:9>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:0>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "isDefaultNamespace", "java.lang.String", "I"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getImmediateValuePointer", ""}}), new String[][]{{"isLanguage", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:10>", "<sample:1>", "<s:b>"}, true, 0, null, 1), new String[][]{{"isAttribute", "", "2"}, {"printPointerChain", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("$0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLea...#234#-696531073", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:2>", "<s:ke@>", "<sample:0>"}, true), new String[][]{{"isLanguage", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:12>", "<sample:5>", "<i:0>"}, true, 0, null, 1), new String[][]{{"testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:4>", "<s:key>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isLeaf", ""}}), new String[][]{{"getImmediateValuePointer", "", "3"}, {"createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("$0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, i...#225#210008268", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getParent", "", "1"}, {"isLeaf", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:2>"}}), new String[][]{{"getNamespaceResolver", "", "2"}, {"getNamespaceURI", "java.lang.String", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getRootNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:10>", "Title1.5d", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:8>", "<s:k>"}, true, 0, null, 2), new String[][]{{"getPropertyPointer", "", "2"}, {"attributeIterator", "org.apache.commons.jxpath.ri.QName", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setIndex", "int", "-2147483647"}}), new String[][]{{"isAttribute", "", "0"}, {"getPropertyPointer", "", "6"}, {"remove", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", actual.getClass().getName());
  assertEquals("$0:sample[-2147483646]/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute...#286#2042187591", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample[-2147483646] {getIndex=-2147483647, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=fal...#216#-493860271", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setNamespaceResolver", new String[]{"org.apache.commons.jxpath.ri.NamespaceResolver"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setAttribute", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getBaseValue", "", "6"}, {"getPropertyPointer", "", "6"}, {"testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:0>", "true", "<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createAttribute", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:0>", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "clone", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:7>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getRootNode", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getLocale", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("0:sample {getName=sample, getPrefix=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "remove", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:2>", "[1,2]"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:6>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getBaseValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isLeaf", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isContainer", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=true, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tru...#202#2023923407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "printPointerChain", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "namespaceIterator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalArgumen...#238#-1497851625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:5>", "<sample:3>", "<null>"}, true, 0, null, 2), new String[][]{{"getIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getParent", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "compareTo", "java.lang.Object", "<d:1.5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalArgumen...#238#-1497851625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setIndex", new String[]{"int"}, new String[]{"-1073741823"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getLength", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample[-1073741822] {getIndex=-1073741823, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=fal...#216#2083191761", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "compareTo", "java.lang.Object", "<i:-94>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "isRoot", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isCollection", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<null>", "true", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getBaseValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "-1", "/a/b"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "namespaceIterator", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:5>", ""}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isCollection", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:7>", "<d:1.5>"}, true, 0, null, 2), new String[][]{{"getLength", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:4>", "<sample:7>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalArgumen...#238#-1497851625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:7>", "<i:1>"}, true, 0, null, 2), new String[][]{{"attributeIterator", "org.apache.commons.jxpath.ri.QName", "3"}, {"getPosition", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:0>", "<i:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setIndex", "int", "0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isContainer", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:8>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "remove", ""}}, 2), new String[][]{{"isNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:1>", "8193", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:6>", "<sample:1>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"clone", "", "5"}, {"isNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:2>", "<d:-1.5>"}, true, 0, null, 2), new String[][]{{"isActual", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "asPath", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"/a/a"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"{{\"a\":1}"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getImmediateNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isCollection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getIndex", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isRoot", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:6>", "<sample:6>", "59"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<null>", "<i:-1>"}, false, 5, new String[][]{}, 2), new String[][]{{"attributeIterator", "org.apache.commons.jxpath.ri.QName", "4"}, {"getPosition", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:2>", "<s:e>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"attributeIterator", "org.apache.commons.jxpath.ri.QName", "4"}, {"getNodePointer", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"21474836481e10"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getRootNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalArgumen...#238#-1497851625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:8>", "<sample:7>", "-16777275"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:8>", "<i:1>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"getPrefix", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "namespaceIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getValuePointer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"12345678901234456789001234567890"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:3>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"printPointerChain", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("2 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=tr...#216#2058684483", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isLeaf", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=true, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tru...#202#2023923407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:5>", "<null>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("null() {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isN...#222#550737049", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setNamespaceResolver", new String[]{"org.apache.commons.jxpath.ri.NamespaceResolver"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isContainer", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getRootNode", ""}}, 1), new String[][]{{"testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "6"}, {"getImmediateValuePointer", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:0>", "<sample:9>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalArgumen...#238#-1497851625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateNode", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isRoot", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "printPointerChain", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalArgumen...#238#-1497851625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=true, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isRoot", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:0>", "<s:ke@>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'ke@' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNod...#220#694100045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "namespaceIterator", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "asPath", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getImmediateNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getBaseValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getNodeValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createAttribute", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:1>", "<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setIndex", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "printPointerChain", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample[1] {getIndex=0, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isNode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isRoot", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getRootNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "remove", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:2>", "<sample:3>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setNamespaceResolver", new String[]{"org.apache.commons.jxpath.ri.NamespaceResolver"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:4>", "<sample:6>", "-2147483648"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getNamespaceURI", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getIndex", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateNode", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"a-"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isAttribute", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:1>", "1020-01-01"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setIndex", "int", "-59"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:6>", "<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isContainer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:ka>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "remove", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:5>", "<s:>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.VariablePointer", actual.getClass().getName());
  assertEquals("$0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getName", new String[]{}, new String[]{}, false), new String[][]{{"getPrefix", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "1.5e300", ""}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:4>", "Tiule"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "compareTo", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:5>", "16325", "<i:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isCollection", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "asPath", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:8>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "isCollection", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getParent", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getBaseValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isLeaf", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:7>", "<sample:2>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createAttribute", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:2>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isLanguage", "java.lang.String", "1.112345678"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getLocale", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNodeValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getImmediateNode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:1>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("1 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=tr...#216#-60366492", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isNode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "printPointerChain", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:2>", "true", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isContainer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isLeaf", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "namespaceIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "toString", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<null>", "<sample:5>", "41", "<d:8.8>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isContainer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:4>", "true", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:7>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:6>", "<s:b>"}, true), new String[][]{{"isContainer", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getNamespaceURI", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "compareTo", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:5>", "<i:-49>"}, true), new String[][]{{"createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:0>", "<sample:1>"}, true), new String[][]{{"getNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:4>", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setIndex", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=true, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tru...#202#2023923407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getBaseValue", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "asPath", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"1.123456789012345(67"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:0>", "false", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setIndex", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=true, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setIndex", new String[]{"int"}, new String[]{"10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample[11] {getIndex=10, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isContainer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getNamespaceResolver", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalArgumen...#238#-1497851625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{" o3 "}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isRoot", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"nulk"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalArgumen...#238#-1497851625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getRootNode", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<null>", "<sample:4>", "16425", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=true, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalArgument...#237#1762405578", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isCollection", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<null>", "<d:1.5>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("1.5 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#1246757885", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.VariablePointer", actual.getClass().getName());
  assertEquals("$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false), new String[][]{{"isCollection", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:2>", "<s:Tkey>", "<null>"}, true), new String[][]{{"getLength", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isContainer", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getParent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<null>", "<s:b>", "<sample:2>"}, true), new String[][]{{"getPropertyPointer", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[blank, bytes, empty], isActual=false, isAttribute...#286#836667694", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:10>", "<sample:4>", "<s:ke>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("$0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLea...#234#-696531073", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:7>", "<i:-1>", "<sample:0>"}, true), new String[][]{{"attributeIterator", "org.apache.commons.jxpath.ri.QName", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isActual", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$:a", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:5>"}, false), new String[][]{{"getPosition", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setNamespaceResolver", new String[]{"org.apache.commons.jxpath.ri.NamespaceResolver"}, new String[]{"<sample:6>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalArgumen...#238#-1497851625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:5>", "<i:-1>", "<sample:0>"}, true), new String[][]{{"namespacePointer", "java.lang.String", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:7>", "<s:k>"}, true), new String[][]{{"setIndex", "int", "4"}, {"getNamespaceURI", "", "5"}, {"testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:5>", "<s:Xke>"}, true), new String[][]{{"compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "namespaceIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:4>", "<s:kez>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "toString", ""}}), new String[][]{{"getName", "", "7"}, {"getPrefix", "", "5"}, {"getPrefix", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{" of "}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "namespaceIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"t4ue"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getLocale", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<null>", "<sample:0>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getBaseValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<null>", "<sample:1>", "<s:k>"}, true), new String[][]{{"isNode", "", "1"}, {"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'k' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#-74197550", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNode", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalArgumen...#238#-1497851625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setIndex", new String[]{"int"}, new String[]{"-2147483647"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample[-2147483646] {getIndex=-2147483647, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=fal...#216#-493860271", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:3>", "0", "<s:>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:6>", "<sample:5>", "-31"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "remove", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isNode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:3>", "<i:-1>", "<sample:0>"}, true), new String[][]{{"createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getBaseValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:4>", "false", "<sample:3>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setIndex", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setIndex", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<null>", "<i:0>", "<empty>"}, true), new String[][]{{"getImmediateParentPointer", "", "4"}, {"compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isLeaf", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"tre"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"Z1,2]"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "printPointerChain", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isActual", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalArgumen...#238#-1497851625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "remove", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "asPath", ""}}), new String[][]{{"getName", "", "6"}, {"getPrefix", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getBaseValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setIndex", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=0, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isRoot", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getNamespaceURI", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "namespaceIterator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:4>", "<i:2>"}, false, 3, new String[][]{}), new String[][]{{"getImmediateValuePointer", "", "6"}, {"getLocale", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "remove", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:0>", "<sample:7>", "-47"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=2147483647, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<d:-1.42>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateNode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:3>", "<s:.ee>"}, false, 3, new String[][]{}), new String[][]{{"setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "1"}, {"isLeaf", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "remove", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.VariablePointer", actual.getClass().getName());
  assertEquals("$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:0>"}, false, 5, new String[][]{}), new String[][]{{"getValuePointer", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#219#-675271169", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:5>", "<s:>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getLength", ""}}), new String[][]{{"getName", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals(":a {getName=a, getPrefix=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getParent", ""}}), new String[][]{{"getNamespaceResolver", "", "7"}, {"isCollection", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isNode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:6>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isLeaf", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:0>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalArgumen...#238#-1497851625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getNode", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:8>", "<sample:8>"}}), new String[][]{{"isLeaf", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"/@"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setValue", "java.lang.Object", "<s:ke>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:0>", "<s:aa>"}, false, 1, new String[][]{}), new String[][]{{"remove", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.VariablePointer", actual.getClass().getName());
  assertEquals("$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getRootNode", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getLocale", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isNode", ""}}), new String[][]{{"isCollection", "", "7"}, {"setAttribute", "boolean", "0"}, {"createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:5>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getParent", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalArgumen...#238#-1497851625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:6>", "true", "<sample:5>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:10>", "<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getImmediateValuePointer", ""}}), new String[][]{{"compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "0"}, {"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.VariablePointer", actual.getClass().getName());
  assertEquals("$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"asPath", "", "6"}, {"isContainer", "", "6"}, {"isDynamicPropertyDeclarationSupported", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}, 1), new String[][]{{"getPosition", "", "7"}, {"getPosition", "", "4"}, {"reset", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:2>", "<i:23>"}, true, 0, null, 3), new String[][]{{"isAttribute", "", "0"}, {"createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "remove", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:4>", "false", "<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getValuePointer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#219#-675271169", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:0>", "<s:k>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getLength", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=true, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateNode", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:1>", "true", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isLeaf", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"1.12345678123456789012345678901234567890"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isActual", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:0>", "PT1H"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getImmediateNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:4>", "-2247493648"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:8>"}}), new String[][]{{"getRootNode", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getName", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "setIndex", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample[-2147483648] {getIndex=2147483647, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=fals...#215#-214915998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isRoot", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getBaseValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalA...#244#1476704554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:6>", "<s:aa>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getImmediateNode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "1.5d", "1.25"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "asPath", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isContainer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$:a", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalArgumen...#238#-1497851625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"0/@"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setIndex", "int", "511"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample[512] {getIndex=511, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getName", "", "7"}, {"getName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalArgumen...#238#-1497851625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setAttribute", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=true, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tru...#202#2023923407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setIndex", new String[]{"int"}, new String[]{"-2147483647"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample[-2147483646] {getIndex=-2147483647, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=fal...#216#-493860271", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isActual", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=!IllegalArgumentException, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=!IllegalArgumentException, isContainer=true, isLeaf=!IllegalArgumen...#238#-1497851625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"18:30:45"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getNamespaceURI", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "{\"b\":1}1.1234567", "1E-5"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "asPath", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getParent", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setIndex", new String[]{"int"}, new String[]{"-1879048192"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setAttribute", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample[-1879048191] {getIndex=-1879048192, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=fal...#216#904745201", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:11>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNodeValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isRoot", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "namespaceIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isDefaultNamespace", "java.lang.String", "1020-01-01b"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNode", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "asPath", ""}}, 3), new String[][]{{"createPath", "org.apache.commons.jxpath.JXPathContext", "6"}, {"getLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getNamespaceURI", ""}}), new String[][]{{"clone", "", "3"}, {"getLength", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setIndex", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getBaseValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setIndex", new String[]{"int"}, new String[]{"59"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setIndex", "int", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=59, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "asPath", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$:a", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$:a", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "TITLE", "\u00e91"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "namespaceIterator", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
}
