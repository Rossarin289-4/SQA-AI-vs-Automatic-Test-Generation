package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "remove", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getLocale", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getValuePointer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:3>", "false", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:6>", "<null>", "<sample:2>"}, true), new String[][]{{"isLeaf", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:0>", "<i:-1>", "<sample:0>"}, true), new String[][]{{"isCollection", "", "3"}, {"createPath", "org.apache.commons.jxpath.JXPathContext", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("-1 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=t...#217#1078243985", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:2>", "false", "<sample:1>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "namespaceIterator", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:2>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:1>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getDefaultNamespaceURI", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:0>"}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isDefaultNamespace", "java.lang.String", "\t"}}, 1), new String[][]{{"asPath", "", "1"}, {"getNamespaceResolver", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "compareTo", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getIndex", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.NamespaceResolver", actual.getClass().getName());
  assertEquals("{isSealed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:0>", "<s:-s>"}}), new String[][]{{"getParent", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:11>", "<s:key>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getRootNode", ""}}), new String[][]{{"isAttribute", "", "3"}, {"getImmediateValuePointer", "", "2"}, {"createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("$0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, i...#225#210008268", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:3>", "<i:-1>"}, true, 0, null, 3), new String[][]{{"getPropertyPointer", "", "5"}, {"attributeIterator", "org.apache.commons.jxpath.ri.QName", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:8>", "<i:-191>"}, true, 0, null, 2), new String[][]{{"printPointerChain", "", "5"}, {"getPropertyPointer", "", "5"}, {"testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "5"}, {"testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isDefaultNamespace", "java.lang.String", "\u00e9"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "printPointerChain", ""}}), new String[][]{{"getPropertyPointer", "", "3"}, {"childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "4"}, {"testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isActual", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isActual", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:0>", "<null>", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "remove", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isContainer", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getValuePointer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "remove", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getValuePointer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getBaseValue", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:0>", "true", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<d:15.34>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getLocale", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getParent", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getParent", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<null>", "<sample:4>", "0", "<i:1>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getLocale", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:2>", "true", "<sample:7>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:2>", "false", "<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isLeaf", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "asPath", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:2>", "<sample:7>", "10"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setIndex", "int", "1"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "isDefaultNamespace", "java.lang.String", "2E-5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:1>", "<sample:0>", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setIndex", "int", "1"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "isDefaultNamespace", "java.lang.String", "+1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<null>", "<sample:9>", "0"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isDefaultNamespace", "java.lang.String", "+"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setNamespaceResolver", new String[]{"org.apache.commons.jxpath.ri.NamespaceResolver"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setNamespaceResolver", new String[]{"org.apache.commons.jxpath.ri.NamespaceResolver"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setNamespaceResolver", new String[]{"org.apache.commons.jxpath.ri.NamespaceResolver"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isRoot", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setIndex", new String[]{"int"}, new String[]{"0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample[1] {getIndex=0, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isAttribute", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "asPath", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:5>", "\037 ", "1.12345678901234567)"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:3>", "true", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isAttribute", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getLocale", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:5>", "\037 ", "1.12345678901234567)"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isAttribute", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isDefaultNamespace", "java.lang.String", "1f5e3r00"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:4>", "\037 ", "1.12345668901234567)"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "printPointerChain", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:2>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:0>", "<i:-1>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"isCollection", "", "3"}, {"createPath", "org.apache.commons.jxpath.JXPathContext", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("-1 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=t...#217#1078243985", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:0>", "<i:-1>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"isCollection", "", "3"}, {"childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:1>", "<i:-16>", "<sample:4>"}, true, 0, null, 2), new String[][]{{"isCollection", "", "3"}, {"getLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:0>", "<i:1>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"isCollection", "", "3"}, {"asPath", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:0>", "<i:64>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"isCollection", "", "3"}, {"asPath", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:3>", "<i:64>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"isCollection", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isAttribute", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"1.12446"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getNamespaceURI", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getNode", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:2>", "false", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:2>", "false", "<sample:1>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getNodeValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:7>", "false", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getIndex", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:0>", "true", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:6>", "<sample:4>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getIndex", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:6>", "false", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:4>", " ", "a b"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:3>", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:6>", "true", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getParent", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:4>", "m", "a b"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:3>", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isNode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getIndex", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getRootNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isNode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getIndex", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getRootNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isNode", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getIndex", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getNamespaceResolver", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isNode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getIndex", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getNamespaceResolver", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<null>", "<i:0>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("0 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=tr...#216#2115549829", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isDefaultNamespace", "java.lang.String", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#219#-675271169", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getLength", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "isDefaultNamespace", "java.lang.String", ".5"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getRootNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:6>", "-1.51d10"}}, 2), new String[][]{{"getNode", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getRootNode", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "printPointerChain", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "clone", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isActual", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isActual", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isActual", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:1>", "-2147483648", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:2>", "-2147483648", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getNamespaceURI", "java.lang.String", "5."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<null>", "<sample:5>", "-2147483648", "<d:1.5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<null>", "<sample:5>", "-2147483648", "<d:1.5>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "namespacePointer", "java.lang.String", "1.5f"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getBaseValue", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:0>", "true", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isContainer", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getIndex", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isContainer", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getIndex", ""}}), new String[][]{{"getNodePointer", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getNamespaceURI", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getIndex", ""}}), new String[][]{{"setPosition", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getNamespaceURI", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getIndex", ""}}), new String[][]{{"setPosition", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getIndex", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "asPath", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getIndex", ""}}), new String[][]{{"setPosition", "int", "1"}, {"reset", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getDefaultNamespaceURI", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:2>", "false", "<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getParent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getParent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:3>", "<sample:5>", "10"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:5>", "<s:a>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:4>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:4>", "<sample:7>", "-2147483647"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:3>", "<sample:6>", "-2147483648"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getName", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.VariablePointer", actual.getClass().getName());
  assertEquals("$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:6>", "<sample:1>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("1 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=tr...#216#-60366492", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:6>", "<i:0>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("0 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=tr...#216#2115549829", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:6>", "<i:0>", "<null>"}, true), new String[][]{{"compareTo", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:7>", "<i:53>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("53 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=t...#217#-1734956969", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:6>", "<i:-2147483648>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("-2147483648 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true,...#226#-1196973221", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:6>", "<i:-2147483648>", "<sample:2>"}, true), new String[][]{{"isLeaf", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setNamespaceResolver", new String[]{"org.apache.commons.jxpath.ri.NamespaceResolver"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isRoot", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isNode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isNode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getParent", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "isNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "asPath", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:5>", "  ", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "asPath", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:5>", "  ", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "asPath", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "asPath", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:5>", "\037 ", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isAttribute", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isDefaultNamespace", "java.lang.String", "1f5e3r00"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:4>", "\037 ", "1.12345668901234567)"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "printPointerChain", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("0:sample {getName=sample, getPrefix=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:0>", "<i:1>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getLength", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:3>", "1f5e3r00", "1.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "asPath", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createAttribute", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateNode", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateNode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isNode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals(":a {getName=a, getPrefix=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getPrefix", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getName", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getPrefix", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{" "}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getNamespaceURI", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isRoot", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getNamespaceURI", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isRoot", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getNamespaceURI", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setIndex", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getBaseValue", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "setAttribute", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample[11] {getIndex=10, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=true, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:2>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setIndex", new String[]{"int"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample[0] {getIndex=-1, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setIndex", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getRootNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample[0] {getIndex=-1, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setIndex", new String[]{"int"}, new String[]{"56"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getRootNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample[57] {getIndex=56, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setIndex", new String[]{"int"}, new String[]{"59"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getRootNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample[60] {getIndex=59, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setIndex", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getRootNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample[2] {getIndex=1, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isLeaf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getValuePointer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:7>", "false", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:7>", "false", "<null>"}, false), new String[][]{{"setPosition", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNodeValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:4>", "false", "<null>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getValuePointer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "asPath", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setIndex", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample[0] {getIndex=-1, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceResolver", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceURI", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "namespaceIterator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:1>", "<i:0>", "<sample:0>"}, true), new String[][]{{"getNamespaceURI", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:4>", "<i:33>", "<sample:0>"}, true), new String[][]{{"attributeIterator", "org.apache.commons.jxpath.ri.QName", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setIndex", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "$0:sample[-2147483648] {getIndex=2147483647, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=fals...#215#-214915998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isDefaultNamespace", "java.lang.String", "TITLE"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getRootNode", ""}}), new String[][]{{"isActual", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isDefaultNamespace", "java.lang.String", "TITLE"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getRootNode", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValuePointer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isDefaultNamespace", "java.lang.String", "TITLE"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getRootNode", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getRootNode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isDefaultNamespace", "java.lang.String", "1E-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isCollection", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{">---0u"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "clone", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getIndex", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"MI"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getIndex", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getNode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setValue", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createAttribute", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isAttribute", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getRootNode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getNamespaceURI", "java.lang.String", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setIndex", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample[2] {getIndex=1, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setIndex", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample[-2147483648] {getIndex=2147483647, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=fals...#215#-214915998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:3>"}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isActual", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", ")", "+1"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isLeaf", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:1>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<null>", "<s:b>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getLength", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:7>", "<sample:2>", "-2147475456", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "printPointerChain", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "isLanguage", "java.lang.String", "Hello, World"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getLength", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:3>"}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:0>", "<sample:3>", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=true, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tru...#202#2023923407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:7>", "  "}, {"org.apache.commons.jxpath.ri.model.NodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:5>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:7>", "  "}, {"org.apache.commons.jxpath.ri.model.NodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:5>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "clone", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:7>", "  "}, {"org.apache.commons.jxpath.ri.model.NodePointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:5>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "clone", ""}}), new String[][]{{"createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "3"}, {"getLocale", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:2>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:3>", " \037"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "clone", ""}}, 2), new String[][]{{"createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "3"}, {"getLocale", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:6>"}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:2>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:3>", " \037"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:9>"}, false, 11, new String[][]{}, 1), new String[][]{{"createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "3"}, {"createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "3"}, {"getNamespaceResolver", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:3>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isContainer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:3>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isContainer", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:3>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isContainer", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isContainer", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getRootNode", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getLength", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isContainer", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getRootNode", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getLength", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#219#-675271169", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"isCollection", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getNodeValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"asPath", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$:a", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isDefaultNamespace", "java.lang.String", "\t"}}, 1), new String[][]{{"asPath", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isDefaultNamespace", "java.lang.String", "\t"}}, 1), new String[][]{{"asPath", "", "1"}, {"getNamespaceResolver", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isCollection", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "namespacePointer", "java.lang.String", "-0.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isCollection", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:1>"}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getImmediateNode", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:3>", "<sample:1>", "-2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "asPath", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:6>", "<null>", "10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "getValuePointer", ""}, {"org.apache.commons.jxpath.ri.model.NodePointer", "getNode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=true, isLeaf=true, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isLanguage", "java.lang.String", "2020-01-09"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$:a {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.VariablePointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.model.NodePointer", "isLanguage", "java.lang.String", "2020@-01-09--1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=!JXPathException, isContainer=true, isLeaf=!JXPathException, isNode=false, isRoot=tr...#203#2051213154", SearchInputFactory_scaffolding.receiverState());
 }
}
